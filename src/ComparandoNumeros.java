import java.util.Scanner;

public class ComparandoNumeros {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Olá, vamos comparar dois números que você digitar");

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais!");
        }

        scanner.close();

    }

}