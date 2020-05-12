package com.subarna.Demo;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Aliens")
public class AlienResource {
	
	AlienRepository repo=new AlienRepository();
	@GET
	@Path("Alien")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Alien> getAliens()
	{
		return repo.getAliens();		
	}

	
	  @GET
	  @Path("Alien/{id}")
	  @Produces(MediaType.APPLICATION_JSON) public Alien getAlien(@PathParam("id") int id)
	  { 
		  Alien a=repo.getAlien(id);
		  return a;
	 	  }
	
	@POST
	@Path("Alien")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createAlien(Alien a1)
	{
		
		repo.create(a1);
		
	}
	
	@PUT
	@Path("Alien/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Alien updateAlien(@PathParam("id") int id,Alien a1)
	{
		
		Alien r=repo.update(a1,id);
		return r;
		
	}
}
