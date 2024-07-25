import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Folder Path");
        String strPath = sc.nextLine();

        File path = new File(strPath); // O File também pode ser um path de um arquivo

        File[] folders = path.listFiles(File::isDirectory); // Criará um vetor contendo o caminho das pastas
        System.out.println("Folders: ");

        for (File folder : folders) {
            System.out.println("Path: " + folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files");

        for (File file : files) {
            System.out.println("File: " + file);
        }

        Boolean check = new File(strPath + "\\subdir").mkdir(); // Criando uma subpasta "subdir"
        System.out.println("Directory status: " + check);

        sc.close();
    }
}
