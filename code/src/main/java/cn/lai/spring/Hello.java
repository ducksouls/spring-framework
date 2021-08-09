package cn.lai.spring;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Hello {

	public void sayHello() {
		log.info("HELLO IS COMPLETE INIT AND CALLED!!!");
	}

}
