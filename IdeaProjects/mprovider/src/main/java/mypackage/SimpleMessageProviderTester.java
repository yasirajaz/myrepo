//import mypackage.MessageRenderer;

package mypackage;
/*class SimpleMessageProviderTester {
	public static void main(String[] args) {
		MessageProvider mp = new SimpleMessageProvider();
		MessageRenderer mr = new StandardOutputMessageRenderer();
		mr.setMessageProvider(mp);
		mr.render();
	}
}*/
/*class SimpleMessageProviderTester {
	public static void main(String[] args) {
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer().orElseThrow(() -> new IllegalArgumentException(" message"));
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider().orElseThrow(() -> new IllegalArgumentException(" message"));
		mr.setMessageProvider(mp);
		mr.render();
	}
}*/
import java.util.ServiceLoader;
class SimpleMessageProviderTester{
	public static void main(String[] args){
		ServiceLoader<MessageRenderer> slr=ServiceLoader.load(MessageRenderer.class);
		ServiceLoader<MessageProvider> slp=ServiceLoader.load(MessageProvider.class);
		MessageRenderer mr = slr.findFirst().orElseThrow(() -> new IllegalArgumentException(" message"));
		MessageProvider mp = slp.findFirst().orElseThrow(() -> new IllegalArgumentException(" message"));
		mr.setMessageProvider(mp);
		mr.render();
	}
}
