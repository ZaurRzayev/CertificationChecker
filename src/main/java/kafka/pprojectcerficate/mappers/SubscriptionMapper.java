package kafka.pprojectcerficate.mappers;

import kafka.pprojectcerficate.dtos.SubscriptionDTO;
import kafka.pprojectcerficate.entities.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {
    Subscription toEntity(SubscriptionDTO subscriptionDTO);
    SubscriptionDTO toDTO(Subscription subscription);
}

