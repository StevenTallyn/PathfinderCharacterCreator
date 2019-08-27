package com.example.pathfindercharactercreator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class DiceRoller extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roller);

    }

    public void roll(View view){
        TextView showRollTextView = (TextView) findViewById(R.id.roll_result);
        TextView showNum4TextView = (TextView) findViewById(R.id.num4sided);
        TextView showNum6TextView = (TextView) findViewById(R.id.num6sided);
        TextView showNum8TextView = (TextView) findViewById(R.id.num8sided);
        TextView showNum10TextView = (TextView) findViewById(R.id.num10sided);
        TextView showNum20TextView = (TextView) findViewById(R.id.num20sided);
        String rollString = showRollTextView.getText().toString();
        String num4String = showNum4TextView.getText().toString();
        String num6String = showNum6TextView.getText().toString();
        String num8String = showNum8TextView.getText().toString();
        String num10String = showNum10TextView.getText().toString();
        String num20String = showNum20TextView.getText().toString();

        Integer roll_result = 0;
        Integer num4sided = Integer.parseInt(num4String);
        Integer num6sided = Integer.parseInt(num6String);
        Integer num8sided = Integer.parseInt(num8String);
        Integer num10sided = Integer.parseInt(num10String);
        Integer num20sided = Integer.parseInt(num20String);

        for(int i=0; i < num4sided; i++)
        {
            Random random = new Random();
            int dieRoll = random.nextInt(4) + 1;
            roll_result = roll_result + dieRoll;
        }

        for(int i=0; i < num6sided; i++)
        {
            Random random = new Random();
            int dieRoll = random.nextInt(6) + 1;
            roll_result = roll_result + dieRoll;
        }

        for(int i=0; i < num8sided; i++)
        {
            Random random = new Random();
            int dieRoll = random.nextInt(8) + 1;
            roll_result = roll_result + dieRoll;
        }

        for(int i=0; i < num10sided; i++)
        {
            Random random = new Random();
            int dieRoll = random.nextInt(10) + 1;
            roll_result = roll_result + dieRoll;
        }

        for(int i=0; i < num20sided; i++)
        {
            Random random = new Random();
            int dieRoll = random.nextInt(20) + 1;
            roll_result = roll_result + dieRoll;
        }

        showRollTextView.setText(roll_result.toString());
    }
}
