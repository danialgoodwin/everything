
class MarketplaceApp {

}

data Marketplace(
    name: String,
    description: String,
    restrictedProducts: List<String>,
    defaultNumberOfProducts: Int = 10
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
)

data Transaction(buyer: User, seller: User, product: Product, quantity: Int, date: DateTime)

data ProductPage(seller: User, product: Product, minQuantity: Int, maxQuantity: Int)

data Product(name: String, description: String, price: Money, images: List<Image>)

data Email(address: String)

data Image(base64: String)

data Forum() {
    data Section(name: String, description: String, threads: List<Thread>, subSections: List<SubSection>, isAllowSubSections: Boolean) {
        data SubSection(name: String, description: String, threads: List<Thread>)
    }
}

data Inbox(user: User, threads: List<Thread>)

data Thread(title: String, user: User, isPinned: Boolean, messages: Message)

data Message(
    user: User,
    text: String,
    flagUsers: List<User>,
    kudoUsers: List<User>,
    isDeleted: Boolean = false
) {
    fun edit() {}
    fun delete() {}
    fun flag() {}
    fun kudo() {}
}


