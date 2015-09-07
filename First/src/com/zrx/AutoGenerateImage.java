package com.zrx;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by zhang on 2015/9/4.
 */
public class AutoGenerateImage {
    public static void main(String[] args) {
        autoGenerateImage();
    }

    private static void autoGenerateImage() {
        BufferedImage bufferedImage = new BufferedImage(150, 100, BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();
        graphics2D.setColor(Color.magenta);
        graphics2D.fillRect(0, 0, 150, 100);
        graphics2D.setColor(Color.cyan);
        graphics2D.drawRect(0, 0, 150 - 1, 100 - 1);
        graphics2D.setFont(new Font("楷体",Font.BOLD+Font.ITALIC,34));
        graphics2D.drawString("你好",40,50);
        try {
            ImageIO.write(bufferedImage, "jpeg", new FileOutputStream("auto.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
