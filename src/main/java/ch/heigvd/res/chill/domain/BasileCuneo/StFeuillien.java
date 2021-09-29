package ch.heigvd.res.chill.domain.BasileCuneo;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class StFeuillien implements IProduct {

    public final static String NAME = "StFeuillien";
    public final static BigDecimal PRICE = new BigDecimal(2.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
