package com.example.smongo;

import com.example.smongo.Repository.CategorieRepository;
import com.example.smongo.service.CategorieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongoRepositories
public class SmongoApplication  implements CommandLineRunner{
	@autowired
	CategorieService CategorieRepository;

	public static void main(String[] args) {

		SpringApplication.run(SmongoApplication.class, args);
	}

}
