package org.hinsteny.rest.resource.impl;

import java.util.function.Function;
import org.hinsteny.model.vos.UserInfo;
import org.hinsteny.rest.resource.UserResource;
import org.hinsteny.rest.request.RegisterRequest;
import org.hinsteny.share.result.CommonResult;
import org.hinsteny.utils.DataFactory;
import org.mortbay.util.ajax.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Hinsteny
 * @version $ID: UserResourceImpl 2018-04-03 20:28 All rights reserved.$
 */
public class UserResourceImpl implements UserResource, InitializingBean {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("start");
    }


    /**
     * 用户注册
     */
    @Override
    public CommonResult<UserInfo> getUser(Long id) {
        Function<Long, UserInfo> apply = (in) -> {
            UserInfo userInfo = new UserInfo();
            userInfo.setId(String.valueOf(in));
            return userInfo;
        };
        return new CommonResult<UserInfo>(true).setResult(DataFactory.buildData(apply, id));
    }

    /**
     * 用户注册
     *
     * @param registerRequest
     * @return
     */
    @Override
    public CommonResult<Boolean> register(RegisterRequest registerRequest) {
        logger.info("User register: {}", JSON.toString(registerRequest));
        return new CommonResult<Boolean>(true).setResult(true);
    }
}
