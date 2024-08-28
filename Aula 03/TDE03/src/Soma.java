import java.util.List;

public class Soma implements Operacao {

    @Override
    public double calcular(List<Double> numeros) {
        double resultado = 0.0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}
