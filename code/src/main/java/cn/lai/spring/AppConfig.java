package cn.lai.spring;


import cn.lai.spring.model.Student;
import cn.lai.spring.model.Teacher;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 这个注解如果配置到其他不是配置类的类上, 包扫描并不会被调用
// 因为spring 根本感知不到那个类的存在
@ComponentScan("cn.lai")
@Log4j2
public class AppConfig {

	static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AppConfig.class);


	public static void main(String[] args) {
		// 程序开始运行
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		logger.info("omaygod");

		System.out.println(ac.getBean(Teacher.class));
		System.out.println(ac.getBean(Student.class));
		// Hello bean = ac.getBean(Hello.class);
		// bean.sayHello();
		logger.info("omaygod");

	}
}
