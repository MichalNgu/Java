import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        Setting setting = new Setting();

        try {
            File file = new File("novy_test.cfg");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();

                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
                }

                String[] parts = line.split("=", 2);
                if (parts.length != 2) continue;

                String key = parts[0].trim();
                String value = parts[1].trim();

                switch (key) {
                    case "language" -> setting.language = value;
                    case "theme" -> setting.theme = value;
                    case "autosave" -> setting.autosave = Boolean.parseBoolean(value);
                    case "refreshRate" -> setting.refreshRate = Integer.parseInt(value);
                    case "volume" -> setting.volume = Integer.parseInt(value);
                    case "fullscreen" -> setting.fullscreen = Boolean.parseBoolean(value);
                    case "username" -> setting.username = value;
                    case "password" -> setting.password = value;
                    case "timeout" -> setting.timeout = Integer.parseInt(value);
                }
            }

            sc.close();

            System.out.println("Načtené nastavení:");
            System.out.println(setting);

        } catch (FileNotFoundException e) {
            System.out.println("Soubor s nastavením nebyl nalezen.");
            e.printStackTrace();
        }
    }
}

class Setting {
    public String language;
    public String theme;
    public boolean autosave;
    public int refreshRate;
    public int volume;
    public boolean fullscreen;
    public String username;
    public String password;
    public int timeout;

    @Override
    public String toString() {
        return "language=" + language + "\n" +
                "theme=" + theme + "\n" +
                "autosave=" + autosave + "\n" +
                "refreshRate=" + refreshRate + "\n" +
                "volume=" + volume + "\n" +
                "fullscreen=" + fullscreen + "\n" +
                "username=" + username + "\n" +
                "password=" + password + "\n" +
                "timeout=" + timeout;
    }
}