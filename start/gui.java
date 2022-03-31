package start;

import javax.swing.*;

class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("RavenWordCount GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       JButton button = new JButton("Press");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);
    }
}