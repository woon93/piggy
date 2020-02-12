package cn.keepingthepiggy.configuration;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DozerConfig {

    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper mapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(Arrays.asList("dozer/dozer-mapping.xml"));
        return mapper;
    }
}