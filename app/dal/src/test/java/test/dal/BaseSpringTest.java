package test.dal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * @author Hinsteny
 * @version $ID: BaseSpringTest 2018-04-11 19:33 All rights reserved.$
 */
@Test
@ContextConfiguration(locations = {"classpath*:spring/dal.xml"})
public abstract class BaseSpringTest extends AbstractTestNGSpringContextTests {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

}
