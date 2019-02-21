
class PointOfSaleApp {
  private val repo = PointOfSaleRepo()
  private val inventory = Inventory()
  private val sales = Sales()
  
  fun addInventory(sellable: Sellable, price: Price) { inventory.add(sellable) }
  
  fun changePrice(sellable: Sellable, newPrice: Price) { inventory.changePrice(sellable, newPrice) }
  
  fun removeInventory(sellable: Sellable, count: Int = 1, isRemoveAll: Boolean = false) { inventory.remove(sellable, count, isRemoveAll) }
  
  fun sell(sellable: Sellable, count: Int = 1) {
    inventory.remove(sellable, count)
    
  }
  
  fun refund(sellable: Sellable, count: Int = 1) {
    potentialInventory.add(sellable, count)
    
  }
  
}

class PointOfSaleRepo {
  
}

class Inventory(val products: List<Product>, val services: List<Service>) { }

class Sales(val salesByDay: Map<Date, Price>) { }

interface Sellable() {}

data class Product(val id: String, val name: String): Sellable { }

data class Service(val id: String, val name: String): Sellable { }

data class Price(val price: Int) { }
