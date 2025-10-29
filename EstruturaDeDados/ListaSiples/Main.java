package ListaSiples;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        lista.inserirInicio(10);
        lista.inserirFim(20);
        lista.inserirFim(30);
        lista.exibir();

        System.out.println("Buscar 20: " + lista.buscar(20));
        lista.remover(20);
        lista.exibir();
    }
}
