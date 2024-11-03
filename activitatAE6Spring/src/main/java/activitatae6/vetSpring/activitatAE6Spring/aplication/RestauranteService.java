package activitatae6.vetSpring.activitatAE6Spring.aplication;

import activitatae6.vetSpring.activitatAE6Spring.domain.Activitat;
import activitatae6.vetSpring.activitatAE6Spring.infrastructure.repositories.RestauranteRepository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;

    @Inject
    public RestauranteService(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public Activitat createRestaurante(Activitat restaurante) {
        return restauranteRepository.save(restaurante);
    }

    public List<Activitat> getAllRestaurantes() {
        return restauranteRepository.findAll();
    }

    public Activitat getRestaurante(UUID id) {
        return restauranteRepository.findById(id).orElseThrow(() -> new RuntimeException("Restaurante no encontrado"));
    }

    public Activitat updateRestaurante(UUID id, int newCapacidad, String newTipoComida) {
        Activitat restaurante = getRestaurante(id);
        restaurante.setCapacidad(newCapacidad);
        restaurante.setTipoComida(newTipoComida);
        return restauranteRepository.save(restaurante);
    }

    public void deleteRestaurante(UUID id) {
        Activitat restaurante = getRestaurante(id);
        restauranteRepository.delete(restaurante);
    }
}
