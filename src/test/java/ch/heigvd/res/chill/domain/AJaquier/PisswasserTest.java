package ch.heigvd.res.chill.domain.AJaquier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PisswasserTest {
    @Test
    void thePriceAndNameForPisswasserShouldBeCorrect() {
        Pisswasser beer = new Pisswasser();
        assertEquals(beer.getName(), Pisswasser.NAME);
        assertEquals(beer.getPrice(), Pisswasser.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPrixPisswasser() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.AJaquier.Pisswasser";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Pisswasser.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
