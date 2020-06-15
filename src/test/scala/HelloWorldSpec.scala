import org.scalatest.flatspec.AnyFlatSpec

class HelloWorldSpec extends AnyFlatSpec {
  behavior of "Hello World"

  it should "start with 'Hello'" in {
    assert("Hello world".startsWith("Hello"))
  }

  it should "ends with 'World'" in {
    assert("Hello World".endsWith("World"))
  }
}