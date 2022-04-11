import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class RobotAppSpec extends AnyFlatSpec with should.Matchers {
  behavior of "The executeAll method"

  it should "return Robot(West, 9, 4) for commands RAALAL and Robot(North 7, 3)" in {
    RobotApp.executeAll(Robot(Direction.North, 7, 3), "RAALAL") shouldBe Robot(Direction.West, 9, 4)
  }
}
