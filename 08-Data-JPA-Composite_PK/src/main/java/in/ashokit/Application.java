package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repository.AccountRepository;

@SpringBootApplication
public class Application {

    private final AccountRepository accountRepository;

    Application(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountRepository accountRepo = context.getBean(AccountRepository.class);
		
		//Saving the Data
		/*AccountPK pk = new AccountPK();
		pk.setAccId(2);
		pk.setAccType("Current");
		pk.setAccNum(48574651037L);
		
		Account acc = new Account();
		acc.setHolderName("Raju");
		acc.setBranch("BTM");
		acc.setAccountPK(pk);
		
		accountRepo.save(acc);*/
		
		//Retrive the data
		
		AccountPK pk = new AccountPK();
		pk.setAccId(2);
		pk.setAccType("Current");
		pk.setAccNum(48574651037L);
		
		Optional<Account> id = accountRepo.findById(pk);
		System.out.println(id.get());
	}

}
