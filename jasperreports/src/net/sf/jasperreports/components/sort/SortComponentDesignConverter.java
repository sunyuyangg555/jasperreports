/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.components.sort;

import net.sf.jasperreports.engine.JRComponentElement;
import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRPrintElement;
import net.sf.jasperreports.engine.component.ComponentDesignConverter;
import net.sf.jasperreports.engine.convert.ElementIconConverter;
import net.sf.jasperreports.engine.convert.ReportConverter;
import net.sf.jasperreports.engine.util.JRImageLoader;

/**
 * @author Narcis Marcu (narcism@users.sourceforge.net)
 */
public class SortComponentDesignConverter extends ElementIconConverter implements ComponentDesignConverter
{

	/**
	 *
	 */
	private final static SortComponentDesignConverter INSTANCE = new SortComponentDesignConverter();
	
	/**
	 *
	 */
	private SortComponentDesignConverter()
	{
		super(JRImageLoader.SUBREPORT_IMAGE_RESOURCE);
	}

	/**
	 *
	 */
	public static SortComponentDesignConverter getInstance()
	{
		return INSTANCE;
	}

	@Override
	public JRPrintElement convert(ReportConverter reportConverter, JRComponentElement element)
	{
		return convert(reportConverter, (JRElement)element);
	}
}
