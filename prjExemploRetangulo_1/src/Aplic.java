//Autor: Leonidas caliel de carvalho

public class Aplic {

    public static void main(String[] args) {
        //definicao de um ponteiro para um objeto
        Retangulo objRet;
        
        //instanciação(alocação) de um objeto da classe retangulo.
        objRet = new Retangulo();
        
        //passagem de mensagem
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da altura do retangulo: " + objRet.getAltura());
        System.out.println("Medida da base do retangulo: " + objRet.getBase());
        System.out.println("Medida da area do retangulo: " + objRet.calcArea());
        System.out.println("Medida do Perimetro do retangulo: " + objRet.caclPerimetro());
        System.out.println("Medida da diagonal do retangulo: " + objRet.calcDiagonal());
        
        Retangulo objRet1 = new Retangulo();
        objRet1.setAltura(3.0);
        objRet1.setBase(4.0);
        
        System.out.println("Medida da altura do retangulo: " + objRet1.getAltura());
        System.out.println("Medida da base do retangulo: " + objRet1.getBase());
        System.out.println("Medida da area do retangulo: " + objRet1.calcArea());
        System.out.println("Medida do Perimetro do retangulo: " + objRet1.caclPerimetro());
        System.out.println("Medida da diagonal do retangulo: " + objRet1.calcDiagonal());
    }
    
}
