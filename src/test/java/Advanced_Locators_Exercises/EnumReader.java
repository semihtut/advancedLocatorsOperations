package Advanced_Locators_Exercises;

import java.util.EnumMap;

public class EnumReader {

    public enum RISKS{
        CRITICAL,
        HIGH,
        MEDIUM,
        LOW;
    }

    public static void mapRisks(){
        EnumMap<RISKS,String>risksMap = new EnumMap<RISKS, String>(RISKS.class);
    }

    public static void main(String[] args) {
        System.out.println("RISKS.CRITICAL = " + RISKS.CRITICAL);
    }
}
