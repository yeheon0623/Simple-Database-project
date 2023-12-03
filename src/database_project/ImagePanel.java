package database_project;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class ImagePanel extends JPanel {
    private Image backgroundImage;

    public ImagePanel(String filePath) {
        try {
            backgroundImage = ImageIO.read(new File(filePath)); // Ensure this path is correct
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
