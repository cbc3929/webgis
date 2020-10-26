package com.webgis.mapper;

import com.webgis.model.InterfaceFramlandSpan;

public interface InterfaceFramlandSpanMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(InterfaceFramlandSpan record);

    int insertSelective(InterfaceFramlandSpan record);

    InterfaceFramlandSpan selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(InterfaceFramlandSpan record);

    int updateByPrimaryKey(InterfaceFramlandSpan record);
}