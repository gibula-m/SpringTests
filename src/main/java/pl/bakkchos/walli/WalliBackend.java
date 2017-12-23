package pl.bakkchos.walli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bakkchos.walli.controller.UserController;
import pl.bakkchos.walli.data.UserRepository;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class WalliBackend {

	@Autowired
	UserRepository ur;

	private static Object[] sources= {WalliBackend.class,UserController.class};

	@RequestMapping("/")
	public String hello() {
		return "Use /login to obtain token";
	}


	public static void main(String[] args) {


		SpringApplication.run(sources, args);
	}
}
