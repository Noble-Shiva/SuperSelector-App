package superselector.wipro.topgear.com.superselector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SelectedPlayersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_list);

        Bundle b = getIntent().getExtras();
        final String[] resultArr = b.getStringArray("selectedItems");
        ListView selectedList = (ListView) findViewById(R.id.selectedList);

        ArrayAdapter<String> listadapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, resultArr);
        selectedList.setAdapter(listadapter);



        selectedList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3)
            {
                //   Toast.makeText(ResultActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SelectedPlayersActivity.this, PlayersDetailActvity.class);
                intent.putExtra("selectedItems",resultArr[position]);
                //intent.putExtra("position",)

                startActivity(intent);
            }
        });
    }
}
