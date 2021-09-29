package ch.heigvd.res.chill.domain.damianomondaini;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThomasMuellerTest {

    @Test
    void thePriceAndNameForThomasMuellerShouldBeCorrect() {
        ThomasMueller beer = new ThomasMueller();
        assertEquals(beer.getName(), beer.NAME);
        assertEquals(beer.getPrice(), beer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForThomasMueller() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.damianomondaini.ThomasMueller";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = ThomasMueller.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}