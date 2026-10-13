package com.reactive.sec3;

import com.reactive.common.Util;
import com.reactive.sec3.helper.NameGenerator;

public class FluxVsList {

    public static void main(String[] args) {

        // we get all result, but only after 10 seconds
//        var list = NameGenerator.getNamesList(10);
//        System.out.println(list);

        NameGenerator.getNamesFlux(10)
                .subscribe(Util.subscriber());

    }
}
