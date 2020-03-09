package day1.assignment3;

public class TestCommandLine {
    public static void main(String args[])
    {
        UserNamePassword userNamePassword=new UserNamePassword();
        //Giving correct values
        userNamePassword.validate(1,123);
        //Giving incorrect values
        userNamePassword.validate(1,45);
    }
}
