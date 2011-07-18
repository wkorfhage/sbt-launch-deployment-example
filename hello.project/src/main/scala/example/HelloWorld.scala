package example


class HelloWorld 
{
  def printGreeting() { println("Hello, World!") }
}

object HelloWorld extends HelloWorld 
{

  def main(args: Array[String]) = {
    printGreeting()
  }

}
