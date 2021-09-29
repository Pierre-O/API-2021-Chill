package ch.heigvd.res.chill.domain.NicolasWichoud;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalandaTest {

  @Test
  void thePriceAndNameForCalandaShouldBeCorrect() {
    Calanda beer = new Calanda();
    assertEquals(beer.getName(), Calanda.NAME);
    assertEquals(beer.getPrice(), Calanda.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCalanda() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NicolasWichoud.Calanda";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Calanda.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}