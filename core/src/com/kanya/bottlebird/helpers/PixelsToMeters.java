package com.kanya.bottlebird.helpers;

import com.badlogic.gdx.math.Vector2;
import com.kanya.bottle.commons.Commons;

public class PixelsToMeters {
	
	public static float[] scaleFloatArray(float[] pixelFloatArray) {
		int arrayLength = pixelFloatArray.length;
		
		float[] meterFloatArray = new float[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			meterFloatArray[i] = pixelFloatArray[i] * Commons.PIXELS_PER_METER;
		}
		
		return meterFloatArray;
	}
	
	public static Vector2[] scaleVectorArray(Vector2[] pixelVectorArray) {
		int arrayLength = pixelVectorArray.length;
		
		Vector2[] meterVectorArray = new Vector2[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			meterVectorArray[i] = pixelVectorArray[i].scl(Commons.PIXELS_PER_METER);
		}
		
		return meterVectorArray;
	}
}
