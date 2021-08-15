package cn.lai.spring.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Student {
	@Autowired
	Teacher tea;

	public Student() {
		log.info("student constructor has bean called!!! " + tea);

	}
}
