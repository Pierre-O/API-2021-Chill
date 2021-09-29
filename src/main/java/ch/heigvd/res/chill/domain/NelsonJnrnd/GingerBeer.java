package ch.heigvd.res.chill.domain.NelsonJnrnd;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GingerBeer implements IProduct {

  public final static String NAME = "Ginger Beer";
  public final static BigDecimal PRICE = new BigDecimal(4);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
