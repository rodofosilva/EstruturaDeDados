package ListaDupla;

public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.inserirInicio(5);
        lista.inserirFim(15);
        lista.inserirFim(25);
        lista.exibirFrente();
        lista.exibirReverso();

        System.out.println("Buscar 15: " + lista.buscar(15));
        lista.remover(15);
        lista.exibirFrente();
    }
}

