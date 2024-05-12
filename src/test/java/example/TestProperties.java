package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties ObjRepo = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\ObjRepo.properties");
        ObjRepo.load(fis);
        Properties config = new Properties();
        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
        config.load(fis);

        System.out.println(ObjRepo.getProperty("bankMgrL"));
        System.out.println(config.getProperty("browser"));
    }
}