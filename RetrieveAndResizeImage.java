/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parabitnbbms;


import java.sql.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RetrieveAndResizeImage {

    public static void main(String[] args) {
        ParabitDB obj1 = new ParabitDB();
        String query = "SELECT photo FROM donorregistration WHERE did = ?";
        try (Connection conn = obj1.stm.getConnection();
             PreparedStatement pst = conn.prepareStatement(query)) {

            // Set the donor ID for which you want to retrieve the image
            pst.setString(1, "2"); // Replace 'your_donor_id' with the actual ID

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                byte[] imgBytes = rs.getBytes("photo");

                if (imgBytes != null) {
                    // Convert byte array to BufferedImage
                    ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes);
                    BufferedImage bImage = ImageIO.read(bis);

                    // Resize the image to fit the JLabel
                    Image scaledImage = bImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH); // Set desired width and height

                    // Convert scaled image to ImageIcon and display in JLabel
                    ImageIcon icon = new ImageIcon(scaledImage);
                    JLabel imageLabel = new JLabel();
                    imageLabel.setIcon(icon);

                    // Display the image in a frame or panel
                    javax.swing.JFrame frame = new javax.swing.JFrame();
                    frame.setSize(300, 300);
                    frame.add(imageLabel);
                    frame.setVisible(true);
                } else {
                    System.out.println("No image found for the specified donor ID.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


