package es.cic.curso2025.proy006;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class Proy006ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testCocheDelete() throws Exception {
		mockMvc.perform(delete("/coche/1"))
				.andDo(print())
				.andExpect(status().isOk());
	}

	@Test
	void testLista() {
		ArrayList miLista = new ArrayList();
		miLista.add("Hola");
		String resultado = (String) miLista.get(0);
		assertEquals("Hola", resultado);

		ArrayList<String> miLista2 = new ArrayList<>();
		miLista2.add("Hola Mundo");
		String resultado2 = miLista2.get(0);
		assertEquals("Hola Mundo", resultado2);
	}
}
