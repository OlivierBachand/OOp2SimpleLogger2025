import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger {
    private static final String DateFormat = "dd-MM-yyyy HH:mm:ss";
    private static final String LOG_FILE = "LogFile.txt";
    public void logThis(String pLogMessage, String pLogLevel) {
        String logEntry = String.format("[%s] [%s] %s", pLogLevel, LocalDateTime.now().format(DateTimeFormatter.ofPattern(DateFormat)), pLogMessage);
        try {
            FileWriter writer = new FileWriter(LOG_FILE);
            writer.write(logEntry);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
