/*Majeed Mirza 2015*/
import javax.swing.*;
import java.awt.*;
public class GradeCalculator
{
    private double in;
    private double worth;
    private double grade;
    private double need;
    private double calc;
    private String out;
    private JFrame f;
    private JPanel p;
    private JPanel p2;
    private JPanel pn;
    private JPanel pc;
    private JPanel ps;
    private JButton b;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    
    public GradeCalculator()
    {       
        f = new JFrame("Grade Calculator");
        p = new JPanel();
        pn = new JPanel();
        pc = new JPanel();
        ps = new JPanel();
        b = new JButton("Go");
        l1 = new JLabel("Enter % grade going in with: ");
        l2 = new JLabel("Enter % exam is worth: ");
        l3 = new JLabel("Enter % you would like to get: ");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t1.setHorizontalAlignment(JTextField.CENTER);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t3.setHorizontalAlignment(JTextField.CENTER);
        MyButtonListener c = new MyButtonListener(this);
        b.addActionListener(c);
        pn.setLayout(new GridLayout(2,1));
        pc.setLayout(new GridLayout(2,1));
        ps.setLayout(new GridLayout(2,1));
        pn.add(l1);
        pn.add(t1);
        pc.add(l2);
        pc.add(t2);
        ps.add(l3);
        ps.add(t3);
        f.setLayout(new GridLayout(1,1));
        p.setLayout(new GridLayout(4,1));
        p.add(pn);
        p.add(pc);
        p.add(ps);
        p.add(b);
        f.add(p);
        b.setSize(20,20);
        f.setVisible(true);
        f.setSize(300,240);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    protected int calculations(){
       try{
            if(changed()) {
                in = Double.parseDouble(t1.getText());
                worth = Double.parseDouble(t2.getText());
                grade = Double.parseDouble(t3.getText());
                double bworth = 100 - worth;
                in = (bworth*in)/100;
                grade = ((grade - in)/worth)*100;
                if(grade>100||grade<0){
                    b.setText("Not Possible");
                    return 0;
                }
                grade = grade*100;
                grade = Math.round(grade);
                grade = grade/100;
                String out = Double.toString(grade);
                b.setText(out);
                return 1;
            }
       } 
       catch (NumberFormatException e){
            b.setText("Please enter numbers only");
       }
       return 0;
    }
    
    public boolean changed() {
         if (t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")){
           b.setText("Please fill all fields");
           return false;
         }
         else {
           return true;
         }

    }

    public static void main(String[] args) {
        new GradeCalculator();
    }
}
