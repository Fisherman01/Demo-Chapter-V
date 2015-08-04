package paint;

import main.DemoHoofdstukV;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

/**
 * Created by avisser on 30-7-2015.
 */
public class DrawItems extends JPanel {
    DemoHoofdstukV controller;

    public DrawItems(DemoHoofdstukV controller) {
        this.controller = controller;

    }


    @Override
    public void paintComponent(Graphics g) {
          super.paintComponent(g);
          this.drawGallows(g);

        if(controller.isHead){
            this.drawHead(g);
        }
        if(controller.isBody) {
            this.drawBody(g);
        }
        if(controller.isLeftArm) {
            this.drawLeftArm(g);
        }
        if(controller.isRightArm) {
            this.drawRightArm(g);
        }
        if(controller.isLeftLeg) {
            this.drawLeftLeg(g);
        }
        if(controller.isRightLeg) {
            this.drawRightLeg(g);
        }

    }

    public void drawGallows(Graphics g){
        g.setColor(Color.black);
        g.drawRect(10, 10, 25, 300);
        g.drawRect(10, 10, 200, 25);
        g.setColor(Color.darkGray);
        g.fillRect(11, 11, 24, 300);
        g.fillRect(11, 11, 199, 24);
    }

    public void drawHead(Graphics g){
        g.setColor(Color.black);
        g.fillRect(200, 35, 2, 40);
        g.fillOval(180, 75, 40, 40);
       // g.drawRect(200, 35, 2, 40);
       // g.drawOval(180, 75, 40, 40);

    }

    public void drawBody(Graphics g){
        g.setColor(Color.black);
        g.fillOval(180, 115, 40, 80);
       // g.drawOval(180, 115, 40, 80);
    }

    public void drawLeftArm(Graphics g){
        g.setColor(Color.black);
        g.fillRect(150, 120, 40, 2);
      //  g.drawRect(150, 120, 40, 2);
    }

    public void drawRightArm(Graphics g){
        g.setColor(Color.black);
        g.fillRect(210, 120, 40, 2);
        //g.drawRect(210, 120, 40, 2);
    }

    public void drawLeftLeg(Graphics g){
        g.setColor(Color.black);
        g.fillRect(190, 190, 2, 45);
       // g.drawRect(190, 190, 2, 45);
    }

    public void drawRightLeg(Graphics g){
        g.setColor(Color.black);
        g.fillRect(208, 190, 2, 45);
        //g.drawRect(208, 190, 2, 45);
    }


}
