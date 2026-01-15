@main def hello()=
  println("Hello, Scala and NeoVim!") 

  val square = (x:Int) => x * x
  val result = List(1, 2, 3).map(square)
  println(result)

  val bigorsmall = if (10 > 6) "Big" else "Small"

  println(bigorsmall)

  def add(a: Int, b: Int) = a + b
  val r = add(1,2)
  val x: Int = 4 
  println(r)

  val numbers = List(1,2,3,4,5)
  val added = numbers.map(n => n + 10)
  val evens = numbers.filter(n => n % 2 == 0)
  println(numbers)
  println(added)
  println(evens)
