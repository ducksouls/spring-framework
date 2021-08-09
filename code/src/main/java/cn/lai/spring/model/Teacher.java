package cn.lai.spring.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Teacher {
	Student stu;

	public Teacher() {
		log.info("Teacher constructor has bean called!!!");
	}
}
