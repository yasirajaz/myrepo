package mypackage;
import java.util.*;
public class MessageSupportFactory {
    private static MessageSupportFactory instance;
    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;
    private MessageSupportFactory(){
        props=new Properties();
        try{
            props.load(this.getClass().getResourceAsStream("/myproperties.properties"));
            String rendererClass=props.getProperty("renderer.class");
            String providerClass=props.getProperty("provider.class");
            renderer=(MessageRenderer)Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider=(MessageProvider)Class.forName(providerClass).getDeclaredConstructor().newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    static{
        instance=new MessageSupportFactory();
    }
    public static MessageSupportFactory getInstance(){
        return instance;
    }
    public Optional<MessageRenderer> getMessageRenderer(){ //optional used to get reference
        // isse kabhi null nahi milta so,
        //null pointer exception nahi aata h
        return renderer!=null?Optional.of(renderer):Optional.empty();
    }
    public Optional<MessageProvider> getMessageProvider(){
        return provider!=null?Optional.of(provider):Optional.empty();
    }
}
