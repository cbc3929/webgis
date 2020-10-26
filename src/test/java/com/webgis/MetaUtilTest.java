package com.webgis;

import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.meta.MetaUtil;
import cn.hutool.db.meta.Table;
import com.sun.org.apache.xpath.internal.functions.FuncStringLength;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.util.List;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis
 * @Author:cc
 * @CreateTime:2020-10-26-16-34
 * @Description:测试获取表结构
 */

public class MetaUtilTest<string> {
    DataSource ds = DSFactory.get(); // 加载 默认数据库
    @Test
    public void getTablesTest() {
        List<String> tables = MetaUtil.getTables(ds);
        System.out.println(tables);

    }

    @Test
    public void getTableMetaTest() {
        Table table = MetaUtil.getTableMeta(ds, "Table_Name");
        System.out.println(table);
    }
}
