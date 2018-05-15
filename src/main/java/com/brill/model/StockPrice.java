package com.brill.model;

import java.util.Date;
import java.util.Objects;

public class StockPrice {
  private Date date;
  private Double price;
  private Long volume;

  public StockPrice(Date d,Double price,Long volume){
    this.date = d;
    this.price = price;
    this.volume = volume;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Long getVolume() {
    return volume;
  }

  public void setVolume(Long volume) {
    this.volume = volume;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StockPrice that = (StockPrice) o;
    return Objects.equals(date, that.date) &&
      Objects.equals(price, that.price) &&
      Objects.equals(volume, that.volume);
  }

  @Override
  public int hashCode() {

    return Objects.hash(date, price, volume);
  }

  @Override
  public String toString() {
    return "StockPrice{" +
      "date=" + date +
      ", price=" + price +
      ", volume=" + volume +
      '}';
  }
}
