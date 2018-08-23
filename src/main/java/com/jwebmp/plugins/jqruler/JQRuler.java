/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqruler;

import com.jwebmp.core.base.html.Div;

/**
 * An implementation of the jsTree project.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
public class JQRuler
		extends Div<JQRulerChildren, JQRulerAttributes, JQRulerFeatures, JQRulerEvents, JQRuler>
{

	private static final long serialVersionUID = 1L;

	private JQRulerFeature feature;

	public JQRuler()
	{
		addFeature(getFeature());
	}

	public final JQRulerFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQRulerFeature(this);
		}
		return feature;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public JQRulerOptions getOptions()
	{
		return getFeature().getOptions();
	}
}
