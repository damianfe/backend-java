package Parrilla.Services;

import Parrilla.models.Menu;

public interface MenuService {
    Menu getMenuById(int id);
    Menu createMenu(Menu menu);
    Menu updateMenu(int id, Menu menu);
    void deleteMenu(int id);
}

