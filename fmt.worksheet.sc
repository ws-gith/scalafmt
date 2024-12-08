case class User(name:  String,
                email: String,
                age:   Int):

  def print: Unit =
    println(s"User ${name} ${email} ${age}")

def DEBUG: Boolean =
  true

def greet(name:    String,
          age:     String,
          email:   String,
          address: Option[String]
        ): Unit =
  println(s"${name} - ${age} - ${email}")

val users = List(
  User(name = "West", email = "west@west.com", age = 30),
  User(name = "East", email = "east@east.com", age = 24),
  User(name = "South", email = "south@south.com", age = 32)
)

for {
  user  <- users
  count <- 1 to 3
  age = user.age
  if age > 30
} {
  println(s"This is a valid user")
  user.print
}

for {
  value <- 1 to 3
}
  println(s"$value")

val stringInterPolation = s"""
| Examples:
|
|  * one    
|  * two
|  * three
|  * ${DEBUG}
""".stripMargin

println(s"${stringInterPolation}")

trait Foo:
  def foo: Boolean = true

trait Bee
trait Mango

case class Bar[T](
                name:         String,
                email:        String,
                age:          Int,
                emailManager: Option[T])
                extends Foo
                                with Bee
                                with Mango:
  /**
   * These function are used as test sample
   */
  def ripe: Unit                  = ???
  def make: Unit                  = ???
  override def toString(): String = ???

object Bar:
  ???
