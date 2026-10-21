package mypkg.pointcut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guitarist implements Singer{
    private static Logger logger=LoggerFactory.getLogger(Guitarist.class);
    @Override
    public void sing(){
        logger.info("HA mjhme hai akad aur mjhpe jachti bhi h");
    }
    public void singasong(){
        logger.info("mere gaano pe wo muh chhupa ke hasti bhi h");
    }

    @Override
    public void rest(){
        logger.info("resting zzzzzz guitarist");
    }
}
