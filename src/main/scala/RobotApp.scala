object RobotApp extends App {
  val x0 = args(0).toInt
  val y0 = args(1).toInt
  val commands = args(2)
  println(executeAll(x0, y0, commands))

  def executeAll(x: Int, y: Int, commands: String): Robot = {
    commands.toUpperCase.foldLeft(Robot(Direction.North, x, y))(execute)
  }

  def execute(robot: Robot, command: Char): Robot = {
    command match {
      case 'A' => robot.advance
      case 'L' => robot.turnLeft
      case 'R' => robot.turnRight
      case _ => {
        println("Invalid command")
        robot
      }
    }
  }
}
