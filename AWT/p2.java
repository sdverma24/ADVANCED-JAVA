import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class MyFrame extends JFrame implements ItemListener 
{ 
JCheckBox jcb,jcb1,jcb2; 
JLabel jl; 
MyFrame() 
{ 
setLayout(new FlowLayout()); 
jl=new JLabel(); 
jcb=new JCheckBox("VRSEC"); 
jcb1=new JCheckBox("PVPSIT"); 
jcb2=new JCheckBox("BEC" ); 
add(jcb); add(jcb1); add(jcb2); add(jl); 
jcb.addItemListener(this); 
jcb1.addItemListener(this); 
jcb2.addItemListener(this); 
} 
public void itemStateChanged(ItemEvent ie) { 
JCheckBox jc=(JCheckBox)ie.getItem(); 
jl.setText("You Selected :"+jc.getText() ); 
} 


public static void main(String arg[]) 
{ 
MyFrame f=new MyFrame(); 
f.setTitle("Welcome to Swings"); 
f.setSize(500,500); 
f.setVisible(true); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
} 
