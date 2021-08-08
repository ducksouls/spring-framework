package cn.lai.spring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.lai")

public class AppConfig {

	//	static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AppConfig.class);


	static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AppConfig.class);


	public static void main(String[] args) {
		log.info("hello");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		TestLombok test = ac.getBean(TestLombok.class);
//		System.out.println(test);
		log.info("omaygod");
		Hello bean = ac.getBean(Hello.class);
		bean.sayHello();
		log.info("omaygod");

	}
}
