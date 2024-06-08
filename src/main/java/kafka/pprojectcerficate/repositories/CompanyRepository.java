package kafka.pprojectcerficate.repositories;

import kafka.pprojectcerficate.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
