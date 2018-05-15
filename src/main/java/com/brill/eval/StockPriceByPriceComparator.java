package com.brill.eval;

import com.brill.model.StockPrice;

import java.util.Comparator;

public class StockPriceByPriceComparator implements Comparator<StockPrice>{

  @Override
  public int compare(StockPrice o1, StockPrice o2) {
    double price1 = o1.getPrice();
    double price2 = o2.getPrice();
    int retVal = Double.compare(price1,price2);

    return retVal;
  }
}
