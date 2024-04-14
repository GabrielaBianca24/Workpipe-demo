package it.workpipe.IancuDemo.repositories;

import it.workpipe.IancuDemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByName(String name);
    User findBySurname(String surname);
    User findByEmail(String email);
    User findByDateOfBirth(LocalDate dateOfBirth);
}