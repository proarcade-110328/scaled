@main def hello()=
  println("Hello, Scala and NeoVim!") 

  val square = (x:Int) => x * x
  val result = List(1, 2, 3).map(square)
  println(result)
  println(square(4))

  val bigorsmall = if (10 > 6) "Big" else "Small"

  println(bigorsmall)

  def add(a: Int, b: Int) = a + b
  val r = add(1,5)
  val x: Int = 8 
  println(r)

  val numbers = List(1,2,3,4,5)
  val added = numbers.map(n => n + 10)
  val evens = numbers.filter(n => n % 2 == 0)
  println(numbers)
  println(added)
  println(evens)

  case class Person(name: String, job: String, age: Int)
  val user1 = Person("Pro", "Programmer", 16)
  val user2 = Person("Alex", "Hacker", 16)

  def greet(person: Person): String = person match {
    case Person(name, "Programmer", age) => s"Welcome, Mr.$name!"
    case Person(name, "Hacker", age) => "Hacking for Security!"
    case Person(name, job, age) => s"Nice to meet you, $name!"
  }

  println(greet(user1))
  println(greet(user2))
