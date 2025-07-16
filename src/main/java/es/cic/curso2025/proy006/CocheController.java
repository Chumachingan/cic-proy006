package es.cic.curso2025.proy006;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coche")
public class CocheController {
    @Autowired
    private CocheService cocheService;

    @PostMapping
    public long create(@RequestBody Coche coche) {
        return cocheService.create(coche);
    }

    @GetMapping
    public List<Coche> get() {
        return cocheService.getAll();
    }

    @GetMapping("/{id}")
    public Coche get(@PathVariable long id) {
        return cocheService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody Coche coche) {
        cocheService.update(coche);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        cocheService.delete(id);
    }
}
