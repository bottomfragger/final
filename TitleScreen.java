import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.image.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;


public class TitleScreen extends JPanel implements ActionListener 
{
	private String title = "BEEBE MUNCHER";
	private Container c;
	private JFrame titleScreen;
	private JButton playButton;
	private JButton exitButton;
	private JLabel jl;
	public TitleScreen()
	{
		JLabel jl = new JLabel();
		jl.setIcon(new ImageIcon("C:\\Users\\Mikey\\Downloads\\front.png"));
		this.add(jl);
		add(jl);
		validate();
		titleScreen = new JFrame("Beebe Muncher Title Screen");
		playButton = new JButton("PLAY");
		playButton.setPreferredSize(new Dimension (100,100));
		playButton.setBounds(20, 110, 100, 30);
		playButton.addActionListener(this);
		exitButton = new JButton("EXIT");
		exitButton.setPreferredSize(new Dimension(100,100));
		exitButton.setBounds(20,150,100,30);
		exitButton.addActionListener(this);
		titleScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = titleScreen.getContentPane();
		this.setPreferredSize(new Dimension(400,300));
		this.setLayout(null);
		this.add(playButton);
		this.add(exitButton);
		c.add(this);
		titleScreen.pack();
			titleScreen.setVisible(true);
	}
	public void paintComponent(Graphics g)
	{
		g.setFont(new Font(title,10,18));
		g.setColor(Color.red);
		g.drawString(title, 20, 20);
	}
	public static void main(String[] args)
	{
		new TitleScreen();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object a = e.getSource();
		if (a == playButton)
		{
			this.titleScreen.dispose();
			new BBFrame();
		}
		else if (a == exitButton)
		{
			this.titleScreen.dispose();
		}
	}

	
}
