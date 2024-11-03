package activitatae6.vetSpring.activitatAE6Spring.infrastructure.repositories;

import activitatae6.vetSpring.activitatAE6Spring.domain.Activitat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RestauranteRepository extends JpaRepository<Activitat, UUID> {
    Optional<Activitat> findByRestauranteId(UUID restauranteId);
}
