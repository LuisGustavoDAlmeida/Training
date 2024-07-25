import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] {
                "Bom Dia",
                "Boa Noite",
                "Boa tarde"
        };
        String path = "C:\\Users\\luisg\\AppData\\Local\\Temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            // O parâmetro true indica que não queremos recriar o arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
