package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenkevin on 7/20/16.
 */
//javaConfig
@Configuration
//@ComponentScan
//@ComponentScan("soundsystem")
//@ComponentScan(basePackages={"soundsystem", "video"})
//@ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class})
public class CDPlayerConfig {

    //1. 命名
    //2. 随意装载
    @Bean(name = "lonelyHeartBandClub")
    public CompactDisc sgtPepper() {

        return new SgtPepper();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPepper());
    }

    @Bean
    //@Qualifier()
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
