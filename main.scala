@main def hello()=
  println("Hello, Scala!") 

  val square = (x:Int) => x * x
  val result = List(1, 2, 3).map(square)
  println(result)
  println(square(19))

  val bigorsmall = if (10 > 6) "Big" else "Small"

  println(bigorsmall)

  def add(a: Int, b: Int) = a + b
  val r = add(6,8)
  val x: Int = 8 
  println(r)

  val numbers = List(1,2,3,4,5)
  val adder = (n:Int) => n + 10
  val added = numbers.map(adder)
  val evens = numbers.filter(n => n % 2 == 0)
  println(numbers)
  println(added)
  println(evens)

  case class Person(name: String, job: String, age: Int)
  val user1 = Person("Pro", "Programmer", 16)
  val user2 = Person("Alex", "Hacker", 16)

  val people = List(user1, user2)
  val maybePro: Option[Person] = people.find(_.name == "Pro")
  val arcadename = maybePro.map(_.name.toUpperCase())
  val finalname = arcadename.getOrElse("No Name")
  println(finalname)

  println(people)
  val names = people
    .map(_.name.toUpperCase())

  def greet(person: Person): String = person match {
    case Person(name, "Programmer", age) => s"Welcome, Mr.$name!"
    case Person(name, "Hacker", age) => "Hacking for Security!"
    case Person(name, job, age) => s"Nice to meet you, $name!"
  }

  println(greet(user1))
  println(greet(user2))

  case class Fruit(name: String, price: Int)
  val fruits = List(
    Fruit("Apple", 1500),
    Fruit("Banana", 2000),
    Fruit("Strawberry", 2500)
  )
  println(fruits)

  val cart = fruits
    .filter(_.price >= 2000)
    .map(_.name.toUpperCase())
  println(cart)

  val listinlist = List(List(1,2), List(3,4))
  val flatlist = listinlist.flatMap(x => x)
  println(listinlist)
  println(flatlist)
 
  case class User(name: String, email: Option[String])
  val users = List(User("ProArcade", Some("anorm@gmail.com")), User("Steve", None))
  val emailhead = users.map(user => user.email.flatMap(_.headOption))
  println(emailhead)

  sealed trait result
  case class Success(data: String) extends result
  case class Failure(error: String) extends result

  val myresult: result = Success("Data load completed")
  myresult match {
    case Success(data) => println(s"Data: $data")
    case Failure(error) => println(s"Error: $error")
  }

  val optionresult: Option[String] = Some("Arcade")
  optionresult match {
    case Some(v) => println(s"값이 있네요, $v")
    case None => println("값이 없네요.")
  }
