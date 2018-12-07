package com.liziyang.dall.greengao2;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class UserInfo {
    /**
     * autoincrement设置自动递减功能
     */
    @Id(autoincrement = true)
    Long id;
    @Unique
    public String name;
    //unique唯一
    @NotNull
    int number;
    @Generated(hash = 743709815)
    public UserInfo(Long id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
    @Generated(hash = 1279772520)
    public UserInfo() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    

}
