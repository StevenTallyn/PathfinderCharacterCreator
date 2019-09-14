package com.example.pathfindercharactercreator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAttributes extends Fragment {

    public FragmentAttributes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_attributes,
                container, false);

        final Button button = (Button) view.findViewById(R.id.update);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onClickUpdate(v);

            }
        });
        return view;
    }

    public void onClickUpdate(View view) {

        TextView strScoreTV = (TextView) getView().findViewById(R.id.strAttribute);
        TextView strModTV = (TextView) getView().findViewById(R.id.strMod);
        TextView dexScoreTV = (TextView) getView().findViewById(R.id.dexAttribute);
        TextView dexModTV = (TextView) getView().findViewById(R.id.dexMod);
        TextView conScoreTV = (TextView) getView().findViewById(R.id.conAttribute);
        TextView conModTV = (TextView) getView().findViewById(R.id.conMod);
        TextView intScoreTV = (TextView) getView().findViewById(R.id.intAttribute);
        TextView intModTV = (TextView) getView().findViewById(R.id.intMod);
        TextView wisScoreTV = (TextView) getView().findViewById(R.id.wisAttribute);
        TextView wisModTV = (TextView) getView().findViewById(R.id.wisMod);
        TextView chaScoreTV = (TextView) getView().findViewById(R.id.chaAttribute);
        TextView chaModTV = (TextView) getView().findViewById(R.id.chaMod);

        String strScoreString = strScoreTV.getText().toString();
        String dexScoreString = dexScoreTV.getText().toString();
        String conScoreString = conScoreTV.getText().toString();
        String intScoreString = intScoreTV.getText().toString();
        String wisScoreString = wisScoreTV.getText().toString();
        String chaScoreString = chaScoreTV.getText().toString();

        Integer strMod;
        Integer dexMod;
        Integer conMod;
        Integer intMod;
        Integer wisMod;
        Integer chaMod;

        Integer strScore = 0;
        Integer dexScore = 0;
        Integer conScore = 0;
        Integer intScore = 0;
        Integer wisScore = 0;
        Integer chaScore = 0;

        if(!strScoreString.isEmpty()) {
            strScore = Integer.parseInt(strScoreString);
        }
        if(!dexScoreString.isEmpty()) {
            dexScore = Integer.parseInt(dexScoreString);
        }
        if(!conScoreString.isEmpty()) {
            conScore = Integer.parseInt(conScoreString);
        }
        if(!intScoreString.isEmpty()) {
            intScore = Integer.parseInt(intScoreString);
        }
        if(!wisScoreString.isEmpty()) {
            wisScore = Integer.parseInt(wisScoreString);
        }
        if(!chaScoreString.isEmpty()) {
            chaScore = Integer.parseInt(chaScoreString);
        }

        strMod = (strScore - 10)/2;
        dexMod = (dexScore - 10)/2;
        conMod = (conScore - 10)/2;
        intMod = (intScore - 10)/2;
        wisMod = (wisScore - 10)/2;
        chaMod = (chaScore - 10)/2;

        if (strMod > 0){
            strModTV.setText("+" + strMod.toString());
        }else {
            strModTV.setText(strMod.toString());
        }
        if (dexMod > 0){
            dexModTV.setText("+" + dexMod.toString());
        }else {
            dexModTV.setText(dexMod.toString());
        }
        if (conMod > 0){
            conModTV.setText("+" + conMod.toString());
        }else {
            conModTV.setText(conMod.toString());
        }
        if (intMod > 0){
            intModTV.setText("+" + intMod.toString());
        }else {
            intModTV.setText(intMod.toString());
        }
        if (wisMod > 0){
            wisModTV.setText("+" + wisMod.toString());
        }else {
            wisModTV.setText(wisMod.toString());
        }
        if (chaMod > 0){
            chaModTV.setText("+" + chaMod.toString());
        }else {
            chaModTV.setText(chaMod.toString());
        }
    }
}
