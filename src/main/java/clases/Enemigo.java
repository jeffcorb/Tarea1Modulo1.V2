package clases;

import com.github.javafaker.Faker;

public class Enemigo {
    private int id;
    private final String nombre;

    private final double peso;

    private final int ataque;

    private final double puntosExp;

    private final boolean esTerrestre;

    public Enemigo() {
        final var faker = new Faker();
        nombre = faker.name().firstName();
        peso = faker.number().randomDouble(2, 30, 80);
        ataque = faker.number().numberBetween(10, 30);
        puntosExp = faker.number().randomDouble(2, 0, 10);
        esTerrestre = faker.bool().bool();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAtaque() {
        return ataque;
    }

    public double getPuntosExp() {
        return puntosExp;
    }

    public boolean isEsTerrestre() {
        return esTerrestre;
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", ataque=" + ataque +
                ", puntosExp=" + puntosExp +
                ", esTerrestre=" + esTerrestre +
                '}';
    }
}
