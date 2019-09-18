package com.example.pathfindercharactercreator;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOverview extends Fragment {


    public FragmentOverview() {
        // Required empty public constructor
    }


    SharedPreferences sp;
    EditText nameTV;
    EditText raceTV;
    EditText classTV;
    EditText deityTV;
    EditText levelTV;
    EditText genderTV;
    EditText bioTV;

    String myPreferences = "myPref";
    String Name = "nameKey";
    String Race = "raceKey";
    String Class = "classKey";
    String Deity = "dietyKey";
    String Level = "levelKey";
    String Gender = "genderKey";
    String Bio = "bioKey";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_overview, container, false);

        FloatingActionButton fab = view.findViewById(R.id.floatingActionButton2);
        FloatingActionButton fab2 = view.findViewById(R.id.floatingActionButton3);
        sp = getContext().getSharedPreferences(myPreferences, Context.MODE_PRIVATE);
        fab.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                nameTV =  getView().findViewById(R.id.char_text);
                raceTV =  getView().findViewById(R.id.race_text);
                classTV = getView().findViewById(R.id.class_text);
                deityTV = getView().findViewById(R.id.diety_text);
                levelTV = getView().findViewById(R.id.level_text);
                genderTV = getView().findViewById(R.id.gender_text);
                bioTV = getView().findViewById(R.id.bio_text);

                String char_name = nameTV.getText().toString();
                String race = raceTV.getText().toString();
                String class_name = classTV.getText().toString();
                String deity = deityTV.getText().toString();
                String level = levelTV.getText().toString();
                String gender = genderTV.getText().toString();
                String bio = bioTV.getText().toString();

                SharedPreferences.Editor editor = sp.edit();
                editor.putString(Name, char_name);
                editor.putString(Race, race);
                editor.putString(Class, class_name);
                editor.putString(Deity, deity);
                editor.putString(Level, level);
                editor.putString(Gender, gender);
                editor.putString(Bio, bio);
                editor.apply();
                Toast.makeText(getActivity(), "Saved Character",Toast.LENGTH_LONG).show();
            }

        });

        fab2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                nameTV = getView().findViewById(R.id.char_text);
                raceTV = getView().findViewById(R.id.race_text);
                classTV = getView().findViewById(R.id.class_text);
                deityTV = getView().findViewById(R.id.diety_text);
                levelTV = getView().findViewById(R.id.level_text);
                genderTV = getView().findViewById(R.id.gender_text);
                bioTV = getView().findViewById(R.id.bio_text);

                if (sp.contains(Name)) {
                    nameTV.setText(sp.getString(Name, ""));
                }
                if (sp.contains(Race)) {
                    raceTV.setText(sp.getString(Race, ""));
                }
                if (sp.contains(Class)) {
                    classTV.setText(sp.getString(Class, ""));
                }
                if (sp.contains(Deity)) {
                    deityTV.setText(sp.getString(Deity, ""));
                }
                if (sp.contains(Level)) {
                    levelTV.setText(sp.getString(Level, ""));
                }
                if (sp.contains(Gender)) {
                    genderTV.setText(sp.getString(Gender, ""));
                }
                if (sp.contains(Bio)) {
                    bioTV.setText(sp.getString(Bio, ""));
                }
            }
        });

        return view;
    }

}
