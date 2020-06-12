package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.dao.ContactReository;
import com.ashokit.pojo.Product;

@SpringBootApplication
public class SpringData1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringData1Application.class, args);
		ContactReository contactReository = context.getBean(ContactReository.class);
		
		Product product = new Product();
		product.setId(2);
		product.setProductName("Pen");
		product.setPrice(4000.00);
		Product prod = contactReository.save(product);
		if(prod!=null)
		System.out.println("Data Saved successfully..... "+prod);
	}

}
