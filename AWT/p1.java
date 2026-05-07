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
        obj.setSize(300,400);
        obj.setVisible(true);
        obj.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                obj.dispose();
            }
        });
    }
}