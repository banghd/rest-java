package com.example.springrest;

public class Response {
    public Float value;
    public String message;
    public Response(float val, String msg ) {
        this.value = val;
        this.message = msg;
    }
}
