package org.cnt.ts;

import org.cnt.ts.beanannotation.Ann2;
import org.cnt.ts.beanannotation.BeanAnn;
import org.cnt.ts.beandefinition.BeanDef;
import org.cnt.ts.beanpp.BeanPP;
import org.cnt.ts.handlermapping.HandlerMappingShow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "org.cnt.ts")
@Ann2
public class TasteSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TasteSpringApplication.class, args);
		SpringApplication sa = new SpringApplication(TasteSpringApplication.class);
		//sa.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext cac = sa.run(args);
		BeanDef bdf = new BeanDef(cac);
		bdf.showBeanDef();
		BeanAnn ba = new BeanAnn(cac);
		ba.showBeanAnn();
		BeanPP bpp = new BeanPP(cac);
		bpp.showBeanPP();
		HandlerMappingShow hms = new HandlerMappingShow(cac);
		hms.show();
		synchronized (TasteSpringApplication.class) {
			try {
				TasteSpringApplication.class.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
