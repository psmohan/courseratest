import javax.swing.*;
public class swing
{
  public static void main(String[] args) {
    JFrame f=new JFrame();
    JLabel l1=new JLabel("hai start learning the swing");
    f.setVisible(true);
    JButton b=new JButton("click chei ra babu");
    b.setBounds(100, 200, 200,40);
    f.add(b);
    f.add(l1);
    f.setLayout(null);
    f.setSize(400, 400);
   }
}
