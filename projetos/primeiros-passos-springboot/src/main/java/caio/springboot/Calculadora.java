package caio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    int soma (int numero1, int numero2){
        return numero1 + numero2;
    }
}
