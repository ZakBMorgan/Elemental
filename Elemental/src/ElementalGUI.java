import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.util.Random;
public class ElementalGUI extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	//Add your object declaration and instantiations here
	public JPanel grid = new JPanel(new GridLayout());
	public JButton start;
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		//Call the paint method of your objects here
		
	}
	
	public static void main(String[] arg) {
		
		ElementalGUI f = new ElementalGUI();
	}
	
	public ElementalGUI() {
			
		JFrame f = new JFrame("Elemental");
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setBackground(Color.white);
		f.setLayout(new BorderLayout());
		f.add(this);
		f.setResizable(false);
 		f.addMouseListener(this);
		f.addKeyListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		f.add(UI(), BorderLayout.CENTER);
		//System.out.print(JFrame.MAXIMIZED_BOTH);
		
		
	}
	
	public JPanel UI() {
		
	    grid = new JPanel(new GridLayout(5,5));
			
	    //creates a title for the game
	    JButton title = new JButton("ELEMENTAL");
	    title.setBackground(Color.WHITE);
	    title.setFont(new Font("Monospaced", Font.PLAIN, JFrame.MAXIMIZED_BOTH * 7));
	    title.setContentAreaFilled(false);
	    title.setBorderPainted(false);
	    title.setFocusable(false);
	    title.setEnabled(false);
			
	    //creates a start button that is white
	    start = new JButton("start");
	    start.setBackground(Color.WHITE);
	    start.setFont(new Font("Monospaced", Font.PLAIN, JFrame.MAXIMIZED_BOTH * 10));
	    start.setBorderPainted(false);
	    start.setFocusable(false);
		
	    //what do you want the button to do when you click it?
	    start.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		start.setVisible(false);
	    		title.setVisible(false);
	    	}
	    });
	    
	    //add buttons directly to the grid
	    for(int i=0; i<5; i++) {
	        for(int j=0; j<5; j++) {
	            if((i == j-1) && i == 1) {
	                grid.add(title);
	            } else if((i == j) && i == 2) {
	                grid.add(start);
	            } else {
	                grid.add(new JButton()); // add empty buttons for other positions
	            }
	        }
	    }
	    return grid;
	}

	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent m) {
		
		System.out.println(m.getX() + ":" + m.getY());
		
		//rectangle collision
		
		//rectangle representation of my player object
		
		//check for collision using the intersect method
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode());
		if(arg0.getKeyCode() == 27) {
			
			start.setText("exit");
			start.setVisible(true);
			start.setDefaultCapable(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}