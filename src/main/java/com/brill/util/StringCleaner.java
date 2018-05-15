package com.brill.util;

public class StringCleaner {

  private static final String removeDoubleQuotesExpression = "\"";

  public static String removeDoubleQuotes(String arg){
    return arg.replace(removeDoubleQuotesExpression,"");
  }

  public static String removeCommas(String arg){
    return arg.replace(",","");
  }
}
