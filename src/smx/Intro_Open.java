/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smx;

/**
 *
 * @author Engr. Balogun Gift
 */
public class Intro_Open {
    
    
    public static void main (String[] args) {
        Intro io=new Intro();
        io.setVisible(true);
        Choose ch=new Choose();
               
               try {
                   for (int i = 0; i <=100; i++){
                       Thread.sleep(40);
                       io.txt_num_loading.setText(Integer.toString(i)+"%");
                       if(i==100){
                           io.setVisible(false);
                           ch.setVisible(true);
                       }
                   }
               } catch (Exception e) {
                   
               }
    }
    
}
