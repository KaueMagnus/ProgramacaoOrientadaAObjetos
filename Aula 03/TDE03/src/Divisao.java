import java.util.List;

public class Divisao implements Operacao {

    @Override
    public double calcular(List<Double> numeros) {
        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            resultado /= numeros.get(i);
        }
        return resultado;
    }
}
