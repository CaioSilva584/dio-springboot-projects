package caio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosSpringbootApplication.class, args);

		// Não é mais utilizado o "new", pois agora a gestão de objetos deve ser feita pelo container
		// Conferir classe MyApp
//		Calculadora calculadora = new Calculadora();
//
//		System.out.println("O resultado é: " + calculadora.soma(10, 3));


	}

}
