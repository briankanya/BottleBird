package com.kanya.bottlebird.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.kanya.bottlebird.gameworld.GameRenderer;
import com.kanya.bottlebird.gameworld.GameWorld;
import com.kanya.bottlebird.helpers.InputHandler;

public class GameScreen implements Screen {
	
	private GameWorld world;
	private GameRenderer renderer;
	private InputHandler inputHandler;
	
	public GameScreen() {
		world = new GameWorld();
		
		renderer = new GameRenderer(world);
		
		inputHandler = new InputHandler(world.getBottle());
		Gdx.input.setInputProcessor(inputHandler);
	}

	@Override
	public void show() {
	}

	@Override
	public void render(float delta) {
		renderer.render();
		world.update(delta);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void dispose() {
		renderer.dispose();
		world.dispose();
	}

}
