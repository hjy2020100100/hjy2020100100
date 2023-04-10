package cn.edu.jnu.x2020100100;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCalculate= this.findViewById(R.id.buton_calculate);
        EditText editTextScores= this.findViewById(R.id.edittext_frome_scores);
        TextView textViewScore= this.findViewById(R.id.textview_score);
        buttonCalculate.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View view){
                String scores= editTextScores.getText().toString();
                string [] arrayScore= scores.split(",");
                BowlingGame game=new BowlingGame();
                for (int i=0;i< arrayScore.length;i++)
                {
                    game.roll(Integer.parseInt()arrayScore[i]);

                }
                textViewScore.setText("Total score is:"+game.score())
            }
        }
    }
}