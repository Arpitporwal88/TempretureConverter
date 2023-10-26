import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TConverter extends WindowAdapter implements ActionListener   {
    Frame f;
    Label l0, l1, l2, l3, l4;
    Choice c1, c2;
    TextField t1, t2;
    Button b;
     public TConverter(){
        f=new  Frame ("Tempreture converter");
       l0 = new Label("Tempreture Converter");
        l1 = new Label("To");
        l2 = new Label("Enter the Value:");
        l3 = new Label("Converted Value:");
        l4 = new Label("From");
        c1 = new  Choice ();
             c1.add("Celsius");    
             c1.add("Fahrenheit");     
        c2 = new  Choice ();
             c2.add("Celsius");    
             c2.add("Fahrenheit");    
        t1 = new TextField();
        t2 = new TextField();
        b = new Button("Convert");
        l0.setBounds(75, 80, 230, 20);
        c1.setBounds(200, 145, 100, 20);
        t1.setBounds(65, 145, 100, 20);
        l1.setBounds(200, 180, 50, 20);
        l4.setBounds(200, 125, 50, 20);
        l2.setBounds(65, 125, 100, 20);
        l3.setBounds(63, 180, 100, 20);
        c2.setBounds(200, 200, 100, 20);
        t2.setBounds(65, 200, 100, 20);
        b.setBounds(130, 250, 100, 20);
        b.setBackground(Color.LIGHT_GRAY);
       t2.setEditable(false);
        l0.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setFont(new Font("Arial", Font.BOLD,12));
        l2.setFont(new Font("Arial", Font.BOLD,12));
        l3.setFont(new Font("Arial", Font.BOLD,12));
        l4.setFont(new Font("Arial", Font.BOLD,12));
        b.setFont(new Font("Arial", Font.BOLD,12));
        b.addActionListener(this);
       f.add(l0);
       f.add(c1);
        f.add(c2);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(b); 
       f.addWindowListener(this);
       f.setBackground(Color.YELLOW);
       f.setSize(360,400);  
       f.setLayout(null);  
       f.setVisible(true);  
}
public void windowClosing(WindowEvent e) {
  f.dispose();
}
public void actionPerformed(ActionEvent e){ 
try{
String s1, s2;
            s1 = (String) c1.getSelectedItem();
            s2 = (String) c2.getSelectedItem();
            if (e.getSource() == b) {
                if (s1== "Celsius" && s2 == "Celsius") {
                    t2.setText(""+ t1.getText());
                } 
                else if (s1== "Fahrenheit" && s2 == "Fahrenheit") {
                    t2.setText(""+ t1.getText());
                } 
                else if (s1 == "Celsius" && s2 == "Fahrenheit") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a * 9 / 5) + 32);
                    t2.setText(" "+ b);
                }      
               else if (s1 == "Fahrenheit" && s2 == "Celsius") {
                    String s = t1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32) * 5 / 9);
                    t2.setText(" "+ b);
                } 
            }
}
catch(Exception er){
System.out.print("Invalid number");
}
}

    public static void main(String args[]){  
      new TConverter();  
   }
}     
