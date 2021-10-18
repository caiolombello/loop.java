import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = teclado.nextInt();

        for(int i = 0; i != 11; i += 1){
            int res = num * i;
            System.out.printf("%d * %d = %d%n", num, i, res);
        }
    }
}
