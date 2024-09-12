public class Eletrico extends Pokemon {

    String fraqueza;

    public void atacar(Pokemon adversario){
        super.atacar(adversario);
        System.out.println("Esse ataque foi elétrico");
        //adversario.hp=adversario.hp-dano;
    }

    public Eletrico(String n, double t, int nivel, String tipo) {
        super(n, t, nivel, tipo);
        fraqueza = "Terra";
    }
}
