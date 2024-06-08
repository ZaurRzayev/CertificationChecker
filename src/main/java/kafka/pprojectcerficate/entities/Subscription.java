package kafka.pprojectcerficate.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate expiryDate;

    @OneToOne(mappedBy = "subscription")
    private User user;
}
