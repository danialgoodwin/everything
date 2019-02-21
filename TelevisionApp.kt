
class TelevisionApp {
  private var isOn = false
  
  fun addRemote(remote: TelevisionRemote) { }
}

class TelevisionRepo(val channels: List<TelevisionChannel>) {

}

data class TelevisionRemote(val buttons: List<Button>) {

}
