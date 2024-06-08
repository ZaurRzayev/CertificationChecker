package kafka.pprojectcerficate.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class CompanyDTO {
    private Long id;
    private String name;
    private Set<UserDTO> users;
}
