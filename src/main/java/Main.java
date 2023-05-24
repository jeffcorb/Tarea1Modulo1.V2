import Utilities.Logs;
import clases.GenerarArray;
import clases.GenerarDatos;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    private static void ejercicio1() {
        Logs.debug("Ejercicio 1");
        Logs.debug("Lista de enemigos: \n");

        final var enemigos = GenerarDatos.crearLista();
        for (var i = 0; i < 150; i++) {
            Logs.debug(enemigos.get(i).toString());
        }

        Logs.info("Cinco Enemigos Aleatorios");
        final var faker = new Faker();
        for (var i = 0; i < 5; i++) {
            Logs.info(enemigos.get(faker.number().numberBetween(1, 150)).toString());
        }
    }

    private static void ejercicio2() {
        final var tamanoLista = GenerarArray.tamanoLista();
        Logs.debug("Tamaño de Lista de Numeros Aleatorios: %d", tamanoLista);

        final var listaAleatoria = GenerarArray.listaAleatoria(tamanoLista);
        Logs.info("Lista Generada: \n\n %s \n", Arrays.toString(listaAleatoria));
        final var listaOrdenada = GenerarArray.bubbleSort(listaAleatoria, tamanoLista);
        Logs.info("Lista ordenada:\n\n %s \n", Arrays.toString(listaOrdenada));
    }

    private static void ejercicio3() {
        final var tamanoLista = GenerarArray.tamanoLista();
        Logs.debug("Cantidad de Nombres : %d", tamanoLista);

        final var listaNombres = GenerarArray.listaAleatoriaNombres(tamanoLista);
        Logs.info("Lista de Nombres: \n\n %s \n", Arrays.toString(listaNombres));

        final var listaNombresOrdenados = GenerarArray.bubbleSortString(listaNombres, tamanoLista);
        Logs.info("Lista Ordenada de Nombres: \n\n %s \n", Arrays.toString(listaNombresOrdenados));
    }

    private static void ejercicio4() {
        final var tamanoLista = GenerarArray.tamanoLista();
        Logs.debug("Cantidad de Enemigos : %d", tamanoLista);

        final var listaEnemigos = GenerarArray.listaEnemigos(tamanoLista);
        Logs.info("Lista de Enemigos: \n\n  %s \n", listaEnemigos);

        final var listaOrdenadaEnemigos = GenerarArray.bubbleSortAtaqueEnemigo(listaEnemigos, tamanoLista);
        Logs.info("Lista ordenada por ataque: \n\n  %s \n", listaOrdenadaEnemigos);
    }

    private static void ejercicio5() {
        final var tamanoLista = GenerarArray.tamanoLista();
        Logs.debug("Cantidad de Enemigos : %d", tamanoLista);

        final var listaEnemigos = GenerarArray.listaEnemigos(tamanoLista);
        Logs.info("Lista de Enemigos: \n\n  %s \n", listaEnemigos);

        final var listaOrdenadaEnemigos = GenerarArray.bubbleSortNombreEnemigo(listaEnemigos, tamanoLista);
        Logs.info("Lista ordenada alfabeticamente por Nombre: \n\n  %s \n", listaOrdenadaEnemigos);

    }
}
