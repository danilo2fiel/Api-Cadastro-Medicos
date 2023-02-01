package med.voll.apiMed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiMedApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8082");
		SpringApplication.run(ApiMedApplication.class, args);
		System.out.println("deu certo graças a deus");
	}

}
