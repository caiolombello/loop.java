public class ex8 {
    public static void main(String[] args){
        int num = 0;
        while (num != 10){
            num += 1;
            double quadrado = Math.pow(num,2);
            double cubo = Math.pow(num,3);
            System.out.printf("""
                    Número    quadrado    cubo
                      %d        %.0f        %.0f
                    """, num, quadrado, cubo);
        }
    }
}
