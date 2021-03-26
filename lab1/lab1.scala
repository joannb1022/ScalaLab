//Zmienić w pliku whiledo.scala pętlę “do-while“ na “while“ i uruchomić skrypt
var i = 0
while (i<10) {
  if (i % 2 == 0) println(i)
  i += 1


var i = 0
val doWhileRes = do {println(i); i += 1; true} while (i < 4)
//Jaki jest typ doWhileRes? -- Unit

//for2while
for (i <- 1 to 10; x = 2 * i + 1; if (x % 3 == 0)) println(i, x)

var i = 1
while (i<=10){
  val x = 2 * i + 1
  if (x%3 ==0) println (i,x)
  i+=1
}

//Napisać pętlę “for“ wypisującą indeksy
//dwuwymiarowej macierzy o wymiarach 5 x 5 leżące ponad główną przekątną
for (i <- 1 to 5; j <- 1 to 5; if (i<j)) println(i,j)

//Zdefiniować jeszcze raz metody f1 i f2, podając jawnie typ rezultatu
def f1(x: Int): Double = if (x > 0) 1 else 2.3 //Jaki jest typ wyniku? -- Double
def f2(x: Int): Any = if (x >= 0) 1 else "x is negative"

//Porównaj wyniki (sygnatury metod) poniższych definicji
def printlnArg(a: Int): Unit = { println(a) } //jawnie podany tym rezultatu
def printlnArg(a: Int) = println(a) //tu juz nie jest jawnie podany
def printlnArg(a: Int) { println(a) } // tu nie ma = ale jest {
//def printlnArg(a: Int) println(a) a to wgl zle
