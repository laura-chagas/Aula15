package ExQuatro;
import java.util.Scanner;
/*Escreva um programa que leia um número em polegadas e o
converta em metros. Nota: Uma polegada é 0,0254 metros.*/

public class Principal{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int polegada = scan.nextInt();

        Conversor.converterParaPolegada(polegada);


    }
}
