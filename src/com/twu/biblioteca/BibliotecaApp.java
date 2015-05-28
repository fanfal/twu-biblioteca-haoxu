//package com.twu.biblioteca;

public class BibliotecaApp
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Bangalore Public Library!");
    bookDatebase();

  }
  public static void bookDatebase()
  {
    listBooks("老人与海","海明威",1951);
    listBooks("简爱","夏洛蒂～勃朗特",1847);
    listBooks("战争与和平","列夫～托尔斯泰",1965);
  }
  public static void listBooks(String name,String author,int year)
  {
    System.out.println("Name:" + name + "     Author:" + author + "     Year:"+year);
  }
}
