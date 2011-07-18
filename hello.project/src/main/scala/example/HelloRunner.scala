package example

import xsbti._

class HelloRunner extends xsbti.AppMain {

  def run (launchConfig: xsbti.AppConfiguration) = {
    class Exit (val code: Int) extends xsbti.Exit
   
    HelloWorld.main (launchConfig.arguments)

    new Exit (0)
  }

}
