package ch.heigvd.res.chill.domain.GeraudSilvestri;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Efes implements IProduct {

  public final static String NAME = "Efes";
  public final static BigDecimal PRICE = new BigDecimal(19.90);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
