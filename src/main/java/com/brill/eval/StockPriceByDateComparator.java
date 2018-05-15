package com.brill.eval;

import com.brill.model.StockPrice;

import java.util.Comparator;
import java.util.Date;

public class StockPriceByDateComparator implements Comparator<StockPrice>{

  @Override
  public int compare(StockPrice o1, StockPrice o2) {
    if(o1.getDate().before(o2.getDate())){
      return -1;
    }
    return 0;
  }
}
