import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void createFoldersAndFiles() {
        for (int i = 1; i <= 20; i++) {
            String folderName = "Folder" + i;
            File folder = new File(folderName);
            folder.mkdir();

            for (int j = 1; j <= 20; j++) {
                String fileName = folderName + "/File" + j + ".txt";
                File file = new File(fileName);

                try {
                    FileWriter writer = new FileWriter(file);
                    for (int k = 1; k <= 1000000; k++) {
                        writer.write(k + ";" + "\t");
                    }
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        createFoldersAndFiles();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Время выполнения: " + elapsedTime + " миллисекунд");
    }
}