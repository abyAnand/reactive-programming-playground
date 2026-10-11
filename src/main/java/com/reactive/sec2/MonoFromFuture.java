package com.reactive.sec2;

import com.reactive.common.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoFromFuture {

    private static final Logger log = LoggerFactory.getLogger(MonoFromFuture.class);

    public static void main(String[] args) {

        Mono.fromFuture(getName())
                .subscribe(Util.subscriber());

        // if sleepSeconds is commented out the name will not be shows.
        Util.sleepSeconds(1);

    }

    private static CompletableFuture<String> getName(){
        return CompletableFuture.supplyAsync(() -> {
            log.info("generating name");
            return Util.faker().name().firstName();
        });
    }
}
