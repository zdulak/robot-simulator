import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import org.scalatest.prop.TableDrivenPropertyChecks._

class DirectionSpec extends AnyFlatSpec with should.Matchers {
  behavior of "rotate"

  it should "return the direction rotated 90 degrees anticlockwise for an angle of -90 degrees" in {
    val args = Table(
      ("Starting direction", "result"),
      (Direction.North, Direction.West),
      (Direction.West, Direction.South),
      (Direction.South, Direction.East),
      (Direction.East, Direction.North)
    )

    forAll(args) {(start, end) => start.rotate(-90) shouldBe end}
  }

  it should "return the direction rotated 90 degrees clockwise for an angle of 90 degrees" in {
    val args = Table(
      ("Starting direction", "result"),
      (Direction.North, Direction.East),
      (Direction.West, Direction.North),
      (Direction.South, Direction.West),
      (Direction.East, Direction.South)
      )

    forAll(args) {(start, end) => start.rotate(90) shouldBe end}
  }
}
