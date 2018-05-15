package com.brill.driver;

import com.brill.eval.StockPriceByDateComparator;
import com.brill.eval.StockPriceByPriceComparator;
import com.brill.eval.StockPriceByVolComparator;
import com.brill.io.StockFileReader;
import com.brill.io.StocksFileReader;
import com.brill.model.StockPrice;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

  public static void main(String args[]) {

    String path = "src/main/resources/charts.csv";
    List<StockPrice> listOfStockPrices = null;
    List<StockPrice> listOfStockPricesComparedByDate = null;
    List<StockPrice> listOfStockPriceComparedByPrice = null;
    List<StockPrice> listOfStockPriceComparedByVol = null;

    try {
      StockFileReader fileReader = new StocksFileReader();
      fileReader.readFile(path);
      listOfStockPrices = fileReader.getStockPrices();
      listOfStockPricesComparedByDate = new ArrayList<>(listOfStockPrices);
      listOfStockPriceComparedByPrice = new ArrayList<>(listOfStockPrices);
      listOfStockPriceComparedByVol = new ArrayList<>(listOfStockPrices);
      Collections.sort(listOfStockPricesComparedByDate, new StockPriceByDateComparator());
      Collections.sort(listOfStockPriceComparedByPrice,new StockPriceByPriceComparator());
      Collections.sort(listOfStockPriceComparedByVol,new StockPriceByVolComparator());
    } catch (IOException io) {
      io.printStackTrace();
    }
    for(StockPrice stockPrice:listOfStockPricesComparedByDate){
      System.out.println(stockPrice);
    }

    System.out.println("---------------------------");

    for(StockPrice stockPrice:listOfStockPriceComparedByPrice){
      System.out.println(stockPrice);
    }

    System.out.println("-----------------------------");

    for(StockPrice stockPrice:listOfStockPriceComparedByVol){
      System.out.println(stockPrice);
    }
  }
}
