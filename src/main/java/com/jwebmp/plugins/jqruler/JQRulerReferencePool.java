/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.interfaces.ReferencePool;

/**
 * @author GedMarc
 * @version 1.0
 * @since Mar 4, 2015
 */
public enum JQRulerReferencePool
		implements ReferencePool
{

	/**
	 * The core of JQuery UI
	 */
	CoreOriginal(new JavascriptReference("RulerGuides", 1.0, "javascript/jquery.ruler/RulerGuides.js"), null, 80),
	Core(new JavascriptReference("RulerGuides", 1.0, "javascript/jquery.ruler/RulerGuidesJQuery.js"), null, 80),
	Event(new JavascriptReference("JQRulerEvent", 1.0, "javascript/jquery.ruler/Event.js", "https://raw.githubusercontent.com/mark-rolich/Event.js/master/Event.js"), null, 79),
	DragDrop(new JavascriptReference("JQRulerDragDrop", 1.0, "javascript/jquery.ruler/Dragdrap.js"), null, 78),
	;

	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	JQRulerReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference, int sortOrder)
	{
		this.javaScriptReference = javaScriptReference;
		this.cssReference = cssReference;
		this.javaScriptReference.setSortOrder(sortOrder);
		this.cssReference.setSortOrder(sortOrder);
	}

	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}

	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}

}
