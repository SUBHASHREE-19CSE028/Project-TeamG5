/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author Team5
 */
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class coins {

    /**
     * @param args the command line arguments
     */
    
    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    int j;
    int i;

      public  static final String song="C:\\Users\\SUBHAHARINI\\Documents\\NetBeansProjects\\Word-O-Word Galaxy\\src\\Project\\coinssoundeffect.mp3";
    MP3Player m=new MP3Player(new File(song));
   
    
    @SuppressWarnings("LeakingThisInConstructor")
    public coins(int j)
    {
        //Font
        Font ff=new Font("Bernard MT Condensed",Font.BOLD+Font.ITALIC,32);
        m.play();
        f=new JFrame();
        
        //Labels
        this.i=i;
        this.j=j;
        if(j<=9)
        {
          if(j==1) 
          {
              i=20;
              l1=new JLabel("Hurrah!You have won the Level "+j);
              l3=new JLabel("You have collected "+i+" coins");
          }
          
          if(j==2)
          {
             i=20;
             i=i+20;
             l1=new JLabel("Hurrah!You have won the Level "+j);
             l3=new JLabel("You have collected "+i+" coins");
          }
          if(j==3)
          {
              i=40;
             i=i+20;
             l1=new JLabel("Hurrah!You have won the Level "+j);
             l3=new JLabel("You have collected "+i+" coins");
          }
          if(j==4)
          {
             i=60; 
             i=i+30;
             l1=new JLabel("Hurrah!You have won the Level "+j);
             l3=new JLabel("You have collected "+i+" coins");
          }
          if(j==5)
          {
             i=90;
             i=i+30;
             l1=new JLabel("Hurrah!You have won the Level "+j);
             l3=new JLabel("You have collected "+i+" coins");
          }
          if(j==6)
          {
             i=120;
             i=i+30;
             l1=new JLabel("Hurrah!You have won the Level "+j);
             l3=new JLabel("You have collected "+i+" coins");
          }
          if(j==7)
          {
             i=150;
             i=i+50;
             l1=new JLabel("Hurrah!You have won the Level "+j);
             l3=new JLabel("You have collected "+i+" coins");
          }
          if(j==8)
          {
              i=200;
             i=i+50;
             l1=new JLabel("Hurrah!You have won the Level "+j);
             l3=new JLabel("You have collected "+i+" coins");
          }
           if(j==9)
          {
              i=250;
             i=i+50;
             l1=new JLabel("Hurrah!You have won the Level "+j);
             l3 = new JLabel("You have collected "+i+" coins finally");
            
          }
        }
     
        l1.setBounds(350,100,600,100);
        l1.setFont(ff);
        l1.setForeground(Color.cyan);
        
        
        l2=new JLabel();
        l2.setBounds(350,200,500,500);
        l2.setIcon(new ImageIcon(this.getClass().getResource("coins_bckgd.gif")));
        
        
     
        l3.setBounds(400,700,600,100);
        
        l3.setForeground(Color.cyan);
        l3.setFont(ff);
        
        l4=new JLabel(new ImageIcon("C:\\Users\\SUBHAHARINI\\Documents\\NetBeansProjects\\Word-O-Word Galaxy\\src\\Project\\coins_background.jpg"));
    
        l4.setBounds(0, 0, 1286, 957);
       
        f.add(l1);
        f.add(l2);
        f.add(l3);
        
        f.add(l4);
       
       
        
        
        
        f.setSize(1286,957);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // level_call(i-1);
    }
    
        
       
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}

