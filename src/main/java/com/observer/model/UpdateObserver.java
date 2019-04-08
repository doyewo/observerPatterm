package com.observer.model;

public class UpdateObserver implements Observer {

    private int observerState;

    private UpdateSubject subject;

    public UpdateObserver(UpdateSubject subject) {
        this.subject = subject;
    }

    public void update() {
        observerState = subject.getState();

    }

    public int getObserverState() {
        return observerState;
    }
}
