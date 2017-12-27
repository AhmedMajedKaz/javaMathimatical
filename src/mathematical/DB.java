package mathematical;

import java.awt.*;
import javax.imageio.*;
import javax.swing.JOptionPane;

public class DB {
    
    
    public Image imagea(boolean s,int h,int w){
        Image imga;
        Image img = null;
        try{
        if(s){
           imga = ImageIO.read(getClass().getResource("true.jpg"));
           img = imga.getScaledInstance(w, h, Image.SCALE_AREA_AVERAGING);
        }
        else{
           imga = ImageIO.read(getClass().getResource("false.jpg"));
           img = imga.getScaledInstance(w, h, Image.SCALE_AREA_AVERAGING);
        }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return img;
    }
    
    public Image[] imgh(int h,int hi,int w){
        Image img1 = null;
        Image img2 = null;
        Image img3 = null;
        try{
        if(h == 0){
            img1 = ImageIO.read(getClass().getResource("black heart.jpg"));
            img2 = ImageIO.read(getClass().getResource("black heart.jpg"));
            img3 = ImageIO.read(getClass().getResource("black heart.jpg"));
        }
        else if(h == 1){
            img1 = ImageIO.read(getClass().getResource("heart.jpg"));
            img2 = ImageIO.read(getClass().getResource("black heart.jpg"));
            img3 = ImageIO.read(getClass().getResource("black heart.jpg"));
        }
        else if(h == 2){
            img1 = ImageIO.read(getClass().getResource("heart.jpg"));
            img2 = ImageIO.read(getClass().getResource("heart.jpg"));
            img3 = ImageIO.read(getClass().getResource("black heart.jpg"));
        }
        else if(h == 3){
            img1 = ImageIO.read(getClass().getResource("heart.jpg"));
            img2 = ImageIO.read(getClass().getResource("heart.jpg"));
            img3 = ImageIO.read(getClass().getResource("heart.jpg"));
        }
        else if(h == 4){
            img1 = ImageIO.read(getClass().getResource("golden heart.jpg"));
            img2 = ImageIO.read(getClass().getResource("heart.jpg"));
            img3 = ImageIO.read(getClass().getResource("heart.jpg"));
        }
        else if(h == 5){
            img1 = ImageIO.read(getClass().getResource("golden heart.jpg"));
            img2 = ImageIO.read(getClass().getResource("golden heart.jpg"));
            img3 = ImageIO.read(getClass().getResource("heart.jpg"));
        }
        else if(h == 6){
            img1 = ImageIO.read(getClass().getResource("golden heart.jpg"));
            img2 = ImageIO.read(getClass().getResource("golden heart.jpg"));
            img3 = ImageIO.read(getClass().getResource("golden heart.jpg"));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Image imgg1 = img1.getScaledInstance(w, hi, Image.SCALE_AREA_AVERAGING);
        Image imgg2 = img2.getScaledInstance(w, hi, Image.SCALE_AREA_AVERAGING);
        Image imgg3 = img3.getScaledInstance(w, hi, Image.SCALE_AREA_AVERAGING);
        return new Image[]{imgg1,imgg2,imgg3};
    }
    
    
}
