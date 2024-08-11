import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Snake");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); // Make the frame appear in the middle of the screen
    }
}
