package day3.assignment1;

import java.util.Arrays;

public class SystemProperties {
    public void display(String args[]) {
        String command = Arrays.toString(args);
        if (command.equals("uname")) printUserName();
        if (command.equals("osname")) printOSName();
        if (command.equals("udir")) printUserDirectory();
        if (command.equals("all")) printDetails();
    }

    public void printUserName() {
        System.out.println("User name is" + System.getProperty("user.name"));
    }

    public void printOSName() {
        System.out.println("OS Name is " + System.getProperty("os.name"));
    }

    public void printUserDirectory() {
        System.out.println("User directory is" + System.getProperty("user.dir"));
    }

    public void printDetails() {
        System.out.println("User name is" + System.getProperty("user.name"));
        System.out.println("OS name is" + System.getProperty("os.name"));
        System.out.println("User directory is" + System.getProperty("user.dir"));
    }
}
