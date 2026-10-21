package mypkg.proxies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.builder.ToStringBuilder;
public class TestResults {
    private static Logger LOGGER = LoggerFactory.getLogger(TestResults.class);
    long advisedMethodTime;
    long unadvisedMethodTime;
    long equalsTime;
    long hashCodeTime;
    long proxyTargetTime;
    @Override
    public String toString() {
        //ToStringBuilder is utility class of common lang which converts objects into string
        return new ToStringBuilder(this)
        .append("advised", advisedMethodTime)
        .append("unadvised", unadvisedMethodTime)
        .append("equals ", equalsTime)
        .append("hashCode", hashCodeTime)
        .append("getProxyTargetClass ", proxyTargetTime)
        .toString();
    }
}
