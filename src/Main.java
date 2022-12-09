import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception{
        InputStream ins = new FileInputStream("src/resources/city_ru.csv");
        Scanner obj = new Scanner(ins);
        ArrayList<ArrayList<Object>> x1 = new ArrayList<>();

        while (obj.hasNextLine()) {
            ArrayList<Object> x2 = new ArrayList<>();
            String[] subStr;
            subStr = obj.nextLine().split(";");
            for(int j=1; j<subStr.length; j++){
                if(j==4)
                    x2.add(Integer.valueOf(subStr[j]));

                x2.add(subStr[j]);
            }
            x1.add(x2);
        }
        for(ArrayList<Object> c: x1){
            if (c.size()==4) {
                System.out.println("City{name='" + c.get(0) +
                        "', region='" + c.get(1) +
                        "', district='" + c.get(2) +
                        "', population=" + c.get(3) +
                        "', foundation=  }");
            }
            else{
                System.out.println("City{name='" + c.get(0) +
                        "', region='" + c.get(1) +
                        "', district='" + c.get(2) +
                        "', population=" + c.get(3) +
                        "', foundation=" + c.get(4) +
                        "}");
            }
        }
    }
}

