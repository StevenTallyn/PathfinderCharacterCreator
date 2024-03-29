package com.example.pathfindercharactercreator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DiceRoller(View view) {
        Intent diceRollerIntent = new Intent(this, DiceRoller.class);
        startActivity(diceRollerIntent);
    }

    public void CharacterSheet(View view) {
        Intent characterSheetIntent = new Intent(this, CharacterSheet.class);
        startActivity(characterSheetIntent);
    }
}

