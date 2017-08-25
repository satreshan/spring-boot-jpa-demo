package springboot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDemoAPI {

	@RequestMapping("/hi")
	public String sayHi()
	{
		return "Hello";
	}

}
