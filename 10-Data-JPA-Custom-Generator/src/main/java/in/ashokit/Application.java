package in.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.OrderDetailsEntity;
import in.ashokit.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		OrderDetailsRepository bean = context.getBean(OrderDetailsRepository.class);
		
		OrderDetailsEntity entity = new OrderDetailsEntity();
		
		entity.setOrderBy("Charles");
		entity.setOrderPlacedDate(new Date());
		
		OrderDetailsEntity save = bean.save(entity);
		
		System.out.println(save);
		
		context.close();
	}

}
