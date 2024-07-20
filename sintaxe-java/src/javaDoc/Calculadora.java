/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note: </b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Sofia
 * @version 1.0
 * @since 19/07/2024
*/
package javaDoc;
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros.
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números
     */
    public static void main(String args[]){
        int a = 4;
        int b = 5;
        System.out.println("Soma é: " + (a+b));

    }
    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }
}