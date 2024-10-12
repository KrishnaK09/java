package oct12;

import java.util.Collections;

public class Stringdemo {
    public static void main(String[] args) {

        String CompanyName="pragra";

        StringBuilder sb=new StringBuilder(CompanyName);
        String reversstring=sb.reverse().toString();
        System.out.println(reversstring);

    }
}
