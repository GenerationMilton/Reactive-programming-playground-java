package com.livemilton.reactive_programming_playground.publisher;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubscriptionImpl implements Subscription {

    private static final Logger log = LoggerFactory.getLogger(SubscriptionImpl.class);

    //variable and constructor
    private Subscriber<? super String> subscriber;

    public SubscriptionImpl( Subscriber<? super String> subscriber){
        this.subscriber=subscriber;
    }

    @Override
    public void request(long l) {

    }

    @Override
    public void cancel() {

    }
}
