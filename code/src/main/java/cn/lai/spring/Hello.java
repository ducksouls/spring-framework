package cn.lai.spring;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component
// @Scope("prototype")
@Slf4j
// @Configuration
// @ComponentScan("cn.lai")
public class Hello {

	public void sayHello() {
		log.info("HELLO IS COMPLETE INIT AND CALLED!!!");
	}

}
