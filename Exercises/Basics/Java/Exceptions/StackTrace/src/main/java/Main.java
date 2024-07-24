import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("End of Program");
    }

    public static void method1(){
        System.out.println("*****Start of Method1*****");
        method2();
        System.out.println("*****End of Method1*****");
    }

    public static void method2() {
        System.out.println("*****Start of Method2*****");

        Scanner sc = new Scanner(System.in);

        try {
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position");
            e.printStackTrace(); // Imprime o rastreamento dessa stack
            // Ele mostrará no terminal a cadeia de chamada de métodos que acarretou a exceção
            sc.next(); // Tempo para ver o StackTrace
        } catch (InputMismatchException e){
            System.out.println("Input error");
        }
        System.out.println("*****End of Method2*****");
        sc.close();
    }
}
