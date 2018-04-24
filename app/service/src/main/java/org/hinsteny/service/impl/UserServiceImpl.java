package org.hinsteny.service.impl;

import com.alibaba.fastjson.JSON;
import org.hinsteny.dal.mapper.UserMapper;
import org.hinsteny.facade.UserService;
import org.hinsteny.model.coverter.UserConverter;
import org.hinsteny.model.vos.UserInfo;
import org.hinsteny.share.result.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * @author Hinsteny
 * @version $ID: UserServiceImpl 2018-04-11 10:23 All rights reserved.$
 */
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    /**
     * 创建一个新用户
     *
     * @param userInfo
     * @return
     */
    @Override
    public CommonResult<Long> createUserInfo(UserInfo userInfo) {
        logger.info("createUserInfo: {}", JSON.toJSONString(userInfo));
        userInfo.setId(UUID.randomUUID().toString());
        int number = userMapper.insert(UserConverter.convertModel2DO(userInfo));
        return new CommonResult<Long>(true).setResult(Integer.toUnsignedLong(number));
    }

}
