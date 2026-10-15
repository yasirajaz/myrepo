package mypkg.pointcut;

import org.slf4j.*;

public class GreatGuitarist implements Singer{
    public static Logger logger= LoggerFactory.getLogger(GreatGuitarist.class);
    @Override
    public void sing(){
        logger.info("Dil ke armaan aansuo me beh gye");
    }
}
