package com.webgis.Bean;



import cn.hutool.db.DbUtil;
import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.meta.MetaUtil;
import cn.hutool.db.meta.Table;
import cn.hutool.log.Log;

import javax.sql.DataSource;
import javax.swing.*;
import java.util.List;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis.Bean
 * @Author:cc
 * @CreateTime:2020-10-26-15-27
 * @Description:分析功能
 */
public class Analysis {
    //获取默认数据源
    DataSource ds = DSFactory.get();
    //获取所有表名
    private static void getTableMetaInfo(DataSource ds) {
        // 获得当前库的所有表的表名
        List<String> tableNames = MetaUtil.getTables(ds);

        /*
         * 获得表结构 表结构封装为一个表对象，里面有Column对象表示一列，列中有列名、类型、大小、是否允许为空等信息
         */
        Table table = MetaUtil.getTableMeta(ds, "TABLE_NAME");
    }


}

