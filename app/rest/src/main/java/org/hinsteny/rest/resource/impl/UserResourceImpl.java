package org.hinsteny.rest.resource.impl;

import org.hinsteny.rest.resource.UserResource;
import org.hinsteny.rest.request.RegisterRequest;
import org.hinsteny.share.result.CommonResult;
import org.mortbay.util.ajax.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Hinsteny
 * @version $ID: UserResourceImpl 2018-04-03 20:28 All rights reserved.$
 */
public class UserResourceImpl implements UserResource {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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
