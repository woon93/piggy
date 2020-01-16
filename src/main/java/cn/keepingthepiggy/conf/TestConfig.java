package cn.keepingthepiggy.conf;

import cn.keepingthepiggy.letus.TheName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@org.springframework.context.annotation.Configuration
public class TestConfig {
    @Bean
    public TheName getName1(){
        TheName name = new TheName();
        name.setName("dawang-1");
        return name;
    }

//    @Bean
//    public TheName getName2(){
//        TheName name = new TheName();
//        name.setName("dawang-2");
//        return name;
//    }
}
