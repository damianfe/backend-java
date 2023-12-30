package Parrilla.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import Parrilla.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    // Puedes agregar métodos personalizados aquí si es necesario
}

