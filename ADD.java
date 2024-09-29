import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ADD{

public static int count1;
public static int count2;
public static int total;

public static void main(String args[]){

JFrame frame = new JFrame("ADDITION");
JButton button1 =new JButton ("increment1");
JButton button2= new JButton("increment2");
JLabel label1= new JLabel();
JLabel label2= new JLabel("+");
JLabel label3= new JLabel();
JLabel label4= new JLabel("=");
JLabel label5= new JLabel();

button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
count1++;
total=count1 + count2;
label1.setText(""+count1);
label5.setText(""+total);
}
});

button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
count2++;
total=count1 + count2;
label3.setText(""+count2);
label5.setText(""+total);

}
});



frame.add(button1);
frame.add(button2);
frame.add(label1);
frame.add(label2);
frame.add(label3);
frame.add(label4);
frame.add(label5);

frame.setSize(700,300);
frame.setLayout(new FlowLayout());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);


}}