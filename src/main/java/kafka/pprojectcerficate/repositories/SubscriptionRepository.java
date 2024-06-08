package kafka.pprojectcerficate.repositories;

import kafka.pprojectcerficate.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
