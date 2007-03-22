/*
 * ============================================================================
 * GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2006 JasperSoft Corporation http://www.jaspersoft.com
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * JasperSoft Corporation
 * 303 Second Street, Suite 450 North
 * San Francisco, CA 94107
 * http://www.jaspersoft.com
 */
package net.sf.jasperreports.engine.export;

import java.awt.Color;

import net.sf.jasperreports.engine.JRBox;
import net.sf.jasperreports.engine.base.JRBasePrintElement;
	
	
/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class JRExporterGridCell
{


	/**
	 *
	 */
	public static final JRExporterGridCell OCCUPIED_CELL = 
		new JRExporterGridCell(
			new ElementWrapper(new JRBasePrintElement(null), null, null),
			0,
			0,
			1,
			1
		); 


	/**
	 *
	 */
	private ElementWrapper elementWrapper = null; 
	
	private Color backcolor;
	private Color forecolor;
	private JRBox box;
	
	private int width = 0;
	private int height = 0;
	private int colSpan = 0;
	private int rowSpan = 0;

	private JRGridLayout layout = null;


	/**
	 *
	 */
	public JRExporterGridCell(
		ElementWrapper elementWrapper, 
		int width, 
		int height,
		int colSpan, 
		int rowSpan
		)
	{
		this.elementWrapper = elementWrapper;
		this.width = width;
		this.height = height;
		this.colSpan = colSpan;
		this.rowSpan = rowSpan;
	}


	public ElementWrapper getElementWrapper()
	{
		return elementWrapper;
	}


	public int getWidth()
	{
		return width;
	}


	public int getHeight()
	{
		return height;
	}


	public int getColSpan()
	{
		return colSpan;
	}


	public int getRowSpan()
	{
		return rowSpan;
	}


	public JRGridLayout getLayout()
	{
		return layout;
	}


	public void setLayout(JRGridLayout layout)//FIXMEODT need this?
	{
		this.layout = layout;
	}


	public Color getBackcolor()
	{
		return backcolor;
	}


	public void setBackcolor(Color backcolor)
	{
		this.backcolor = backcolor;
	}


	public JRBox getBox()
	{
		return box;
	}


	public void setBox(JRBox box)
	{
		this.box = box;
	}


	public Color getForecolor()
	{
		return forecolor;
	}


	public void setForecolor(Color forecolor)
	{
		this.forecolor = forecolor;
	}


}
