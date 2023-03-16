import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{
    MainMenu(){

        // JLabel
        JLabel imageLabel = new JLabel();

        // Image shown at Main Menu
        ImageIcon imageMM = new ImageIcon("pong.gif");

        // Set image to label
        imageLabel.setIcon(imageMM);
        
        // Title
        JLabel textLabel = new JLabel("                                   PONG!                                   ");
        textLabel.setFont(new Font("Impact", Font.BOLD, 50));
        textLabel.setForeground(Color.BLACK);

        // JButton
        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("Impact", Font.BOLD, 30));


        JLabel textLabel0 = new JLabel("                                                 Graphical User Interface by:                                                ");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel0.setForeground(Color.BLACK);

        
        JLabel textLabel1 = new JLabel("   Arellano, Ma. Darlene");
        textLabel1.setFont(new Font("Arial", Font.PLAIN, 15));
        textLabel1.setForeground(Color.BLACK);

        JLabel textLabel2 = new JLabel("     Diaz, Sophia   ");
        textLabel2.setFont(new Font("Arial", Font.PLAIN, 15));
        textLabel2.setForeground(Color.BLACK);

        JLabel textLabel3 = new JLabel("    Llaguno, Marielle      ");
        textLabel3.setFont(new Font("Arial", Font.PLAIN, 15));
        textLabel3.setForeground(Color.BLACK);

        JLabel textLabel4 = new JLabel(" Vejar, Anjiela     ");
        textLabel4.setFont(new Font("Arial", Font.PLAIN, 15));
        textLabel4.setForeground(Color.BLACK);


        // add event to start button
        EventHandler sHandler = new EventHandler();
        startButton.addActionListener(sHandler);

   

        // Add label to frame 
        
        this.add(imageLabel);
        this.add(textLabel);
        this.add(startButton);

        this.add(textLabel0);
        this.add(textLabel1);
        this.add(textLabel2);
        this.add(textLabel3);
        this.add(textLabel4);

        //Frame title
        this.setLayout(new FlowLayout());
         // Frame title
        this.setTitle("Pong!");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(600,500);
        // Puts frame in the middle 
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // set Background color
        this.getContentPane().setBackground(Color.WHITE);

    }

    // Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
        // Goes to game frame 
        new Customizations();
    
        // Closes frame
        dispose();
            
        }
    }

    
}
