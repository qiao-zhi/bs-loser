package cn.qs.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 1.JSON返回实体类报错2.设置页面的默认页面.3.日期转换类
 * 
 * @author Administrator
 *
 */
@Configuration
public class MVCConfig extends WebMvcConfigurerAdapter {
	/**
	 * 解决JSON返回实体类报错
	 */
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorPathExtension(false);
	}

	/**
	 * 设置页面的默认页面
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/index.html");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		super.addViewControllers(registry);
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new DateConverter());
	}

	/**
	 * 日期转换类
	 * 
	 * @author Administrator
	 *
	 */
	private class DateConverter implements Converter<String, Date> {
		private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		@Override
		public Date convert(String s) {
			if ("".equals(s) || s == null) {
				return null;
			}
			try {
				return simpleDateFormat.parse(s);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return null;
		}
	}
}