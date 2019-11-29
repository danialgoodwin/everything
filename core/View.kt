abstract class View() {
    abstract fun show()
}

class RowView(val views: View...) : View() {
    override fun show() {
        views.foreach { view ->
            this.add(view)
        }
    }
}

class ColumnView(val views: View...) : View() {
    override fun show() {
        views.foreach { view ->
            this.add(view)
        }
    }
}

class ImageView(val image: Image) : View() {
    override fun show() {}
}

class TextView(val text: String) : View() {
    override fun show() {}
}

class TextInputView(val text: String, val hint: String) : View() {
    override fun show() {}
}

data class Image(base64: String)
