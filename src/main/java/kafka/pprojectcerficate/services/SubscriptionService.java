package kafka.pprojectcerficate.services;

import kafka.pprojectcerficate.dtos.SubscriptionDTO;
import kafka.pprojectcerficate.entities.Subscription;
import kafka.pprojectcerficate.mappers.SubscriptionMapper;
import kafka.pprojectcerficate.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private SubscriptionMapper subscriptionMapper;

    public SubscriptionDTO createSubscription(SubscriptionDTO subscriptionDTO) {
        Subscription subscription = subscriptionMapper.toEntity(subscriptionDTO);
        subscription = subscriptionRepository.save(subscription);
        return subscriptionMapper.toDTO(subscription);
    }
}

