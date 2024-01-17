package tainted.CoinCon.gui;

import tainted.CoinCon.listeners.InputListener;
import tainted.CoinCon.listeners.WindowListener;

import java.awt.*;

public class GUI extends Frame {
    private static TextField ptfInput;
    private static TextField gtfInput;
    private static TextField stfInput;
    private static TextField ctfInput;

    private static TextField ptfOutput;
    private static TextField gtfOutput;
    private static TextField stfOutput;
    private static TextField ctfOutput;

    private static CheckboxGroup cType;

    public static TextField getPtfInput() {
        return ptfInput;
    }

    public static TextField getGtfInput() {
        return gtfInput;
    }

    public static TextField getStfInput() {
        return stfInput;
    }

    public static TextField getCtfInput() {
        return ctfInput;
    }

    public static TextField getPtfOutput() {
        return ptfOutput;
    }

    public static TextField getGtfOutput() {
        return gtfOutput;
    }

    public static TextField getStfOutput() {
        return stfOutput;
    }

    public static TextField getCtfOutput() {
        return ctfOutput;
    }

    public static CheckboxGroup getConType() {
        return cType;
    }

    public void appGUI() {
        setLayout(new GridLayout(3, 4));

        cType = new CheckboxGroup();
        add(new Checkbox("Platinum", cType, false));
        add(new Checkbox("Gold", cType, true));
        add(new Checkbox("Silver", cType, false));
        add(new Checkbox("Copper", cType, false));

        ptfInput = new TextField("0");
        add(ptfInput);
        ptfInput.addActionListener(new InputListener());

        gtfInput = new TextField("0");
        add(gtfInput);
        gtfInput.addActionListener(new InputListener());

        stfInput = new TextField("0");
        add(stfInput);
        stfInput.addActionListener(new InputListener());

        ctfInput = new TextField("0");
        add(ctfInput);
        ctfInput.addActionListener(new InputListener());

        ptfOutput = new TextField();
        ptfOutput.setEditable(false);
        add(ptfOutput);

        gtfOutput = new TextField();
        gtfOutput.setEditable(false);
        add(gtfOutput);

        stfOutput = new TextField();
        stfOutput.setEditable(false);
        add(stfOutput);

        ctfOutput = new TextField();
        ctfOutput.setEditable(false);
        add(ctfOutput);

        addWindowListener(new WindowListener());

        setTitle("Coin Converter");
        setSize(350, 100);
        setVisible(true);
    }

}
