package me.jcala.blog.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.jcala.blog.domain.ReversePath;
/**
 * 
* @ClassName: ReverseConfig 
* @Description: TODO  使用此种方式把自定义的bean注册到springboot中
* @Company:esmart
* @author Thinkpad 
* @version 1.0 2017年11月25日 下午8:46:27
 */
@Configuration
public class ReverseConfig {

	
	@Bean(name= "reverse")  
	@Autowired
	public ReversePath reversePath(@Value("${reverse.pic-file}")String picFilePath,
			@Value("${reverse.pic-url}")String picUrlPath,
			@Value("${reverse.css-url}")String cssUrlPath,
			@Value("${reverse.js-url}")String jsUrlPath){
		
		return new ReversePath(picFilePath,picUrlPath,cssUrlPath,jsUrlPath);
	}
}
