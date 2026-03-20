
import java.util.Scanner;

//@autor Leonidas Caliel de Carvalho

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        
        System.out.print("Digite a medida da altura do retangulo: ");
        medAlt = entrada.nextDouble(); //scanf("%lf", &medAlt);
        System.out.print("Digite a medida da base do retangulo: ");
        medBase = entrada.nextDouble();
        
        Retangulo objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("\n\nMedida da altura do retangulo: " + objRet.getAltura());
        System.out.println("Medida da base do retangulo: " + objRet.getBase());
        System.out.println("Medida da area do retangulo: " + objRet.calcArea());
        System.out.println("Medida do Perimetro do retangulo: " + objRet.caclPerimetro());
        System.out.println("Medida da diagonal do retangulo: " + objRet.calcDiagonal());
    }
    
}
