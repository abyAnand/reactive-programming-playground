package com.reactive.sec2;

import com.reactive.sec1.subscriber.SubscriberImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

public class MonoJust {

    private static final Logger log = LoggerFactory.getLogger(LazyStream.class);

    public static void main(String[] args) {



         var mono =Mono.just("vins");
         var subscriber = new SubscriberImpl();
         mono.subscribe(subscriber);

         subscriber.getSubscription().request(10);
    }
}
