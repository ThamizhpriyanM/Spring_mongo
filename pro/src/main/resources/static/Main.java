package templates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main{

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(Main.class, args);
		//printBeans(Context);
	}

	private static void printBeans(ConfigurableApplicationContext Context) {
		String[] BeanNames = Context.getBeanDefinitionNames();
		for (String names : BeanNames) {
			System.out.println(names);
		}
	}
}



