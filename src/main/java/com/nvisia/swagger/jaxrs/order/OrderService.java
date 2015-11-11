package com.nvisia.swagger.jaxrs.order;

/**
 * Service interface for orders
 * 
 * @author Michael Hoffman, NVISIA
 *
 */
public interface OrderService {

   /**
    * Selects an order by order ID
    * 
    * @param orderId
    * @return
    */
   Order getOrder(int orderId) throws Exception;

}
