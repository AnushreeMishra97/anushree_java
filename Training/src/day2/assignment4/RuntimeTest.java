package day2.assignment4;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RuntimeTest {
    public static void main(String[] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("notepad");
        process.waitFor(30, TimeUnit.SECONDS);
        process.destroy();

        //environment variable using ProcessBuilder
        ProcessBuilder processBuilder = new ProcessBuilder();
        Map<String, String> environmentMap = processBuilder.environment();
        for (Map.Entry<String, String> entry : environmentMap.entrySet()) {
            System.out.println("Key is:" + entry.getKey()+ "  " + "Value is:" + entry.getValue());
        }
    }
}
