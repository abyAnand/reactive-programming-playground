package com.reactive.sec3.assignment;

import com.reactive.common.Util;
import com.reactive.sec3.client.ExternalServiceClient;

public class Assignment {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();
        var subscriber = new StockPriceObserver();
        client.getPriceChanges()
                .subscribe(subscriber);

        Util.sleepSeconds(20);

    }
}
