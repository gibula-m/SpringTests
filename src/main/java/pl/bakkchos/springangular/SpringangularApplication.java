package pl.bakkchos.springangular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bakkchos.springangular.data.UserRepository;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringangularApplication {

	@Autowired
	UserRepository ur;

	private static Object[] sources= {SpringangularApplication.class,UserController.class};

	@RequestMapping("/")
	public String hello() {
		return "REST";
	}


	public static void main(String[] args) {


		SpringApplication.run(sources, args);
	}
}
