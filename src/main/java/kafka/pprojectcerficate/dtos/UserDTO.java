package kafka.pprojectcerficate.dtos;

// UserDTO.java
import java.time.LocalDate;

import lombok.Data;
import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String password;
    private String username;
    private String email;
    private Set<RoleDTO> roles;
    private CompanyDTO company;
    private SubscriptionDTO subscription;
}


