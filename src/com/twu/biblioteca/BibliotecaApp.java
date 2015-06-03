//package com.twu.biblioteca;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BibliotecaApp
{
  static Movies movie = new Movies();
  static Books  book = new Books();
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
        case "BL":
          book.listBooks();
          chooseTheOption();
          break;
        case "BC":
          book.checkOutBooks(br);
          chooseTheOption();
          break;
        case "BR":
          book.returnBackBooks(br);
          chooseTheOption();
          break;
        case "ML":
          movie.printMovieList();
          mainMenu();
          break;
        case "MC":
          movie.movieCheckOut(br);
          mainMenu();
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


  public static void mainMenu()
  {
    System.out.print("[BL]listBooks    ");
    System.out.print("[BC]checkOutBooks    ");
    System.out.print("[BR]returnBackBooks    ");
    System.out.print("[ML]listMovies    ");
    System.out.print("[MC]checkOutMovies    ");
    System.out.print("[Q]quit    ");
    System.out.println("");
    chooseTheOption();

  }

  /*public static void printDatebase()
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
  }*/
}
