package ch.heigvd.res.chill.domain.GeraudSilvestri;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.HUART1848.Amogus;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaccabiTest {

  @Test
  void thePriceAndNameForMaccabiShouldBeCorrect() {
    Maccabi beer = new Maccabi();
    assertEquals(beer.getName(), Maccabi.NAME);
    assertEquals(beer.getPrice(), Maccabi.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMaccabi() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.GeraudSilvestri.Maccabi";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Maccabi.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}