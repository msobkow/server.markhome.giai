// Description: Java 25 JavaFX View/Edit Form implementation for UInt32Type.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.busmodel.busmodeljavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.Inz;
import server.markhome.cf.javafx.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

/**
 *	BusModelJavaFXUInt32TypeViewEditForm JavaFX View/Edit Form implementation
 *	for UInt32Type.
 */
public class BusModelJavaFXUInt32TypeViewEditForm
extends CFBorderPane
implements IBusModelJavaFXUInt32TypePaneCommon,
	ICFForm
{
	public static String S_FormName = "View/Edit UInt32Type";
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected ICFFormClosedCallback formClosedCallback = null;
	protected boolean dataChanged = false;
	protected CFSplitPane javafxViewEditPane = null;
	protected CFButton buttonEdit = null;
	protected CFButton buttonSave = null;
	protected CFButton buttonClose = null;
	protected CFButton buttonCancel = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;

	public BusModelJavaFXUInt32TypeViewEditForm( ICFFormManager formManager, IBusModelJavaFXSchema argSchema, IBusModelUInt32TypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		formClosedCallback = closeCallback;
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javaFXFocus = argFocus;
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (IBusModelUInt32TypeObj)argFocus.read( true );
			javaFXFocus = argFocus;
		}
		javafxViewEditPane = argSchema.getUInt32TypeFactory().newViewEditPane( cfFormManager, argFocus );

		if( cameFromAdd ) {
			dataChanged = true;
		}

		scrollMenu = new ScrollPane();
		scrollMenu.setVbarPolicy( ScrollBarPolicy.NEVER );
		scrollMenu.setHbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollMenu.setFitToHeight( true );
		scrollMenu.setContent( getHBoxMenu() );

		setTop( scrollMenu );
		setCenter( javafxViewEditPane );
	}

	public ICFFormManager getCFFormManager() {
		return( cfFormManager );
	}

	public void setCFFormManager( ICFFormManager value ) {
		final String S_ProcName = "setCFFormManager";
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public void forceCancelAndClose() {
		IBusModelUInt32TypeObj focus = getJavaFXFocusAsUInt32Type();
		if( focus != null ) {
			IBusModelUInt32TypeEditObj editObj = (IBusModelUInt32TypeEditObj)focus.getEdit();
			if( editObj != null ) {
				if( editObj.getIsNew() ) {
					editObj.endEdit();
					editObj = null;
					setJavaFXFocus( null );
					setPaneMode( CFPane.PaneMode.Unknown );
				}
				else {
					editObj.endEdit();
					editObj = null;
					setPaneMode( CFPane.PaneMode.View );
				}
			}
		}
		if( cfFormManager != null ) {
			if( cfFormManager.getCurrentForm() == this ) {
				cfFormManager.closeCurrentForm();
			}
		}
		if( formClosedCallback != null ) {
			formClosedCallback.formClosed( null );
		}
	}

	public IBusModelJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelUInt32TypeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelUInt32TypeObj" );
		}
		((IBusModelJavaFXUInt32TypePaneCommon)javafxViewEditPane).setJavaFXFocus( value );
		IBusModelUInt32TypeObj argFocus = (IBusModelUInt32TypeObj)value;
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (IBusModelUInt32TypeObj)argFocus.read( true );
			super.setJavaFXFocus( argFocus );
		}
	}

	public IBusModelUInt32TypeObj getJavaFXFocusAsUInt32Type() {
		return( (IBusModelUInt32TypeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsUInt32Type( IBusModelUInt32TypeObj value ) {
		setJavaFXFocus( value );
	}

	public CFHBox getHBoxMenu() {
		if( hboxMenu == null ) {
			hboxMenu = new CFHBox( 10 );
			buttonEdit = new CFButton();
			buttonEdit.setMinWidth( 200 );
			buttonEdit.setText( "Edit" );
			buttonEdit.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						if( getJavaFXFocusAsUInt32Type() != null ) {
							if( null == getJavaFXFocusAsUInt32Type().getEdit() ) {
								setPaneMode( CFPane.PaneMode.Edit );
							}
							else {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.CannotBeginEditAlreadyEditing"),
									Inz.s("cflibjavafx.common.CannotBeginEditAlreadyEditing") );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
					adjustButtons();
				}
			});
			hboxMenu.getChildren().add( buttonEdit );

			buttonSave = new CFButton();
			buttonSave.setMinWidth( 200 );
			buttonSave.setText( "Save" );
			buttonSave.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelUInt32TypeObj focus = getJavaFXFocusAsUInt32Type();
						if( focus != null ) {
							IBusModelUInt32TypeEditObj editObj = (IBusModelUInt32TypeEditObj)( focus.getEdit() );
							if( editObj == null ) {
								throw new CFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"editObj" );
							}

							CFPane.PaneMode oldMode = getPaneMode();
							try {
								setPaneMode( CFPane.PaneMode.Update );
								setPaneMode( CFPane.PaneMode.View );
							}
							catch( Throwable t ) {
								setPaneMode( oldMode );
								throw t;
							}
						}
						else {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"focus" );
						}
						dataChanged = true;
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
					adjustButtons();
				}
			});
			hboxMenu.getChildren().add( buttonSave );

			buttonClose = new CFButton();
			buttonClose.setMinWidth( 200 );
			buttonClose.setText( "Close" );
			buttonClose.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelUInt32TypeObj focus = getJavaFXFocusAsUInt32Type();
						if( focus != null ) {
							IBusModelUInt32TypeEditObj editObj = (IBusModelUInt32TypeEditObj)( focus.getEdit() );
							if( editObj == null ) {
								throw new CFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"editObj" );
							}

							CFPane.PaneMode oldMode = getPaneMode();
							try {
								setPaneMode( CFPane.PaneMode.Update );
							}
							catch( Throwable t ) {
								setPaneMode( oldMode );
								throw t;
							}
							dataChanged = true;
						}
						else {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"focus" );
						}
						cfFormManager.closeCurrentForm();
						if( formClosedCallback != null ) {
							focus = getJavaFXFocusAsUInt32Type();
							formClosedCallback.formClosed( focus );
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonClose );

			buttonCancel = new CFButton();
			buttonCancel.setMinWidth( 200 );
			buttonCancel.setText( "Cancel" );
			buttonCancel.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelUInt32TypeObj focus = getJavaFXFocusAsUInt32Type();
						if( focus != null ) {
							IBusModelUInt32TypeEditObj editObj = (IBusModelUInt32TypeEditObj)focus.getEdit();
							if( editObj != null ) {
								if( editObj.getIsNew() ) {
									editObj.endEdit();
									editObj = null;
									setJavaFXFocus( null );
									setPaneMode( CFPane.PaneMode.Unknown );
								}
								else {
									editObj.endEdit();
									editObj = null;
									setPaneMode( CFPane.PaneMode.View );
								}
							}
						}
						cfFormManager.closeCurrentForm();
						if( formClosedCallback != null ) {
							if( dataChanged ) {
								focus = getJavaFXFocusAsUInt32Type();
							}
							else {
								focus = null;
							}
							formClosedCallback.formClosed( focus );
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonCancel );

		}
		return( hboxMenu );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		if( oldMode == value ) {
			return;
		}
		try {
			super.setPaneMode( value );
			((IBusModelJavaFXUInt32TypePaneCommon)javafxViewEditPane).setPaneMode( value );
		}
		catch( Throwable t ) {
			super.setPaneMode( oldMode );
			((IBusModelJavaFXUInt32TypePaneCommon)javafxViewEditPane).setPaneMode( oldMode );
			throw t;
		}
		adjustButtons();
	}

	public void adjustButtons() {
		CFPane.PaneMode value = getPaneMode();
		if( value == CFPane.PaneMode.View ) {
			if( buttonEdit != null ) {
				buttonEdit.setDisable( false );
			}
			if( buttonSave != null ) {
				buttonSave.setDisable( true );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( true );
			}
		}
		else if( value == CFPane.PaneMode.Edit ) {
			if( buttonEdit != null ) {
				buttonEdit.setDisable( true );
			}
			if( buttonSave != null ) {
				buttonSave.setDisable( false );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( false );
			}
		}
		else if( value == CFPane.PaneMode.Add ) {
			if( buttonEdit != null ) {
				buttonEdit.setDisable( true );
			}
			if( buttonSave != null ) {
				buttonSave.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( false );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
		}
		else {
			if( buttonEdit != null ) {
				buttonEdit.setDisable( true );
			}
			if( buttonSave != null ) {
				buttonSave.setDisable( true );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( true );
			}
		}
	}
}
