object Salary{

  def salary(normal_hours: Int, OT_hours: Int): Double ={
    (normal_hours * 250) + (OT_hours * 85)
  }
  
  def tax(normal_hours: Int, OT_hours: Int): Double ={
    val grossSalary = salary(normal_hours, OT_hours)
    val taxAmount = grossSalary * 0.12 // 12% tax
    taxAmount
  }
  
  def takehome_salary(normal_hours: Int, OT_hours: Int):Double = {
    val netSalary = salary(normal_hours, OT_hours) - tax(normal_hours, OT_hours)
    netSalary
  }

  def main(args: Array[String]):Unit = {
    val Salary = takehome_salary(40, 30)
    println(Salary)
  }

}
