package ch.heigvd.res.chill.domain.PierreO;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class DeliriumTremens implements IProduct {

    public final static String NAME = "Delirium Tremens";
    public final static BigDecimal PRICE = new BigDecimal(6.80);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}