package com.example.pathfindercharactercreator;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEquipment extends Fragment {


    ListView listView;
    ArrayList<String> list;
    Button addButton;
    EditText addText;

    public FragmentEquipment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_equipment, container, false);

        listView = (ListView) view.findViewById(R.id.list_view);
        addText = view.findViewById(R.id.addEquipText);
        addButton = view.findViewById(R.id.addEquipButton);
        list = new ArrayList<>();


        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list);

        View.OnClickListener addListener = new View.OnClickListener(){

            @Override
            public void onClick(View view){

                list.add(addText.getText().toString());
                addText.setText("");
                adapter.notifyDataSetChanged();

            }
        };

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                adapter.remove(list.get(i));
                adapter.notifyDataSetChanged();
                return false;
            }
        });
        addButton.setOnClickListener(addListener);
        listView.setAdapter(adapter);

        return view;
    }


}
