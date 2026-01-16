file://<WORKSPACE>/main.scala
### java.lang.AssertionError: assertion failed: position not set for nn(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in <WORKSPACE>/main.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 691
uri: file://<WORKSPACE>/main.scala
text:
```scala
@main def hello()=
  println("Hello, Scala and NeoVim!") 

  val square = (x:Int) => x * x
  val result = List(1, 2, 3).map(square)
  println(result)
  println(square(19))

  val bigorsmall = if (10 > 6) "Big" else "Small"

  println(bigorsmall)

  def add(a: Int, b: Int) = a + b
  val r = add(1,5)
  val x: Int = 8 
  println(r)

  val numbers = List(1,2,3,4,5)
  val added = (n:Int) => n + 10
  val evens = numbers.filter(n => n % 2 == 0)
  println(numbers)
  println(added)
  println(evens)

  case class Person(name: String, job: String, age: Int)
  val user1 = Person("Pro", "Programmer", 16)
  val user2 = Person("Alex", "Hacker", 16)

  val maybePro: Option[Person] = people.find(_.n@@)

  val people = List(user1, user2)
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