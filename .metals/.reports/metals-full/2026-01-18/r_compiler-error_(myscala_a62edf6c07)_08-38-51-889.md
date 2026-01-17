file://<WORKSPACE>/main.scala
### java.lang.AssertionError: assertion failed: position not set for nn(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in <WORKSPACE>/main.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 2807
uri: file://<WORKSPACE>/main.scala
text:
```scala
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

  case class Book(id: Int, name: String, author: String, available: Boolean)
  val booklist = List(
    Book(1, "Nvim", "Github", true),
    Book(2, "Gemini", "Google", true),
    Book(3, "Muscle Kim", "Wall Su", false)
    )
  val bookmap = booklist.map(b => b.id -> b).toMap
  def bookfind(id: Int): String = 
    val maybebook = bookmap.get(id)
    maybebook match {
      case Some(book) if Book.available =>
        s"${Book.name}: Available"
      case Some(book) =>
        s"${Book.name}: Not available"
      case None =>
        "Can't find book"
    }

  val availableAuthors = booklist
    .filter(_.@@)
  }
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.typer.Typer$.assertPositioned(Typer.scala:72)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3297)
	dotty.tools.dotc.typer.Applications.extMethodApply(Applications.scala:2483)
	dotty.tools.dotc.typer.Applications.extMethodApply$(Applications.scala:400)
	dotty.tools.dotc.typer.Typer.extMethodApply(Typer.scala:119)
	dotty.tools.dotc.typer.Applications.tryApplyingExtensionMethod(Applications.scala:2528)
	dotty.tools.dotc.typer.Applications.tryApplyingExtensionMethod$(Applications.scala:400)
	dotty.tools.dotc.typer.Typer.tryApplyingExtensionMethod(Typer.scala:119)
	dotty.tools.dotc.interactive.Completion$Completer.tryApplyingReceiverToExtension$1(Completion.scala:526)
	dotty.tools.dotc.interactive.Completion$Completer.$anonfun$23(Completion.scala:569)
	scala.collection.immutable.List.flatMap(List.scala:294)
	scala.collection.immutable.List.flatMap(List.scala:79)
	dotty.tools.dotc.interactive.Completion$Completer.extensionCompletions(Completion.scala:566)
	dotty.tools.dotc.interactive.Completion$Completer.selectionCompletions(Completion.scala:446)
	dotty.tools.dotc.interactive.Completion$.computeCompletions(Completion.scala:218)
	dotty.tools.dotc.interactive.Completion$.rawCompletions(Completion.scala:78)
	dotty.tools.pc.completions.Completions.enrichedCompilerCompletions(Completions.scala:114)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:136)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: position not set for nn(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in <WORKSPACE>/main.scala