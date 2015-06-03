/**
 * Created by xuhao on 6/3/15.
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Login {
    private String userName = new String();
    private String passWord = new String();
    private String emailAddress = new String();
    private String phoneNumber = new String();
    private boolean login;
    public Login()
    {
        this.userName = "xxx-xxxx";
        this.passWord = "123";
        this.login = false;
        this.phoneNumber = "123456";
        this.emailAddress = "271299626@qq.com";

    }
    public void userLogin()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temptUserName = "";
        String temptPassWord = "";

        try{
            System.out.println("please input your userName and end with enter button!");
            temptUserName = br.readLine();
            System.out.println("please input your passWord and end with enter button!");
            temptPassWord = br.readLine();

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        if (this.userName.equals(temptUserName) == true  && this.passWord.equals(temptPassWord) == true)
        {
            this.login  = true;
            System.out.println("login success");
        }
        else
        {
            System.out.println("error userName or passWord, please check and try again");
        }

    }
    public void showPersonalImformation()
    {
        if(this.login == false)
        {
            System.out.println("please login first");
            return;
        }
        else
        {
            System.out.println("Here is your personal information!");
            System.out.println("userName:" + this.userName + "    emailAddress:" + this.emailAddress + "phoneNumber" + this.phoneNumber);
        }
    }
}
