import scala.math.abs

sealed abstract class Direction(val angle: Int) {
  def rotate(angle: Int): Direction = {
    val newAngle = (this.angle + angle) % 360
    newAngle match {
      case Direction.North.angle => Direction.North
      case newAngle if (abs(newAngle) == Direction.South.angle) => Direction.South
      case newAngle if (newAngle == Direction.East.angle || newAngle == -Direction.West.angle) => Direction.East
      case newAngle if (newAngle == Direction.West.angle || newAngle == -Direction.East.angle) => Direction.West
    }
  }
}

object Direction {
  case object North extends Direction(0)
  case object South extends Direction(180)
  case object West extends Direction(270)
  case object East extends Direction(90)
}
