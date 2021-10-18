import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Limite superior: ");
        int limSup = teclado.nextInt();

        System.out.println("Incremento: ");
        int inc = teclado.nextInt();

        int i = 0;
        while(i <= limSup){
            System.out.printf("%d ", i);
            i += inc;
        }
    }
}
