//package com.twu.biblioteca;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BibliotecaApp
{
  static int totalBookNumber = 3;
  static String[] name = new String[3];
  static String[] author = new String[3];
  static int[] year  = new int[3];
  static boolean[] check = new boolean[3];

  public static void main(String[] args)
  {
    System.out.println("Welcome to the Bangalore Public Library!");
    dateBaseInit();
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
        printDatebase();
        break;
        case "C":
        checkOutBooks(br);
        break;
        case "R":
        returnBackBooks(br);
        break;
        case "Q":
        break;
        default:
        System.out.println("Select a valid option");
        chooseTheOption();
      }
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
  public static void returnBackBooks(BufferedReader br)
  {
    System.out.println("please input the number of the book taht you want to return!");
    try
    {
      String option = br.readLine();
      if(option != "Q")
      {
        if(!(option != null && Integer.parseInt(option) <= totalBookNumber))
        {
          System.out.println("please input the right number");

        }
        else
        {
          if(check[Integer.parseInt(option)] == false)
          {
            System.out.println("This is not a valid book to return");

          }
          else
          {
            check[Integer.parseInt(option)] = false;
            System.out.println("Thank you for returning the book");
          }
        }
      }
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    mainMenu();
  }
  public static void checkOutBooks(BufferedReader br)
  {
    System.out.println("please input the number of the book taht you want to checkout!");
    try
    {
      String option = br.readLine();
      if(option != "Q")
      {
        if(!(option != null && Integer.parseInt(option) <= totalBookNumber))
        {
          System.out.println("please input the right number");

        }
        else
        {
          if(check[Integer.parseInt(option)] == true)
          {
            System.out.println("That book is not available");

          }
          else
          {
            check[Integer.parseInt(option)] = true;
            System.out.println("Thank you! Enjoy the book");
          }
        }
      }
    }catch(IOException e)
    {
      e.printStackTrace();
    }
    mainMenu();
  }
  public static void mainMenu()
  {
    System.out.print("[L]listBooks    ");
    System.out.print("[Q]quit    ");
    System.out.print("[C]checkOutBooks    ");
    System.out.print("[R]returnBackBooks    ");
    System.out.println("");
    chooseTheOption();

  }
  public static void dateBaseInit()
  {
    name[0] = "老人与海";
    name[1] = "简爱";
    name[2] = "战争与和平";
    author[0] = "海明威";
    author[1] = "夏洛蒂～勃朗特";
    author[2] = "列夫～托尔斯泰";
    year[0] = 1951;
    year[1] = 1847;
    year[2] = 1965;
    check[0] = false;
    check[1] = false;
    check[2] = false;
  }
  public static void printDatebase()
  {
    for(int i=0;i<3;i++)
    {
      if(check[i] == false)
      {
        listBooks(i,name[i],author[i],1951);
      }

    }
    mainMenu();
  }
  public static void listBooks(int bookNumber,String name,String author,int year)
  {
    System.out.println("BookNumber:" + bookNumber+"    Name:" + name + "     Author:"
     + author + "     Year:"+year);
  }
}
