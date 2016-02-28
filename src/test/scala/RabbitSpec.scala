import org.specs2.mutable.Specification
import org.specs2.specification.Scope

class RabbitSpec extends Specification {

  "うさぎ" should {

    "日本名のうさぎ" should {

      trait RabbitBefore {
        val name = "月野うさぎ"
        val rabbit = new Rabbit(name)
      }

      "ジャンプできる" in new Scope with RabbitBefore {
        rabbit.jump must_== "月野うさぎ jumped!"
      }

      "話すことができない" in new Scope with RabbitBefore {
        rabbit.talk must throwAn[UnsupportedOperationException]
      }
    }

    "英名のうさぎ" should {
      "ジャンプできる" in {
        val rabbit = new Rabbit("Peter Rabbit")
        rabbit.jump must_== "Peter Rabbit jumped!"
      }
   }
 }
}
