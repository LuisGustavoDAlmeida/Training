import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\luisg\\AppData\\Local\\Temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file); // Para ler o nosso arquivo
            while (sc.hasNextLine()) { // Se tiver uma próxima linha continuar lendo
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) { // É necessário do if, porque se for nulo e ele tentar fechar irá dar NullPointerException
                sc.close();
            }
        }
    }
}
