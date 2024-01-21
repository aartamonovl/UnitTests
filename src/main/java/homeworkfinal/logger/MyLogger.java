package homeworkfinal.logger;

import java.util.logging.Logger;

public class MyLogger {
    private final Logger logger = Logger.getLogger(getClass().getName());

    public void showMessage(final String message) {
        logger.info(message);
    }
}
