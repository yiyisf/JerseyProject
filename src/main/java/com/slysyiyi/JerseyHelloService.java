package com.slysyiyi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/show-on-screen")
public class JerseyHelloService {
    @GET
    @Path("/{message}")
    public Response getMsg(@PathParam("message") String msg) {
        String out = "message requested ： " + msg;
        return Response.status(200).entity(out).build();
    }
}
