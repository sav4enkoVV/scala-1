import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._

class TriangleServiceSpec extends AnyFlatSpec with should.Matchers {
  def victim() = new TriangleService

  "TriangleService" should "calculate area for given triangle data" in {
    val value = TriangleData(3, 4, 5)

    victim().area(value) should be (6)

    val value1 = TriangleData(9, 12, 15)

    victim().area(value1) should be (54)
  }

  it should "return zero if a is zero" in {
    val value = TriangleData(0, 4, 4)

    victim().area(value) should be (0)
  }

  it should "return zero if b is zero" in {
    val value = TriangleData(4, 0, 4)

    victim().area(value) should be (0)
  }

  it should "return zero if c is zero" in {
    val value = TriangleData(4, 4, 0)

    victim().area(value) should be (0)
  }
}
