package ch.heigvd.res.chill.domain.BernardLhermite;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HuithuitTest {

  @Test
  void thePriceAndNameForHuithuitShouldBeCorrect() {
    Huithuit beer = new Huithuit();
    assertEquals(beer.getName(), Huithuit.NAME);
    assertEquals(beer.getPrice(), Huithuit.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForHuithuit() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.BernardLhermite.Huithuit";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Huithuit.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}