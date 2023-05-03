package ExCinco;

import java.util.Scanner;

/* Escreva um programa Java que receba um número do usuário
e gere um inteiro entre 1 e 7. Ele exibe o nome do dia da
semana. Nota: usem switch case.*/
public class Semana {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        VerificarDia.qualDiaDaSemana(numero);

    }

}
