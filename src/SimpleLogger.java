import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger {
    private static final String DateFormat = "dd-MM-yyyy HH:mm:ss";
    private static SimpleLogger aLogger;
    private SimpleLogger() {}
    public static SimpleLogger getInstance() {
        if (SimpleLogger.aLogger == null) {
            SimpleLogger.aLogger = new SimpleLogger();
        }
        return SimpleLogger.aLogger;
    }
    public void logThis(String pLogMessage, String pLogLevel) {
        String logEntry = String.format("[%s] [%s] %s", pLogLevel, LocalDateTime.now().format(DateTimeFormatter.ofPattern(DateFormat)), pLogMessage);
        System.out.println(logEntry);
    }
}
