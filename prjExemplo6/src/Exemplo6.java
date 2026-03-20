//Auto Leonidas Caliel de Carvalho
//While

public class Exemplo6 {

    public static void main(String[] args) {
        int cont = 0, num;
        num = (int) (Math.random()*100);
        System.out.println("TABUADA DO " + num);
        do {
            System.out.println(num + " x " + cont + " + " + cont * num);
            cont++;
        } while (cont < 10);
    }
}
