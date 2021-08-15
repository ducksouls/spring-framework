package cn.lai.spring.model;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

// @Component
@Slf4j
public class SubAwareInterfaceTest  implements ResourceLoaderAware {

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println(resourceLoader);
		log.info("SubAwareInterfaceTest 子类中忽略？");
	}
}
