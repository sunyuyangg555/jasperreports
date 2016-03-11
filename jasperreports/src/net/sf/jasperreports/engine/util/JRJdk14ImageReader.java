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
package net.sf.jasperreports.engine.util;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import net.sf.jasperreports.engine.JRException;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public class JRJdk14ImageReader implements JRImageReader
{
	public static final String EXCEPTION_MESSAGE_KEY_IMAGE_READ_FAILED = "util.jdk14.image.read.failed";

	@Override
	public Image readImage(byte[] bytes) throws JRException
	{
		InputStream bais = new ByteArrayInputStream(bytes);

		Image image = null;
		try
		{
			image = ImageIO.read(bais);
		}
		catch (Exception e)
		{
			throw new JRException(e);
		}
		finally
		{
			try
			{
				bais.close();
			}
			catch (IOException e)
			{
			}
		}

		if (image == null)
		{
			throw 
				new JRException(
					EXCEPTION_MESSAGE_KEY_IMAGE_READ_FAILED,
					(Object[])null);
		}

		return image;
	}


}
