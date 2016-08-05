package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by chenkevin on 8/3/16.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ConcertConfig {

    //@Bean
    //public Audience audience() {
    //    return new Audience();
    //}

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }
}
