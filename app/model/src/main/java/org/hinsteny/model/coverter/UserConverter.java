package org.hinsteny.model.coverter;

import org.hinsteny.model.dos.UserDO;
import org.hinsteny.model.vos.UserInfo;

/**
 * 用户模型转化器
 * @author Hinsteny
 * @version $ID: UserConverter 2018-04-23 19:17 All rights reserved.$
 */
public class UserConverter {

    /**
     * Model -> dos
     * @param userInfo
     * @return dos
     */
    public static UserDO convertModel2DO(UserInfo userInfo) {
        if (userInfo == null) {
            return null;
        }
        UserDO userDO = new UserDO();
        userDO.setId(userInfo.getId());
        userDO.setNickname(userInfo.getNickName());

        return userDO;
    }
}
