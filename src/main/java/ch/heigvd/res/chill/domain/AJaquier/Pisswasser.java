package ch.heigvd.res.chill.domain.AJaquier;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pisswasser implements IProduct  {

    public final static String NAME = "Pisswasser";
    public final static BigDecimal PRICE = new BigDecimal(1);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
