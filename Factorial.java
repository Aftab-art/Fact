import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Factorial.class" width=300 height=300>
 * </applet>
*/
public class Factorial extends Applet implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1;
    public void init()
    {
        l1=new Label("ENTER THE VALUE");
        add(l1);
        t1=new TextField(15);
        add(t1);
        l2=new Label("FACTORIAL VALUE");
        add(l2);
        t2=new TextField(15);
        add(t2);
        B1=new Button("compute");
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int value=Integer.parseInt(t1.getText());
            int fact=Factorial(value);
            t2.setText(String.value(fact));
        }
    }
    int fact(int x)
    {
        if(x==0)
        return 1;
        else
        return x*fact(x-1);
    }
}