package fruitshop.checkout

import org.junit.Test
import org.junit.Assert._

import fruitshop.checkout.ShoppingCart;

class ShoppingCartTest{    
    
  @Test
  def testCorrectTotalReturnsValid()
  {   
    assertTrue(new ShoppingCart().checkoutCalculator(List("Apple","Apple","Orange","Apple")) == 2.05)  
  }
  
  @Test
  def testIncorrectTotalReturnsInvalid()
  {   
    assertFalse(new ShoppingCart().checkoutCalculator(List("Apple","Apple","Orange","Orange")) == 2.05)  
  }
  

}