package org.hinsteny.model.vos;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Hinsteny
 * @version $ID: UserInfo 2018-04-11 10:20 All rights reserved.$
 */
public class UserInfo implements Serializable {

    private String id;

    private String name;

    private String nickName;

    private int age;

    private LocalDateTime birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
