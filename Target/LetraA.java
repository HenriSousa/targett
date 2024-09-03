import java.util.Scanner;

/**
 * LetraA
 * <p> A Classe LetraA foi criada para verificar a quantidade de vezes
 * que a letra 'a' aparece no texto digitado.
 * 
 * @author Luiz Henrique de Sousa Costa
 * @version 1.0
 * @since 03/09/2024
 */

public class LetraA {

    /**
     * Método para converter um texto em letras minúsculas.
     * @param letter recebera um valor do tipo String.
     * @return o Método retornara o texto recebido com todas as
     * letras minúsculas.
     */
    
    public static String toLowerCase(String letter){
        return letter.toLowerCase();
    }

    /**
     * Método para contar as ocorrências da letra 'a' em uma string.
     * @param letter recebera um valor do tipo String.
     * @return o Método retornara a quantidade que a letra 'a' apareceu
     * na frase ou palavra recebida.
     */
    
    public static long countLetterA(String letter){
        return letter.chars().filter(ch -> ch == 'a').count();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.println("Digite uma palavra: ");
        
        // Recebe o valor do usuário
        String letter = sc.nextLine();
        
        // Converte o texto ou palavra recebida para minúsculo
        String lowerCaseLetter = toLowerCase(letter);
        
        // Conta o número da quantidade que apareceu a letra 'a'
        long count = countLetterA(lowerCaseLetter);
        
        // Estrutura de decisão para visualizar o resultado.
        System.out.println("A letra 'a' " + 
        (count > 0 ? "ocorre " + count + " vezes" : "não foi encontrada") + 
        " na string.");

        sc.close();
                
    }
}
