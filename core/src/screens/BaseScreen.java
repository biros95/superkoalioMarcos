package screens;

import com.badlogic.gdx.Screen;
import com.mygdx.game.KoalioGame;

public abstract class BaseScreen implements Screen {
    protected KoalioGame game;

    BaseScreen(KoalioGame game) {
        this.game = game;
    }
    BaseScreen() {

    }
}
