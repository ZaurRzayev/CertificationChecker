package kafka.pprojectcerficate.mappers;


import kafka.pprojectcerficate.dtos.UserDTO;
import kafka.pprojectcerficate.entities.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDTO userDTO);
    UserDTO toDTO(User user);
    List<UserDTO> toDTOs(List<User> users);
    List<User> toEntities(List<UserDTO> userDTOs);
}

