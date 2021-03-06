package theImport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan
@Import(pathVariable.PathVariableController.class)
public class Application {

//	Run the application and input "localhost:8080/data" and "localhost:8080/data/1" in the browser
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}
