package com.webgis.controller;

import com.webgis.Bean.BeanUser;
import com.webgis.mapper.BeanUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis.controller
 * @Author:cc
 * @CreateTime:2020-10-09-09-47
 * @Description:用户控制层
 */
@RestController

public class ControllerBean {

    @Autowired

    BeanUserMapper beanUserMapper;

    //查询

    @RequestMapping("/get/{id}")

    public BeanUser getBeanUser(@PathVariable("id") Integer id){

        return beanUserMapper.selectId(id);

    }
    //插入

    @RequestMapping("/insert")

    public BeanUser insertBeanUser(BeanUser beanUser){

        beanUserMapper.insertBean(beanUser);

        return beanUser;

    }
    //修改

    @RequestMapping("/update")

    public BeanUser updateBeanUser(BeanUser beanUser){

        beanUserMapper.UpdateBean(beanUser);

        return beanUser;

    }
    //删除

    @RequestMapping("/delete/{id}")

    public String deleteBeanUser(@PathVariable("id")Integer id){

        beanUserMapper.deleteId(id);

        return "删除成功！";

    }
}
