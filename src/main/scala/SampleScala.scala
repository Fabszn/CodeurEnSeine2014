object SampleScala extends App {

  case class Contact(name: String)

  val p1: Contact = null; // no value

  val p2: Contact = Contact("Harikovair") // instance of Person


  val opt1 = Option(p1)
  val opt2 = Option(p2)

  println("opt1 est vide : " + opt1)
  println("")
  println("opt2 contient une valeur : " + opt2)


}
