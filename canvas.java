import java.awt.*;
import javax.swing.*;
public class canvas extends JFrame  {

  public canvas () {
    JFrame displayHome = new JFrame();
    JPanel middle = new JPanel();
    JButton play, exit, menu, replay;
    JPanel home = new JPanel();
    home.setLayout(new BoxLayout(home, BoxLayout.PAGE_AXIS));
    JLabel nameH = new JLabel("ShellShock");  

    home.add(nameH);
    home.add(Box.createRigidArea(new Dimension(0,5)));
    home.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    //middle
    middle.setLayout(new BoxLayout(middle, BoxLayout.PAGE_AXIS));
    JLabel middletxt = new JLabel("ShellShock");
    middle.add(Box.createRigidArea(new Dimension(0, 5)));
    middle.add(middletxt);
    middle.add(Box.createRigidArea(new Dimension(0, 5)));
    middle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
    //buttons
    play = new JButton("Play");
    exit = new JButton("Exit");
     menu = new JButton("Options");
    replay = new JButton("Replay");

    //button alignment
    JPanel buttonPane = new JPanel();
    buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
    buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
    buttonPane.add(Box.createHorizontalGlue());
    buttonPane.add(play, CENTER_ALIGNMENT);
    buttonPane.add(exit, CENTER_ALIGNMENT);
    buttonPane.add(menu, CENTER_ALIGNMENT);
    //buttonPane.add(replay, CENTER_ALIGNMENT);

     //constructing it
     Container homePane = displayHome.getContentPane();
     homePane.add(buttonPane, BorderLayout.PAGE_END);
     middle.setBackground(Color.LIGHT_GRAY);
     homePane.add(middle, BorderLayout.CENTER);
     homePane.add(home);
    
    //show it
    pack();
    displayHome.setSize(400, 400);
    displayHome.setVisible(true);
  }
}
