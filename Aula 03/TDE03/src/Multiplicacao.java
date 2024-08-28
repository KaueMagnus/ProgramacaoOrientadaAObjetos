import java.util.List;

public class Multiplicacao implements Operacao {

    @Override
    public double calcular(List<Double> numeros) {
        double resultado = 1.0;
        for (double numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }
}
