package com.observer.model;

public class UpdateObserver implements Observer {

    private int observerState;

    private UpdateCase event;

    public UpdateObserver(UpdateCase event) {
        this.event = event;
    }

    public void update() {
        observerState = event.getState();

    }

    public int getObserverState() {
        return observerState;
    }
}
