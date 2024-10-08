package imageOpener;

import javax.swing.*;
import java.awt.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ImageOpener extends JFrame {

    private BufferedImage image;

    public ImageOpener(String imagePath) {
        try {
            URL imageUrl = getClass().getResource("/image/" + imagePath);
            if (imageUrl != null) {
                image = ImageIO.read(imageUrl);
            } else {
                throw new IOException("Imagem não encontrada: " + imagePath);
            }
        } catch (IOException e) {
            System.err.println("Erro ao abrir a imagem: " + e.getMessage());
            System.exit(1);
        }

        setTitle("Visualizador de Imagem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImagePanel panel = new ImagePanel();
        add(panel);
        pack();  
        setLocationRelativeTo(null);  
    }

    private class ImagePanel extends JPanel {
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(image.getWidth(), image.getHeight());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }

}