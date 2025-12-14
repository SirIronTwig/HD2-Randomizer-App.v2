package me.abbatrombone.traz.Panels;

import javax.swing.*;
import java.awt.*;

public class LabelPanel{
    private final JPanel panel = new JPanel();
    private final Font font = new Font("Segoe UI", Font.BOLD, 24);

    public LabelPanel(){
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        panel.add(makeLabel());
    }
    private JLabel makeLabel(){
        String labelText = "Helldivers 2 Randomizer";
        JLabel titleLabel = new JLabel(labelText);

        titleLabel.setFont(font);
        titleLabel.setBackground(Color.BLACK);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        return titleLabel;
    }
    public JPanel getPanel() {
        return panel;
    }

}
