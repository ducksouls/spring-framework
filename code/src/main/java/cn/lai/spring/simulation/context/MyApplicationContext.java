package cn.lai.spring.simulation.context;

import cn.lai.spring.simulation.annotations.ComponentScan;
import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;


/**
 * 容器构造: 我们要通过这个容器来解析bean, 以及反射bean
 * 1. 给定配置
 * 2. 解析配置
 * 3. 根据配置去解析类, 生成 BeanDefinition
 * 4. 根据BeanDefinition 实例化类(实例化前后可以做一些操作)
 * 5. 实例化类以后存入beanMap
 * 6. 调用者根据条件,调用getBean方法获得对象
 * 7. .....
 * TODO: 由于是模仿,所以比较粗糙, 而且也没有什么设计模式, 后续有能力了在根据设计模式继续改写
 */
@Slf4j
public class MyApplicationContext {
	public MyApplicationContext() {}


	/**
	 * 通过传入的配置类去解析
	 *
	 * @param config
	 */
	public MyApplicationContext(Class configClass) throws IllegalAccessException {
		//起码需要个包扫描
		if (!configClass.isAnnotationPresent(ComponentScan.class)) {
			throw new IllegalArgumentException();
		}

		ComponentScan declaredAnnotation = (ComponentScan) configClass.getDeclaredAnnotation(ComponentScan.class);
		System.out.println(declaredAnnotation.value());
		System.out.println(configClass.getAnnotations());

	}

	private HashMap<String, Object> beanMap;

	/**
	 * TODO: 2021-8-10 21:58:23
	 * 这个方法以后实现吧, 哭唧唧
	 *
	 * @param beanClazz
	 * @param <T>
	 * @return
	 */
	public <T> T getBean(Class<T> beanClazz) {
		return null;
	}

	public Object getBean(String beanName) {
		// return beanMap.get(beanName);
		return null;
	}
}
