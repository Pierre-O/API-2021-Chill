package ch.heigvd.res.chill.domain.NelsonJnrnd;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.NelsonJnrnd.GingerBeer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GingerBeerTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    GingerBeer beer = new GingerBeer();
    assertEquals(beer.getName(), GingerBeer.NAME);
    assertEquals(beer.getPrice(), GingerBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NelsonJnrnd.GingerBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = GingerBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}