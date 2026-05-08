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
        Button b = new Button("Click!");
        b.setBounds(300,222,30,40);
        obj.add(b);
    }
}