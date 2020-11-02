package main.java.report;

public class decToHex {

    public static String hubToHex(int num) {
        return Integer.toHexString(num);
    }

    public static String checkNull(String item) {
        String count = String.valueOf((String.valueOf(Math.abs(Integer.parseInt(item))).length()));
        if (item.equals("0")) {
            item = item + "0";
        } else if (count.equals("1")) {
            item = "0" + item;
        }

        return item;
    }

    public static String checkFirst(String item) {
        int num = Integer.parseInt(item);
        return String.valueOf(num);
    }

    public static String deviceToHex(int num) {

        int a = num / 1000000;
        int b = (num / 10000) % 100;
        int c = (num / 100) % 100;
        int d = num % 100;

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);

        String a_HEX = checkFirst(checkNull(Integer.toHexString(a)));
        String b_HEX = checkNull(Integer.toHexString(b));
        String c_HEX = checkNull(Integer.toHexString(c));
        String d_HEX = checkNull(Integer.toHexString(d));

        return (a_HEX + b_HEX + c_HEX + d_HEX);
    }

}
