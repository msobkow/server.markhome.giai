// Description: Java 25 JavaFX View/Edit Form implementation for IndexTweak.

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
 *	BusModelJavaFXIndexTweakViewEditForm JavaFX View/Edit Form implementation
 *	for IndexTweak.
 */
public class BusModelJavaFXIndexTweakViewEditForm
extends CFBorderPane
implements IBusModelJavaFXIndexTweakPaneCommon,
	ICFForm
{
	public static String S_FormName = "View/Edit IndexTweak";
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

	public BusModelJavaFXIndexTweakViewEditForm( ICFFormManager formManager, IBusModelJavaFXSchema argSchema, IBusModelIndexTweakObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		formClosedCallback = closeCallback;
		if( argSchema == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javaFXFocus = argFocus;
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (IBusModelIndexTweakObj)argFocus.read( true );
			javaFXFocus = argFocus;
		}
		javafxViewEditPane = argSchema.getIndexTweakFactory().newViewEditPane( cfFormManager, argFocus );

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
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public void forceCancelAndClose() {
		IBusModelIndexTweakObj focus = getJavaFXFocusAsIndexTweak();
		if( focus != null ) {
			IBusModelIndexTweakEditObj editObj = (IBusModelIndexTweakEditObj)focus.getEdit();
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
		if( ( value == null ) || ( value instanceof IBusModelIndexTweakObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelIndexTweakObj" );
		}
		((IBusModelJavaFXIndexTweakPaneCommon)javafxViewEditPane).setJavaFXFocus( value );
		IBusModelIndexTweakObj argFocus = (IBusModelIndexTweakObj)value;
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (IBusModelIndexTweakObj)argFocus.read( true );
			super.setJavaFXFocus( argFocus );
		}
	}

	public IBusModelIndexTweakObj getJavaFXFocusAsIndexTweak() {
		return( (IBusModelIndexTweakObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsIndexTweak( IBusModelIndexTweakObj value ) {
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
						if( getJavaFXFocusAsIndexTweak() != null ) {
							if( null == getJavaFXFocusAsIndexTweak().getEdit() ) {
								setPaneMode( CFPane.PaneMode.Edit );
							}
							else {
								throw IYCFUsageException.getService().getInstance( getClass(),
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
						IBusModelIndexTweakObj focus = getJavaFXFocusAsIndexTweak();
						if( focus != null ) {
							IBusModelIndexTweakEditObj editObj = (IBusModelIndexTweakEditObj)( focus.getEdit() );
							if( editObj == null ) {
								throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
						IBusModelIndexTweakObj focus = getJavaFXFocusAsIndexTweak();
						if( focus != null ) {
							IBusModelIndexTweakEditObj editObj = (IBusModelIndexTweakEditObj)( focus.getEdit() );
							if( editObj == null ) {
								throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"focus" );
						}
						cfFormManager.closeCurrentForm();
						if( formClosedCallback != null ) {
							focus = getJavaFXFocusAsIndexTweak();
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
						IBusModelIndexTweakObj focus = getJavaFXFocusAsIndexTweak();
						if( focus != null ) {
							IBusModelIndexTweakEditObj editObj = (IBusModelIndexTweakEditObj)focus.getEdit();
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
								focus = getJavaFXFocusAsIndexTweak();
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
			((IBusModelJavaFXIndexTweakPaneCommon)javafxViewEditPane).setPaneMode( value );
		}
		catch( Throwable t ) {
			super.setPaneMode( oldMode );
			((IBusModelJavaFXIndexTweakPaneCommon)javafxViewEditPane).setPaneMode( oldMode );
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
