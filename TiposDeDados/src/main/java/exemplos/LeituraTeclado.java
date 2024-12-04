package exemplos;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero01 = teclado.nextInt();
        System.out.println(numero01);
        System.out.println("Digite uma palavra: ");
        String mensagem = teclado.next();
        System.out.println(mensagem);

        System.out.println("digite outro numero: " );
        int numero02 = teclado.nextInt();
        System.out.println("Soma de numero01 + numero02 vale: " + (numero01 + numero02));

    }

}
