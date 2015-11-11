package com.nvisia.swagger.jaxrs.order;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.*;

/**
 * Order resource
 * 
 * @author Michael Hoffman, NVISIA
 *
 */
@Path("order")
public class OrderResource {

   @GET
   @Path("{orderId}")
   @Produces(MediaType.APPLICATION_JSON)
   public Order getOrder(@PathParam("orderId") int orderId) {
      OrderService orderService = new DefaultOrderService();
      Order order = null;
      try {
         order = orderService.getOrder(orderId);
      } catch (Exception e) {
         throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR)
               .type(MediaType.APPLICATION_JSON).build());
      }
      if (order == null) {
         throw new WebApplicationException(Response.status(Status.NOT_FOUND)
               .type(MediaType.APPLICATION_JSON).build());
      }

      return order;
   }
}
