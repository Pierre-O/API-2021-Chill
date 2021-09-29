package ch.heigvd.res.chill.domain.Loris199;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Water implements IProduct {

  public final static String NAME = "Water";
  public final static BigDecimal PRICE = new BigDecimal(0.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
