package com.lolo.mediator.smarthouse;

//同事抽象类
public abstract class Colleague {
    public String name;
    private Mediator mediator;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
