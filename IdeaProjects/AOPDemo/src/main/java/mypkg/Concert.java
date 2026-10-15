package mypkg;
import org.slf4j.*;
import static java.time.Duration.ofMillis; //static variables ko import krane k liye
public class Concert implements Performance{
    private static Logger logger=LoggerFactory.getLogger(Concert.class);
    @Override
    public void execute(){
        logger.info("...la lalala la lalala...");
        try{
            Thread.sleep(ofMillis(2000).toMillis());

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
