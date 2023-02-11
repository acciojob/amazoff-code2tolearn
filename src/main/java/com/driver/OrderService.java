package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository ;

   public void addOrder( Order order)
   {
        orderRepository.addOrder(order);
   }

   //
   public void addPartner(@PathVariable String partnerId)
   {
      orderRepository.addPartner(partnerId);
   }
   // pair
  public void  addOrderPartnerPair(String orderId, String partnerId)
  {
        orderRepository.addOrderPartnerPair(orderId,partnerId );
  }
  //  get Order
    public Order getOrderById(String orderId) {
     return orderRepository.getOrderById(orderId) ;
   }
    // get partner

   public DeliveryPartner getPartnerById(String partnerId) {
      return orderRepository.getPartnerById(partnerId) ;
  }
  // get order count
   public int getOrderCountByPartnerId(String partnerId)
   {
       return orderRepository.getOrderCountByPartnerId(partnerId) ;
   }
  //
  public List<String> getOrdersByPartnerId(String partnerId)
  {
       return orderRepository.getOrdersByPartnerId(partnerId) ;
  }

  //
  public List<String> getAllOrders()
  {
      return orderRepository.getAllOrders() ;
  }
  // get count of unassignedOrders
   public int  getCountOfUnassignedOrders()
   {
       return orderRepository.getCountOfUnassignedOrders() ;
   }
   //
  public int getOrdersLeftAfterGivenTimeByPartnerId(String time,  String partnerId)
  {
      return orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time , partnerId);
  }
  //
  public String getLastDeliveryTimeByPartnerId( String partnerId)
  {
      return orderRepository.getLastDeliveryTimeByPartnerId(partnerId);
  }

  public void deletePartnerById(String partnerId)
  {
      orderRepository.deletePartner(partnerId);
  }

   public void deleteOrderById( String orderId)
   {
       orderRepository.getOrderById(orderId) ;
   }

}
