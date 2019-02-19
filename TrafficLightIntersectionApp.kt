
object TrafficLightIntersectionApp {
  val repo = TrafficLightIntersectionRepo()
  val intersection = TrafficLightIntersection()
  
}

class TrafficLightIntersectionRepo {
  private val trafficLights = List<TrafficLights>()
}

class TrafficLightIntersection() {
  fun addTrafficLight(trafficLight: TrafficLight) { }
}

data class Direction(angle: Int) { }

data class PedestrianLight() {
  enum Mode { START, STOPPING, STOP }
  enum Mode2 { START, STOP }
}

data class TrafficLight(fromDirection: Direction, toDirection: Direction) { }

enum TrafficLightColor { GREEN, YELLOW, RED }

enum TrafficLightSymbol {
  FULL, ARROW_LEFT, ARROW_RIGHT, ARROW_FORWARD, ARROW_U_TURN
}


