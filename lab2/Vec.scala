class Int2DVec(val x: Int, val y: Int) {
  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def -(other: Int2DVec) = new Int2DVec(x - other.x, y - other.y)
  def *(other: Int2DVec) = x* other.x + y * other.y
  def unary_- = new Int2DVec(-x, -y)
  override def toString() = "(" + x.toString + "," + y.toString + ")"

  //Auxiliary constructors
  def this() = {
  //  println("Creating Int2DVec(0,0)")
    this(0, 0)
    println("Creating Int2DVec(0,0)")
  }

  def this(prototype: Int2DVec) = {
    //println("Copy-constructor working")
    this(prototype.x, prototype.y)
    println("Copy-constructor working")
  }

  // Kiedy zamienilam kolejnosc (this <-> println) w konstruktorach pomocniczych, pojawil sie blad: error: 'this' expected but identifier found.
  // W konstruktorach pomocniczych MUSI zaczynac sie odwolaniem do konstruktora glownego lub poprzednio zdefiniowanych pomocniczych

}


object Appl {
  def main(agrs: Array[String]) {
    val v1 = new Int2DVec(1, 2)
    val v2 = new Int2DVec(10, 20)
    val v3 = v1 + v2
    val v4 = -v2
    val v5 = v2 - v1
    val v6 = v1 * v2
    println(v3)
    println(v4)
    println(v5)
    println(v6)
    println(new Int2DVec())
    println(new Int2DVec(v1 + v1 + v2))
  }
}
