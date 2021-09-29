package ch.heigvd.res.chill.domain.BernardLhermite;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Gralsburg implements IProduct {

  public final static String NAME = "Gralsburg";
  public final static BigDecimal PRICE = new BigDecimal(0.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
