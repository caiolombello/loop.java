public class ex3 {
    public static void main(String[] args){
        int x = 1;
        while (x < 10){
            x += 1;
            int impar = x % 2;
            if(impar == 1){
                System.out.println(x);
            }
        }
    }
}
