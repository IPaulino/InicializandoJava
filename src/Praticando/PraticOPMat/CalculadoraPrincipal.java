package Praticando.PraticOPMat;

public class CalculadoraPrincipal {
    public static void CalcOperacao(OperacaoMat o, double x,double y){
        System.out.println(o.calcular(x,y));
    }

    public static void main(String[] args) {
        CalcOperacao(new Soma(),10,1000);
        CalcOperacao(new Multiplicar(),5,25);
        CalcOperacao(new Divisao(),5,5);
        CalcOperacao(new Subtracao(),10,5);
    }
}
