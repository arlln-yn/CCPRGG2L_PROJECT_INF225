import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {


    GamePanel panel;

    // Game BG color
    static Color gameBGColor;

    GameFrame(String player1Name, String player2Name) {

        panel = new GamePanel();

        // Create label with player names
       JLabel playerNamesLabel = new JLabel(player1Name + " vs. " + player2Name);
       playerNamesLabel.setFont(new Font("Arial", Font.BOLD, 40));
       playerNamesLabel.setForeground(Color.black);
       playerNamesLabel.setHorizontalAlignment(JLabel.CENTER);
        
        // Add panel and label to frame
       this.add(panel, BorderLayout.CENTER);
       this.add(playerNamesLabel, BorderLayout.NORTH);

        //To change BG color
        this.setBackground(gameBGColor);

        this.add(panel);
        this.setTitle("Pong!");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        }
    }


