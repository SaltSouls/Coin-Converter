package tainted.CoinCon.listeners;

import tainted.CoinCon.gui.GUI;
import tainted.CoinCon.utils.MathUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static tainted.CoinCon.utils.ConversionUtils.*;

public class InputListener implements ActionListener {

    private static boolean isType(String name) {
        Checkbox type = GUI.getConType().getSelectedCheckbox();
        return Objects.equals(type.getLabel(), name);
    }

    private static long getValue(String text) {
        if (!text.isEmpty()) { return MathUtils.evaluate(text); }
        else { return 0; }
    }

    private static long[] getCoins() {
        String pIn = GUI.getPtfInput().getText();
        String gIn = GUI.getGtfInput().getText();
        String sIn = GUI.getStfInput().getText();
        String cIn = GUI.getCtfInput().getText();

        long platinum = getValue(pIn);
        long gold = getValue(gIn);
        long silver = getValue(sIn);
        long copper = getValue(cIn);


        return new long[]{platinum, gold, silver, copper};
    }

    private static String stringify(long num) {
        return String.valueOf(num);
    }

    private static void setConverted(long[] coins) {
        TextField pOut = GUI.getPtfOutput();
        TextField gOut = GUI.getGtfOutput();
        TextField sOut = GUI.getStfOutput();
        TextField cOut = GUI.getCtfOutput();


        pOut.setText(stringify(coins[0]));
        gOut.setText(stringify(coins[1]));
        sOut.setText(stringify(coins[2]));
        cOut.setText(stringify(coins[3]));
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        long[] coins = getCoins();

        // Convert coins based on user selection
        if (isType("Platinum")) { toPlatinum(coins); }
        else if (isType("Gold")) { toGold(coins); }
        else if (isType("Silver")) { toSilver(coins); }
        else { toCopper(coins); }

        setConverted(coins);
    }

}
