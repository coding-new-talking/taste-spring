package org.cnt.ts.bean.regfruitbd;

import org.cnt.ts.beanannotation.Ann2;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2019-07-02
 */
@EnableFruit(fruit = "orange", weight = 5.6, color = "red")
@Configuration
@Ann2
public class FruitConfig {

}
