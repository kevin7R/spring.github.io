import model.knights.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenkevin on 6/12/16.
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight =  context.getBean("knight",Knight.class);
        knight.embarkOnQuest();

    }
}