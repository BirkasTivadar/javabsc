package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.List;

public class Underground {

    public static void main(String[] args) {
        Operations operations = new Operations();
        List<String> wagonNumbers = null;

        try {
            wagonNumbers = operations.readFile();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        String dailySchedule = null;
        if (wagonNumbers != null) {
            dailySchedule = operations.getDailySchedule(wagonNumbers);
        }
        System.out.println(dailySchedule);
    }
}
