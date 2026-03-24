package test;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.lang.invoke.VarHandle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPanelTest {

	public static void main(String[] args) {

		DrawPanel panel1 = new DrawPanel();
		
		JPanel panel2 = new JPanel(){
			
			public void paintComponent(Graphics g) 
			{
				
				super.paintComponent(g);
				
				int width = getWidth();
				int height = getHeight();
				
				for(int i = 0; i < 14; i++) {
					g.drawLine(0, 0, height-(i*18), i*18);
				}
			}
		};
		
		DrawPanelNew panel3 = new DrawPanelNew()
		{
			
			public void paintComponent(Graphics g) 
			{
				
				super.paintComponent(g);
				
				int width = getWidth();
				int height = getHeight();
				
				for(int i = 0; i < 16; i++)
				{
					g.drawLine(0, 0, height-(i*18), i*18);
					g.drawLine(width, height, height-(i*18), i*18);
					g.drawLine(0, height,height - (i*18),width - (i*18) );
					g.drawLine(width, 0,height - (i*18),width - (i*18) );
				}
			}
		};
		
		DrawPanelNew panel4 = new DrawPanelNew()
		{
			public void paintComponent(Graphics g) 
			{
				
				super.paintComponent(g);
				
				int width = getWidth();
				int height = getHeight();
				
				int i = 0;
				
				while(i < width)
				{
					g.drawLine(0, 0+i, i, height);
					i += 15;
				}
			}
		};
		
		DrawPanelNew panel5 = new DrawPanelNew()
		{
			public void paintComponent(Graphics g) 
			{
				
				super.paintComponent(g);
				
				int width = getWidth();
				int height = getHeight();
				
				int i = 0;
				
				while(i < width)
				{
					g.drawLine(0, i, i, height);
					i += 15;
				}
				
				i = 0;
				
				while(i < height)
				{
					g.drawLine(width-i, 0,0,i);
					i += 15;
				}
				
				i = 0;
				
				while(i < height)
				{
					g.drawLine(i,height,width,height-i);
					i += 15;
				}
				
				i = 0;
				
				while(i < height)
				{
					g.drawLine(width, height-i,width-i,0);
					i += 15;
				}
				
				
			   Point mouseObject = MouseInfo.getPointerInfo().getLocation();
			   
			   g.drawArc(mouseObject.x, mouseObject.y, 25, 25, 0 , 360);
			   
			     repaint();
			}
		};
		
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel5);
		application.setSize(275, 275);
		application.setVisible(true);
	}

}
