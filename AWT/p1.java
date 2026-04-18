import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class p1 extends Frame{
    p1(String name){
       super(name);
       TextField t = new TextField();
       t.setBounds(20,120,150,30);

       Label l = new Label("Hello Friends : ");
       l.setBounds(20,90,150,30);

       Button b = new Button("Click Me!");
       b.setBackground(Color.green);
       b.setForeground(Color.white);
       b.setBounds(20,40,80,30);

       add(t);
       add(l);
       add(b);

    }
    public static void main(String[] args) {
        p1 obj = new p1("SDV");
        obj.setSize(500,500);
        obj.setLayout(null);
        obj.setVisible(true);
        obj.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                obj.dispose();
            }
        });
    }
}