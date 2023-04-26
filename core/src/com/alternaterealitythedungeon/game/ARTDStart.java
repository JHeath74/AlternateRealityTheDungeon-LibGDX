package com.alternaterealitythedungeon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class ARTDStart extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private BitmapFont font;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("Images/Program/alternate-reality-the-dungeon_8.jpg/");
		
		font = new BitmapFont();
        font.setColor(Color.LIME);
        

	}

	@Override
	public void render () {
		
		
		
		//Clear the Screen
		Gdx.gl.glClearColor(0, 128, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		
        //Drawing Font and Image information
		batch.begin();
		batch.draw(img, 720, 400); // Set Image Location
		font.draw(batch, "Alternate Reality The Dungeon", 900, 1600, 500, 600, false); //Set Font Size and Location
		font.getData().setScale(5, 15); // Set Font Size
		font.setColor(Color.FIREBRICK);
	
		batch.end();

        

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		font.dispose();
	}
}
