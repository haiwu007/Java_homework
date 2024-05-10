package homework511;

import java.util.HashMap;
import java.util.Map;

public class dateTrans {
    static int year, month, day;
    static Map<String,Integer> map;
    static String[] strMonth = {"","January","February","March","April","May","June","July","August","September","October","November","December"};

    static void mapInit(){
        map = new HashMap<String, Integer>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
    }

    static void setDate(String[] args) {
        if (args.length == 1) {
            String str[] = args[0].split("\\.");
            year = Integer.valueOf(str[0]).intValue();
            month = Integer.valueOf(str[1]).intValue();
            day = Integer.valueOf(str[2]).intValue();
        }
        else{
            month = map.get(args[0]);
            String str[] = args[1].split(",");
            day = Integer.valueOf(str[0]).intValue();
            year = Integer.valueOf(str[1]).intValue();
        }
    }

    static void getDate(String[] args){
        String str;
        if (args.length == 1) {
            str = String.format("%s %02d,%04d", strMonth[month], day, year);
        }
        else{
            str = String.format("%04d.%02d.%02d", year, month, day);
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        if (args.length > 2 || args.length < 1) {
            System.err.println("参数数量错误");
            return;
        }
        mapInit();

        setDate(args);
        getDate(args);
    }
}
