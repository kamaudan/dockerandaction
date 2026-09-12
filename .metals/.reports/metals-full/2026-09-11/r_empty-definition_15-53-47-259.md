error id: file:///C:/Users/user/Downloads/dockerandaction/dockerandaction/src/test/java/com/container/dockerandaction/ApiControllerTest.java:org/springframework/boot/test/context/SpringBootTest#
file:///C:/Users/user/Downloads/dockerandaction/dockerandaction/src/test/java/com/container/dockerandaction/ApiControllerTest.java
empty definition using pc, found symbol in pc: org/springframework/boot/test/context/SpringBootTest#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 120
uri: file:///C:/Users/user/Downloads/dockerandaction/dockerandaction/src/test/java/com/container/dockerandaction/ApiControllerTest.java
text:
```scala
package com.container.dockerandaction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.@@SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;




@AutoConfigureMockMvc 
public class ApiControllerTest {


    @Autowired
	private MockMvc mockMvc;

	@Test
	void testGetApi() throws Exception {
		mockMvc.perform(get("/api"))
				.andExpect(status().isOk())
				.andExpect(content().string("This is the API endpoint"));
    }

	

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: org/springframework/boot/test/context/SpringBootTest#