package ch.heigvd.res.chill.domain.theomi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Tsingtao implements IProduct {

  public final static String NAME = "Tsingtao";
  public final static BigDecimal PRICE = new BigDecimal(3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
