import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        System.out.println("Digite um número: ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int cont = 0;
        while(cont != 10){
            cont += 1;
            int res = num * cont;
            System.out.printf("%d * %d = %d%n", num, cont, res);
        }
    }
}
