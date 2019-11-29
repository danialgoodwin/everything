from core.Database import Database
from core.View import View, RowView, TextView, ImageView, Image


class MinimalSocialMediaView(val database: Database) : View() {
    private var postsView : View
    
    override fun show() {
        postsView =  PostsView(database.getPosts())
        return postsView
    }
    fun addNewPost(user: User, message: String) {
        postsView.add(Post(user, message))
    }
}

class PostsView(val posts: List<Post> = listOf()) : ColumnView() {
    override fun show() {
        posts.foreach { post ->
            this.add(PostView(post))
        }
    }
}

class PostView(val post: Post) : View() {
    override fun show() {
        return RowView(ImageView(post.user.avatar), TextView(post.message))
    }
    fun reply() {}
}

class ProfileView(val user: User) {
    override fun show() {
        return ColumnView(
            ImageView(user.avatar),
            TextView(user.name),
            ButtonView('Show posts'),
            ButtonView('Send message'),
            ButtonView('Follow'),
            ButtonView('Block')
        )
    }
    fun showPosts(user: User) {}
    fun sendMessage(fromUser: User, toUser: User) {}
    fun follow(followingUser: User, followedUser: User) {}
    fun block(blockingUser: User, blockedUser: User) {}
}

data class Post(val user: User, val message: String)
data class User(
    val name: String,
    val avatar: Image = defaultAvatar(),
    val birthday: DateTime? = null,
    val birthdayPrivacySettings: BirthdayPrivacySettings = BirthdayPrivacySettings(),
    val friends: List<User> = listOf(),
    val posts: List<Post> = listOf()
) {
    fun isFriend(otherUser: User) = friends.contains(otherUser)
}

class BirthdayPrivacySettings(
    val user: User,
    val isShowDateToFriends: Boolean = true,
    val isShowDateToPublic: Boolean = true,
    val isShowYearToFriends: Boolean = false,
    val isShowYearToPublic: Boolean = false,
    val allowedUsers: List<User> = listOf()
) {
    /** Return birthday is permission is granted, otherwise return null. */
    fun getBirthday(requestingUser: User) : DateTime? {
        if (allowedUsers.contains(requestingUser)) { return user.birthday }
        if (user.isFriend(requestingUser)) {
            
        } else {
            
        }
        return null
    }
}
