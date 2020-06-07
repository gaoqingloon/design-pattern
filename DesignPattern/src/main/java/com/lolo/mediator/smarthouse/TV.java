package com.lolo.mediator.smarthouse;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTv() {
        System.out.println("It's time to startTv!");
    }

    public void stopTv() {
        System.out.println("stopTv!");
    }
}
