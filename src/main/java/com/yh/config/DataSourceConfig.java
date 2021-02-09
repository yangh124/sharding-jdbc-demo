package com.yh.config;

import org.apache.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlMasterSlaveDataSourceFactory;
import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author : yh
 * @date : 2021/2/5 22:18
 */
@Configuration
public class DataSourceConfig {
    /**
     * 分库分表配置
     * @return
     * @throws IOException
     * @throws SQLException
     */
//    @Bean
//    public DataSource dataSource() throws IOException, SQLException {
//        // 指定 YAML 文件路径
//        File file = ResourceUtils.getFile("classpath:sharding-jdbc-database1.yml");
//        return YamlShardingDataSourceFactory.createDataSource(file);
//    }


    /**
     * 读写分离
     * @return
     * @throws IOException
     * @throws SQLException
     */
    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        // 指定 YAML 文件路径
        File file = ResourceUtils.getFile("classpath:sharding-jdbc-masterSlave.yml");
        return YamlMasterSlaveDataSourceFactory.createDataSource(file);
    }
}

