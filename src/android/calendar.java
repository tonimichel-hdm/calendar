package com.example.calendar;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;

public class Calendar extends CordovaPlugin {
	public static final String ACTION_ADD_CALENDAR_ENTRY = "addCalendarEntry";
	
	@Override 
	public boolean execute ( String action, JSONArray args, CallbackContext callbackContext ) throw JSONException {
		try {
			if( ACTION_ADD_CALENDAR_ENTRY.equals( action ) ) {
				JSONObject arg_object = arg.getJSONObject( 0 );
				Intent callIntent = new Intent( Intent.ACTION_EDIT )
					.setType( "vnd.android.cursor.item/event" )
					.putExtra( "beginTime", arg_object.getLong( "startTimeMillis" ) )
					.putExtra( "endTime", arg_object.getLong( "endTimeMillis" ) )
					.putExtra( "title", arg_object.getLong( "title" ) )
					.putExtra( "description", arg_object.getLong( "description" ))
					.putExtra( "eventLocation", arg_object.getLong( "eventLocation" ) )
					
				this.cordova.getActivity().startActivity( callIntent );
				callbackContext.success();
				return true;
			}
		} catch ( Exception e ) {
			System.err.print( "Exception: " + e.getMessage() );
			callbackContext.error( e.getMessage() );
			return false;
		}
	}
}