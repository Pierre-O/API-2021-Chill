package ch.heigvd.res.chill.domain.BasileCuneo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StFeuillienTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        StFeuillien beer = new StFeuillien();
        assertEquals(beer.getName(), StFeuillien.NAME);
        assertEquals(beer.getPrice(), StFeuillien.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.BasileCuneo.StFeuillien";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = StFeuillien.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}