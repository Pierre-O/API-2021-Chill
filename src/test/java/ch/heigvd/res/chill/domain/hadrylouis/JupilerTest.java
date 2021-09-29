package ch.heigvd.res.chill.domain.hadrylouis;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JupilerTest {

  @Test
  void thePriceAndNameForJupilerShouldBeCorrect() {
    Jupiler beer = new Jupiler();
    assertEquals(beer.getName(), beer.NAME);
    assertEquals(beer.getPrice(), beer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForJupiler() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.hadrylouis.Jupiler";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Jupiler.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}