/**
 * 
 */

data Marketplace(
    name: String,
    description: String,
    restrictedProducts: List<String>,
    defaultConcurrentProducts: Int = 10,
    isIncludeForum: Boolean = true,
    isSupportProducts: Boolean = true,
    isSupportServices: Boolean = false
)

// Maybe add 2-factor-auth field?
data User(
    username: String,
    email: Email,
    isEmailVerfied: Boolean,
    avatar: Image,
    transactions: Transactions,
    productAvailable: ProductAvailable,
    joinDate: DateTime,
    lastSignedInDate: DateTime,
    ignoredUsers: List<User>,
    messages: List<Message>,
    sellerReviews: List<Review>,
    buyerReviews: List<Review>
) {
    data Email(address: String)   
}

data Transaction(
    buyer: User,
    seller: User,
    product: Product,
    quantity: Int,
    totalPrice: Money,
    date: DateTime
)

data ProductPage(
    product: Product,
    minQuantity: Int,
    maxQuantity: Int,
    transactions: List<Transactions> = listOf()
) {
    fun edit()
    fun delete()
    fun flag()
    fun review()
    fun buy()
}

data Product(seller: User, name: String, description: String, price: Money, images: List<Image>, category: String)

data Image(base64: String)
data Money(amount: Double, currency: Currency)
data Currency(name: String)
data Review(fromUser: User, forUser: User, value: Int, message: String = "", date: DateTime)

data Forum() {
    data Section(name: String, description: String, threads: List<Thread>, subSections: List<Section>, isAllowSubSections: Boolean) {
        fun newThread(title: String, message: String)
    }
}

data Inbox(user: User, threads: List<Thread>) {
    newThread(toUser: User, title: String = "", message: String)
}

data Thread(title: String, user: User, isPinned: Boolean, messages: List<Message> = listOf()) {
    newMessage(text: String)
}

data Message(
    user: User,
    text: String,
    flagUsers: List<User> = listOf(),
    kudoUsers: List<User> = listOf(),
    isDeleted: Boolean = false
) {
    fun reply() {}
    fun edit() {}
    fun delete() {}
    fun flag() {}
    fun kudo() {}
}

abstract class Plugin()
class MarketplacePlugin(paymentPlugin: PaymentPlugin) : Plugin()
class PaymentPlugin() : Plugin()
class ForumPlugin() : Plugin()
class ForumAdsPlugin() : Plugin()
class UserAccountPlugin() : Plugin()
class UserDirectMessagingPlugin() : Plugin()


abstract Page()
class SignInPage() : Page()
class ProductsPage() : Page()
class ProductPage() : Page()
class OrderStatusPage(): Page()
class PaymentPage() : Page()
class InboxPage() : Page()
class ProfilePage(user: User) : Page()
class SalesPage() : Page()
class SettingsPage() : Page()
class AdminPage() : Page()
class HealthPage() : Page()


