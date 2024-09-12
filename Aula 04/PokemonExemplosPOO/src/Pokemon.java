public class Pokemon {
    String nome;
    String tipo;
    int nivel;
    double tamanho;
    double hp;

    public void atacar(Pokemon adversario){
        double dano = (Math.random()*10);
        System.out.println(this.nome +" Atacou o "+ adversario.nome+" e causou dano "+ dano);
        adversario.hp -= dano;
        //adversario.hp=adversario.hp-dano;
    }

    public void atacar(Pokemon adversario, int dano){
        System.out.println(this.nome +" Atacou o "+ adversario.nome+" e causou dano "+ dano);
        adversario.hp -= dano;
        //adversario.hp=adversario.hp-dano;
    }
     void defender();

    public void apresentar(){
        System.out.println(this.nome);
        System.out.println(this.nivel);
        System.out.println(this.tamanho);
        System.out.println(this.tipo);
        System.out.println(this.hp);
    }

    public static Pokemon capturar(String n, double t, int nivel,String tipo){
        Pokemon p1 = new Pokemon();
        p1.nome= n;
        p1.tamanho=t;
        p1.tipo=tipo;
        p1.nivel=nivel;
        p1.hp=100;
        return p1;
    }

    public Pokemon(String n, double t, int nivel,String tipo){
        this.nome = n;
        this.tamanho = t;
        this.tipo = tipo;
        this.nivel = nivel;
        this.hp = 100;
    }
    public Pokemon(){}
}
