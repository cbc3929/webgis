package com.webgis.controller;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis.controller
 * @Author:cc
 * @CreateTime:2020-10-27-09-54
 * @Description:分析接口
 */
import com.webgis.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerAnalysis {

    private AnalysisService analysisService;

    @GetMapping("/get/names")
    public List<String> getTableNames(){ return AnalysisService.getTableName(AnalysisService.ds);}

}
