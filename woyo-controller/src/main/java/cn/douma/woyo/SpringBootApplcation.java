package cn.douma.woyo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = { "cn.douma.woyo.db" }, sqlSessionFactoryRef = "sqlSessionFactory")
@ComponentScan(basePackages={"cn.douma.woyo"})
public class SpringBootApplcation {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApplcation.class, args);
    }
}
