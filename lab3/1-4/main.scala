// object Appl {
//   def readFile(fileName: String) = try {
//     println("Opening the file...")
//     val inFile = scala.io.Source.fromFile(fileName)
//     try {
//       for (line <- inFile.getLines) println(line)
//       val x = 100 / inFile.getLines.length
//     } finally {
//       println("Closing the file...")
//       inFile.close
//     }
//   } catch {
//     case ex: java.io.FileNotFoundException =>
//       println(ex.getMessage)
//     case ex: Throwable =>
//       println("Default exception handler: "+ ex.getMessage)
//   }
//
//   def main(args: Array[String]) {
//     readFile("logins.txt")
//   }
// }

// package p1.p2.p3
// class A3

// package p1
// package p2
// package p3
// class A3

// package p1.p2.p3 {
//   class A3
// }


// package p1 {
//   package p2 {
//     package p3 {
//       class A3
//     }
//   }
// }


// package p1 {
//   class A1T { new A1B }
//   package p2 {
//     class A2T { new A2B; new A1T; new A1B }
//     package p3 {
//       class A3 { new A2T; /* new A2B; */ new A1T; /* new A1B */ }
//     }
//     class A2B { /* new A2T; new A1T; new A1B */ }
//   }
//   // class A1B { /* new A1T */ }
//   class A1B { new A1T }
// }
//
// object Appl {
//   def main(args: Array[String]) {
//     new p1.A1T
//     new p1.A1B
//     new p1.p2.A2T
//     new p1.p2.A2B
//     new p1.p2.p3.A3
//   }
// }



// package p1 {
//   class A1
//   package p2 {
//     class A21
//   }
// }
//
// package p1 {
//   package p2 {
//     class A22 { new A1 }
//   }
// }

// package p1 {
//   package p2 {
//     class A1 { println("p1.p2.A1") }
//     class A22 {
//       println("Calling new p1.p2.A1")
//       new A1
//       println("Calling new _root_.p1.A1")
//       new _root_.p1.A1
//       println("p1.p2.A22")
//     }
//   }
// }
//
// object Appl {
//   def main(args: Array[String]) {
//     new p1.A1
//     new p1.p2.A21
//     new p1.p2.A22
//   }
// }


//
// import p1.p2.C2._
// object Appl {
//   import p1._
//   new C1
//   import p2.{C21, C22=>MyC22, C23=>_} //C22 ma juz nazwe MyC22 ALIASOWANIE (C23 tez dlatego nie)
//   new C21
//   // new C22
//   new MyC22
//   // new C23
//   def main(args: Array[String]) {
//     m1OC2()
//     m2OC2(new C1)
//   }
// }


object Appl {
  def main(args: Array[String]) {
    import p1._
    println(m1(2))
    println(m2(5.5))
  }
}
