package com.company;

public class RenderContentHandler extends AbstractRequestHandler{
    public void handleRequest(WebRequest request) {
        if (request.getPath() == "/dashboard") {
            //if request is eligible handle it
            System.out.println("Status 200 : Dashboard content here");
        }
        if (request.getPath() == "/home") {
            System.out.println("Status 200 : Home content here");
        }
            this.successorHandleRequest(request);
        }
}
