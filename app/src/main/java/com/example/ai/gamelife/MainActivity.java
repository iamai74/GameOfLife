package com.example.ai.gamelife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    int size = 9;
    LifeCycle cycle;
    GridView gvMain;
    ArrayAdapter<Integer> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cycle = new LifeCycle(size);
        cycle.setNewStartArray(false);
        adapter = new ArrayAdapter<Integer>(this, R.layout.item, R.id.tvText, cycle.getArray());
        gvMain = (GridView) findViewById(R.id.sandBox);
        gvMain.setAdapter(adapter);

        gvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                View cell = gvMain.getChildAt(i);
                cycle.toggleItem(i);
                cell.setBackgroundColor(cycle.getColor(i));
            }
        });
    }
}
