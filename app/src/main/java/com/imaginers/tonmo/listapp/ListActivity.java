package com.imaginers.tonmo.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] mContacts ={"Rafi","Tusher","Ishayat","Shohag","Armaan"};
    ListView mContactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //bind the listview id to this class
        mContactList = (ListView)findViewById(R.id.contactsLV);
        //to create adapter and pass context,built-in simple list item &
        // array data to the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mContacts);
        //adapter needed to attached to the listview
        //to set the listview data to a simple view
        mContactList.setAdapter(adapter);
        //set for listening to the clicks on the row
        //need to implement OnItemClickListner
        mContactList.setOnItemClickListener(this);
    }

    //onItemClick implementation overrides this onItemClick method as
    //interfaces rules are to override them
    //AdapterView is the ListView,View is the row,position is
    // the position of textview and id is id of textview

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//        holding the clicked row data of the list
        TextView holder = (TextView)view;
        Toast.makeText(this,holder.getText()+" "+position,Toast.LENGTH_SHORT).show();
    }
}
