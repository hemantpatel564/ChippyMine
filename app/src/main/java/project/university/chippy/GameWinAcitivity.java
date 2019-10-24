package project.university.chippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GameWinAcitivity extends AppCompatActivity {

//    @BindView(R.id.textView)
//    TextView textView;
    @BindView(R.id.startNewGame)
    Button startNewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_win_acitivity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.startNewGame)
    public void onViewClicked() {
        startActivity(new Intent(GameWinAcitivity.this,MainActivity.class));
        finish();
    }
}
