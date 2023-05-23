package clases;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class GenerarArray {
    public static int tamanoLista() {
        final var faker = new Faker();
        return faker.number().numberBetween(20, 50);
    }

    public static int[] listaAleatoria(int tamanoLista) {
        var listaAleatoria = new int[tamanoLista];
        final var faker = new Faker();
        for (var i = 0; i < tamanoLista; i++) {
            listaAleatoria[i] = faker.number().numberBetween(100, 1000);
        }
        return listaAleatoria;
    }

    public static int[] bubbleSort(int[] listaAleatorio, int tamanoLista) {

        for (var i = 0; i < tamanoLista - 1; i++) {
            var swapped = false;

            for (var j = 0; j < tamanoLista - i - 1; j++) {
                if (listaAleatorio[j] > listaAleatorio[j + 1]) {
                    int temp = listaAleatorio[j];
                    listaAleatorio[j] = listaAleatorio[j + 1];
                    listaAleatorio[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        return listaAleatorio;
    }

    public static String[] listaAleatoriaNombres(int tamanoLista) {
        var listaAleatoriaNombres = new String[tamanoLista];
        final var faker = new Faker();
        for (var i = 0; i < tamanoLista; i++) {
            listaAleatoriaNombres[i] = faker.name().firstName();
        }
        return listaAleatoriaNombres;
    }

    public static String[] bubbleSortString(String[] listaAleatorioNombres, int tamanoLista) {

        for (int i = 0; i < tamanoLista - 1; i++) {
            var swapped = false;

            for (int j = 0; j < tamanoLista - i - 1; j++) {
                if (listaAleatorioNombres[j].compareTo(listaAleatorioNombres[j + 1]) > 0) {
                    // Intercambiar las palabras
                    String temp = listaAleatorioNombres[j];
                    listaAleatorioNombres[j] = listaAleatorioNombres[j + 1];
                    listaAleatorioNombres[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        return listaAleatorioNombres;

    }

    public static List<Enemigo> listaEnemigos(int tamanoLista) {
        final var lista = new ArrayList<Enemigo>();

        for (var i = 1; i <= tamanoLista; i++) {
            final var enemigo = new Enemigo();
            enemigo.setId(i);
            lista.add(enemigo);
        }
        return lista;
    }

    public static List<Enemigo> bubbleSortAtaqueEnemigo(List<Enemigo> enemigo, int tamanoLista) {

        for (int i = 0; i < tamanoLista - 1; i++) {
            for (int j = 0; j < tamanoLista - i - 1; j++) {
                if (enemigo.get(j).getAtaque() > (enemigo.get(j + 1).getAtaque())) {
                    Enemigo temp = enemigo.get(j);
                    enemigo.set(j, enemigo.get(j + 1));
                    enemigo.set(j + 1, temp);
                }
            }
        }
        return enemigo;
    }

    public static List<Enemigo> bubbleSortNombreEnemigo(List<Enemigo> enemigo, int tamanoLista) {

        for (int i = 0; i < tamanoLista - 1; i++) {
            for (int j = 0; j < tamanoLista - i - 1; j++) {
                if (enemigo.get(j).getNombre().compareTo(enemigo.get(j + 1).getNombre()) > 0) {
                    Enemigo temp = enemigo.get(j);
                    enemigo.set(j, enemigo.get(j + 1));
                    enemigo.set(j + 1, temp);
                }
            }
        }
        return enemigo;
    }
}
