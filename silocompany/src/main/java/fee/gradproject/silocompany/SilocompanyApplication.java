package fee.gradproject.silocompany;

import fee.gradproject.silocompany.auth.AuthenticationService;
import fee.gradproject.silocompany.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static fee.gradproject.silocompany.user.Role.مدير_تنفيذي;
import static fee.gradproject.silocompany.user.Role.مدير_عام;

@SpringBootApplication
public class SilocompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SilocompanyApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthenticationService service){
		return args -> {
			var admin = RegisterRequest.builder()
					.firstName("mohamed")
					.lastName("samy")
					.email("mohamed@gmail.com")
					.password("01010949086")
					.role(مدير_عام)
					.build();
			System.out.println("Admin token: "+ service.register(admin).getToken());

			var manager = RegisterRequest.builder()
					.firstName("manager")
					.lastName("manager")
					.email("manger@gmail.com")
					.password("01020704311")
					.role(مدير_تنفيذي)
					.build();
			System.out.println("Manager token: "+ service.register(manager).getToken());
		};
	}
}
