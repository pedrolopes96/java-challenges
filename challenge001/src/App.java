/*************************************************************************
 *  1-Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int estoqueMedio, estoqueMinimo, estoqueMaximo;

        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o estoque mínimo: \n\n" );
        estoqueMinimo = entrada.nextInt();
        System.out.print("Digite o estoque máximo: \n\n");
        estoqueMaximo = entrada.nextInt();

        estoqueMedio = (estoqueMinimo + estoqueMaximo) / 2;

        System.out.println("O estoque médio é: " + estoqueMedio + ".");
    }
}
