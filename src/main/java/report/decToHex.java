package main.java.report;

public class decToHex {

    public static String hubToHex(int num) {
        return Integer.toHexString(num);
    }

    public static String checkNull (String item){
        if (item.equals("0")){
            item = item+"0";
        }
        return item;
    }

    public static String deviceToHex(int num) {

        int a = num / 1000000;
        int b = (num / 10000) % 100;
        int c = (num / 100) % 100;
        int d = num % 100;

        System.out.println(a+"\n"+b+"\n"+c+"\n"+d);

        String a_HEX = checkNull(Integer.toHexString(a));
        String b_HEX = checkNull(Integer.toHexString(b));
        String c_HEX = checkNull(Integer.toHexString(c));
        String d_HEX = checkNull(Integer.toHexString(d));

        if (a_HEX.equals("0")){
            a_HEX = a_HEX+"0";
        } else if (b_HEX.equals("0")){
            b_HEX = b_HEX+"0";
        }  else if (c_HEX.equals("0")){
            c_HEX = c_HEX+"0";
        }  else if (d_HEX.equals("0")){
            d_HEX = d_HEX+"0";
        }

        return a_HEX+b_HEX+c_HEX+d_HEX;
    }

}
