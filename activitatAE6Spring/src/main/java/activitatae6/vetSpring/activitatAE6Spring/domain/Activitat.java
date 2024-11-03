package activitatae6.vetSpring.activitatAE6Spring.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "restaurantes", schema = "activitat")
public class Activitat {

    @Id
    @Column(name = "restaurante_id")
    private UUID restauranteId;

    @Column(name = "nombre")
    private String name;

    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "tipo_comida")
    private String tipoComida;

    public Activitat(UUID restauranteId, String name, int capacidad, String tipoComida) {
        this.restauranteId = restauranteId;
        this.name = name;
        this.capacidad = capacidad;
        this.tipoComida = tipoComida;
    }

    public Activitat(String name, int capacidad, String tipoComida) {
        this.restauranteId = UUID.randomUUID();
        this.name = name;
        this.capacidad = capacidad;
        this.tipoComida = tipoComida;
    }

    public Activitat() {}

    public UUID getRestauranteId() {
        return restauranteId;
    }

    public String getName() {
        return name;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
}
