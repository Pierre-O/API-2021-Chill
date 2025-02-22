package ch.heigvd.res.chill.domain.theomi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TsingtaoTest {

  @Test
  void thePriceAndNameForTsingtaoShouldBeCorrect() {
    Tsingtao tsingtao = new Tsingtao();
    assertEquals(tsingtao.getName(), Tsingtao.NAME);
    assertEquals(tsingtao.getPrice(), Tsingtao.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTsingtao() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.theomi.Tsingtao";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Tsingtao.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}