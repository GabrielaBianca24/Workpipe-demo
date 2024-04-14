package it.workpipe.IancuDemo;

import it.workpipe.IancuDemo.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class IancuDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IancuDemoApplication.class, args);
	}

	User utente1 = new User("Paolo", "Franchi", "email1@example.com", LocalDate.of(1990, 1, 1));
	User utente2 = new User("Luca", "Moschi", "email3@example.com", LocalDate.of(1991, 2, 2));
	User utente3 = new User("Monica", "Marchi", "email5@example.com", LocalDate.of(1992, 3, 3));
	User utente4 = new User("Marika", "Suceava", "email8@example.com", LocalDate.of(1993, 4, 4));
	User utente5 = new User("Giulia", "Iancu", "emai21@example.com", LocalDate.of(1994, 5, 5));}
