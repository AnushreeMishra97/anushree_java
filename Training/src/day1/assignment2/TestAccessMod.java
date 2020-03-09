package day1.assignment2;

public class TestAccessMod {
    public static void main(String args[])
    {
        AccessMod accessMod=new AccessMod();
        accessMod.printProperties();
        System.out.println("Accessing public integer type data member:"+accessMod.age);
        System.out.println("Accessing public long type data member:"+accessMod.count);
        System.out.println("Accessing protected float type data member:"+accessMod.value);
        System.out.println("Accessing protected double type data member:"+accessMod.digit);
        System.out.println("Accessing default character type data member:"+accessMod.ch);
        System.out.println("Accessing default boolean type data member:"+accessMod.b);
        //System.out.println("Accessing private String type data member:"+accessMod.s);
    }
}
