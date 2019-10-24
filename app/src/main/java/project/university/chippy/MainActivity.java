package project.university.chippy;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GameEngine chippy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get size of the screen
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        chippy = new GameEngine(this, size.x, size.y);

        // Make GameEngine the view of the Activity
        setContentView(chippy);
    }

    // Android Lifecycle function
    @Override
    protected void onResume() {
        super.onResume();
        chippy.startGame();
    }

    // Stop the thread in snakeEngine
    @Override
    protected void onPause() {
        super.onPause();
        chippy.pauseGame();
    }
}

