import scala.io.StdIn

object Main extends App {
  val triangleService = new TriangleService

  print("Triangle a: ")
  val a = StdIn.readDouble()

  print("Triangle b: ")
  val b = StdIn.readDouble()

  print("Triangle c: ")
  val c = StdIn.readDouble()

  val value = TriangleData(a, b, c)

  println(s"Triangle Area: ${triangleService.area(value)}")

  println("Press RETURN...")
  StdIn.readLine()
}
