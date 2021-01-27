/*
  Sample code of Email Addon. Made By Ct tricks
*/

package com.cttricks.V8EmailAddon;

import android.app.Activity;
import android.content.Context;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import java.io.*;
import java.util.*;

@SimpleObject(external = true)
@DesignerComponent(
	category = ComponentCategory.EXTENSION,
	description = "A simple extension which creates JS code for sending emails from your own Gmail id using V8 Engine",
	nonVisible = true,
	iconName = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAYAAACNiR0NAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAAABmJLR0QA/wD/AP+gvaeTAAAAB3RJTUUH5QEbAygqtIUAmgAAAqhJREFUOMutlc1PE0EYxn8zO7tbwIIUqgJC0BhNlCZ+JHqDRM+a1IvevHKBeDLx5s2Ek8YL/glcJJEjMRJjYsCbEA4YPqzhs1JdLd1tu+146G7pB5qY+Jw2szu/fd553pkR1OjRu+nwcQBIAneABBALxjPAIvAamAaRAs3EcLLKEA2wCHAPeAgMAYqj5QNLwDNgCvBCqKiBdQBPgNEA3CTd6AI8YDKY50wMJxE1zp4CY4BRRxECtEYDncqkJxLh80EWX4d4SsAL4DHgyWDwfuCsDlb2S+QzB+iyptM0udkVZ8Cw4BBGMGc0YCCDAMabyhSCguOyObtMYSXNSGc3nusxt7tNsR4YVjgODKggzcRRa5bfz5L/kWVnfo2Plk2mtwXXNpFCoAFLSDQ6LD8BJGXQGk1p/lpNk174AmVBNnvA27kltle/VWFRQ3GrO86F1mNhWAq4rZrcCYG77bD3YY1SroA0DBDgux7phQ0QgoFEPyNdcVTRJ+U4oMIoSMiapg16Q+Os7FLM5isJA1IaSKUo5lz25tfp2HAQ+SKzO1s4sq6NuppK1aVyBdYgKQ1Q4Odc3r9ZZCXznchQD1LK+u+A/bqKpUC1mUdlVHFqKHJeju3lLYqOV60i0L6ksjdrgJLo2W6kbRxujap9UC0W8euDdN/ox2g1G3tyUQEzwEiYtC6XKToe5ZKPUBJ8HbIwbEXsah+xS6cRhmz8oQ/MKGAaeABcEUKQ2/1J5tMmxy+ewu5qI7uewT8ooFpN2s/FaT9zEiFls/tKpdMKSAHPgUkNEaPVJHatl+jgCVTEon0wTqngI02Fsi3+IDdgpMKUp4DLaD1mRVsM63xfcCiAYVkYtt24VrUqAS8Dxr8dX0eo+fgK3/zXA7YBCtAP3OXvV8Ar4CtQdwX8BnxV/Mi6IYiDAAAAJXRFWHRkYXRlOmNyZWF0ZQAyMDIxLTAxLTI3VDAzOjQwOjQyLTA1OjAwGtL5aAAAACV0RVh0ZGF0ZTptb2RpZnkAMjAyMS0wMS0yN1QwMzo0MDo0Mi0wNTowMGuPQdQAAAAASUVORK5CYII=",
	helpUrl = "https://cttricks.com/",
	version = 1
)
public final class V8EmailAddon extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    private Context context;
    private Activity activity;

    public V8EmailAddon(ComponentContainer container) {
        super(container.$form());
        context = container.$context();
        activity = container.$context();
    }
	
	@SimpleFunction
    public String SendEmail(String to, String subject, String body){
		String output = "MailApp.sendEmail('"+ to +"', '"+ subject +"', '"+ body +"')";
		return output;
    }
	
}
