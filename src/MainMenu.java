import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
public class MainMenu implements WindowListener,ActionListener{
    
    ArrayList<String> a;
    public String name;
    public String id;
    public String price;
    
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6;
    
    JFrame f1;//for add item
    JButton b11,b12,b13;
    TextField th11,th12,th13,th14;
    Label l11,l12,l13,l14;
    
    JFrame f2;//for order item
    Label l20,l21,l22,l23;
    JButton b21,b22,b23;
    TextField th20,th21,th22,th23;
    
    JFrame f3;//for status view
    JLabel l100;
    JButton b31,b32,b33,b34,b35;
    TextArea a31,a32,a33;
    JCheckBox c31,c32,c33;
    BufferedReader x;
    
    JFrame f4;//for Update Status
    JButton b41,b42,b43,b44,b45,b46;
    TextArea a41,a42,a43;
    JCheckBox c41,c42,c43;
    Label l41,l42,l43,l44,l45,l46;
    TextField th41;
    
    JFrame f5;//for personal iinfo
    JButton b51, b52,b53,b54;
    TextArea t51,t52,t53;
    TextField th51;
    Label l51,l52,l53,l54;
    
    ImageIcon img111,img2,img3,img4,img5,img6;
    JLabel l00,l101,l102,l103,l104,l105,l106;
    
    
    public MainMenu()
    {
       
        
        img111=new ImageIcon("a.jpg");
        img2=new ImageIcon("b.jpg");
        img3=new ImageIcon("c.jpg");
        img4=new ImageIcon("d.jpg");
        img5=new ImageIcon("e.jpg");
        img6=new ImageIcon("f.jpg");
        
        l00=new JLabel(img111);
        l106=new JLabel(img2);
        l101=new JLabel(img3);
        l102=new JLabel(img4);
        l103=new JLabel(img5);
        l104=new JLabel(img6);
        
        
        
        
        
        f=new JFrame("Order Tracking");
        b1=new JButton("Add new Item");
        b2=new JButton("Order New Item");
        b3=new JButton("View Ordering Status");
        b4=new JButton("Update Item Status");
        b5=new JButton("Specific Customer Ordered");
        b6=new JButton("Exit");
        a=new ArrayList<>();
	
        
        f1=new JFrame("add new Item");
        b12=new JButton("Back To main Menu");
        b13=new JButton("Exit");        
        l11=new Label();
        th11= new TextField(30);
        l12=new Label();
        th12= new TextField(30);
        l13=new Label();
        th13= new TextField(30);
        l14=new Label();
        th14= new TextField(30);
        b11=new JButton("Enter");
        
        f2=new JFrame("Order New Item");
        b21=new JButton("Enter");
        b22=new JButton("Back to Main Menu");
        b23=new JButton("Exit");
        l20=new Label();
        l21=new Label();
        l22=new Label();
        l23=new Label();
        th20=new TextField(30);
        th21=new TextField(30);
        th22=new TextField(30);
        th23=new TextField(30);
        
        //x=new BufferedReader();
        f3=new JFrame("Status view");// Status view
        b31=new JButton("Enter");
        b34=new JButton("Clear Text");
        c31=new JCheckBox("View Receved");
        c32=new JCheckBox("View Shipped");
        c33=new JCheckBox("View Delevered");
        b35=new JButton("Back To main Menu");
        l100=new JLabel("Choose to see");
        a31= new TextArea();
        
        a32= new TextArea();
        a33= new TextArea();
        
        
        
        f4=new JFrame("Update Status");
        b41=new JButton("Enter");
        b46=new JButton("Enter");
        b43=new JButton("Back To main Menu");
        l41= new Label("Search By CustomerId");
        c42= new JCheckBox("shipped");
        l42= new Label("Want to delevered/shiped");
        c43= new JCheckBox("delevered");
        l43= new Label("Delevered Item");
        a41= new TextArea();
        a42= new TextArea();
        a43= new TextArea();
        l44= new Label("available shipping order");
        l45= new Label("available delevered order");
        th41= new TextField(30);
        
        f5=new JFrame("Display Specific Customer Ordered Item ");
        b51 = new JButton("Search");
        b52=new JButton("Exit");
        b53=new JButton("Back To main Menu");
        b54=new JButton("Clear text data");
        th51=new TextField(30);
        t51=new TextArea();
        t52=new TextArea();
        t53=new TextArea();
        l51= new Label("Customer Name");
        l52= new Label("Recieved Item");
        l53= new Label("shipped Item");
        l54= new Label("Delevered Item");
         f.addWindowListener(this);
        
        
        
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
        
        
        b1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                //f1.setVisible(true);
                f.setVisible(false);
                AddItem b = new AddItem();
                b.additem();
                
            }
        });
        b2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                f.setVisible(false);
                OrderItem c = new OrderItem();
                c.orderitem();
            }
        });
        b3.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                f.setVisible(false);
                StatusView d = new StatusView();
                d.status();
            }
        });
        b4.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e)
           {
               f.setVisible(false);
               UpdateStatus r = new UpdateStatus();
               r.update();
           }
       });
        b5.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                f.setVisible(false);
                personalItem q = new personalItem();
                q.personal();
            }
        });
        
        f.addMouseListener(new MouseAdapter() {				
			public void mouseClicked(MouseEvent e){
				//System.out.println(e.getX()+"..."+e.getY());
			}
		});
        
       
        
        
    }
    
    public void show()
    {
        f.setSize(1080,720);
        f.setLayout(null);
         b1.setBounds(120,209,200,50);
        f.add(b1);
        b2.setBounds(120,270,200,50);
        f.add(b2);
        b3.setBounds(430,209,200,50);
        f.add(b3);
        b4.setBounds(430,270,200,50);
        f.add(b4);
        b5.setBounds(740,209,200,50);
        f.add(b5);
        b6.setBounds(740,270,200,50);
        f.add(b6);
        
        l00.setBounds(0, 0,1080,720);
        f.add(l00);
        
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        MainMenu aaa = new MainMenu();
        aaa.show();
    }


    @Override
    public void windowOpened(WindowEvent e) {
       }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
       }

    @Override
    public void windowClosed(WindowEvent e) {
        
        }

    @Override
    public void windowIconified(WindowEvent e) {
       }

    @Override
    public void windowDeiconified(WindowEvent e) {
        }

    @Override
    public void windowActivated(WindowEvent e) {
        }

    @Override
    public void windowDeactivated(WindowEvent e) {
        }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("Exit")) {
            System.exit(0);
        }

    }
    
}
