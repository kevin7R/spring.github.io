package com.kevin.conditon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenkevin on 8/1/16.
 */
@Configuration
public class MagicConfig {

    @Bean
    @Conditional(MagicBeanConditon.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
