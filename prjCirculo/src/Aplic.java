
import java.util.Scanner;

//Autor Leonidas Caliel de Carvalho
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        
        System.out.println("Digite a medida do Raio: ");
        medRaio = entrada.nextDouble();
        
        Circulo objRet = new Circulo();
        objRet.setRaio(medRaio);
        
        System.out.println("\n\n Medida do Raio do Circulo: " + objRet.getRaio());
        System.out.println("Medida da area do Circulo: " + objRet.calcArea());
        System.out.println("Medida do perimetro do Circulo: " + objRet.calcPerimetro());
        System.out.println("Medida do diametro do Circulo: " + objRet.calcDiametro());
    }
    
}
