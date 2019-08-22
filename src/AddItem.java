import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AddItem extends MainMenu implements WindowListener,ActionListener 
{

    public AddItem() 
    {
        super();
    }
    
    public void additem()
    {
        
        f1.addWindowListener(this);
        b11.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
            {
                 try {
                     BufferedWriter addfile = new BufferedWriter(new FileWriter("add.txt",true));
                     String x = th11.getText();
                    // BufferedWriter addfile1 = new BufferedWriter(new FileWriter("D:\\project\\id.txt",true));
                     String y = th12.getText();
                     // BufferedWriter addfile2 = new BufferedWriter(new FileWriter("D:\\project\\price.txt",true));
                     String z = th13.getText();
                     addfile.write("Product Name: "+x);
                     addfile.newLine();
                     addfile.write("Product Id:"+y);
                     addfile.newLine();
                     addfile.write("Product Price:"+z);
                     addfile.newLine();
                     th11.setText("");
                     th12.setText("");
                     th13.setText("");
                     addfile.close();
                     addfile.close();
                     addfile.close();
                     
                 } 
                 catch (IOException ex)
                 {
                     Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
        });
        b12.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
            {
                f1.setVisible(false);
                show();
            }
        });
        b13.addActionListener(this);
        
        f1.setSize(1080,720);
        f1.setLayout(null);
        
        l11.setBounds(170,100,200,30);
        f1.add(l11);
        l11.setText("Product name    ");
        th11.setBounds(380,100,200,30);
        f1.add(th11);
        
        l12.setBounds(170,150,200,30);
        f1.add(l12);
        l12.setText("product id   ");
         th12.setBounds(380,150,200,30);
        f1.add(th12);
        
        l13.setBounds(170,200,200,30);
        f1.add(l13);
        l13.setText("price");
        th13.setBounds(380,200,200,30);
        f1.add(th13);
        
        b11.setBounds(460,250,100,30);
        f1.add(b11);  
        b12.setBounds(340,400,200,30);
        f1.add(b12);//back to main
        b13.setBounds(560,400,100,30);
        f1.add(b13);
        
        l106.setBounds(0, 0,1080,720);
        f1.add(l106);
        
        f1.setVisible(true);
        f.setVisible(false);
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
