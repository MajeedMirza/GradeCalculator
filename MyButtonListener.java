import java.awt.event.*;
public class MyButtonListener implements ActionListener
{
    private GradeCalculator g;
    
    public MyButtonListener(GradeCalculator g)
    {
        this.g = g;
    }

    public void actionPerformed(ActionEvent e)
    {
        g.calculations();
    }
}
