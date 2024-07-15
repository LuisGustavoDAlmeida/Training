package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println("Qual número inteiro você quer o Digital Root?");
        Scanner inputUser = new Scanner(System.in);
        Integer nInteger = inputUser.nextInt();

        ArrayList<Integer> digitalRoot = new ArrayList<Integer>();
        Integer sum;

        do{
            sum = 0;
            String nString = nInteger.toString();

            for (int i = 0; i < nString.length(); i++){
                char c = nString.charAt(i); // Pegando o número individualmente
                digitalRoot.add(Character.getNumericValue(c)); // Adicionando na lista e convertendo para Inteiro novamente
            }
            for (int n : digitalRoot) {
                sum += n;
            }
            nInteger = sum;

            digitalRoot.clear();
        } while (sum > 10);
        System.out.println(sum);
    }
}