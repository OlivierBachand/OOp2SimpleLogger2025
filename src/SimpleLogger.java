import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger {
    private static final String DateFormat = "dd-MM-yyyy HH:mm:ss";
    public void logThis(String pLogMessage, String pLogLevel) {
        String logEntry = String.format("[%s] [%s] %s", pLogLevel, LocalDateTime.now().format(DateTimeFormatter.ofPattern(DateFormat)), pLogMessage);
        System.out.println(logEntry);
    }
}
