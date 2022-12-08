import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception{
        InputStream ins = new FileInputStream("src/resources/city_ru.csv");
        Scanner obj = new Scanner(ins);
        while (obj.hasNextLine()) {

            String[] subStr;
            subStr = obj.nextLine().split(";");
            City x;
            if(subStr.length==6) {
                x = new City(subStr[1],subStr[2],subStr[3],Integer.valueOf(subStr[4]), subStr[5]);
            } else {
                x = new City(subStr[1],subStr[2],subStr[3],Integer.valueOf(subStr[4]));
            }
            System.out.println("City{name='"+ x.getName() + "', region='"+x.getRegion()+"', district='" +x.getDistrict()+"', population="+ x.getPopulation()+"', foundation="+ x.getFoundation()+"}");
        }
    }
}

