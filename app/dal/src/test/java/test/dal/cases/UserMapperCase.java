package test.dal.cases;

import com.alibaba.fastjson.JSON;
import org.hinsteny.dal.mapper.UserMapper;
import org.hinsteny.model.dos.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import test.dal.BaseSpringTest;

import java.util.Date;
import java.util.UUID;

/**
 * @author Hinsteny
 * @version $ID: UserMapperCase 2018-04-12 19:47 All rights reserved.$
 */
public class UserMapperCase extends BaseSpringTest {

    @Autowired(required = false)
    private UserMapper userMapper;

    public void createUserTest() {
        UserDO userDO = new UserDO();
        userDO.setId(UUID.randomUUID().toString());
        userDO.setNickname("Hinsteny");
        userDO.setSex("1");
        userDO.setGmtCreate(new Date());
        int result = userMapper.insert(userDO);
        logger.info("Create new user: {}, result: {}", JSON.toJSONString(userDO), result);
    }
}
