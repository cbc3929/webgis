package com.webgis.mapper;

import com.webgis.model.InterfaceWater;

public interface InterfaceWaterMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(InterfaceWater record);

    int insertSelective(InterfaceWater record);

    InterfaceWater selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(InterfaceWater record);

    int updateByPrimaryKey(InterfaceWater record);
}