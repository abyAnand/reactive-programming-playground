package com.reactive.sec3;

import com.reactive.common.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxInterval {

    public static void main(String[] args) {

        Flux.interval(Duration.ofMillis(500))
                .subscribe(Util.subscriber());

        Util.sleepSeconds(5);

    }
}
