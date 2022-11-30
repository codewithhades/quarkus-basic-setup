package com.codewithhades.quarkus.basicsetup;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class GreetingsResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getUsers() {
        return Response.ok("Welcome to Code with Hades!").build();
    }

}