package report.makeJSON;

public class BUTTON_OFF {

    static public String[] DevParam = {
            // DOOR_PROTECT
            "0a 01 09 444f4f525f50524f54454354 0b 00 b0 09630909",
            // MOTION_PROTECT
            "0a 01 09 4d4f54494f4e5f50524f54454354 0b 00 b0 09630909",
            // FIRE_PROTECT
            "0a 01 09 464952455f50524f54454354 0b 00 b0 09630909",
            // GLASS_PROTECT
            "0a 01 09 474c4153535f50524f54454354 0b 00 b0 09630909",
            // LEAK_PROTECT
            "0a 01 09 4c45414b5f50524f54454354 0b 00 b0 09630909",
            // MOTION_PROTECT_CURTAIN
            "0a 01 09 4d4f54494f4e5f50524f544543545f4355525441494e 0b 00 b0 09630909",
            // RANGE_EXTENDER
            "0a 01 09 52414e47455f455854454e444552 0b 00 b0 09630909",
            // COMBI_PROTECT
            "0a 01 31 01 32 01 09 434f4d42495f50524f54454354 0b 00 b0 09630909",
            // FIRE_PROTECT_PLUS
            "0a 01 09 464952455f50524f544543545f504c5553 0b 00 b0 09630909",
            // KEYBOARD
            "0a 01 09 4b4559424f415244 0b 00 b0 09630909",
            // SPACE_CONTROL
            "0a 01 09 53504143455f434f4e54524f4c 0b 00 b0 09630909",
            // BUTTON
            "0a 01 09 425554544f4e0d0a 0b 00 b0 09630909",
            // MOTION_CAM
            "0a 01 09 4d4f54494f4e5f43414d 0b 00 b0 09630909",
            // MOTION_PROTECT_PLUS
            "0a 01 09 4d4f54494f4e5f50524f544543545f504c5553 0b 00 b0 09630909",
            // DOOR_PROTECT_PLUS
            "0a 01 09 444f4f525f50524f544543545f504c5553 0b 00 b0 09630909",
            // TRANSMITTER
            "0a 01 34 00 09 5452414e534d4954544552 0b 00 b0 09630909",
            // RELAY
            "0a 01 09 52454c4159 0b 00 b0 09630909",
            // MOTION_PROTECT_OUTDOOR
            "0a 01 09 4d4f54494f4e5f50524f544543545f4f5554444f4f52 0b 00 b0 09630909",
            // STREET_SIREN
            "0a 01 09 5354524545545f534952454e 0b 00 b0 09630909",
            // HOME_SIREN
            "0a 01 09 484f4d455f534952454e 0b 00 b0 09630909",
            // SOCKET
            "0a 01 09 534f434b4554 0b 00 b0 09630909",
            // WALL_SWITHC
            "0a 01 09 57414c4c5f535749544348 0b 00 b0 09630909",
            // DOUBLE_BUTTON
            "0a 01 09 444f55424c455f425554544f4e 0b 00 b0 09630909",
            // MULTI_TRANSMITTER
            "0a 01 09 4d554c54495f5452414e534d4954544552 0b 00 b0 09630909",
            // SS_DD
            "0a 01 09 53535f4444 0b 00 b0 09630909",
            // KPP
            "0a 01 09 4b5050 0b 00 b0 09630909",
            // KPC
            "0a 01 09 4b5043 0b 00 b0 09630909",
            // DCO
            "0a 01 09 44434f 0b 00 b0 09630909",
            // MCO
            "0a 01 09 4d434f 0b 00 b0 09630909",
            // VHF_BRIDGE
            "0a 01 16 01 03 80 0b 00 05 8000 04 80 31 80 b7 00 09 5648465f425249444745",
            // DOOR_PROTECT_FIBRA
            "0a 01 09 444f4f525f50524f544543545f4649425241 0b 00 b0 09630909",
            // MOTION_PROTECT_FIBRA
            "0a 01 09 4d4f54494f4e5f50524f544543545f4649425241 0b 00 b0 09630909",
            // GLASS_PROTECT_FIBRA
            "0a 01 09 474c4153535f50524f544543545f4649425241 0b 00 b0 09630909",
            // COMBI_PROTECT_FIBRA
            "0a 01 09 434f4d42495f50524f544543545f4649425241 0b 00 b0 09630909",
            // KEYBOARD_FIBRA
            "0a 01 09 4b4559424f4152445f4649425241 0b 00 b0 09630909",
            // MOTION_PROTECT_PLUS_FIBRA
            "0a 01 09 4d4f54494f4e5f50524f544543545f504c55535f4649425241 0b 00 b0 09630909",
            // DOOR_PROTECT_PLUS_FIBRA
            "0a 01 09 444f4f525f50524f544543545f504c55535f4649425241 0b 00 b0 09630909",
            // STREET_SIREN_FIBRA
            "0a 01 09 5354524545545f534952454e5f4649425241 0b 00 b0 09630909",
            // HOME_SIREN_FIBRA
            "0a 01 09 484f4d455f534952454e5f4649425241 0b 00 b0 09630909",
            // SS_DD_FIBTA
            "0a 01 09 53535f44445f4649425441 0b 00 b0 09630909",
            // RANGE_EXTENDER 2
            "0a 01 09 52414e47455f455854454e4445522032 0b 00 b0 09630909",
            // WI_MT_INTRUSION
            "0a 01 3c 001c 09 57495f4d545f494e54525553494f4e 0b 00 32 00 3f 00",
            // WI_MT_FIFE
            "0a 01 3c 001c 09 57495f4d545f46495245 0b 00 32 00 3f 01",
            // WI_MT_MEDICAL
            "0a 01 3c 001c 09 57495f4d545f4d45444943414c 0b 00 32 00 3f 02",
            // WI_MT_PANIC
            "0a 01 3c 001c 09 57495f4d545f50414e4943 0b 00 32 00 3f 03",
            // WI_MT_GAS
            "0a 01 3c 001c 09 57495f4d545f474153 0b 00 32 00 3f 04",
    };
}
