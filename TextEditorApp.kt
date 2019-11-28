
class TextEditorApp() {

}

class TextEditor() {

}

data class MenuBar(val menus: List<Menu>)

data class Menu(val name: String, val description: String = "", action: Action? = null, val menus: List<Menu> = listOf())

data class Action(val name: String, val description: String, keyBindings: List<KeyBinding>)

data class KeyBinding(trigger: String, action: Action)


abstract class View()
class TextView() : View()
class TextInputView() : View()

abstract class Layout()

class Glutter(plugins: List<GlutterPlugin>, menus: List<Menu>)
abstract class GlutterPlugin()
class LineNumberGlutterPlugin() : GlutterPlugin()
class ImageGlutterPlugin() : GlutterPlugin()
class ColorGlutterPlugin() : GlutterPlugin()
class NotificationGlutterPlugin() : GlutterPlugin()
class VersionControlGlutterPlugin() : GlutterPlugin()
class CodeResultGlutterPlugin() : GlutterPlugin()

abstract Page()
