package fruitshop.checkout

class ShoppingCart{  
  // Fruits price list
  val fruits_price = Map("Apple"->0.60,
                        "Orange"->0.25) 

  def checkoutCalculator(bill: List[String])={   
    val total_bill = (bill map fruits_price).sum
    total_bill    
  }   
}