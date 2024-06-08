package kafka.pprojectcerficate.services;


import kafka.pprojectcerficate.dtos.RoleDTO;
import kafka.pprojectcerficate.entities.Role;
import kafka.pprojectcerficate.mappers.RoleMapper;
import kafka.pprojectcerficate.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleMapper roleMapper;

    public RoleDTO createRole(RoleDTO roleDTO) {
        Role role = roleMapper.toEntity(roleDTO);
        role = roleRepository.save(role);
        return roleMapper.toDTO(role);
    }
}

