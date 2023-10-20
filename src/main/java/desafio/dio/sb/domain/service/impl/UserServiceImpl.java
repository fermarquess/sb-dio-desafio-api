package desafio.dio.sb.domain.service.impl;

import desafio.dio.sb.domain.model.User;
import desafio.dio.sb.domain.repository.UserRepository;
import desafio.dio.sb.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() !=null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User Id Already exists");
        }
        return userRepository.save(userToCreate);
    }


}
