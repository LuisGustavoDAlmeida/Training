import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\luisg\\AppData\\Local\\Temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // O Buffered é instanciado a partir do File Reader, uma abstração maior dele
            String line = br.readLine(); // Se o arquivo estiver no final ele retornará null

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
