package kafka.pprojectcerficate.services;

import kafka.pprojectcerficate.dtos.UserDTO;
import kafka.pprojectcerficate.entities.User;
import kafka.pprojectcerficate.mappers.UserMapper;
import kafka.pprojectcerficate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        user.setPassword(passwordEncoder.encode(userDTO.getPassword())); // Encode password
        user = userRepository.save(user);
        return userMapper.toDTO(user);
    }

    public Optional<UserDTO> findByUsername(String username) {
        return userRepository.findByUsername(username).map(userMapper::toDTO);
    }

    public Optional<UserDTO> findById(Long id) {
        return userRepository.findById(id).map(userMapper::toDTO);
    }

    public List<UserDTO> findAll() {
        return userMapper.toDTOs(userRepository.findAll());
    }
}
