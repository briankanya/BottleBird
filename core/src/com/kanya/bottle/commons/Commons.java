package com.kanya.bottle.commons;

public interface Commons {
	final String BOTTLE_PATH = "bottle.png";
	final String GROUND_PATH = "ground.png";
	
	final float PIXELS_PER_METER = 10f;
	final float GRAVITY = 9.8f;
	final float TIME_STEP = 1f;
	final int VIEWPORT_WIDTH = (int) (150 * PIXELS_PER_METER);
	final int VIEWPORT_HEIGHT = (int) (250 * PIXELS_PER_METER);
	final int VELOCITY_ITERATIONS = 8;
	final int POSITION_ITERATIONS = 5;
}
