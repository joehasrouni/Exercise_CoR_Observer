package com.company;

public class ExistingContentCheckRequestHandler extends AbstractRequestHandler {

    public void handleRequest(WebRequest request) {
        if (request.getPath() != "/dashboard" && request.getPath() != "/home") {
            //if request is eligible handle it
            System.out.println("Status 404 : Page missing");

        } else {
            this.successorHandleRequest(request);
        }
    }
}
