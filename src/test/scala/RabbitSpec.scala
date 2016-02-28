import org.specs2.mutable.Specification

class RabbitSpec extends Specification {

  "うさぎ" should {

    "日本名のうさぎ" should {
      "ジャンプできる" in {
        val rabbit = new Rabbit("月野うさぎ")
        rabbit.jump must_== "月野うさぎ jumped!"
      }

      "話すことができない" in {
        val rabbit = new Rabbit("月野うさぎ")
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
