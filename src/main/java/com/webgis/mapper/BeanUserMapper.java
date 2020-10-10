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

    @Select("select * from table_one where id=#{id}")

    public BeanUser selectId(Integer id);



    //删除

    @Delete("delete from table_one where id=#{id}")

    public int deleteId(Integer id);



    //插入

    @Insert("insert into table_one(id,user_name,pass_word) values(#{id},#{user_name},#{pass_word})")

    public int insertBean(BeanUser beanUser);



    //修改

    @Update("update table_one set user_name=#{user_name},pass_word=#{pass_word} where id=#{id}")

    public int UpdateBean(BeanUser beanUser);

}