import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.boot.controller.HelloWordController;
import com.boot.controller.SampleController;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = SampleController.class)
public class HelloWordTest {

	private MockMvc mokmvc;

	@Before
	public void setUp() {
		mokmvc = MockMvcBuilders.standaloneSetup(new HelloWordController()).build();
	}

	@Test
	public void hello() throws Exception {
		mokmvc.perform(MockMvcRequestBuilders.get("/product").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string("hello word"));
	}

}
