import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderItem  extends MainMenu implements WindowListener,ActionListener {
    ArrayList<String> c = new ArrayList<>();

    public OrderItem() {
        super();
    }
     public void orderitem()
    {
        f2.addWindowListener(this);
        b21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try {
                    BufferedWriter ofile = new BufferedWriter(new FileWriter("order.txt",true));
                    BufferedWriter ofile1 = new BufferedWriter(new FileWriter("sc.txt",true));
                    String x = th21.getText();
                    String y = th22.getText();
                    String p = th20.getText();
                    String z = th23.getText();
                    
                    //int x = 0;
                   // int y;
                    if (y != null)
                    {
                        for (int i = 0; i < a.size(); i++)
                        {
                            if (c.get(i).contains(y))
                            {
                                c.add(i,x);
                                break;
                               // ofile1.write("Product Name:"+x+"     ");
                                
                            }
                            else
                            {
                                c.add("Customer Name:"+y+"  Product Name:"+x);
                                break;
                                
                                
                            }
                            
                           
                        }
                        
                         for(int j=0;j<c.size();j++)
                            {
                                ofile1.write(j);
                            }
                         ofile1.close();
                    }
                    
                    
                    ofile.write("Product Name:"+x+"     ");                
                    ofile.write("ordered by: "+y+"     ");
                    ofile.write("ordered customer Id:"+p+"     ");                   
                    ofile.write("Customer Address:"+z);
                    ofile.newLine();
                    th21.setText("");
                    th22.setText("");
                    th20.setText("");
                    th23.setText("");
                    ofile.close();
                    ofile.close();
                    ofile.close();
                    ofile.close();
                } catch (IOException ex) {
                    Logger.getLogger(OrderItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });//enter button
        b22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                f2.setVisible(false);
                show();
            }
        });
        b23.addActionListener(this);
        th21.addActionListener(this);
        th22.addActionListener(this);
        th23.addActionListener(this);
        
        f2.setSize(1080,720);
        f2.setLayout(null);
        
        l21.setBounds(170,100,200,30);
        f2.add(l21);
        th21.setBounds(380,100,200,30);
        l21.setText("product Name    ");
        f2.add(th21);
        
        l22.setBounds(170,150,200,30);
        f2.add(l22);
        th22.setBounds(380,150,200,30);
        l22.setText("Customer name   ");
        f2.add(th22);
        
        l20.setBounds(170,200,200,30);
        f2.add(l20);
        l20.setText("Customer name id   ");
        th20.setBounds(380,200,200,30);
        f2.add(th20);
        
        l23.setBounds(170,250,200,30);
        f2.add(l23);
        l23.setText("Customer address    ");
        th23.setBounds(380,250,200,30);
        f2.add(th23);
 
        b21.setBounds(460,300,100,30);
        f2.add(b21);
        
        b22.setBounds(340,400,200,30);
        f2.add(b22);
        b23.setBounds(560,400,100,30);
        f2.add(b23);
       
        l101.setBounds(0, 0,1080,720);
        f2.add(l101);
        
        f.setVisible(false);
        f2.setVisible(true);
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
