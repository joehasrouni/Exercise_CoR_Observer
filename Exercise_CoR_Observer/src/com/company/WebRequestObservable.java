package com.company;

public interface WebRequestObservable {
    public void attach(WebRequestObserver observer);
    public void detach(WebRequestObserver observer);
    public void notifyObservers(WebRequest webRequest);
}
