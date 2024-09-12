public class Main {
    public static void main(String[] args) {

        Pokemon pok1 = new Pokemon("Charmander", 4, 4, "Fogo");
        Eletrico pok2 = new Eletrico("Pikachu", 6, 6, "Elétrico");

        pok2.atacar(pok1);
    }

}
