/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import entities.Animal;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Emil PC
 */
@Path("animal")
public class AnimalResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AnimalResource
     */
    public AnimalResource() {

    }

    /**
     * Retrieves representation of an instance of rest.AnimalResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    //@Produces(MediaType.APPLICATION_JSON)
    public String getString() {
        return "Hello from my first web service";
    }

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "{\"msg\":\"hej Henning\"}";
    }

    @GET
    @Path("/RandomAnimal")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAnimal() {
        Animal ra = AnimalResource.getRandomAnimal();
        Gson gson = new Gson();
        String jsonRa = gson.toJson(ra);
        return jsonRa;
    }

    public static Animal getRandomAnimal() {
        Animal a1 = new Animal("HenningDyr",1995,"Im depressed");
        Animal a2 = new Animal("SvensDyr",1997,"classic wow!!!!!");
        Animal a3 = new Animal("Hund",1337,"Capitalism is the poison of society");
        Animal a4 = new Animal("Kat",2077,"Vov");
        
        List animals = new ArrayList<Animal>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        
        return (Animal) animals.get((int) (Math.random()*4));
    }

    /**
     * PUT method for updating or creating an instance of AnimalResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
