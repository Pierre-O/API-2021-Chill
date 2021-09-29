package ch.heigvd.res.chill.domain.BernardLhermite;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GralsburgTest {

  @Test
  void thePriceAndNameForGralsburgShouldBeCorrect() {
    Gralsburg beer = new Gralsburg();
    assertEquals(beer.getName(), Gralsburg.NAME);
    assertEquals(beer.getPrice(), Gralsburg.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGralsburg() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.BernardLhermite.Gralsburg";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Gralsburg.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}