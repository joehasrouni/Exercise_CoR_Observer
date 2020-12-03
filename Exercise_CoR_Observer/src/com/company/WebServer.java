package com.company;

import java.util.ArrayList;

public class WebServer implements WebRequestObservable {

    private ArrayList<WebRequestObserver> observers;

    WebServer(){
        observers = new ArrayList<WebRequestObserver>();
    }

    public String getRequest(WebRequest request) {

        AbstractRequestHandler h1 = new ExistingContentCheckRequestHandler();
        AbstractRequestHandler h2 = new PolicyCheckRequestHandler();
        AbstractRequestHandler h3 = new RenderContentHandler();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        h1.handleRequest(request);


        this.notifyObservers(request);

        return "";
    }


    @Override
    public void attach(WebRequestObserver observer) {
        observers.add(observer);

    }

    @Override
    public void detach(WebRequestObserver observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers(WebRequest webRequest) {
        for (WebRequestObserver observer : observers){
            observer.update(webRequest);
        }

    }
}
