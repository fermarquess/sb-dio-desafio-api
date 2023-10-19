package desafio.dio.sb.domain.repository;

import desafio.dio.sb.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
