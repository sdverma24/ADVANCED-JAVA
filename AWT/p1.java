import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class p1 extends Frame implements WindowListener
{
    p1(String s)
    {
        super(s);
        addWindowListener(this);
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

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing Window");
    }
}