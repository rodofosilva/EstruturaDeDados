package ListaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.exibir();

        System.out.println("Buscar 2: " + lista.buscar(2));
        lista.remover(2);
        lista.exibir();
    }
}
