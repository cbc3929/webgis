package com.webgis.service.impl;
import com.webgis.model.MapElement;
import com.webgis.mapper.MapElementMapper;
import com.webgis.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis.service.impl
 * @Author:cc
 * @CreateTime:2020-10-09-10-22
 * @Description:
 */
@Service
public  class MapServiceimpl implements MapService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MapElementMapper mapElementMapper;
    private String geometry;
    private double radius;

    @Override
    public List<MapElement> findAll() {
        return mapElementMapper.findAll();
    }

    @Override
    public List<MapElement> findMapElementByCondition(MapElement mapElement) {
        return mapElementMapper.findMapElementByCondition(mapElement);
    }

    @Override
    public void addMapElement(MapElement mapElement) {
        mapElementMapper.addMapElement(mapElement);
    }

    @Override
    public MapElement findById(Long id) {
        return mapElementMapper.findById(id);
    }

    @Override
    public void updateMapElement(MapElement mapElement) {
        mapElementMapper.updateMapElement(mapElement);
    }

    @Override
    public void deleteMapElement(Long id) {
        mapElementMapper.deleteMapElement(id);
    }

    @Override
    public List<MapElement> findMapElementByCircle(String geometry, double radius) {
        return mapElementMapper.findMapElementByCircle(geometry, radius);
    }

    @Override
    public List<MapElement> findMapElementByPolygon(String geometry) {
        return mapElementMapper.findMapElementByPolygon(geometry);
    }





}
