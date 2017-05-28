package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;

import helpers.MyAssetManager;
import screens.BaseScreen;
import screens.GameScreen;
import screens.MenuScreen;
import screens.SplashScreen;

/**
 * Created by Marcos on 28/05/2017.
 */

public class KoalioGame extends Game implements ApplicationListener{
    public static int WIDTH;
    public static int HEIGHT;
    private MyAssetManager manager;

    public BaseScreen loadingScreen, menuScreen, gameOverScreen, creditsScreen;
    public GameScreen gameScreen;

    @Override
    public void create() {
        manager = new MyAssetManager();
        manager.getManager().update();
        manager.load();
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();
        setScreen(new SplashScreen(this));
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    public AssetManager getManager() {
        return manager.getManager();
    }

    public void finishLoading() {
        menuScreen = new MenuScreen(this);
        gameScreen = new GameScreen();
     //   gameOverScreen = new GameOverScreen(this);
        setScreen(menuScreen);
    }


}

