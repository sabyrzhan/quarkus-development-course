package kz.sabyr.quarkus.helloworlkotlin

import kz.sabyr.quarkus.helloworlkotlin.model.MyData
import kz.sabyr.quarkus.helloworlkotlin.service.MyService
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-world")
class MyResource {
    @Inject
    @field: Default
    lateinit var myService: MyService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(@PathParam("name") name: String) = MyData(name + ", ID: " + myService.generateUUID())
}