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

import javafx.scene.layout.Pane;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;

public class YCFPane
extends Pane
implements IYCFPaneCommon
{
	/**
	 *	Panels all start in an Unknown or View state.
	 *
	 *	public void AttrJPanel.setPanelMode( YCFJPanel.PanelMode value ) {
	 *		YCFJPanel.PanelMode.oldMode = getPanelMode();
	 *		if( value != YCFJPanel.PanelMode.Unknown ) {
	 *			if( SwingFocus is null ) {
	 *				RAISE NullParameterException;
	 *			}
	 *		}
	 *		super.setPanelMode( value );
	 *		switch( value ) {
	 *			case Unknown:
	 *				if( swingFocus is not null ) {
	 *					if( editing SwingFocus ) {
	 *						swingFocus.Edit.endEdit();
	 *					}
	 *				}
	 *				break;
	 *			case View:
	 *				if( editing SwingFocus ) {
	 *					switch( oldMode ) {
	 *						case Unknown:
	 *							break;
	 *						case View:
	 *							break;
	 *						case Edit:
	 *							if( editing SwingFocus ) {
	 *								SwingFocus.Edit.endEdit();
	 *							}
	 *							break;
	 *						case Update:
	 *							if( editing SwingFocus ) {
	 *								SwingFocus.Edit.endEdit();
	 *							}
	 *							break;
	 *						case Delete:
	 *							if( SwingFocus is not null ) {
	 *								if( editing SwingFocus ) {
	 *									SwingFocus.Edit.endEdit();
	 *								}
	 *								SwingFocus = null;
	 *							}
	 *							break;
	 *				}
	 *				break;
	 *			case Edit:
	 *				if not editing SwingFocus
	 *				then
	 *					SwingFocus.beginEdit()
	 *				end if
	 *				break;
	 *			case Update:
	 *				switch( oldMode ) {
	 *					case View:
	 *						if( editing SwingFocus ) {
	 *							SwingFocus.Edit.endEdit();
	 *						}
	 *						break;
	 *					case Edit:
	 *						PostDisplayChangesToEditObj
	 *						SwingFocus.Edit.update();
	 *						SwingFocus.Edit.endEdit();
	 *						break;
	 *					default:
	 *						RAISE UsageException
	 *						break;
	 *				}
	 *				if( SwingFocus is null ) {
	 *					setPanelMode( YCFJPanel.PanelMode.Unknown );
	 *				}
	 *				else {
	 *					setPanelMode( YCFJPanel.PanelMode.View );
	 *				}
	 *				break;
	 *			case Delete:
	 *				if( oldMode != YCFJPanel.PanelMode.Edit ) {
	 *					RAISE UsageException
	 *				}
	 *				SwingFocus.Edit.delete();
	 *				SwingFocus.Edit.endEdit();
	 *				SwingFocus = null;
	 *				setPanelMode( YCFJPanel.PanelMode.Unknown );
	 *				break;
	 *		}
	 *		RefreshDisplayedValues
	 *	}
	 */
	public enum PaneMode {
		Unknown,
		Add,
		View,
		Edit,
		Update,
		Delete
	};

	protected IYCFLibAnyObj javaFXFocus = null;
	protected YCFPane.PaneMode paneMode = YCFPane.PaneMode.Unknown;
	
	public YCFPane() {
		super();
	}

	public IYCFLibAnyObj getJavaFXFocus() {
		return( javaFXFocus );
	}
	
	public void setJavaFXFocus( IYCFLibAnyObj value ) {
		javaFXFocus = value;
	}
	
	public YCFPane.PaneMode getPaneMode() {
		return( paneMode );
	}
	
	public void setPaneMode( YCFPane.PaneMode value ) {
		paneMode = value;
	}
}
