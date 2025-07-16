package es.cic.curso2025.proy006;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@AutoConfigureMockMvc
public class CocheControllerTests {

    @Autowired
    private CocheController cocheController;

    @Test
    public void testCreate(){
        long resultadoId = cocheController.create(null);
        assertTrue(resultadoId > 0);
    }
}
