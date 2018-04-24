package org.hisoka.datasource.mybatis;

import java.util.Map;

/**
 * @author Hinsteny
 * @version $ID: MultiDataSource 2018-04-11 21:07 All rights reserved.$
 */
public class MultiDataSource {

    /**
     * 默认的数据源bean-id
     */
    private String defaultSQLFactory;

    /**
     * 系统可用的数据源bean-id
     */
    private Map<String, String> configSQLFactoryNames;

    public MultiDataSource() {
    }

    public MultiDataSource(String defaultSQLFactory, Map<String, String> templateMap) {
        this.defaultSQLFactory = defaultSQLFactory;
        this.configSQLFactoryNames = templateMap;
    }

    public String getDefaultSQLFactory() {
        return defaultSQLFactory;
    }

    public void setDefaultSQLFactory(String defaultSQLFactory) {
        this.defaultSQLFactory = defaultSQLFactory;
    }

    public Map<String, String> getConfigSQLFactoryNames() {
        return configSQLFactoryNames;
    }

    public void setConfigSQLFactoryNames(Map<String, String> configSQLFactoryNames) {
        this.configSQLFactoryNames = configSQLFactoryNames;
    }

    public String getSqlSessionFactoryName(String key, boolean useDefault) {
        String sqlSessionFactoryName = this.configSQLFactoryNames.get(key);
        if (null == sqlSessionFactoryName || "".equals(sqlSessionFactoryName.trim())) {
            if (useDefault) {
                sqlSessionFactoryName = this.configSQLFactoryNames.get(this.defaultSQLFactory);
            }
        }
        if (null == sqlSessionFactoryName || "".equals(sqlSessionFactoryName.trim())) {
            throw new RuntimeException("can't get one sqlSessionFactoryName by" + key);
        }
        return sqlSessionFactoryName;
    }

}
