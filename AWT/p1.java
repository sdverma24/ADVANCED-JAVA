import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class p1 extends Frame
{
    p1(String s)
    {
        super(s);
    }
    public void windowClosing(WindowEvent e)
    {
       Frame frame = (Frame)e.getSource();
       frame.dispose();
    }
    public static void main(String args[])
    {
        p1 obj = new p1("SDV");
        obj.setSize(300,300);
        obj.setVisible(true);
        obj.setLayout(null);
        obj.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        Button b = new Button("oK");
        b.setBounds(20,20,100,100);
        obj.add(b);
    }
}