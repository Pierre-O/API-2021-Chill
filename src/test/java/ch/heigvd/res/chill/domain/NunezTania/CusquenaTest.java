package ch.heigvd.res.chill.domain.NunezTania;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CusquenaTest {

  @Test
  void thePriceAndNameForCusquenaShouldBeCorrect() {
    Cusquena beer = new Cusquena();
    assertEquals(beer.getName(), Cusquena.NAME);
    assertEquals(beer.getPrice(), Cusquena.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCusquena() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NunezTania.Cusquena";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Cusquena.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}