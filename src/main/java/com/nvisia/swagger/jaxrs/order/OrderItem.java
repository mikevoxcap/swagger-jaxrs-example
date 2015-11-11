package com.nvisia.swagger.jaxrs.order;

import javax.xml.bind.annotation.*;

/**
 * Order item type
 * 
 * @author Michael Hoffman, NVISIA
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderItem {

   private int orderItemId;
   private int orderedProductId;

   /**
    * Blank constructor
    */
   public OrderItem() {

   }

   /**
    * Full constructor
    * 
    * @param orderItemId
    * @param orderedProductId
    */
   public OrderItem(int orderItemId, int orderedProductId) {
      super();
      this.orderItemId = orderItemId;
      this.orderedProductId = orderedProductId;
   }

   /**
    * @return the orderItemId
    */
   public int getOrderItemId() {
      return orderItemId;
   }

   /**
    * @param orderItemId
    *           the orderItemId to set
    */
   public void setOrderItemId(int orderItemId) {
      this.orderItemId = orderItemId;
   }

   /**
    * @return the orderedProductId
    */
   public int getOrderedProductId() {
      return orderedProductId;
   }

   /**
    * @param orderedProductId
    *           the orderedProductId to set
    */
   public void setOrderedProductId(int orderedProductId) {
      this.orderedProductId = orderedProductId;
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("OrderItem [orderItemId=").append(orderItemId)
            .append(", orderedProductId=").append(orderedProductId).append("]");
      return builder.toString();
   }

}
