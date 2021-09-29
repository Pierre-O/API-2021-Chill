package ch.heigvd.res.chill.domain.Marinlestylo;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PipouBeer implements IProduct {

  public final static String NAME = "PipouBeer";
  public final static BigDecimal PRICE = new BigDecimal(1.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
