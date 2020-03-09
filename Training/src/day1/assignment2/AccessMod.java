package day1.assignment2;

public class AccessMod {
    public int age=10;
    public long count=372;
    protected float value=2.1f;
    protected double digit=2.34;
    private String greet="Hello";
    char ch='a';
    boolean b=true;
    public void printProperties() {
        System.out.println("Int dataype:"+age);
        System.out.println("long datatype:"+count);
        System.out.println("float datatype:"+value);
        System.out.println("double datatype:"+digit);
        System.out.println("String datatype:"+greet);
        System.out.println("character datatype:"+ch);
        System.out.println("boolean datatype:"+b);
    }
    }
