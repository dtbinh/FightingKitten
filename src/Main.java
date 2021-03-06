import DB.StringRes.MySettings;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class Main extends Game
{
    public static void main (String[] arg)
    {
        System.setProperty("user.name", "Mery");

        TexturePacker.process(MySettings.IMAGES_FOLDER, MySettings.ATLAS_FOLDER, MySettings.ATLAS_NAME);

        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = MySettings.TITLE;
        cfg.fullscreen = MySettings.FULL_SCREEN;
        cfg.vSyncEnabled = MySettings.V_SYNC_ENABLED;
        cfg.foregroundFPS = MySettings.FOREGROUND_FPS;
        cfg.width = MySettings.SCREEN_WIDTH;
        cfg.height = MySettings.SCREEN_HEIGHT;

        new LwjglApplication(new Main(), cfg);
    }

    @Override public void create()
    {
        this.setScreen(new GameScreen());
    }
}
