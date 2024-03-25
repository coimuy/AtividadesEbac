import java.util.ArrayList;
import java.util.List;

public class ListaCarros {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Honda());
        listaCarros.add(new Civic());
        listaCarros.add(new Toyota());
        listaCarros.add(new Ford());
        listaCarros.add(new Chevrolet());

        for (Carro carro : listaCarros) {
            carro.acelerar();
            carro.frear();
        }
    }
}
