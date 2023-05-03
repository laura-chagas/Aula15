package ExUm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num = scan.next(); // entrada de dados do usuario

        System.out.println(Verificacoes.verifiqueSeTodosOsNumerosSaoPares(num));


    }

}

