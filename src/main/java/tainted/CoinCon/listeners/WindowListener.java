package tainted.CoinCon.listeners;

import java.awt.event.WindowEvent;

public class WindowListener implements java.awt.event.WindowListener {

    @Override
    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }

    // Not used, but needed as part of the constructor
    @Override public void windowOpened(WindowEvent event) { }
    @Override public void windowClosed(WindowEvent event) { }
    @Override public void windowIconified(WindowEvent event) { }
    @Override public void windowDeiconified(WindowEvent event) { }
    @Override public void windowActivated(WindowEvent event) { }
    @Override public void windowDeactivated(WindowEvent event) { }

}
