package fruitshop.checkout
import scala.math.Integral.Implicits._

class ShoppingCart{  
  // Fruits price list
  val fruits_price = Map("Apple"->0.60,
                        "Orange"->0.25) 
 
  def checkoutCalculator(bill: List[String])={ 
    var total_bill : Double = 0.00 
  
    //check for invalid items in the cart
    // Exit by returning 0 value total bill for any invalid items 
    try{
      bill map fruits_price      
      }
    catch{
      case e: NoSuchElementException => {   
        // This block can be enhanced to call audit log method to record the error and invalid item
        total_bill}      
    } 

    //apply offer on apples
    val (applesinoffer, applesfullprice) = (bill.count(_=="Apple") /% 2)
    
    //apply offer in oranges
    val (orangesinoffer, orangesfullprice) = (bill.count(_=="Orange") /% 3) 
    
    total_bill = ((applesinoffer + applesfullprice)*fruits_price("Apple")) +
                 (orangesinoffer*2*fruits_price("Orange")+ orangesfullprice*fruits_price("Orange"))       

    total_bill
  }
}