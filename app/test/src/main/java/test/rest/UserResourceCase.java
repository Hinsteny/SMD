package test.rest;

import com.alibaba.fastjson.JSON;
import org.hinsteny.rest.request.RegisterRequest;
import org.hinsteny.rest.resource.UserResource;
import org.hinsteny.share.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * user-service test case
 * @author Hinsteny
 * @version $ID: UserServiceCase 2018-04-11 19:39 All rights reserved.$
 */
public class UserResourceCase extends BaseSpringTest {

    @Autowired
    private UserResource userResource;

    @Test
    void testCreateUser() {
        RegisterRequest registerRequest = new RegisterRequest();
        logger.info("Request info: {}", JSON.toJSONString(registerRequest));
        CommonResult<Boolean> result = userResource.register(registerRequest);
        logger.info("Response result: {}", JSON.toJSONString(result));
    }

}
