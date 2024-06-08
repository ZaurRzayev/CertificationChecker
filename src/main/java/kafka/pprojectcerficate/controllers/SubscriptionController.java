package kafka.pprojectcerficate.controllers;

import kafka.pprojectcerficate.dtos.SubscriptionDTO;
import kafka.pprojectcerficate.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping("/create")
    public SubscriptionDTO createSubscription(@RequestBody SubscriptionDTO subscriptionDTO) {
        return subscriptionService.createSubscription(subscriptionDTO);
    }
}

