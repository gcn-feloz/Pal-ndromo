import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.nextLine();
        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida = invertida + Character.toString(palavra.charAt(i));
        }

        if (palavra.equals(invertida)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}
