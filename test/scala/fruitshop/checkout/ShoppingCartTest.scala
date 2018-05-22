package fruitshop.checkout

import org.junit.Test
import org.junit.Assert._

import fruitshop.checkout.ShoppingCart

class ShoppingCartTest{    
    
  @Test
  def testCorrectTotalReturnsWithOffers()
  {   
    assertTrue(new ShoppingCart().checkoutCalculator(List("Apple","Apple","Apple","Orange","Orange","Orange")) == 1.70)  
  }
  
  @Test
  def testCorrectTotalReturnsWithoutOffers()
  {   
    assertTrue(new ShoppingCart().checkoutCalculator(List("Apple","Orange","Orange")) == 1.1)  
  }
  
  @Test
  def testIncorrectTotalReturnsInvalid()
  {   
    assertFalse(new ShoppingCart().checkoutCalculator(List("Apple","Apple","Orange","Orange")) == 2.05)  
  }
  
  @Test
  def testInvalidItemInCartReturnsInvalid()
  {   
    assertFalse(new ShoppingCart().checkoutCalculator(List("Apple","Aple","Apple","Orange","Orange","Orange")) == 1.70)  
  }
    
}