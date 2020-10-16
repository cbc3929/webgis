package com.webgis.Bean;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis.Bean
 * @Author:cc
 * @CreateTime:2020-10-09-09-51
 * @Description:
 */
public class BeanUser {

    private Integer id;
    private String user_name;
    private String pass_word;
    private String realname;

    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }
    public String getReal_name(){

        return realname;

    }

    public String getUser_name() {

        return user_name;

    }

    public void setUser_name(String user_name) {

        this.user_name = user_name;

    }

    public String getPass_word() {

        return pass_word;

    }

    public void setPass_word(String pass_word) {

        this.pass_word = pass_word;

    }
    public void setReal_name(String realname){
        this.realname=realname;
    }
}
