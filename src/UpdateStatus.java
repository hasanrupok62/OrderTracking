
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class UpdateStatus extends MainMenu implements WindowListener, ActionListener {

    ArrayList<String> a = new ArrayList<>();
    ArrayList<String> b = new ArrayList<>();
    String search;

    public UpdateStatus() 
    {
        super();
        
        try {

            // BufferedReader bis = new BufferedReader(new FileReader("D:\\project\\order.txt"));
            Scanner s = new Scanner(new File("order.txt"));
            Scanner z = new Scanner(new File("shiped.txt"));
            //String s1;
            while (s.hasNext()) {
                a.add(s.nextLine());
               // System.out.println(a);
            }
            while(z.hasNext()) {
                b.add(z.nextLine());
               // System.out.println(b);
            }
            s.close();
            z.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    public void update() 
    {
        f4.addWindowListener(this);

        b43.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                f4.setVisible(false);
                show();
            }
        });

        f4.setSize(1080, 720);
        f4.setLayout(null);
        
        l41.setBounds(50,50,150,30);
        f4.add(l41);
        th41.setBounds(220,50,120,30);
        f4.add(th41);
        b41.setBounds(360,50,100,30);
        f4.add(b41);
        a41.setBounds(50,100,420,100);
        f4.add(a41);
         c42.setBounds(50,220,100,30);
        f4.add(c42);
        c43.setBounds(160,220,100,30);
        f4.add(c43);
        b46.setBounds(300,220,100,30);
        f4.add(b46);
        l44.setBounds(50,260,200,30);
        f4.add(l44);
        a42.setBounds(50,300,420,100);
        f4.add(a42);
       
          
        f4.add(l42);
        
        b43.setBounds(630,300,200,30);
        f4.add(b43);

        //****************to check if it contains or not*******************************
        b41.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
                BufferedReader bis = null;
                a41.setText("");
                a42.setText("");
                try {
                    search = th41.getText();
                    System.out.println(search);
                    int x = 0;
                    int y = 0;
                    if (search != null) {
                        for (int i = 0; i < a.size(); i++) {
                            if (a.get(i).contains(search)) {
                                x = 1;
                                a41.append(a.get(i));
                                a41.append("\n");
                                break;
                            }
                        }
                        
                        if (x == 0 ) {
                            a41.setText("You Dont have such product in recieved Status ");
                            th41.setText("");
                       
                         for (int j = 0; j < b.size(); j++) {
                            if (b.get(j).contains(search)) {
                                y = 1;
                                a42.setText(b.get(j));
                                a42.append("\n");
                                break;
                            }
                         }
                        }
                        if (y == 0 && x== 0) {
                            a41.setText("You Dont have such product in recieved or delevired Status ");
                            a42.setText("You Dont have such product in  delevired Status ");
                            th41.setText("");
                        }
                    
                    
                    bis.close();
                    } 
                }
                    catch (Exception ex) {
                    // Logger.getLogger(UpdateStatus.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                UpdateStatus uss=new UpdateStatus();
            }
        });
        //********************************2nd enter works*********************************
        b46.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
               
                
                 
                if (c42.isSelected()) {
                    search = th41.getText();
                    BufferedWriter bw = null;
                    BufferedWriter bww = null;
                    
                    try {
                        bw = new BufferedWriter(new FileWriter("order.txt"));
                        bww = new BufferedWriter(new FileWriter("shiped.txt",true));
                        int x = 0;

                        for (int i = 0; i < a.size(); i++) {
                            if (a.get(i).contains(search)) {
                                x = 1;
                                bww.write(a.get(i));
                                bww.newLine();
                                b.add(i,a.get(i));
                                a.remove(i);

                                break;
                            }
                        }
                        
                    
                        if(x != 0) {
                            th41.setText(null);
                            for (int i = 0; i < a.size(); i++) { 
                                bw.write(a.get(i));
                                 bw.flush();
                                bw.write("\n");
                            }
                            bw.close();
                        }
                        if (a.isEmpty()) {
                            th41.setText(" ");

                        }
                         bw.close();
                    } catch (Exception ex) {
                        //Logger.getLogger(UpdateStatus.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            bw.close();
                            bww.close();
                        } catch (Exception ex) {
                            // Logger.getLogger(UpdateStatus.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
/*
                ***********************Shiped to delivered********************
                */
            if (c43.isSelected()) {
                   // search = th41.getText();
                    BufferedWriter bw1 = null;
                    BufferedWriter bww2 = null;
                    try {
                        bw1 = new BufferedWriter(new FileWriter("shiped.txt"));
                        bww2 = new BufferedWriter(new FileWriter("delevere.txt",true));
                        int a = 0;
                        int p = b.size() + 1;
                        for (int i = 0; i < p; i++) {
                            if (b.get(i).contains(search)) {
                                a = 1;
                               // bww.newLine();
                                bww2.write(b.get(i));
                                bww2.newLine();
                                //a42.setText((a.get(i)) + "\n\n\n IS ADDED TO SHIPED");
                                b.remove(i);

                                break;
                            }

                        }
                       
                         if(a != 0){
                            th41.setText(null);
                            for (int i = 0; i < b.size(); i++) {
                                
                                bw1.write(b.get(i));
                                bw1.flush();
                                bw1.write("\n");
                            }
                            bw1.close();
                        }
                        if (b.isEmpty()) {
                            th41.setText(" ");

                        }
                        bw1.close();
                    } catch (Exception ex) {
                        //Logger.getLogger(UpdateStatus.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            bw1.close();
                            bww2.close();
                        } catch (Exception ex) {
                            // Logger.getLogger(UpdateStatus.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                    UpdateStatus uss=new UpdateStatus();
            }
        });
        
         l103.setBounds(0, 0,1080,720);
        f4.add(l103);
        
        f.setVisible(false);
        f4.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("Exit")) {
            System.exit(0);
        }

    }
}
