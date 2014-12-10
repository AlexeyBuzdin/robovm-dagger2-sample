package lv.jug.byoctj.server;

import static spark.Spark.*;

import spark.*;
//import javax.inject.Inject;

public class MyServer {

    public static void main(String[] args) {
        get("/hello", (request, response) -> "Hello World!");
    }
}
