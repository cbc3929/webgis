package com.webgis.service;



import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.meta.MetaUtil;

import javax.sql.DataSource;
import java.util.List;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis.Bean
 * @Author:cc
 * @CreateTime:2020-10-26-15-27
 * @Description:分析功能
 */


public  interface AnalysisService {
    //获取默认数据源
    DataSource ds = DSFactory.get();
    //获取所有表名
     static List<String> getTableName(DataSource ds) {
        // 获得当前库的所有表的表名
        List<String> tableNames = MetaUtil.getTables(ds);
        return tableNames;

    }


}

