import javax.swing.*;

public abstract class MyJpanel extends Text implements Interface{

    public void jpanel(){
        JFrame frame= new JFrame("CV");
        frame.getContentPane().add(new Main());
        frame.setSize(800, 880);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
