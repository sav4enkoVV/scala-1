import scala.math.sqrt

class TriangleService {
  def area(value: TriangleData): Double = {
    val p = (value.a + value.b + value.c) / 2
    return sqrt(p * (p - value.a) * (p - value.b) * (p - value.c))
  }
}
