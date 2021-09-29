package ch.heigvd.res.chill.domain.Marinlestylo;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Maximator implements IProduct {

  public final static String NAME = "Maximator";
  public final static BigDecimal PRICE = new BigDecimal(14.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
