package com.webgis.model;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Data;


import java.math.BigDecimal;
/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis.model
 * @Author:cc
 * @CreateTime:2020-10-09-10-26
 * @Description:地理数据实体
 */
@Data
public class MapElement {

    /**
     * 数据库自增主键
     */
    private Long id;

    /**
     * 地图元素的名称（医院，银行，警察局等）
     */
    private String name;


    //地图元素（医院，银行，警察局）以点的形式存储
    /**
     * 地图元素位置点的的纬度
     */
    public Double latitude;

    /**
     * 地图元素位置点的经度
     */
    private Double longitude;

    /**
     * 空间信息转换为字符串
     */
    public String geoStr;

    public double getLongitude() {
        return longitude;
    }
    public String setGeoStr(String geometryToString){
        return geoStr;
    }

    public Long getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }
}