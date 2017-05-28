package helpers;


import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * Created by MarcosPortatil on 18/04/2017.
 */

public class MyAssetManager {

    AssetManager manager;
    TextureAtlas textureAtlas;
     public MyAssetManager() {
         manager = new AssetManager();
         textureAtlas = new TextureAtlas("textures.txt");
     }

     public void load(){

         manager.load("logo.png", Texture.class);
          manager.load("floor.png", Texture.class);
          manager.load("gameover.png", Texture.class);
          manager.load("overfloor.png", Texture.class);

          manager.load("spike.png", Texture.class);
          manager.load("player.png", Texture.class);
          manager.load("audio/die.ogg", Sound.class);
          manager.load("audio/jump.ogg", Sound.class);
          manager.load("audio/song.ogg", Music.class);

     }

     public Sprite cargarTextura(String textura){
         return textureAtlas.createSprite(textura);
     }

    public TextureAtlas getTextureAtlas() {
        return textureAtlas;
    }

    public AssetManager getManager() {
          return manager;
     }
}
