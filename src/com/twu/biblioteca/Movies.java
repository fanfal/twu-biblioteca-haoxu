/**
 * Created by xuhao on 6/2/15.
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Movies {
    private String[] movieName = new String[3];
    private int[] movieYear = new int[3];
    private String[] movieDirector = new String[3];
    private double[] movieRate = new double[3];
    private boolean[] movieCheck = new boolean[3];
    private int totalMovieNumber = 3;
    public  Movies()
    {
        this.movieName[0] = "TITANIC";
        this.movieYear[0] = 1997;
        this.movieDirector[0] = "James Cameron";
        this.movieRate[0] = 10.0;
        this.movieCheck[0] = false;

        this.movieName[1] = "The Shawsh ank Redemption";
        this.movieYear[1] = 1994;
        this.movieDirector[1] = "Frank Darabont";
        this.movieRate[1] = 9.5;
        this.movieCheck[1] = false;

        this.movieName[2] = "True Lies";
        this.movieYear[2] = 1993;
        this.movieDirector[2] = "James Cameron";
        this.movieRate[2] = 9.7;
        this.movieCheck[2] = false;
    }
    public void printMovieList()
    {
        for(int i=0;i<totalMovieNumber;i++)
        {
            if(this.movieCheck[i] ==  false)
            {
                System.out.println("Movie Number:" +i +"    Movie Name:" + this.movieName[i] + "    Movie Year:"+this.movieYear[i] +
                        "    Movie Director:"+this.movieDirector[i]);
            }

        }
    }
    public void movieCheckOut(BufferedReader br)
    {
        System.out.println("please input the number of the movie that you want to checkout!");
        try
        {
            String option = br.readLine();
            if(option != "Q")
            {
                if(!(option != null && Integer.parseInt(option) < totalMovieNumber))
                {
                    System.out.println("please input the right number");

                }
                else
                {
                    if(movieCheck[Integer.parseInt(option)] == true)
                    {
                        System.out.println("That movie is not available");

                    }
                    else
                    {
                        movieCheck[Integer.parseInt(option)] = true;
                        System.out.println("Thank you! Enjoy the movie");
                    }
                }
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

 }
