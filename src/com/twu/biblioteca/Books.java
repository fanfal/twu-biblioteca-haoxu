/**
 * Created by xuhao on 6/3/15.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Books {
    int totalBookNumber = 3;
    String[] name = new String[3];
    String[] author = new String[3];
    int[] year  = new int[3];
    boolean[] check = new boolean[3];

    public Books()
    {
        this.name[0] = "老人与海";
        this.name[1] = "简爱";
        this.name[2] = "战争与和平";
        this.author[0] = "海明威";
        this.author[1] = "夏洛蒂～勃朗特";
        this.author[2] = "列夫～托尔斯泰";
        this.year[0] = 1951;
        this.year[1] = 1847;
        this.year[2] = 1965;
        this.check[0] = false;
        this.check[1] = false;
        this.check[2] = false;
    }
    public void listBooks()
    {
        for(int i=0;i<3;i++)
        {
            if(check[i] == false)
            {
                System.out.println("BookNumber:" + i + "    Name:" + this.name[i] + "     Author:"
                        + this.author[i] + "     Year:" + this.year[i]);
            }

        }
    }
    public void checkOutBooks(BufferedReader br)
    {
        System.out.println("please input the number of the book that you want to checkout!");
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
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void returnBackBooks(BufferedReader br)
    {
        System.out.println("please input the number of the book that you want to return!");
        try
        {
            String option = br.readLine();
            if(option != "Q")
            {
                if(!(option != null && Integer.parseInt(option) < totalBookNumber))
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

    }
}
