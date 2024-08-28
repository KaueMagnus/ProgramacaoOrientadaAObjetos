import java.util.ArrayList;
import java.util.List;

public class CrudTDE {
    public static void main(String[] args) {
        List<String> listaDeItens = new ArrayList<>();

        adicionarItem(listaDeItens, "Arroz");
        adicionarItem(listaDeItens, "Feijão");
        adicionarItem(listaDeItens, "Carne");

        exibirLista(listaDeItens);

        atualizarItem(listaDeItens, 1, "Batata");

        exibirLista(listaDeItens);

        removerItem(listaDeItens, 0);

        exibirLista(listaDeItens);
    }


    // CREATE
    public static void adicionarItem(List<String> lista, String item) {
        lista.add(item);
        System.out.println("Item adicionado: " + item);
    }

    // READ
    public static void exibirLista(List<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Itens na lista:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + ": " + lista.get(i));
            }
        }
    }

    // UPDATE
    public static void atualizarItem(List<String> lista, int indice, String novoItem) {
        if (indice >= 0 && indice < lista.size()) {
            String itemAntigo = lista.set(indice, novoItem);
            System.out.println("Item atualizado: " + itemAntigo + " para " + novoItem);
        } else {
            System.out.println("Índice inválido! Não foi possível atualizar o item.");
        }
    }

    // DELETE
    public static void removerItem(List<String> lista, int indice) {
        if (indice >= 0 && indice < lista.size()) {
            String itemRemovido = lista.remove(indice);
            System.out.println("Item removido: " + itemRemovido);
        } else {
            System.out.println("Índice inválido! Não foi possível remover o item.");
        }
    }

}
