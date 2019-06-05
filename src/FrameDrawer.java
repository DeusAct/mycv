import javax.swing.*;

public abstract class FrameDrawer extends TextComponent {

    public void drawJframe(){
        JFrame frame = new JFrame("CV");
        frame.getContentPane().add(new JframeLauncher());
        frame.setSize(800, 880);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
