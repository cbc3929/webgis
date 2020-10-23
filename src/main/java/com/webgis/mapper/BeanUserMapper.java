package com.webgis.mapper;

import com.webgis.Bean.BeanUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis.mapper
 * @Author:cc
 * @CreateTime:2020-10-09-09-49
 * @Description:
 */
@Repository
@Mapper

public interface BeanUserMapper {



    //查询

    @Select("select * from user_info where id=#{id}")
    BeanUser selectId(Integer id);



    //删除

    @Delete("delete from user_info where id=#{id}")
    int deleteId(Integer id);



    //插入

    @Insert("insert into user_info(id,user_name,pass_word,realname) values(#{id},#{user_name},#{pass_word},#{realname})")
    int insertBean(BeanUser beanUser);



    //修改

    @Update("update user_info set user_name=#{user_name},pass_word=#{pass_word},realname=#{realname} where id=#{id}")
    int UpdateBean(BeanUser beanUser);

} 