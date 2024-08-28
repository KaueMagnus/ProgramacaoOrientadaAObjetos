import java.util.List;

public class Calculadora {

    public double executarCalculo(Operacao operacao, List<Double> numeros) {
        return operacao.calcular(numeros);
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        List<Double> numeros = List.of(5.0, 25.0);

        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        System.out.println("Soma: " + calculadora.executarCalculo(soma, numeros));
        System.out.println("Subtracao: " + calculadora.executarCalculo(subtracao, numeros));
        System.out.println("Multiplicação: " + calculadora.executarCalculo(multiplicacao, numeros));
        System.out.println("Divisão: " + calculadora.executarCalculo(divisao, numeros));
    }
}
