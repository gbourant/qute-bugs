package gr;

import io.quarkus.qute.Qute;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        // TODO: ENV!
        return Qute.fmt("{#mkouba /}").render();
    }
}
