public class ex5 {
    public static void main(String[] args){
        boolean x = false;
        int cont = 50;
        while (!x) {
            if (cont == 0){
                x = true;
            }
            System.out.println(cont);
            cont -= 2;
        }
    }
}
