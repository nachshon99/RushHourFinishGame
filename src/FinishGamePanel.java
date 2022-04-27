import javax.swing.*;
import java.awt.*;

public class FinishGamePanel extends JPanel{

    public FinishGamePanel(){
        this.setBounds(Main.WINDOW_WIDTH/4,Main.WINDOW_HEIGHT/3,500,250);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.setDoubleBuffered(true);

        JLabel title = new JLabel("You Win!");
        title.setBounds(150,50,250,50);
        Font titleButtonFont = new Font("Arial", Font.ITALIC, 50);
        title.setFont(titleButtonFont);
        this.add(title);

        JLabel message = new JLabel("The game is Finish!");
        message.setBounds(30,100,450,60);
        Font messageButtonFont = new Font("Arial", Font.ITALIC, 50);
        message.setFont(messageButtonFont);
        this.add(message);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(170,170,150,60);
        Font exitButtonFont = new Font("Arial",Font.ITALIC,45);
        exitButton.setFont(exitButtonFont);
        exitButton.addActionListener((event) -> {
            System.exit(0);
        });
        this.add(exitButton);
    }
}
