package ch.heigvd.res.chill.domain.IvanR_Vecerina;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrGabsIPATest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    DrGabsIPA beer = new DrGabsIPA();
    assertEquals(beer.getName(), DrGabsIPA.NAME);
    assertEquals(beer.getPrice(), DrGabsIPA.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender james = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.IvanR_Vecerina.DrGabsIPA";
    OrderRequest request = new OrderRequest(7, productName);
    OrderResponse response = james.order(request);
    BigDecimal expectedTotalPrice = DrGabsIPA.PRICE.multiply(new BigDecimal(7));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}