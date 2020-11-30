package com.ucare.webucare;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class WebUcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebUcareApplication.class, args);
	}

	@Bean
	public FixedLocaleResolver localeResolver() {
		return new FixedLocaleResolver(new Locale("pt","BR"));
	}

}
