package cn.lai.spring;


import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.lai")
@Log4j2
public class AppConfig {

	static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AppConfig.class);


	public static void main(String[] args) {
		// 程序开始运行
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		logger.info("omaygod");
		Hello bean = ac.getBean(Hello.class);
		bean.sayHello();
		logger.info("omaygod");

	}
}
