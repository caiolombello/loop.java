import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Limite superior: ");
        int limSup = teclado.nextInt();

        System.out.println("Incremento: ");
        int inc = teclado.nextInt();

        for(int i = 0; i <= limSup; i += inc){
            System.out.printf("%d ", i);
        }
    }
}
