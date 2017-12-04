package com.example.demo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication()//exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class} 一开始没有数据库，可以用这块代码排除报错
public class SpringBootHelloApplication {

	/**
	 * 使用@bean注入fastJsonHttpMessageConvert
	 * @return
     */
    @Bean
	public HttpMessageConverters fastJsonHttpMessageConverters(){
		//1.需要定义一个convert转换消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		//2.添加fastJson的配置信息，比如：是否要格式化返回的json数据
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

		//3.在convert中加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastConverter;

		//4.将convert加入到converts中
		return new HttpMessageConverters(converter);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloApplication.class, args);
	}
}
