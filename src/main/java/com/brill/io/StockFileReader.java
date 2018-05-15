package com.brill.io;

import com.brill.model.StockPrice;

import java.io.IOException;
import java.util.List;

public interface StockFileReader {

  public void readFile(String path) throws IOException;
  public List<StockPrice> getStockPrices() throws IOException;
}
