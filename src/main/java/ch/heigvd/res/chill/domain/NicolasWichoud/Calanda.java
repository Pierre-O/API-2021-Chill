package ch.heigvd.res.chill.domain.NicolasWichoud;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Calanda implements IProduct {

  public final static String NAME = "Calanda";
  public final static BigDecimal PRICE = new BigDecimal(4.3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
