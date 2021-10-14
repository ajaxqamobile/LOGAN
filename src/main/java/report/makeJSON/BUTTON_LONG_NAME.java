package report.makeJSON;

public class BUTTON_LONG_NAME {

    static public String[] DevParam = {
            // DOOR_PROTECT
            "0a 01 16 01 15 00 b0 09630909 33 01 ac 0000 ad 0000 02 28 03 01 0b 01 05 0064 04 01 35 00 34 00 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // MOTION_PROTECT
            "0a 01 16 01 15 00 b0 09630909 32 00 33 01 ac 0000 ad 0000 02 28 03 01 0b 01 05 0064 04 01 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // FIRE_PROTECT
            "0a 01 16 01 15 00 b0 09630909 39 01 36 01 34 01 02 41 03 01 0b 01 05 0001 04 00 31 00 32 00 3c 00 33 01 37 00 38 00 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // GLASS_PROTECT
            "0a 01 16 01 15 00 b0 09630909 33 01 31 00 34 00 ac 0000 ad 0000 02 28 03 01 0b 01 05 0064 04 01 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // LEAK_PROTECT
            "0a 01 16 01 15 00 b0 09630909 31 00 09 575757575757575757575757575757575757575757575757 02 32 03 01 0b 01 05 0064 04 01 32 00 b7 01 c0 00 c1 00 17 ffffffff",
            // MOTION_PROTECT_CURTAIN
            "0a 01 16 01 15 00 32 00 40 01 33 00 31 00 ac 0000 ad 0000 b0 09630909 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0001 04 01 41 00 b7 01 c0 00 c1 00 17 ffffffff",
            // RANGE_EXTENDER
            "0a 01 16 01 15 00 b0 09630909 09 575757575757575757575757575757575757575757575757 03 01 0b 01 05 0064 04 00 31 01 b7 01 c0 00 c1 00 17 ffffffff",
            // COMBI_PROTECT
            "0a 01 31 01 32 01 16 01 15 00 35 00 36 00 33 00 34 00 ac 0000 ad 0000 b0 09630909 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0064 04 01 b7 01 c0 00 c1 00 17 ffffffff",
            // FIRE_PROTECT_PLUS
            "0a 01 16 01 15 00 b0 09630909 34 01 39 01 36 01 3b 01 09 575757575757575757575757575757575757575757575757 02 41 03 01 0b 01 05 0001 04 00 31 00 32 00 3c 00 33 01 37 00 38 00 3a 00 b7 01 c0 00 c1 00 17 ffffffff",
            // KEYBOARD
            "0a 01 b0 03330000 16 01 15 00 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0001 04 01 b7 01 c0 00 c1 00 17 ffffffff",
            // SPACE_CONTROL
            "0a 01 16 01 15 00 31 00 35 00 b0 09630909 09 575757575757575757575757575757575757575757575757 05 0001 b7 01 c0 00 c1 00 17 ffffffff",
            // BUTTON
            "0a 01 16 01 15 00 33 00 31 00 35 00 b0 09630909 09 575757575757575757575757575757575757575757575757 05 0001 b7 01 0b 01 c0 00 c1 00 17 ffffffff",
            // MOTION_CAM
            "0a 01 16 01 15 00 31 01 32 00 ac 0000 ad 0000 42 01 b0 09630909 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0001 04 01 4b 01 42 01 b7 01 c0 00 c1 00 17 ffffffff",
            // MOTION_PROTECT_PLUS
            "0a 01 16 01 15 00 b0 09630909 32 00 33 01 ac 0000 ad 0000 02 28 03 01 0b 01 05 0064 04 01 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // DOOR_PROTECT_PLUS
            "0a 01 16 01 15 00 ac 0000 ad 0000 33 01 43 01 40 01 b0 09630909 40 01 43 01 35 00 34 00 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0064 04 00 31 00 34 00 b7 01 c0 00 c1 00 17 ffffffff",
            // TRANSMITTER
            "0a 01 16 01 15 00 38 01 37 01 ac 0000 ad 0000 34 01 b0 09630909 09 575757575757575757575757575757575757575757575757 02 32 03 01 0b 01 05 0064 04 01 34 01 b7 01 c0 00 c1 00 17 ffffffff",
            // RELAY
            "0a 01 16 01 15 00 33 01 b0 09630909 09 575757575757575757575757575757575757575757575757 03 01 0b 01 35 1b57 b7 01 c0 00 c1 00 17 ffffffff",
            // MOTION_PROTECT_OUTDOOR
            "0a 01 16 01 15 00 32 00 33 01 ac 0000 ad 0000 b0 09630909 09 575757575757575757575757575757575757575757575757 02 3c 03 01 0b 01 05 0001 04 01 41 00 44 00 b7 01 c0 00 c1 00 17 ffffffff",
            // STREET_SIREN
            "0a 01 b0 09630909 15 00 38 00 32 00 33 00 34 01 31 0003 35 1f 09 575757575757575757575757575757575757575757575757 02 32 03 01 0b 01 05 0001 04 00 36 00 b7 01 c0 00 c1 00 17 ffffffff",
            // HOME_SIREN
            "0a 01 b0 09630909 16 00 15 00 38 00 32 00 33 00 34 01 31 0003 35 1f 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0001 04 00 36 00 b7 01 c0 00 c1 00 17 ffffffff",
            // SOCKET
            "0a 01 16 01 15 00 31 01 32 01 b0 09630909 35 00dc 09 575757575757575757575757575757575757575757575757 03 01 0b 01 42 00002710 43 000186a0 b7 01 c0 00 c1 00 17 ffffffff",
            // WALL_SWITCH
            "0a 01 16 01 15 00 31 01 32 01 b0 09630909 35 00dc 09 575757575757575757575757575757575757575757575757 03 01 0b 01 42 00002710 43 000186a0 b7 01 c0 00 c1 00 17 ffffffff",
            // DOUBLE_BUTTON

            "0a 01 16 01 15 00 31 00 b0 09630909 09 575757575757575757575757575757575757575757575757 05 0001 b7 01 0b 01 c0 00 c1 00 17 ffffffff",
            // MULTI_TRANSMITTER
            "0a 01 16 01 15 00 b0 09630909 09 575757575757575757575757575757575757575757575757 03 01 0b 01 05 0064 34 00 35 00 04 01 31 01 37 01 33 01 b7 01 c0 00 c1 00 17 ffffffff",
            // SS_DD
            "0a 01 b0 09630909 16 00 15 00 38 00 32 00 33 00 34 01 31 0003 35 1f 09 575757575757575757575757575757575757575757575757 02 32 03 01 0b 01 05 0001 04 00 36 00 b7 01 c0 00 c1 00 17 ffffffff",
            // KPP
            "0a 01 16 01 15 00 b0 09630909 3d 00000001 09 575757575757575757575757575757575757575757575757 40 01 41 01 26 01 42 01 43 01 40 01 02 28 03 01 0b 01 05 0001 04 01 b7 01 c0 00 c1 00 17 ffffffff",
            // KPC
            "0a 01 16 01 15 00 b0 09630909 3d 00000001 40 01 09 575757575757575757575757575757575757575757575757 41 01 26 01 40 01 02 28 03 01 0b 01 05 0001 04 01 b6 01 42 01 43 00 44 01 46 0003 47 00 4c 00 b7 01 c0 00 c1 00 17 ffffffff",
            // DCO
            "0a 01 16 01 15 00 b0 09630909 ac 0005 ad 0005 09 575757575757575757575757575757575757575757575757 26 01 02 3c 03 01 0b 01 05 0064 04 01 31 01 32 01 33 00 34 00 39 01 3b 00 3a 01 3c 00 35 01 36 01 b7 01 c0 00 c1 00 17 ffffffff",
            // MCO
            "0a 01 16 01 15 00 33 01 ac 0000 ad 0000 b0 09630909 09 575757575757575757575757575757575757575757575757 26 01 4f 01 52 00 55 01 02 3c 03 01 0b 01 05 0001 04 01 4b 01 42 01 32 00 33 00 b7 01 c0 00 c1 00 17 ffffffff",
            // VHF_BRIDGE
            "0a 01 16 01 03 01 0b 01 05 64 04 01 31 01 b7 01 17 ffffffff 09 575757575757575757575757575757575757575757575757",
            // DOOR_PROTECT_FIBRA
            "0a 01 16 01 15 00 99 00 b0 09630909 33 01 ac 0000 ad 0000 02 28 03 01 0b 01 05 0064 04 01 35 00 34 00 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // MOTION_PROTECT_FIBRA
            "0a 01 16 01 15 00 99 00 b0 09630909 32 00 33 01 ac 0000 ad 0000 02 28 03 01 0b 01 05 0064 04 01 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // GLASS_PROTECT_FIBRA
            "0a 01 16 01 15 00 99 00 b0 09630909 33 01 31 00 34 00 ac 0000 ad 0000 02 28 03 01 0b 01 05 0064 04 01 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // COMBI_PROTECT_FIBRA
            "0a 01 16 01 15 00 99 00 35 00 36 00 33 00 34 00 ac 0000 ad 0000 b0 09630909 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0064 04 01 b7 01 c0 00 c1 00 17 ffffffff",
            // KEYBOARD_FIBRA
            "0a 01 16 01 15 00 99 00 b0 09630909 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0001 04 01 b7 01 c0 00 c1 00 17 ffffffff",
            // MOTION_PROTECT_PLUS_FIBRA
            "0a 01 16 01 15 00 99 00 b0 09630909 32 00 33 01 ac 0000 ad 0000 02 28 03 01 0b 01 05 0064 04 01 b7 01 09 575757575757575757575757575757575757575757575757 c0 00 c1 00 17 ffffffff",
            // DOOR_PROTECT_PLUS_FIBRA
            "0a 01 16 01 15 00 99 00 ac 0000 ad 0000 33 01 43 01 40 01 b0 09630909 40 01 43 01 35 00 34 00 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0064 04 00 31 00 34 00 b7 01 c0 00 c1 00 17 ffffffff",
            // STREET_SIREN_FIBRA
            "0a 01 16 00 15 00 99 00 38 00 32 00 33 00 34 01 31 0003 35 1f b0 09630909 09 575757575757575757575757575757575757575757575757 02 32 03 01 0b 01 05 0001 04 00 36 00 b7 01 c0 00 c1 00 17 ffffffff",
            // HOME_SIREN_FIBRA
            "0a 01 16 00 15 00 99 00 38 00 32 00 33 00 34 01 31 0003 35 1f b0 09630909 09 575757575757575757575757575757575757575757575757 02 28 03 01 0b 01 05 0001 04 00 36 00 b7 01 c0 00 c1 00 17 ffffffff",
            // SS_DD_FIBTA
            "0a 01 16 00 15 00 99 00 38 00 32 00 33 00 34 01 31 0003 35 1f b0 09630909 09 575757575757575757575757575757575757575757575757 02 32 03 01 0b 01 05 0001 04 00 36 00 b7 01 c0 00 c1 00 17 ffffffff",
            // RANGE_EXTENDER 2
            "0a 01 16 01 15 00 b0 09630909 09 575757575757575757575757575757575757575757575757 03 01 0b 01 05 0064 04 00 31 01 b7 01 4d 01 49 01 c0 00 c1 00 17 ffffffff",
            // WI_MT_INTRUSION
            "0a 01 16 01 3c 001c b7 01 ac 0000 ad 0000 40 01 09 575757575757575757575757575757575757575757575757 0b 01 32 00 33 01 3f 00 c0 00 c1 00 17 ffffffff",
            // WI_MT_FIFE
            "0a 01 16 01 3c 001c b7 01 ac 0000 ad 0000 40 01 09 575757575757575757575757575757575757575757575757 0b 01 32 00 33 01 3f 01 c0 00 c1 00 17 ffffffff",
            // WI_MT_MEDICAL
            "0a 01 16 01 3c 001c b7 01 ac 0000 ad 0000 40 01 09 575757575757575757575757575757575757575757575757 0b 01 32 00 33 01 3f 02 c0 00 c1 00 17 ffffffff",
            // WI_MT_PANIC
            "0a 01 16 01 3c 001c b7 01 ac 0000 ad 0000 40 01 09 575757575757575757575757575757575757575757575757 0b 01 32 00 33 01 3f 03 c0 00 c1 00 17 ffffffff",
            // WI_MT_GAS
            "0a 01 16 01 3c 001c b7 01 ac 0000 ad 0000 40 01 09 575757575757575757575757575757575757575757575757 0b 01 32 00 33 01 3f 04 c0 00 c1 00 17 ffffffff",
    };
}
