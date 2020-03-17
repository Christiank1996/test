import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIWindow extends JFrame{
    
    JLabel test;
    JButton button;
    JTextField textField;
    
    public GUIWindow(String title) {
        initComponents();
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(test);
        this.add(textField);
        this.add(button);
        this.setVisible(true);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null); 
        
    }
    
    private void initComponents() {
        test = new JLabel("test");
        button = new JButton("this");
        textField = new JTextField(10);

        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println(textField.getText());
                textField.addMouseMotionListener(new MouseMotionListener() {
                    
                    @Override
                    public void mouseMoved(MouseEvent e) {
                        
                    }
                    
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        
                    }
                });
                
            }
        });
    }
}
