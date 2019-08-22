
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class personalItem extends OrderItem implements WindowListener, ActionListener {

    ArrayList<String> a = new ArrayList<>();
    ArrayList<String> b = new ArrayList<>();
    ArrayList<String> c = new ArrayList<>();

    public personalItem() {
        super();
        try {
            Scanner s = new Scanner(new File("order.txt"));

            while (s.hasNext()) {
                a.add(s.nextLine());
               // System.out.println(a);

            }
            Scanner t = new Scanner(new File("shiped.txt"));

            while (t.hasNext()) {
                b.add(t.nextLine());
               // System.out.println(b);

            }
            Scanner u = new Scanner(new File("delevere.txt"));

            while (u.hasNext()) {
                c.add(u.nextLine());
                System.out.println(c);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(personalItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void personal() {

        b51.addActionListener(new ActionListener() {      //Serch button to show

            public void actionPerformed(ActionEvent e) {

                BufferedReader xx;
                BufferedReader yy;
                BufferedReader zz;
                t51.setText("");
                t52.setText("");
                t53.setText("");
                try {
                    xx = new BufferedReader(new FileReader("order.txt"));
                    String aa = new Scanner(xx).useDelimiter("\\Z").next();
                    String search = th51.getText();
                    // ArrayList<String> a=new ArrayList<>();
                    System.out.println(search);
                    int x = 0;
                    int y = 0;
                    if (search != null) {
                        for (int i = 0; i < a.size(); i++) {
                            if (a.get(i).contains(search)) {
                                x = 1;
                                t51.append(a.get(i));
                                t51.append("\n");

                            }
                        }
                    }
                    if (x == 0) {
                        t51.setText("NO AVAILABLE ORDER FOR THIS CUSTOMER ");
                    }
                    yy = new BufferedReader(new FileReader("shiped.txt"));
                    String bb = new Scanner(yy).useDelimiter("\\Z").next();
                    //String search = th51.getText();
                    // ArrayList<String> a=new ArrayList<>();
                    System.out.println(search);
                    int yx = 0;
                    int yz = 0;
                    if (search != null) {
                        for (int i = 0; i < b.size(); i++) {
                            if (b.get(i).contains(search)) {
                                yx = 1;
                                t52.append(b.get(i));
                                t52.append("\n");

                            }
                        }
                    }
                    if (yx == 0) {
                        t52.setText("NO AVAILABLE ORDER FOR THIS CUSTOMER ");
                    }
                    zz = new BufferedReader(new FileReader("delevere.txt"));
                    String cc = new Scanner(zz).useDelimiter("\\Z").next();
                    //String search = th51.getText();
                    // ArrayList<String> a=new ArrayList<>();
                    System.out.println(search);
                    int zx = 0;
                    int zy = 0;
                    if (search != null) {
                        for (int i = 0; i < c.size(); i++) {
                            if (c.get(i).contains(search)) {
                                zx = 1;
                                t53.append(c.get(i));
                                t53.append("\n");

                            }
                        }
                    }
                    if (zx == 0) {
                        t53.setText("NO AVAILABLE ORDER FOR THIS CUSTOMER ");
                    }
                    

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(personalItem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(personalItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        b53.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f5.setVisible(false);
                show();
            }
        });
        b54.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                th51.setText("");
            }
        });

        f5.setSize(1080, 720);
        f5.setLayout(null);
        
        l51.setBounds(350,50,100,30);
        f5.add(l51);
        th51.setBounds(460,50,120,30);
        f5.add(th51);
        b51.setBounds(600,50,100,30);
        f5.add(b51);
        
        f5.add(b54);
        
        l52.setBounds(50,100,150,30);
        f5.add(l52);
        t51.setBounds(50,130,327,150);
        f5.add(t51);

        l53.setBounds(380,100,150,30);
        f5.add(l53);
        t52.setBounds(380,130,327,150);
        f5.add(t52);

        l54.setBounds(710,100,150,30);
        f5.add(l54);
        t53.setBounds(710,130,327,150);
        f5.add(t53);

        b54.setBounds(400,350,100,30);
        f5.add(b54);
        
        b53.setBounds(350,400,200,30);
        f5.add(b53);
        b52.setBounds(400,450,100,30);
        f5.add(b52);
       
         l104.setBounds(0, 0,1080,720);
        f5.add(l104);
        
        f5.setVisible(true);
        f.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        String q = e.getActionCommand();

        if (q.equals("Exit")) 
        {
            System.exit(0);
        }

    }
}
