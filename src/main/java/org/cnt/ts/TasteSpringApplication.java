package org.cnt.ts;

import org.cnt.ts.beandefinition.BeanDef;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TasteSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TasteSpringApplication.class, args);
		SpringApplication sa = new SpringApplication(TasteSpringApplication.class);
		sa.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext cac = sa.run(args);
		BeanDef bdf = new BeanDef(cac);
		bdf.showBeanDef();
	}

}
