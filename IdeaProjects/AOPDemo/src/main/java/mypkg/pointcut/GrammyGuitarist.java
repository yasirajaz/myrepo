package mypkg.pointcut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrammyGuitarist implements Singer{
    private static Logger logger= LoggerFactory.getLogger(GrammyGuitarist.class);
    @Override
    public void sing(){
        logger.info("sing: mahaul pura wavy");
    }
    public void sing(Guitar guitar){
        logger.info("play: "+guitar.play());
    }
    public void talk(){
        logger.info("talk");
    }
    public void rest(){
        logger.info("zzzzzzzzzz");
    }

}
class Guitar{
    public String play(){
        return "sa re ga ma";
    }
}
