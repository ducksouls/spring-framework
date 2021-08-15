package cn.lai.spring.simulation;

import cn.lai.spring.simulation.context.MyApplicationContext;
import cn.lai.spring.simulation.test.AppConfig;


public class Test {
	public static void main(String[] args) throws IllegalAccessException {
		MyApplicationContext ac = new MyApplicationContext(AppConfig.class);

		ac.getBean("");
	}
}
