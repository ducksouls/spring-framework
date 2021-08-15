package cn.lai.spring.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

// @Component
@Slf4j
public class AwareInterfaceTest implements ResourceLoaderAware {

	@Autowired
	private SubAwareInterfaceTest subAwareInterfaceTest;

	private ResourceLoader resourceLoader;
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		log.info("AwareInterfaceTest 不是说好忽略自动注入的吗?还是说 需要autowired");
		this.resourceLoader = resourceLoader;
	}
}
