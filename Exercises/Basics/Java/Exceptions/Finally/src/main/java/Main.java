import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            // Sistema para ler arquivos
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        } finally { // Será executando independentemente do que estiver no try e no catch, ele é algo que ocorerrá no fim
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally Ok!");
        }
    }
}
