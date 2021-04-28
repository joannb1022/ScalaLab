import scala.beans.BeanProperty

class Personval (val givenName : String, @BeanProperty var surname : String, protected val id : String)

object Applbean{
  def main(args: Array[String]) : Unit = {
    val p = new Personval("Jan", "Kowalski", "1234567800")
    p.setSurname("Nowak")
    println(p.getSurname())

  }
}
