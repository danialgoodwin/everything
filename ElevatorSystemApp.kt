// TODO: Add option to keep first floor door open?

object ElevatorSystemApp {
  val repo = ElevatorSystemRepo()
}

class ElevatorSystemRepo {
  val elevators = List<Elevator>
}

data class ElevatorLobby(val elevators: List<Elevator>) { }

data class Elevator(val numberOfDoors: Int = 1) { }

class ElevatorController private constructor() {
  private val buttons = List<String>
  fun addButton(button: String) { buttons.add(button) }
  fun build(): ElevatorController { }
}

