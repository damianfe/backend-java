package Parrilla.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Parrilla.models.Menu;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    // Otros métodos implementados...

    @Override
    public Menu updateMenu(int id, Menu menu) {
        // Verifica si el menú existe en la base de datos
        if (menuRepository.existsById(id)) {
            // Establece el ID del menú y guarda los cambios
            menu.setIdMenu(id);
            return menuRepository.save(menu);
        } else {
            // Maneja el caso donde el menú no existe
            return null;
        }
    }

    @Override
    public Menu getMenuById(int id) {
        // Devuelve el menú con el ID proporcionado
        throw new UnsupportedOperationException("Unimplemented method 'getMenuById'");
    }

    @Override
public Menu createMenu(Menu menu) {
    // Puedes realizar lógica de validación o manipulación de datos aquí si es necesario
    return menuRepository.save(menu);
}

    @Override
    public void deleteMenu(int id) {
        // Busca el menú a eliminar por su ID y lo elimina de la base de datos
        throw new UnsupportedOperationException("Unimplemented method 'deleteMenu'");
    }
}
