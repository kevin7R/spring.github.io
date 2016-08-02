import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenkevin on 7/31/16.
 */
@RunWith(JMockit.class)
public class PropertyAPI {
    @Test
    public void psTest() throws IOException {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("encoding","gbk");

        PropertySource source = new MapPropertySource("map", map);

        System.out.println("name : " + source.getName());
        System.out.println("encoding : " + source.getProperty("encoding"));

        PropertySource peopleSource = new ResourcePropertySource("resource", "classpath:resources.properties");

        System.out.println("name : " + peopleSource.getName());
        System.out.println("name : " + peopleSource.getProperty("name"));
    }
}
