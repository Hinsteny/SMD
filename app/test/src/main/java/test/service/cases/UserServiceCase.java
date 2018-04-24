package test.service.cases;

import com.alibaba.fastjson.JSON;
import org.hinsteny.facade.UserService;
import org.hinsteny.model.vos.UserInfo;
import org.hinsteny.share.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * user-service test case
 * @author Hinsteny
 * @version $ID: UserServiceCase 2018-04-11 19:39 All rights reserved.$
 */
public class UserServiceCase extends BaseSpringTest {

    @Autowired
    private UserService userService;

    @Test
    void testCreateUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Hinsteny");
        logger.info("Request info: {}", JSON.toJSONString(userInfo));
        CommonResult<Long> result = userService.createUserInfo(userInfo);
        logger.info("Response result: {}", JSON.toJSONString(result));
    }

}
