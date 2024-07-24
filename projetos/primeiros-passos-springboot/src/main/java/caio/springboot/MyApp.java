package caio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// A classe deve implementar a interface CommandLineRunner
// Os objetos gerenciados passam a ser Beans
// Verificar a classe calculadora

// Toda classe criada deve se tornar um componente
@Component
public class MyApp implements CommandLineRunner {

    // Instanciação do componente (Bean)
    // Aqui é feita a injeção automática da classe
    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("O resultado é: " + calculadora.soma(10, 3));

        // O container, ao ser iniciado, viu que tinha um componente calculadora e viu que precisava
        // injetetar (instanciar) esse objeto, portanto, utiliza o autowired para fazer a injeção automática.
    }
}
