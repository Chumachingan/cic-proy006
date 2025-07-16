package es.cic.curso2025.proy006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class CocheService {
    private long contador = 0;  // Contador para generar IDs únicos
    private Map<Long, Coche> coches = new HashMap<>();  // Almacenamiento en memoria

    public long create(Coche coche) {
        long id = ++contador;     
        coche.setId(id);         
        coches.put(id, coche);   
        return id;               
    }

    public List<Coche> getAll() {
        return new ArrayList<>(coches.values());
    }

    public Coche getById(long id) {
        return coches.get(id);
    }

    public void update(Coche coche) {
        coches.put(coche.getId(), coche);
    }

    public void delete(long id) {
        coches.remove(id);
    }
}
