/*
 *	MSS Code Factory YCFLib 2.13 JavaFX Support
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycflib.YCFLib.JavaFX;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;

/**
 *	Any Node being set as a display form must be castable to IYCFForm.
 *
 *	The form manager makes calls through this interface to ensure
 *	that forms are cleaned up when an application logs out or resets
 *	to the root form for a facet.
 */
public interface IYCFForm
{
	/**
	 *	Get the form manager associated with this form.
	 */
	IYCFFormManager getYCFFormManager();

	/**
	 *	Force the form to cancel and close.  The form should invoke
	 *	IYCFFormManager.closeCurrentForm(), but if it doesn't, the
	 *	form manager will force the form off the stack after
	 *	invoking this callback.
	 */
	void forceCancelAndClose();
}
