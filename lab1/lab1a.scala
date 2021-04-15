// println("Hasta la vista, baby")
//
// var x1: Int = 3
// x1
// x1 = 5
// x1
// var x2 = 10.3
// x2
// val c1: Int = 11
// c1
// val c2 = 45.1
// //c2 = 32.3 nie można zmienic val
// val c2 = 32.3
// val zdzblo = 3
// val ~^~ = 4
// val |-<*>-| = 4
// val x1 = 4; x2 = 5
// val x1 = 4; val x2 = 5
// //val x3 = x2++
// //val x3 = ++x2
// //val x3 = x2 += 1 value += is not a member of Int
// //val x4 = _
// //val x4: Int = _
// //var x4 = _
// var x4: Int = _ //ale wyswietla sie blad chociaz niby dziala
// c2.toInt //było 32.3 zmieniło na 32
//
// var x = 0
// val y = 5.4
// val sum = x + y // Jaki jest typ sum? Double
// val xr2 = x = 2 //
// val xr3 = (x == 0)
// val xr4 = (x += 2)
// x = x + 2
// x //6
//
//
// //BLOK W SCALI
// { val x = 10; 2 * x + 1 } // Jaka jest "wartość bloku" -- 21
// //ten blok zwrócił wartość ostatniego wyrażenia
// val y = { val x = 10; 2 * x + 1 }
//
// val b1 = { println("The answer to the Ultimate Question ")
//   42
// }
// //The answer to the Ultimate Question val b1: Int = 42
//
// val b2 = {
//   val answer = 42;
//   println("The answer to the Ultimate Question is " + answer)
// }
// //i to jest unit -- val b2: Unit = ()
//
// b1==b2 //val res2: Boolean = false
//
//
// val i = -1
// val abs_i = if (i >= 0) i else -i
// val ifNoElseRes = if (i >= 0 || i % 2 == 0) println("Nonnegative or even") // Jaki jest typ ifNoElseRes
//
// val i = 1
// val ifRes = if (i > 0) i else 0 //val ifRes: Int = 1
// val halfIfRes1 = if (i > 10) i //val halfIfRes1: AnyVal = ()
// val halfIfRes2 = if (i > 10) i else () //val halfIfRes2: AnyVal = ()
//
// var i = 0
// while (i < 5) {
//   println(i)
//   i += 1
// }
//
// var i = 10
// val whileRes = while (i >= 0) {
//   println(i)
//   i -= 2
//   true
// }
//
// var i = 0
// do {
//   if (i % 2 == 0) println(i)
//   i += 1
// } while (i < 10)
//
// var i = 0
// while (i<10) {
//   if (i % 2 == 0) println(i)
//   i += 1
// }
//
// for (i <- 1 to 3) println(i) //1 2 3
// for (i <- 1 until 3) println(i) //1 2
// val expr1 = 1 to 3 //inclusive
// val expr2 = 1 until 3
// for (i <- 1.to(3)) println(i)
// for (i <- 1.until(3)) println(i)
// val expr1 = 1.to(3)
// val expr2 = 1.until(3)
//
// for (i <- 1 to 10; x = 2 * i + 1; if (x % 3 == 0)) println(i, x) //(1,3) (4,9) (7,15) (10,21)
// val forLoopRes = for (i <- 1 to 10; x = 2 * i + 1; if (x % 3 == 0))  {println(i, x); i}
// //nie wiem po co to i
// // val forLoopRes: Unit = ()
//
// for (i <- 1 to 3; j <- 1 to 4) println(i,j)
//
// //przetwarzone elementy i do jednej kolekcji -- jak map w haskellu
// for (i <- 1 to 3) yield(i)
// val xsv = for (i <- 1 to 3) yield(2 * i + 1)
//
// val xsa = for (i <- (1 to 3).toArray) yield(i) // def toArray: Array[A]
// val xsl = for (i <- (1 to 3).toList) yield(i) // def toList: scala.List[A]
// //val xss1 = for (i <- (1 to 3).toSet) yield(2 * i) // def toSet[B >: A]: Set[B]
// val xss2 = for (i:Int <- (1 to 3).toSet) yield(i * i)
// val xss3 = for (i <- (1 to 3).toSet[Int]) yield {if (i % 2 == 0) i * i else 2 * i + 1}
// val xss4 = for (i <- (1 to 3).toSet[Int]) yield {if (i % 2 != 0) i * i}
//
// def abs(x: Double): Double = { if (x >= 0) x else -x }
// //abs: (x: Double)Double
// abs(-5)
//
// val absAsFunction: (Double) => Double = abs
// val absAsFunction = abs _
//
// val x1 = absAsFunction(-3)
// val x2 = absAsFunction.apply(-3) // równoważne powyższej linii
//
//
// def abs(x: Double): Double = if (x >= 0) x else -x
// def abs(x: Double) = if (x >= 0) x else -x
// //def factorial (n: Int) = if (n <= 0) 1 else n * factorial(n-1) //tu nie ma podanego typu wyniku
// def factorial (n: Int): Int = if (n <= 0) 1 else n * factorial(n-1)
// def f1(x: Int) = if (x > 0) 1 else 2.3 //Jaki jest typ wyniku? -- Double
// def f2(x: Int) = if (x >= 0) 1 else "x is negative" //Jaki jest typ wyniku? -- Any (albo 1 albo jakis napis)
//
// f1(3)
// f1(-10)
// f2(100)
// f2(-45)
//
// def printAll(args: Int*) {for (arg <- args) println(arg)}
// printAll(1,2,3,4,6)
// printAll(1,10,100,1000,10000)
//
// def f1(head: Int, tail: Int*) = {println(head); for (arg <- tail) println(arg)}
// f1(1,2,3,4,5)
// f1(1, (2 to 20): _*)
//
//
// //*-parameter must come last
// //def f2(ints: Int*, theLast: Int) = {
// //  for (arg <- ints) println(arg); println(theLast)
// //}
//
// //def f3(ints: Int*, doubles: Double*) = {
// //  for (arg <- ints) println(arg)
// //  for (arg <- doubles) println(arg)
// //}
//
// def f4(args: Any*) = for (arg <- args) println(arg)
// f4(1, 3.14, true, "Jak dobrze być pisanką!")
//
// def printName(name: String = "John", surname: String = "Doe") {
//   println(name + " " + surname)
// }
// printName()
// printName("John")
//
// printName(surname = "Smith")
// printName(name = "Andrew")
// printName(surname = "Black", name = "Joe")
// printName("Black", "Joe")
//
// def f4() = 2 * 2
// f4()
// //f4 przejdzie ale mowi ze brakuje tych
// def f5 = 2 * 2
// f5
// //f5()
