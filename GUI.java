import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI{

private static int count;
public static void main(String args[]){

JFrame frame = new JFrame ("GUI ");
JButton button = new JButton("increment by 1");
JLabel label = new JLabel ("Counter:");

button.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
count++;
label.setText("counter :"+ count);
}
});

frame.add(button);
frame.add(label);

frame.setLayout(new FlowLayout());
frame.setSize(500, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

}}