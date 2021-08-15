package cn.lai.spring.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Teacher {
	@Autowired
	Student stu;

	public Teacher() {
		log.info("Teacher constructor has bean called!!! " + stu);
	}
}
