package com.seven.forum;import com.seven.forum.entity.lhj.UserDynamicEntity;import com.seven.forum.service.lhj.UserDynamicService;import org.mybatis.spring.annotation.MapperScan;import org.springframework.boot.SpringApplication;import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.context.ConfigurableApplicationContext;import java.util.List;@SpringBootApplication@MapperScan("com.seven.forum.dao")public class SpringBootApp {    public static void main(String[] args) {        ConfigurableApplicationContext run =                SpringApplication.run(SpringBootApp.class, args);        UserDynamicService bean = run.getBean(UserDynamicService.class, run);        List<UserDynamicEntity> userDynamicEntities = bean.listFollowUserDynamic(1,4,123);        for (UserDynamicEntity userDynamicEntity : userDynamicEntities) {            System.out.println("userDynamicEntity = " + userDynamicEntity);        }    }}