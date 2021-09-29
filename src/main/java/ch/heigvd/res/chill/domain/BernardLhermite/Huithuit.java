package ch.heigvd.res.chill.domain.BernardLhermite;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Huithuit implements IProduct {

  public final static String NAME = "Huithuit";
  public final static BigDecimal PRICE = new BigDecimal(8.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
