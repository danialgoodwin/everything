
/** A competition can have leagues, which has games. A competition could also be a tournament, which has games.
 * Games are played with Teams, which has Players. */
object class CompetitionManagerApp {
  val repo = Repo()
  
  fun newTournament(): Tournament { }
  fun newLeague(): League { }
  fun addPlayerConstrain(player: Player, constraint: Constraint)
}

class CompetitionsRepo {
  private val tournaments = List<Tournaments>
  private val leagues = List<Leagues>
}

data class Tournament(val teams: List<Teams>, val startDateTime: LocalDateTime) { }

data class League(val teams: List<Teams>, val frequency: Frequency, val startDate: LocalDate, val gameTimes: List<Time>) { }

data class Game(val teams: List<Player>) { }

data class Team(val players: Set<Player>) { }

data class Player(val name: String, val email: String, val phoneNumber: String, val dateJoined: String) { }

data class GameConstraint(val earliestTime: LocalTime?, val latestTime: LocalTime?) { }

enum Frequency { WEEK, DAY, HOUR, UNDEFINED }

