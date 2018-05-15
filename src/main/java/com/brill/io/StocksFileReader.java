package com.brill.io;

import com.brill.model.StockPrice;
import com.brill.util.StringCleaner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StocksFileReader implements StockFileReader {

  private String path;
  BufferedReader bufferedReader;

  public StocksFileReader(){

  }

  public void readFile(String path) throws IOException{
    File file = new File(path);
    bufferedReader = new BufferedReader(new FileReader(file));
    readHeader();

  }

  public String readHeader() throws IOException{
    String line = bufferedReader.readLine();
    return line;
  }

  public List<StockPrice> getStockPrices()throws IOException{
    String line = "";
    String splitter = "\\s+";
    String removeDoubleQuotes = "\"";
    List<StockPrice> stockPricesList = new ArrayList<>();
    while((line=bufferedReader.readLine())!=null){
      String entry = line;
      String[] entries = entry.trim().split(splitter);
      Date d = new Date(entries[0]);
      Double price = new Double(entries[1]);
      String vol = StringCleaner.removeDoubleQuotes(entries[2]);
      vol = StringCleaner.removeCommas(vol);
      Long volume = new Long(Long.parseLong(vol));
      StockPrice stockPrice = new StockPrice(d,price,volume);
      stockPricesList.add(stockPrice);

    }
    return stockPricesList;
  }


}
