package main.java.report.makeJSON;

public enum texts {

    text1("[\n" +
            "  {\n" +
            "    \"name\": \".\",\n" +
            "    \"node_type\": \"add_hub\",\n" +
            "    \"is_open\": true,\n" +
            "    \"children\": [\n" +
            "      {\n" +
            "        \"name\": \"FAKE HUB\",\n" +
            "        \"node_type\": \"minus\",\n" +
            "        \"id\": \"77777777\",\n" +
            "        \"type\": \"21\",\n" +
            "        \"obj_type\": \"hub\",\n" +
            "        \"can_delete\": true,\n" +
            "        \"is_open\": true,\n" +
            "        \"children\": [\n" +
            "          {\n" +
            "            \"name\": \"rooms\",\n" +
            "            \"node_type\": \"add\",\n" +
            "            \"obj_type\": \"rooms\",\n" +
            "            \"is_open\": true,\n" +
            "            \"children\": [\n" +
            "              {\n" +
            "                \"name\": \"fake room\",\n" +
            "                \"node_type\": \"minus\",\n" +
            "                \"id\": \"00000001\",\n" +
            "                \"id_editable\": false,\n" +
            "                \"type\": \"24\",\n" +
            "                \"obj_type\": \"room\",\n" +
            "                \"can_delete\": true,\n" +
            "                \"children\": [\n" +
            "                  {\n" +
            "                    \"name\": \"00\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"66616b6520726f6f6d\"\n" +
            "                  }\n" +
            "                ]\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"groups\",\n" +
            "            \"node_type\": \"add\",\n" +
            "            \"obj_type\": \"groups\",\n" +
            "            \"is_open\": true,\n" +
            "            \"children\": [\n" +
            "              {\n" +
            "                \"name\": \"fake group\",\n" +
            "                \"node_type\": \"minus\",\n" +
            "                \"id\": \"00000001\",\n" +
            "                \"id_editable\": false,\n" +
            "                \"type\": \"23\",\n" +
            "                \"obj_type\": \"group\",\n" +
            "                \"can_delete\": true,\n" +
            "                \"children\": [\n" +
            "                  {\n" +
            "                    \"name\": \"02\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"66616b652067726f7570\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"04\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"01\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"05\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"01\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"06\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"00\"\n" +
            "                  }\n" +
            "                ]\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"devices\",\n" +
            "            \"node_type\": \"add\",\n" +
            "            \"obj_type\": \"devices\",\n" +
            "            \"is_open\": true,\n" +
            "            \"children\": [\n" +
            "              {"),

    text4("   ]\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"users\",\n" +
            "            \"node_type\": \"add\",\n" +
            "            \"obj_type\": \"users\",\n" +
            "            \"children\": [\n" +
            "              {\n" +
            "                \"name\": \"Misha\",\n" +
            "                \"node_type\": \"minus\",\n" +
            "                \"id\": \"66666666\",\n" +
            "                \"id_editable\": false,\n" +
            "                \"type\": \"22\",\n" +
            "                \"obj_type\": \"user\",\n" +
            "                \"can_delete\": false,\n" +
            "                \"children\": [\n" +
            "                  {\n" +
            "                    \"name\": \"01\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"4d69736861\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"02\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"6b6f7a6c69756b2e6d40616a61782e73797374656d73\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"03\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"2b333830393339333738323436\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"09\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"07\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"0a\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"03\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"0b\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"03\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"0f\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"01f5\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"10\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"03\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"14\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"ffffffff\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"15\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"01\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"19\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"ffffffffffffffff\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"1a\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"ffffffffffffffff\"\n" +
            "                  },\n" +
            "                  {\n" +
            "                    \"name\": \"21\",\n" +
            "                    \"node_type\": \"param\",\n" +
            "                    \"data_type\": \"hex\",\n" +
            "                    \"value\": \"00000000\"\n" +
            "                  }\n" +
            "                ]\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"cards\",\n" +
            "            \"node_type\": \"add\",\n" +
            "            \"obj_type\": \"cards\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"billing_companies\",\n" +
            "            \"node_type\": \"add\",\n" +
            "            \"obj_type\": \"billing_companies\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"notifications\",\n" +
            "            \"node_type\": \"add\",\n" +
            "            \"obj_type\": \"notifications\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"00\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"46414b4520485542\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"37\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"00033c20\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"75\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"06\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"01\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"0064\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"07\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"01\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"08\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"00\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"10\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"00\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"23\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"05050505\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"24\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"05050505\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"25\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"05050505\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"26\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"05050505\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"c7\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"01\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"49\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"01\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"4a\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"00\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"7e\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"01\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"89\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"00\"\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"name\": \"Misha\",\n" +
            "        \"node_type\": \"minus\",\n" +
            "        \"id\": \"66666666\",\n" +
            "        \"id_editable\": false,\n" +
            "        \"type\": \"22\",\n" +
            "        \"obj_type\": \"logged_user\",\n" +
            "        \"can_delete\": false,\n" +
            "        \"children\": [\n" +
            "          {\n" +
            "            \"name\": \"01\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"4d69736861\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"02\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"6b6f7a6c69756b2e6d40616a61782e73797374656d73\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"03\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"2b333830393339333738323436\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"09\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"07\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"0a\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"03\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"0b\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"03\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"0f\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"01f5\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"10\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"03\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"14\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"ffffffff\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"15\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"01\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"19\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"ffffffffffffffff\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"1a\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"ffffffffffffffff\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"21\",\n" +
            "            \"node_type\": \"param\",\n" +
            "            \"data_type\": \"hex\",\n" +
            "            \"value\": \"00000000\"\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "]");

    private final String text;

    texts(String P) {
        text = P;
    }

    public String getString() {
        return text;
    }
}
