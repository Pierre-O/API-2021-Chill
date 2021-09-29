package ch.heigvd.res.chill.domain.Marinlestylo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PipouBeerTest {

  @Test
  void thePriceAndNameForPipouBeerShouldBeCorrect() {
    PipouBeer beer = new PipouBeer();
    assertEquals(beer.getName(), PipouBeer.NAME);
    assertEquals(beer.getPrice(), PipouBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPipouBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Marinlestylo.PipouBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PipouBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}