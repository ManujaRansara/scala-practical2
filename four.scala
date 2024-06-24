object ticket_price{
     def Ticket_and_attendence(ticket_price:Double):Double = {
         var attendence = 120 - ( (ticket_price - 15) * 4);
         attendence
     }
     def Profit(ticket_price:Double):Double = {
         var profit = (Ticket_and_attendence(ticket_price)*ticket_price) - (500+ 3 * Ticket_and_attendence(ticket_price));
         profit
     }
     def main(args:Array[String]):Unit = {
         println("Enter the Ticket Price:")
         val ticket = scala.io.StdIn.readDouble()
         val profit = Profit(ticket)
         println("Your profit is "+{profit})
     }
}