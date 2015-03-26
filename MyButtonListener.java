import java.awt.event.*;
public class MyButtonListener implements ActionListener
{
    private GradeCalculator g;
    /**
     * Constructor for objects of class MyButtonListener
     */
    public MyButtonListener(GradeCalculator g)
    {
        this.g = g;
    }

    public void actionPerformed(ActionEvent e)
    {
        g.calculations();
    }
}
