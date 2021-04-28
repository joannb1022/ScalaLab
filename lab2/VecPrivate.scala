import scala.math.sqrt
import scala.math.pow

class Int2DVec private (val x: Int, val y: Int) {
  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def -(other: Int2DVec) = new Int2DVec(x - other.x, y - other.y)
  def *(other: Int2DVec) = x* other.x + y * other.y
  def unary_- = new Int2DVec(-x, -y)
  override def toString() = "(" + x.toString + "," + y.toString + ")"

}


object Appl {
  def main(agrs: Array[String]) {
    val v1 = Int2DVec(1, 2) //wywolanie metody apply na obiekcie towarzyszacym
    val v2 = Int2DVec(10, 20)
    val v3 = v1 + v2
    val v4 = -v2
    val v5 = Int2DVec.unitVectorOf(v1)
    println(v5)
    println(v3)
    println(v4)
    println(Int2DVec())
    println(Int2DVec(v1 + v1 + v2))

  }
}

object Int2DVec {
  def apply(x: Int, y: Int) = new Int2DVec(x, y)
  def apply() = new Int2DVec(0, 0)
  def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y)
  def unitVectorOf(v : Int2DVec) : Int2DVec = {
    val length = sqrt(v.x * v.x + v.y * v.y)
    val x = v.x / length
    val y = v.y / length
    return new Int2DVec(x.toInt,y.toInt)
}
}

/*

metody fabryczne - tworza nowe obiekty
podstawowa roznica - konstruktor zawsze tworzy nowy obiekt i go zwraca, apply - nie zwracamy nowego obiektu, uzywamy obiektow ktore powstaly wczesniej
apply - mozemy pominac jej nazwe

*/
