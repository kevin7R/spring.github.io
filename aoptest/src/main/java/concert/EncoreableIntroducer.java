package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by chenkevin on 8/4/16.
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "concert.Performance+",defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
