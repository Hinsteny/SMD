package org.hinsteny.rest.request;

import java.io.Serializable;

/**
 * 注册请求实体
 * @author Hinsteny
 * @version $ID: RegisterRequest 2018-04-03 20:30 All rights reserved.$
 */
public class RegisterRequest implements Serializable {

    private static final long serialVersionUID = 6231638606181828553L;

    /** 手机 */
    private String            mobile;

    /** 验证码 */
    private String            captcha;

    /** 密码 */
    private String            password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
