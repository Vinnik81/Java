import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class CreateFolders extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            String folderName = "Folder" + i;
            File folder = new File(folderName);
            folder.mkdir();
        }
    }
}

class CreateFiles extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            String folderName = "Folder" + i;

            for (int j = 1; j <= 20; j++) {
                String fileName = folderName + "/File" + j + ".txt";
                File file = new File(fileName);

                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

class WriteToFile extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            String folderName = "Folder" + i;

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
}

public class MainThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        CreateFolders createFolders = new CreateFolders();
        CreateFiles createFiles = new CreateFiles();
        WriteToFile writeToFile = new WriteToFile();

        createFolders.start();
        createFiles.start();
        writeToFile.start();

        try {
            createFolders.join();
            createFiles.join();
            writeToFile.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Время выполнения: " + elapsedTime + " миллисекунд");
    }
}
