import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class Player1Paddle extends JFrame{


    // Color name array
    private String[] colorNameArray = {"RED", "YELLOW", "PINK"};
    // Color list array
    private Color[] colorListArray = {Color.RED, Color.YELLOW, Color.PINK};

    // JLIst
    JList colorList;
    
    Player1Paddle(){
        // JLabel
        JLabel label = new JLabel();
        label.setText("Player 1, choose your color:");
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setForeground(Color.black);
        
        // JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));
        colorList.setForeground(Color.black);

        // Allows only once selection in the list
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // JLabel for image
        JLabel imageLabel = new JLabel();

        // Image shown at PlayAgain
        ImageIcon imageP1 = new ImageIcon("paddles.jpg");
               
        // Set image to label
        imageLabel.setIcon(imageP1);
        
        // Add Event Handler
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        
        // Add list to frame 
        this.add(label);
        this.add(colorList);

        // Directions
        JLabel direction = new JLabel("First to reach five (5)");
        direction.setFont(new Font("Arial", Font.PLAIN, 20));
        direction.setForeground(Color.BLACK);

        JLabel direction0 = new JLabel("points will be the winner!");
        direction0.setFont(new Font("Arial", Font.PLAIN, 20));
        direction0.setForeground(Color.BLACK);
        
        // Add directions
        this.add(imageLabel);
        this.add(direction);
        this.add(direction0);

        //Frame title
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Pong!");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(400,500);
        // Puts frame in the middle 
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // set Background color
        this.getContentPane().setBackground(Color.WHITE);

    }
    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            Paddle.paddle1 = colorListArray[colorList.getSelectedIndex()];

            // open Player2Paddle
            new Player2Paddle();

            // close game frame
            dispose();
        }
    }  
}

