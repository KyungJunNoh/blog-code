import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogApplication.class);

        for (int i = 0; i <= 10; i++) {
            logger.trace("trace 로깅 : {}", i);
            logger.debug("debug 로깅 : {}", i);
            logger.info("info 로깅 : {}", i);
            logger.warn("warn 로깅 : {}", i);
            logger.error("error 로깅 : {}", i);
        }
    }
}
