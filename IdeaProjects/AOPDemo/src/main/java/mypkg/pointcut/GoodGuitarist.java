package mypkg.pointcut;
import org.slf4j.*;

public class GoodGuitarist implements Singer{
    public static Logger logger= LoggerFactory.getLogger(GoodGuitarist.class);
    @Override
    public void sing(){
        logger.info("I am a rockstar");
    }
}
