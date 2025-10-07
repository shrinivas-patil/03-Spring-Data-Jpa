package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Product;
import in.ashokit.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		
		Product p = new Product();
		p.setProductName("KeyBoard");
		p.setProductPrice(250.50);
		
		productRepo.save(p);
		System.out.println("Product Inserted...");
	}

}
