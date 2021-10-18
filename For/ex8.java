public class ex8 {
    public static void main(String[] args){
        System.out.print("Número\tQuadrado\tCubo");
        for(int i = 0; i != 11; i += 1){
            double quadrado = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);
            System.out.printf("\n%d\t%.0f\t%.0f", i, quadrado, cubo);
        }
    }
}
