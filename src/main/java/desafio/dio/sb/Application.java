package desafio.dio.sb;

import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		servers = {@Server(url = "/", description = "Default Server Url")},
		info = @Info(
				title = "Desafio de projeto API",
				version = "1.0.0",
				description = "API para fins educativos",
				termsOfService = "https://github.com/fermarquess/sb-dio-desafio-api",
				contact = @Contact(
						name = "Fernanda M",
						email = "fermarquessantos@gmail.com"
				),
		license = @License(
				name = "License",
				url = "https://github.com/fermarquess/sb-dio-desafio-api"
		)
)
)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
