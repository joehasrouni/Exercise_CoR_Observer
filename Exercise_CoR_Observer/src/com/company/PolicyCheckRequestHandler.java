package com.company;

public class PolicyCheckRequestHandler extends AbstractRequestHandler {

    public void handleRequest(WebRequest request) {
        if (request.getPath() == "/dashboard" && request.getLoggedUser().isAdmin() == false) {
            //if request is eligible handle it
            System.out.println("Status 403 : user is not authorized to access this content");
        }
        if ( (request.getPath() == "/dashboard" && request.getLoggedUser().isAdmin() == true) || request.getPath()=="/home") {
            this.successorHandleRequest(request);
        }

    }
}
