package kz.sabyr.quarkus.helloworl;

import kz.sabyr.quarkus.service.MyService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/hello-world")
public class MyResource {
    @Inject
    MyService myService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> helloWithParam(@PathParam(value = "name") String name) {
        return Map.of("name", name + ", ID: " + myService.generateUUID());
    }
}