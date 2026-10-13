package com.reactive.sec3;

import com.reactive.common.Util;
import com.reactive.sec3.client.ExternalServiceClient;

public class NonBlockingStreamingMessages {

    public static void main(String[] args) {

        var client = new ExternalServiceClient();
        client.getNames()
                .subscribe(Util.subscriber("sub1"));

        client.getNames()
                .subscribe(Util.subscriber("sub2"));

        Util.sleepSeconds(6);

    }
}
