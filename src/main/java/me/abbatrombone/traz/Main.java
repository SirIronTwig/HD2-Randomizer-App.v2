package me.abbatrombone.traz;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LoggerSetup.initializeLogger();
        SwingUtilities.invokeLater(HDApp::new);
    }
}


