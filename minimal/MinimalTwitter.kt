from core.Database import Database
from core.View import View, RowView, TextView, ImageView, Image


class MinimalTwitterView(val database: Database) : View() {
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

data class Post(val user: User, val message: String)
data class User(name: String, avatar: Image)
