package cn.douma.woyo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.douma.woyo.db.dao")
public class SpringBootApplcation {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApplcation.class, args);
    }
}
