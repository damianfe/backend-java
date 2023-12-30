package Parrilla.controllers;

import Parrilla.models.Menu;
import Parrilla.Services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/{id}")
    public Menu getMenu(@PathVariable int id) {
        return menuService.getMenuById(id);
    }

    @PostMapping
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @PutMapping("/{id}")
    public Menu updateMenu(@PathVariable int id, @RequestBody Menu menu) {
        return menuService.updateMenu(id, menu);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable int id) {
        menuService.deleteMenu(id);
    }
}
