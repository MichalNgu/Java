import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            File myFile = new File("novy_test.cfg");

            if (myFile.createNewFile()) {
                System.out.println("Soubor byl úspěšně vytvořen: " + myFile.getName());

                FileWriter writer = new FileWriter(myFile);
                writer.write("language=cs\n" +
                                 "theme=dark\n" +
                                 "autosave=true\n" +
                                 "refreshRate=60\n" +
                                 "volume=75\n" +
                                 "fullscreen=false\n" +
                                 "username=admin\n" +
                                 "password=1234\n" +
                                 "timeout=300");
                writer.close();
            } else {
                System.out.println("Soubor už existuje.");
            }

        } catch (IOException e) {
            System.out.println("Nastala chyba.");
            e.printStackTrace();
        }
    }
}