package com.mmartin.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnType(){
		return "<p>Java Web SErvices</p>";
	}
}
