package learn.up;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        Calculator calculator = context.getBean(Calculator.class);

        calculator.sum(6,4);
        calculator.divide(12,6);
        calculator.multiply(50,100);
        calculator.subtract(60,59);

    }
}
