package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerarDatos {
    public static List<Enemigo> crearLista() {
        final var lista = new ArrayList<Enemigo>();

        for (var i = 1; i <= 150; i++) {
            final var enemigo = new Enemigo();
            enemigo.setId(i);
            lista.add(enemigo);
        }
        return lista;
    }

    public static Map<Integer, Enemigo> crearMap(List<Enemigo> lista) {
        final var mapEnemigos = new HashMap<Integer, Enemigo>();
        for (var elemento : lista) {
            final var enemigo = elemento.getId();
            mapEnemigos.put(enemigo, elemento);
        }
        return mapEnemigos;

    }
}
