package com.squaremobile.template.api;

import com.google.gson.Gson;
import com.squaremobile.template.domain.Template;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;
 //comment
@Path("/template")
public class TemplateService {

    static final Logger logger = Logger.getLogger(TemplateService.class); 
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public String get(Template template) {
  
		return new Gson().toJson(template);
 
	}
 
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
        @Produces(MediaType.APPLICATION_JSON)
	public Response post(Template template) {
           
            
            logger.info("Message ");
        
      
                
                
		return Response.status(201).entity(new Gson().toJson(template)).build();
 
	
        }
 
}