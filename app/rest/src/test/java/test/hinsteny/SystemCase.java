package test.hinsteny;

import java.util.Properties;

/**
 * @author Hinsteny
 * @version $ID: SystemCase 2018-04-10 11:40 All rights reserved.$
 */
public class SystemCase {


    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties.getProperty("dubbo.application.logger"));
        /*System.setProperty("dubbo.application.logger", "slf4j");
        System.out.println(properties.getProperty("dubbo.application.logger"));*/

    }
}
