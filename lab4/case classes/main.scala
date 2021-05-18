// class CC(x: Int)
// case class CC(x: Int)  //2 pliki

// object O1 { val x = 2 } //2 pliki

// class C1(val x: Int)
// class SubC1(x: Int) extends C1(x)

// class C1(val x: Int)
// case class SubC1(x: Int) extends C1(x)

// class C1(val x: Int)
// case class SubC1(y: Int) extends C1(y)

// case class C1(x: Int)
// class SubC1(x: Int) extends C1(x)

// case class C1(x: Int)
// case class SubC1(x: Int) extends C1(x)

// 
// class C1 extends T1 {
//   def f(i: Int) = { println(i) }
// }
object Appl {
  def main(args: Array[String]) {
    (new C1).f(3)
  }
}
