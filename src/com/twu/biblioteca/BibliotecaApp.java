//package com.twu.biblioteca;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BibliotecaApp
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Bangalore Public Library!");
    mainMenu();

  }
  public static void chooseTheOption()
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try
    {
      String option = br.readLine();
      switch(option)
      {
        case "L":
        bookDatebase();
        break;
        case "Q":
        mainMenu();
        default:
        System.out.println("Select a valid option");
      }
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
  public static void mainMenu()
  {
    System.out.print("[L]listBooks    ");
    System.out.print("[Q]quit    ");
    System.out.println("");
    chooseTheOption();

  }
  public static void bookDatebase()
  {
    listBooks("老人与海","海明威",1951);
    listBooks("简爱","夏洛蒂～勃朗特",1847);
    listBooks("战争与和平","列夫～托尔斯泰",1965);
    mainMenu();
  }
  public static void listBooks(String name,String author,int year)
  {
    System.out.println("Name:" + name + "     Author:" + author + "     Year:"+year);
  }
}
