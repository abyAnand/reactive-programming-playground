package com.reactive.sec2;

import com.reactive.common.Util;
import reactor.core.publisher.Mono;

public class MonoEmptyError {

    public static void main(String[] args) {

        getUsername(3)
                .subscribe(
                        System.out::println,
                        err -> {}
                );

    }

    private static Mono<String> getUsername(int userId){
        return switch (userId){
            case 1 -> Mono.just("sam");
            case 2 -> Mono.empty(); // null
            default -> Mono.error(new RuntimeException("Invalid Input"));
        };
    }
}
