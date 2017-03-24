package com.kanya.bottlebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Box2D;
import com.kanya.bottle.commons.Commons;
import com.kanya.bottlebird.screens.GameScreen;

public class BottleBirdGame extends Game {
	
	public static AssetManager manager;
	public static AssetDescriptor<Texture> bottleDescriptor;
	public static AssetDescriptor<Texture> groundDescriptor;
	
	@Override
	public void create() {
		bottleDescriptor = new AssetDescriptor<Texture>(Gdx.files.internal(Commons.BOTTLE_PATH), Texture.class);
		
		groundDescriptor = new AssetDescriptor<Texture>(Gdx.files.internal(Commons.GROUND_PATH), Texture.class);
		
		manager = new AssetManager();
		manager.load(bottleDescriptor);
		manager.load(groundDescriptor);
		
		Box2D.init();
		
		do {
			manager.update();
		}
		while(manager.update() == false);
		
		setScreen(new GameScreen());
	}
	
	@Override
	public void dispose() {
		super.dispose();
		manager.dispose();
	}
}