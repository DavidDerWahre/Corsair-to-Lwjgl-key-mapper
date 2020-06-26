package example;

import ca.fiercest.cuesdk.Color;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;
import de.david.KeyMapper;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Init the KeyMapper.
        KeyMapper km = new KeyMapper();
        //Init the CueSDK.
        CueSDK sdk = new CueSDK(true);

        // The key "R" should light up now.
        sdk.SetLedColor(km.getLedIdByKeyBoardKey(19), new Color(255,0,255));

        //And just for fun, we print out the opposite (Should print out 19)
        System.out.println(km.getKeyBoardKeyByLedId(LedId.CLK_R));

        //Let the key a bit longer lighting.
        Thread.sleep(2000);

    }

}
