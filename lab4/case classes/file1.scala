// trait T1 {
//   def f(i: Int): Unit
// }


// sealed trait T1 {
// def f(i: Int): Unit
// }

//illeagal ingeritance from sealed trait T1 (class C1 extends T1)


sealed trait T1 {
  def f(i: Int): Unit
}
class C1 extends T1 {
  def f(i: Int) = { println(i) }
}
