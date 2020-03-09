package day1.assignment3;

public class UserNamePassword {



    public void validate(int userCode,int password)
    {
      if(userCode==1)
          System.out.println("UserCode is:"+userCode);
      else
          System.out.println("Invalid userCode");

      if(password==123)
          System.out.println("Password Valid:"+password);
      else
          System.out.println("Invalid password");
    }
}


