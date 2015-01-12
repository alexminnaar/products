package models

case class Product(ean:Long,name:String,description:String)

object Product {

  var products=Set(
  Product(94275629875L,"Teddy Bear","A cute little teddy bear!"),
  Product(734L,"Stuffed Giraffe","A giraffe with a long neck."),
  Product(8947659L,"Monkey","A stuffed monkey that likes to eat bananas.")
  )

  def findAll=products.toList.sortBy(_.ean)

  def findByEan(ean:Long)=products.find(_.ean==ean)

  def add(product:Product){
    products=products+product
  }
}
