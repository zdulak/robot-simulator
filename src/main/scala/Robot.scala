case class Robot(direction: Direction, x: Int, y: Int) {
  def advance: Robot = {
    direction match {
      case Direction.North => Robot(direction, x, y + 1)
      case Direction.South => Robot(direction, x, y - 1)
      case Direction.West => Robot(direction, x - 1, y)
      case Direction.East => Robot(direction, x + 1, y)
    }
  }
  def turnLeft: Robot = Robot(direction.rotate(-90), x, y)

  def turnRight: Robot = Robot(direction.rotate(90), x, y)
}
