package ch.heigvd.res.chill.domain.damianomondaini;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class ThomasMueller implements IProduct {

  public final static String NAME = "Thomas Mueller";
  public final static BigDecimal PRICE = new BigDecimal(25.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
