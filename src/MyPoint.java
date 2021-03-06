// Decompiled by Jad v1.5.7c. Copyright 1997-99 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/SiliconValley/Bridge/8617/jad.html
// Decompiler options: packfields(5) packimports(3) nocasts braces 
// Source File Name:   Fortune.java

import java.awt.Graphics;
import java.awt.Point;

class MyPoint implements Paintable
{
	volatile double x, y;

	public MyPoint(double d, double d1)
	{
		x = d;
		y = d1;
	}

	public MyPoint(MyPoint mypoint)
	{
		x = mypoint.x;
		y = mypoint.y;
	}

	public MyPoint(Point point)
	{
		x = point.x;
		y = point.y;
	}

	/**
	 * paint this point as an circle
	 */
	public void paint(Graphics g)
	{
/*		int x = (int)this.x, y = (int)this.y;
		g.drawLine(x  , y-2, x  , y-2);
		g.drawLine(x-1, y-1, x+1, y-1);
		g.drawLine(x-2, y  , x+2, y  );
		g.drawLine(x-1, y+1, x+1, y+1);
		g.drawLine(x  , y+2, x  , y+2);
*/
		g.fillOval((int)(x - 3.0), (int)(y - 3.0), 7, 7);
//		g.drawOval((int)(x - 4.0), (int)(y - 4.0), 9, 9);
	}

	/**
	 * @param mypoint another point
	 * @return euclidean distance between this and mypoint.
	 */
	public double distance(MyPoint mypoint)
	{
		double dx = mypoint.x - x;
		double dy = mypoint.y - y;
		return Math.sqrt(dx * dx + dy * dy);
	}

}
