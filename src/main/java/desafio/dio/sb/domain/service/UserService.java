package desafio.dio.sb.domain.service;

import desafio.dio.sb.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
