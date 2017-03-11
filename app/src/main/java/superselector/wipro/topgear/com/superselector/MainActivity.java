package superselector.wipro.topgear.com.superselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    int checkBoxes;
    Button selectButton;
    ListView playerListView;
    ArrayAdapter<String> listadapter;

    /* Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        playerListView = (ListView) findViewById(R.id.list_of_players);
        selectButton = (Button) findViewById(R.id.Select_Players_Button);

        String[] sports = getResources().getStringArray(R.array.sports_array);
        listadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, sports);
        playerListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        playerListView.setAdapter(listadapter);

        selectButton.setOnClickListener(this);
    }
/* Click On select button performs following actions*/
    @Override
    public void onClick(View view) {
        SparseBooleanArray checked = playerListView.getCheckedItemPositions();
        checkBoxes=playerListView.getCheckedItemCount();
        ArrayList<String> selectedItems = new ArrayList<String>();
        for (int i = 0; i < checked.size(); i++) {
            // Item position in adapter
            int position = checked.keyAt(i);
            // Add sport if it is checked i.e.) == TRUE!
            if (checked.valueAt(i))
                selectedItems.add(listadapter.getItem(position));
        }

        String[] outputStrArr = new String[selectedItems.size()];

        for (int i = 0; i < selectedItems.size(); i++) {
            outputStrArr[i] = selectedItems.get(i);
        }


        Intent intent = new Intent(getApplicationContext(),
                SelectedPlayersActivity.class);

        // Create a bundle object
        Bundle b = new Bundle();
        b.putStringArray("selectedItems", outputStrArr);

        Toast.makeText(MainActivity.this,"Please select 11 players", Toast.LENGTH_SHORT).show();

        if(outputStrArr.length==0 )
        {  //if user didnt select any palyers
            Toast.makeText(MainActivity.this,"Please select 11 players", Toast.LENGTH_SHORT).show();
        }
        else if(checkBoxes==11){

            //if user select 11 palyers

            // Add the bundle to the intent.
            intent.putExtras(b);

            // start the ResultActivity
            startActivity(intent);
        }

        else {
            //if user select less than 11 palyers
            Toast.makeText(MainActivity.this, "Please select only 11 players and you have selected "+checkBoxes+" players", Toast.LENGTH_SHORT).show();
        }
    }
}
