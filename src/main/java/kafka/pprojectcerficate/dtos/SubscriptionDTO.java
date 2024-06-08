package kafka.pprojectcerficate.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SubscriptionDTO {
    private Long id;
    private LocalDate expiryDate;
    private UserDTO user;
}
