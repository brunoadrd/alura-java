import java.util.Scanner;

public class DesafioOne {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int choice1 = keyboard.nextInt();

        if (choice1 >= 0) {
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é negativo!");
        }

        System.out.println("Digite outro número inteiro:");
        int choice2 = keyboard.nextInt();

        if (choice1 == choice2) {
            System.out.println("Os números são iguais!");
        } else if (choice1 > choice2) {
            System.out.println("O primeiro número é maior que o segundo!");
        } else if (choice1 < choice2) {
            System.out.println("O primeiro número é menor que o segundo!");
        } else {
            System.out.println("Os números são iguais!");
        }

    }
}
