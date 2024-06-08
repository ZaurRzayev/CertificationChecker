package kafka.pprojectcerficate.mappers;


import kafka.pprojectcerficate.dtos.RoleDTO;
import kafka.pprojectcerficate.entities.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role toEntity(RoleDTO roleDTO);
    RoleDTO toDTO(Role role);
}

