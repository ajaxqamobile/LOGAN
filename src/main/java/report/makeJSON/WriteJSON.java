package report.makeJSON;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {

    public static void writeToJSON(int index, String text) {
        String filePath = "HTS json/Info/Devices/";

        if (index < 6) {
            try (
                    FileWriter writer = new FileWriter(filePath + File.separator + "Button " + index + ".json", false)) {
                // запись всей строки
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.flush();
            } catch (IOException ignored) {
            }
        } else if (index == 6){
            try (FileWriter writer = new FileWriter(filePath + File.separator + "Button OFF.json", false)) {
                // запись всей строки
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.flush();
            } catch (IOException ignored) {
            }
        } else {
            try (FileWriter writer = new FileWriter(filePath + File.separator + "Button Long Name.json", false)) {
                // запись всей строки
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.flush();
            } catch (IOException ignored) {
            }
        }
    }
}
