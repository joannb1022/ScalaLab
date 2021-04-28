class Person(val givenName: String, var surname: String, protected val id : String){
  def name = givenName + " " + surname
}

object Appl {
  def main(agrs: Array[String]) {
    val p = new Person("Jan", "Kowalski", "1234567890")
    p.surname = "Nowak" //wywolanie meteody surname_$eq
    println(p.name)
    println(p.givenName)
    println(p.surname)
  }
}


/*

LAB 2

W skali wszystkie klasy sa domyslnie publiczne
Konstruktor glowny!!
class Person() <- okreslam parametry konstruktora glownego

kazdy parametr jest zamieniany na atrybut z metodami?
val givenName - generuje nam sie atrybut i metoda dostepowa (ale on jest niemodyfikowalny)
var - generowana jest metoda ktora pozwala zmienic wartosc
protected - metoda ktora bedzie pozwalala tylko obiektom ktore dziedzicza z klasy Person dostawac sie do id

*/
