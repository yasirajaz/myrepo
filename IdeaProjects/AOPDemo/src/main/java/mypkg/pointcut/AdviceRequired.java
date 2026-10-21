package mypkg.pointcut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface AdviceRequired{}
class AnnotatedGuitarist implements Singer {
    private static Logger LOGGER = LoggerFactory.getLogger(AnnotatedGuitarist.class);
    @Override
    public void sing() {}

    @Override
    public void rest() {

    }

    @AdviceRequired
    public void sing(Guitar guitar) {
        LOGGER.info("play: " + guitar.play());
    }
}