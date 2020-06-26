package de.david;

import ca.fiercest.cuesdk.enums.LedId;

import java.util.HashMap;
import java.util.Map;

public class KeyMapper {

    /**
     * @Author DavidDerWahre
     * Jwjgl -> Corsair
     */

    private final HashMap<Integer, LedId> KEY_MAP = new HashMap<>();

    /**
     * Initializing the keys (Not all yet)
     */

    public KeyMapper() {
        KEY_MAP.put(2, LedId.CLK_1);
        KEY_MAP.put(3, LedId.CLK_2);
        KEY_MAP.put(4, LedId.CLK_3);
        KEY_MAP.put(5 ,LedId.CLK_4);
        KEY_MAP.put(6,LedId.CLK_5);
        KEY_MAP.put(7,LedId.CLK_6);
        KEY_MAP.put(8,LedId.CLK_7);
        KEY_MAP.put(9,LedId.CLK_8);
        KEY_MAP.put(10,LedId.CLK_9);
        KEY_MAP.put(11,LedId.CLK_0);
        KEY_MAP.put(12,LedId.CLK_MinusAndUnderscore);
        KEY_MAP.put(15,LedId.CLK_Tab);
        KEY_MAP.put(16,LedId.CLK_Q);
        KEY_MAP.put(17,LedId.CLK_W);
        KEY_MAP.put(18,LedId.CLK_E);
        KEY_MAP.put(19,LedId.CLK_R);
        KEY_MAP.put(20,LedId.CLK_T);
        KEY_MAP.put(21,LedId.CLK_Y);
        KEY_MAP.put(22,LedId.CLK_U);
        KEY_MAP.put(23,LedId.CLK_I);
        KEY_MAP.put(24,LedId.CLK_O);
        KEY_MAP.put(25,LedId.CLK_P);
        KEY_MAP.put(26,LedId.CLK_BracketLeft);
        KEY_MAP.put(58,LedId.CLK_CapsLock);
        KEY_MAP.put(28,LedId.CLK_Enter);
        KEY_MAP.put(29,LedId.CLK_LeftCtrl);
        KEY_MAP.put(30,LedId.CLK_A);
        KEY_MAP.put(31,LedId.CLK_S);
        KEY_MAP.put(32,LedId.CLK_D);
        KEY_MAP.put(33,LedId.CLK_F);
        KEY_MAP.put(34,LedId.CLK_G);
        KEY_MAP.put(35,LedId.CLK_H);
        KEY_MAP.put(36,LedId.CLK_J);
        KEY_MAP.put(37,LedId.CLK_K);
        KEY_MAP.put(38,LedId.CLK_L);
        KEY_MAP.put(39,LedId.CLK_SemicolonAndColon);
        KEY_MAP.put(40,LedId.CLK_ApostropheAndDoubleQuote);
        KEY_MAP.put(41,LedId.CLK_GraveAccentAndTilde);
        KEY_MAP.put(42,LedId.CLK_LeftShift);
        KEY_MAP.put(43,LedId.CLK_Backslash);
        KEY_MAP.put(44,LedId.CLK_Z);
        KEY_MAP.put(45,LedId.CLK_X);
        KEY_MAP.put(46,LedId.CLK_C);
        KEY_MAP.put(47,LedId.CLK_V);
        KEY_MAP.put(48,LedId.CLK_B);
        KEY_MAP.put(49,LedId.CLK_N);
        KEY_MAP.put(50,LedId.CLK_M);
        KEY_MAP.put(51,LedId.CLK_KeypadComma);
        KEY_MAP.put(52,LedId.CLK_PeriodAndBiggerThan);
        KEY_MAP.put(54,LedId.CLK_RightShift);
        KEY_MAP.put(56,LedId.CLK_LeftAlt);
        KEY_MAP.put(57,LedId.CLK_Space);
        KEY_MAP.put(69,LedId.CLK_NumLock);
        KEY_MAP.put(70,LedId.CLK_ScrollLock);
        KEY_MAP.put(71,LedId.CLK_Keypad7);
        KEY_MAP.put(72,LedId.CLK_Keypad8);
        KEY_MAP.put(73,LedId.CLK_Keypad9);
        KEY_MAP.put(74,LedId.CLK_KeypadMinus);
        KEY_MAP.put(75,LedId.CLK_Keypad4);
        KEY_MAP.put(76,LedId.CLK_Keypad5);
        KEY_MAP.put(77,LedId.CLK_Keypad6);
        KEY_MAP.put(78,LedId.CLK_KeypadPlus);
        KEY_MAP.put(79,LedId.CLK_Keypad1);
        KEY_MAP.put(80,LedId.CLK_Keypad2);
        KEY_MAP.put(81,LedId.CLK_Keypad3);
        KEY_MAP.put(82,LedId.CLK_Keypad0);
        KEY_MAP.put(83,LedId.CLK_KeypadPeriodAndDelete);
        KEY_MAP.put(203,LedId.CLK_LeftArrow);
        KEY_MAP.put(200,LedId.CLK_UpArrow);
        KEY_MAP.put(205,LedId.CLK_RightArrow);
        KEY_MAP.put(208,LedId.CLK_DownArrow);
    }

    /**
     * Returns the Hashmap with all the mapped keys.
     */
    public Map<Integer, LedId> getKeyMap() { return KEY_MAP; }

    /**
     * Returns the LedId by it's mapped key.
     */
    public LedId getLedIdByKeyBoardKey(int keyBoardKey) {
        return KEY_MAP.get(keyBoardKey);
    }

    /**
     * Returns the Keyboard key by the LedId but returns 0 when the Keyboard key does not exist!
     */
    public int getKeyBoardKeyByLedId(LedId lID) {
        for (Map.Entry<Integer, LedId> entry : KEY_MAP.entrySet()) {
            if (entry.getValue().equals(lID)) {
                return entry.getKey();
            }
        }
        return 0;
    }

    /**
     * Returns true if the Key exists in the Hashmap (this is practical for now because not all LWJGL key codes exist in this Hashmap).
     */
    public boolean doesKeyExist(int key) {
        return KEY_MAP.containsKey(key);
    }

}
