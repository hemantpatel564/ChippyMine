package project.university.chippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GameOverActivity extends AppCompatActivity {

//    @BindView(R.id.textView)
//    TextView textView;
    @BindView(R.id.startNewGame)
    Button startNewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.startNewGame)
    public void onViewClicked() {
        startActivity(new Intent(GameOverActivity.this, MainActivity.class));
        finish();
    }
}
