package com.yh.config;

import org.apache.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
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

    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        // 指定 YAML 文件路径
        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        return YamlShardingDataSourceFactory.createDataSource(file);
    }
}
