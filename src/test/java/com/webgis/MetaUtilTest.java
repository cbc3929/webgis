package com.webgis;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.meta.MetaUtil;
import cn.hutool.db.meta.Table;
import com.sun.org.apache.xpath.internal.functions.FuncStringLength;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;
import java.lang.reflect.Array;
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
        Table table = MetaUtil.getTableMeta(ds, "tables");

        try {
            List<Entity> entities = Db.use().query("select * from user where name = ? and age > ?","1",2);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
    }

