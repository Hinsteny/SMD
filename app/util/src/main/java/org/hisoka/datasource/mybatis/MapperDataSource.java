package org.hisoka.datasource.mybatis;

import java.lang.annotation.*;

/**
 * specify which Data-Source will be used
 * @author Hinsteny
 * @version $ID: MapperDataSource 2018-04-11 21:02 All rights reserved.$
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MapperDataSource {

    /**
     * data-source name
     * @return
     */
    String value() default "";
}
