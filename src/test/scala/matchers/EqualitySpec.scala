package matchers

import com.h2.services.Currency

class EqualitySpec extends UnitSpec {

  behavior of "Currency equals"

  it should "match two 10 USD currencies as equal when using 'should equal' syntax" in {
    val currency1: Currency = "10 USD"
    val currency2: Currency = "10 USD"

    currency1 should equal(currency2)
  }

  it should "match two 10 USD currencies as equal when using '===' syntax" in {
    val currency1: Currency = "10 USD"
    val currency2: Currency = "10 USD"

    currency1 should ===(currency2)
  }

  it should "match two 10 USD currencies as equal when using 'shouldEqual' syntax" in {
    val currency1: Currency = "10 USD"
    val currency2: Currency = "10 USD"

    currency1 shouldEqual currency2
  }

  it should "match two 10 USD currencies as equal when using 'should be' syntax" in {
    val currency1: Currency = "10 USD"
    val currency2: Currency = "10 USD"

    currency1 should be(currency2)
  }

  it should "not match 10 USD and 100 USD currencies as equal when using 'should be' syntax" in {
    val currency1: Currency = "10 USD"
    val currency2: Currency = "100 USD"

    currency1 should not be currency2
  }

  it should "not match 10 USD and 100 USD currencies as equal when using 'should equal' syntax" in {
    val currency1: Currency = "10 USD"
    val currency2: Currency = "100 USD"

    currency1 should not equal currency2
  }

}
