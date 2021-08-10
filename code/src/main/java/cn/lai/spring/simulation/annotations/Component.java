package cn.lai.spring.simulation.annotations;

import java.lang.annotation.*;

/**
 * 注解Component
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Component {
	String value() default "";
}
