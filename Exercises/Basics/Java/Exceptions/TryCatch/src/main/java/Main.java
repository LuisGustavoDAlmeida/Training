import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String[] vector = sc.nextLine().split(" "); // Lê a linha inteira e
            // divide em substrings separadas por espaços
            // Cria um novo vetor de Strings e atribui a variável vector
            int position = sc.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e){ // Tratamento de erro para indíce além do vetor
            System.out.println("Posição inválida");
        } catch (InputMismatchException e){ // Tratamento de erro para input inválido
            System.out.println("Input inválido");
        }

        System.out.println("End");
        sc.close();
    }
}
