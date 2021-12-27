package com.example.CasaDeLeilao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CasaDeLeilaoApplication {

	public static void main(String[] args) {
		System.out.println("Inicianto CasaDeLeilaoApplication ...");
		SpringApplication.run(CasaDeLeilaoApplication.class, args);
		System.out.println("CasaDeLeilao iniciado com sucesso!");
	}

}
