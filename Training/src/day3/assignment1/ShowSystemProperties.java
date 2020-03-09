package day3.assignment1;

public class ShowSystemProperties
{
    public static void main(String[] args)
    {
        SystemProperties systemProperties=new SystemProperties();
        if(args.length==1) systemProperties.display(args);
        else System.out.println("No command provided");

    }
}
