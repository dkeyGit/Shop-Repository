package de.leuphana.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ComponentShopService {

	public static void main(String[] args) {
		SpringApplication.run(ComponentShopService.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplateBuilder()
				.build();
	}
}
