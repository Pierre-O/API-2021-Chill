package ch.heigvd.res.chill.domain.VincentPeer;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VinyldecoTest {

  @Test
  void thePriceAndNameFoVinyldecoShouldBeCorrect() {
    Vinyldeco beer = new Vinyldeco();
    assertEquals(beer.getName(), Vinyldeco.NAME);
    assertEquals(beer.getPrice(), Vinyldeco.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForVinyldeco() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.VincentPeer.Vinyldeco";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Vinyldeco.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}