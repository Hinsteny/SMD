package org.hinsteny.facade;

import org.hinsteny.model.vos.UserInfo;
import org.hinsteny.share.result.CommonResult;

/**
 * 用户相关操作服务
 * @author Hinsteny
 * @version $ID: UserService 2018-04-11 10:03 All rights reserved.$
 */
public interface UserService {

    /**
     * 创建一个新用户
     * @param userInfo
     * @return
     */
    CommonResult<Long> createUserInfo(UserInfo userInfo);

}
