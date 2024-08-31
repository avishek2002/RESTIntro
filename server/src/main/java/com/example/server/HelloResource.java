package com.example.server;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello world";
    }

    @GET
    @Path("/{input}")
    @Produces(MediaType.APPLICATION_JSON)
    public JSONFile postString(@PathParam("input") String input) {
        // Process the input string
        String message = "Hello world, " + input;

        // Return a response
        //return Response.ok(message).build();

        // return json file
        return new JSONFile(message);

    }
}
