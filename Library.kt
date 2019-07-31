class Library(val id: UUID) {

  const CHECKOUT_BOOK_TIME_PERIOD_IN_DAYS = 14
  
  val books = Set<Book>()
  

  fun addBook(book: Book)
  fun removeBook(book: Book)
  fun checkoutBook(book: Book, patron: User)
  fun returnBook(book: Book)

  data class Checkout(val book: Book, val patron: User, val checkoutDatetime: DateTime, val dueDate: Date, val returnDatetime: DateTime)

  data class Book(val id: UUID, val isbn: String, val name: String, val author: String, val description: String)

}
