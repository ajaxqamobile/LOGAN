package report.makeJSON;

public class MakeJSON {

    static String JSON = null;
    private static int mtIndex;
    private static int wiIndex;

//      public static void main(String[] args) {
//        startMakeJSON();
//}

public static void startMakeJSON() {
    for (int i = 0; i <= 6; i++) {
        mtIndex = 0;
        wiIndex = 0;
        System.out.println(texts.text1.getString());
        JSON = texts.text1.getString() + "\n";
        String lastIndex = "00";

        switch (i) {
            case 0:
                for (int j = 0; DeviceID.arrayType.length > j; j++) {
                    if (DeviceID.arrayType.length == j + 1) {
                        lastIndex = "01";
                    }
                    makeJson(DeviceID.arrayType[j], BUTTON_1.DevParam[j], lastIndex);
                }
                break;
            case 1:
                for (int j = 0; DeviceID.arrayType.length > j; j++) {
                    if (DeviceID.arrayType.length == j + 1) {
                        lastIndex = "01";
                    }
                    makeJson(DeviceID.arrayType[j], BUTTON_2.DevParam[j], lastIndex);
                }
                break;
            case 2:
                for (int j = 0; DeviceID.arrayType.length > j; j++) {
                    if (DeviceID.arrayType.length == j + 1) {
                        lastIndex = "01";
                    }
                    makeJson(DeviceID.arrayType[j], BUTTON_3.DevParam[j], lastIndex);
                }
                break;
            case 3:
                for (int j = 0; DeviceID.arrayType.length > j; j++) {
                    if (DeviceID.arrayType.length == j + 1) {
                        lastIndex = "01";
                    }
                    makeJson(DeviceID.arrayType[j], BUTTON_4.DevParam[j], lastIndex);
                }
                break;
            case 4:
                for (int j = 0; DeviceID.arrayType.length > j; j++) {
                    if (DeviceID.arrayType.length == j + 1) {
                        lastIndex = "01";
                    }
                    makeJson(DeviceID.arrayType[j], BUTTON_5.DevParam[j], lastIndex);
                }
                break;
            case 5:
                for (int j = 0; DeviceID.arrayType.length > j; j++) {
                    if (DeviceID.arrayType.length == j + 1) {
                        lastIndex = "01";
                    }
                    makeJson(DeviceID.arrayType[j], BUTTON_OFF.DevParam[j], lastIndex);
                }
                break;
            case 6:
                for (int j = 0; DeviceID.arrayType.length > j; j++) {
                    if (DeviceID.arrayType.length == j + 1) {
                        lastIndex = "01";
                    }
                    makeJson(DeviceID.arrayType[j], BUTTON_LONG_NAME.DevParam[j], lastIndex);
                }
                break;
        }
        System.out.println(texts.text4.getString());
        JSON = JSON + texts.text4.getString() + "\n";
        WriteJSON.writeToJSON(i + 1, JSON);
    }
}

    public static void makeJson(String ID, String param, String lastIndex) {

        String[] arrayFullParam = (param + " 27 " + ID).split(" ");
        String[] Param = new String[arrayFullParam.length / 2];
        String[] Value = new String[arrayFullParam.length / 2];

        try {
            int y = 0;
            int p = 0;
            for (String retval : arrayFullParam) {
                if (y % 2 == 0) {
                    Param[p] = retval;
                    p++;
                }
                y++;
            }
            y = 0;
            p = 0;
            for (String retval : arrayFullParam) {
                if (y % 2 != 0) {
                    Value[p] = retval;
                    p++;
                }
                y++;
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }

        String text3;
        String prefixID = "00ff00";
        String fullID;


        if (ID.equals("1d")) {
            ++mtIndex;
            fullID = "00aa0" + mtIndex + ID;
        } else if (ID.equals("26")) {
            ++wiIndex;
            fullID = "00af0" + wiIndex + ID;
        } else {
            fullID = prefixID + ID;
        }

        String text2 = "\"name\": \"" + fullID + "\",\n" +
                "                \"node_type\": \"minus\",\n" +
                "                \"id\": \"" + fullID + "\",\n" +
                "                \"id_editable\": true,\n" +
                "                \"type\": \"" + ID + "\",\n" +
                "                \"type_editable\": true,\n" +
                "                \"obj_type\": \"device\",\n" +
                "                \"can_delete\": true,\n" +
                "                \"is_open\": true,\n" +
                "                \"children\": [";

        System.out.println(text2);
        JSON = JSON + text2 + "\n";

        for (int i = 0; i < Param.length; i++) {
            if ((i != Param.length - 1)) {
                text3 = " {\n" +
                        "        \"name\": \"" + Param[i] + "\",\n" +
                        "        \"node_type\": \"param\",\n" +
                        "        \"data_type\": \"hex\",\n" +
                        "        \"value\": \"" + Value[i] + "\"\n" +
                        "        },";
                System.out.println(text3);
                JSON = JSON + text3 + "\n";
            } else if (lastIndex.equals("01")) {
                text3 = " {\n" +
                        "        \"name\": \"" + Param[i] + "\",\n" +
                        "        \"node_type\": \"param\",\n" +
                        "        \"data_type\": \"hex\",\n" +
                        "        \"value\": \"" + Value[i] + "\"\n" +
                        "        }";
                System.out.println(text3);
                JSON = JSON + text3 + "\n";
            } else {
                text3 = " {\n" +
                        "        \"name\": \"" + Param[i] + "\",\n" +
                        "        \"node_type\": \"param\",\n" +
                        "        \"data_type\": \"hex\",\n" +
                        "        \"value\": \"" + Value[i] + "\"\n" +
                        "        }";

                String text3_2 = " ]\n" +
                        "              },\n" +
                        "              {";
                System.out.println(text3 + "\n" + text3_2);
                JSON = JSON + text3 + "\n" + text3_2 + "\n";
            }
        }
    }
}