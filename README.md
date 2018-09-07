# SMD（SpringMVC+Mybatis+Dubbo）
Java web应用开发的基础框架, 数据库配置的Postgres Sql.

## 作者
* Hinsteny [Home](https://github.com/Hinsteny)

### 项目介绍
项目本身采用Maven管理, jdk1.8, 配置基础的SSM框架使用方法.

### 包含技术
*  Springmvc, mybatis, Dubbo
*  postgres
*  

### 项目结构架图

```sequence
title: 项目模块结构图
rest->facade: web-rest服务依赖service接口
facade->service: service是facade的实现
service->dal: service通过dal实现对数据库操作
service->>model: model中存放pojo对象
service->>test: test模块对service中接口进行测试
rest->>test: test模块对rest中restful服务进行测试
rest->>util: util模块对存放通用工具
note left of util: util模块后期考虑拆分出去
```

### 配置使用

#### 编译打包

`mvn clean compile package -Dmaven.test.skip=true -B`

#### rest 模块对外提供restful接口服务, 以war包的形式部署于tomcat/jetty中


### 第一期 基础框架组合与配置

Functions: 
* log4j2 config!
* Dubbo service config!
* Persistence level could config multi datasource!
*


PS: some little issues
1. 启动dubbo服务时需要添加命令行参数 '-Ddubbo.application.logger=slf4j' 指定日志处理框架为slf4j, 这样日志才能被log4j2接收到;
