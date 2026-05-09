import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class p1 extends Frame
{
    p1(String s)
    {
        super(s);
    }
    public static void main(String[] args) 
    {
        p1 obj = new p1("SDV");
        obj.setVisible(true);
        obj.setSize(400,400);
        obj.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                obj.dispose();
            }
        });    
        obj.setLayout(null);
        Label l = new Label("Enter your name : ");
        l.setBounds(30,50,150,50);
        obj.add(l);
        TextField t = new TextField();
        t.setBounds(200,50,150,50);
        obj.add(t);
        Button b = new Button("Submit");
        b.setBounds(20,130,40,40);
        obj.add(b);
    }
}