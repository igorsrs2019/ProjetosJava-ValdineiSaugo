package exemplos;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero01 = teclado.nextInt();
        System.out.println(numero01);
    }
}
