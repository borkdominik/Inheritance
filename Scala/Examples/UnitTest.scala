trait Purr {
  def purr(name: String): String = s"$name is purring!"
}

class PurrTraitTest {

  // anonymous implementation (no concrete class needed)
  val purrTrait = new Purr {}

  def test(): Unit = {
    assert(purrTrait.purr("Mimi") == "Mimi is purring!")
  }
}

@main def runTests(): Unit = {
  PurrTraitTest().test()
}

