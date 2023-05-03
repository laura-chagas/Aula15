package ExUm;

public class Verificacoes {

    public static boolean verifiqueSeTodosOsNumerosSaoPares(String num) {

        String[] arrayComNumero = num.split(""); // colocar a entrada em um array (quebrar)

        for (int i = 0; i < arrayComNumero.length; i++) {
            int numeroConvertido = Integer.parseInt(arrayComNumero[i]);
            if (numeroConvertido % 2 != 0) {
                return false;
            }
        }

        return true;

    }
}
