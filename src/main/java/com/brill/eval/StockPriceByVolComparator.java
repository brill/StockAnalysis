package com.brill.eval;

import com.brill.model.StockPrice;

import java.util.Comparator;

public class StockPriceByVolComparator implements Comparator<StockPrice> {
  @Override
  public int compare(StockPrice o1, StockPrice o2) {
    Long vol1 = o1.getVolume();
    Long vol2 = o2.getVolume();
    int retVal = Long.compare(vol1,vol2);
    return retVal;
  }

}
