package com.reactive.sec3;

import com.reactive.common.Util;
import reactor.core.publisher.Flux;

public class FluxLog {

    public static void main(String[] args) {

        Flux.range(1,5)
                .log("log-name")
                .subscribe(Util.subscriber());

    }
}
