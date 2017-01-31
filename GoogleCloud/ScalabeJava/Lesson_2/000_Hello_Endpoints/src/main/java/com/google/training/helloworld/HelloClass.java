package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass (String name, String timeOfDay) {
        this.message = "Good " + timeOfDay + " " + name + "!";
    }

    public String getMessage() {
        return message;
    }
}
