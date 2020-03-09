package day2.assignment3;

public class StringManipulation
{
    public static void main(String[] args)
    {
      StringOperation stringOperation=new StringOperation();
      if(args.length==0) System.out.println("Not entered input");
      else stringOperation.doOperationWithRegEX(args);

    }
}
