package templatemethod;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    //Jframe's update algorithm calls paint(). By default, paint() does nothing.
    //We override paint() to do something.
    @Override
    public void paint(java.awt.Graphics graphics) {
        super.paint(graphics);
        var g = graphics;
        String msg = "I rule!!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        new MyFrame("Template Method Pattern");
    }
}