import utils._


object Appl {
  def readFile(fileName: String, outFileName: String) = try {
    println("Opening the file...")
    val inFile = scala.io.Source.fromFile(fileName)
    val outFile = new java.io.PrintWriter(outFileName)
    try {
      for (login <- inFile.getLines){
      val passwd: String = PasswdGen.nextPasswd(10) //kazde haslo ma dlugosc 10
      outFile.println(login + " : " + passwd)
    }
    } finally {
      println("Closing the file...")
      inFile.close
      outFile.close
    }
  } catch {
    case ex: java.io.FileNotFoundException =>
      println(ex.getMessage)
    case ex: Throwable =>
      println("Default exception handler: "+ ex.getMessage)
  }

  def main(args: Array[String]) {
    readFile("logins.txt", "login-passwds.txt")
  }
}
