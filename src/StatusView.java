import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StatusView extends MainMenu implements WindowListener,ActionListener
{
   
    public StatusView() {
        super();
        
    }
    
    public void status()
    {
        f3.addWindowListener(this);
        
          b34.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                a31.setText("");
            }
        });
        
        b31.addActionListener(new ActionListener(){           
            public void actionPerformed(ActionEvent e)
            {
                
              if(c31.isSelected())
              {
                  try {
                       
                       Scanner scan=new Scanner(System.in);
                       x = new BufferedReader(new FileReader("order.txt"));
                       String p = new Scanner(x).useDelimiter("\\Z").next();
                       a31.append(p);
                       a31.append("\n");
                       x.close();
                   } 
                    catch (FileNotFoundException ex) {
                       Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   catch (IOException ex) {
                       Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                   }
              }
               
              
               if(c32.isSelected())
               {
                    try {
                    x = new BufferedReader(new FileReader("shiped.txt"));
                    String aa = new Scanner(x).useDelimiter("\\Z").next();
                    a31.append(aa);
                    a31.append("\n");
                    x.close();
                 
                    
                } catch (FileNotFoundException ex) {
                   // Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                   // Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
               
               
               if(c33.isSelected())
               {
                    try {
                    x = new BufferedReader(new FileReader("delevere.txt"));
                    String b = new Scanner(x).useDelimiter("\\Z").next();
                    a31.append(b);
                    a31.append("\n");
                    x.close();
                 
                    
                } catch (FileNotFoundException ex) {
                   // Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                   // Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
                   
                  
            }
           
        });//enter button
        
        b35.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                f3.setVisible(false);
                show();
            }
        });
        
        /* b32.addActionListener(new ActionListener(){           
            public void actionPerformed(ActionEvent e)
            {
                try {
                    x = new BufferedReader(new FileReader("shiped.txt"));
                    String aa = new Scanner(x).useDelimiter("\\Z").next();
                    a32.append(aa);
                    a32.append("\n");
                    x.close();
                 
                    
                } catch (FileNotFoundException ex) {
                   // Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                   // Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
         });
         
          b33.addActionListener(new ActionListener(){           
            public void actionPerformed(ActionEvent e)
            {
                try {
                    x = new BufferedReader(new FileReader("delevere.txt"));
                    String b = new Scanner(x).useDelimiter("\\Z").next();
                    a33.append(b);
                    a33.append("\n");
                    x.close();
                 
                    
                } catch (FileNotFoundException ex) {
                   // Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                   // Logger.getLogger(StatusView.class.getName()).log(Level.SEVERE, null, ex);
                }
                  }
            
         });*/
                
        
        f3.setSize(1080,720);
        f3.setLayout(null);
        
        f3.add(b34);
        b34.setBounds(350,450,100,30);
        l100.setBounds(150,150,100,30);
        f3.add(l100);
        c31.setBounds(150,200,120,30);
        f3.add(c31);
        c32.setBounds(150,250,120,30);
        f3.add(c32);
        c33.setBounds(150,300,120,30);
        f3.add(c33);
        b31.setBounds(200,350,100,30);
        f3.add(b31);
        
        a31.setBounds(450,150,450,200);
        f3.add(a31);
        
        b35.setBounds(350,500,200,30);
        f3.add(b35);
        
         l102.setBounds(0, 0,1080,720);
        f3.add(l102);
        
        f.setVisible(false);
        f3.setVisible(true);
    }
    
     public void actionPerformed(ActionEvent e)
    {          
        String s=e.getActionCommand();
       
        if(s.equals("Exit"))
        {
            System.exit(0);
        }

    } 
}
