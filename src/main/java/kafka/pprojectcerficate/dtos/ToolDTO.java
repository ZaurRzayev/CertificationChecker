package kafka.pprojectcerficate.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ToolDTO {
    private Long id;
    private String name;
    private String currentSituation;
    private LocalDate certificationDate;
    private LocalDate expireDate;
    private UserDTO user;
}
