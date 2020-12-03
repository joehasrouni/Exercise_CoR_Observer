package com.company;

public abstract class AbstractRequestHandler {
    protected AbstractRequestHandler successor;

    public void setSuccessor(AbstractRequestHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(WebRequest request);

    protected void successorHandleRequest(WebRequest request) {
        if (this.successor != null) {
            this.successor.handleRequest(request);
        }
    }
}

