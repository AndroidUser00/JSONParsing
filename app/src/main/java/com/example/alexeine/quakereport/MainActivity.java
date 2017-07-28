package com.example.alexeine.quakereport;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
listView=(ListView)findViewById(R.id.list);
        final ArrayList<Data> earthquakes = QueryUtils.extractEarthquakes();
if (earthquakes.size()>0 && earthquakes!=null) {
    CustomAdapter customAdapter = new CustomAdapter(this, 1, earthquakes);
    listView.setAdapter(customAdapter);
}else{
    Toast.makeText(this, "Earth quake list is null", Toast.LENGTH_SHORT).show();

}
        final CustomAdapter adt = new CustomAdapter(this,1,earthquakes);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Data datass = adt.getItem(position);
Uri earthquakeUri = Uri.parse(datass.getUri());
                Intent webIntent = new Intent(Intent.ACTION_VIEW,earthquakeUri);
                startActivity(webIntent);
            }
        });
    }
}

