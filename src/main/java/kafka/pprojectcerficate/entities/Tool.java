package kafka.pprojectcerficate.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String currentSituation;
    private LocalDate certificationDate;
    private LocalDate expireDate;

    @ManyToOne
    private User user;
}
