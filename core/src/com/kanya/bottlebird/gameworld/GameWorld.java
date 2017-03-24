package com.kanya.bottlebird.gameworld;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Disposable;
import com.kanya.bottle.commons.Commons;
import com.kanya.bottlebird.BottleBirdGame;
import com.kanya.bottlebird.gameobjects.Bottle;
import com.kanya.bottlebird.gameobjects.Ground;

public class GameWorld implements Disposable {

	private Bottle bottle;
	private Ground ground;
	private World world;
	
	
	public GameWorld() {
		world = new World(new Vector2(0, Commons.GRAVITY), true);
		
		bottle = new Bottle(BottleBirdGame.manager.get(BottleBirdGame.bottleDescriptor), world, 50 * Commons.PIXELS_PER_METER, 0);
	
		ground = new Ground(BottleBirdGame.manager.get(BottleBirdGame.groundDescriptor), world);
	}
	
	public void update(float delta) {
		world.step(Commons.TIME_STEP, Commons.VELOCITY_ITERATIONS, Commons.POSITION_ITERATIONS);
	}
	
	public Bottle getBottle() {
		return bottle;
	}
	
	public Ground getGround() {
		return ground;
	}
	
	public World getWorld() {
		return world;
	}
	
	public void dispose() {
		world.dispose();
	}

}
