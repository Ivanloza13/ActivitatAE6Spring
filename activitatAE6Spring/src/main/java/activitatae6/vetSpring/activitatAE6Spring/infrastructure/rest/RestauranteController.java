package activitatae6.vetSpring.activitatAE6Spring.infrastructure.rest;

import activitatae6.vetSpring.activitatAE6Spring.aplication.RestauranteService;
import activitatae6.vetSpring.activitatAE6Spring.domain.Activitat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping("/createRestaurante")
    @ResponseStatus(HttpStatus.CREATED)
    public Activitat createRestaurante(@RequestBody Activitat restaurante) {
        return restauranteService.createRestaurante(restaurante);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Activitat> getAllRestaurantes() {
        return restauranteService.getAllRestaurantes();
    }

    @GetMapping("/{restauranteId}")
    @ResponseStatus(HttpStatus.OK)
    public Activitat getRestaurante(@PathVariable String restauranteId) {
        return restauranteService.getRestaurante(UUID.fromString(restauranteId));
    }

    @PutMapping("/{restauranteId}")
    @ResponseStatus(HttpStatus.OK)
    public Activitat updateRestaurante(@PathVariable String restauranteId,
                                       @RequestParam int capacidad,
                                       @RequestParam String tipoComida) {
        return restauranteService.updateRestaurante(UUID.fromString(restauranteId), capacidad, tipoComida);
    }

    @DeleteMapping("/{restauranteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRestaurante(@PathVariable String restauranteId) {
        restauranteService.deleteRestaurante(UUID.fromString(restauranteId));
    }
}