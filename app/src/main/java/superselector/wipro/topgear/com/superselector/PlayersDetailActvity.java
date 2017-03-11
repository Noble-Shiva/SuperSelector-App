package superselector.wipro.topgear.com.superselector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class PlayersDetailActvity extends AppCompatActivity {

    ImageView playerImg;
    TextView playerDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent=getIntent();
        Bundle b=intent.getExtras();
        String i=b.getString("selectedItems");
        //int pos=intent.getIntExtra("position");



        String[] sports = getResources().getStringArray(R.array.sports_person_details_array);

        String[] player_names={ "Mahendra Singh Dhoni",
                "Virat Kohli",
                "Yuvraj Singh",
                "Ajinkya Rahane",
                "Ishanth Sharma",
                "Amit Mishra",
                "Shikhar Dhawan",
                "Suresh Raina",
                "K.L. Rahul",
                "Rohith Sharma",
                "Mohammed Shami",
                "Ravichandran Ashwin",
                "Ravindra Jadeja",
                "Cheteshwar Pujara",
                "Umesh Yadav"
        };


        int[] player_images= { R.drawable.ms_dhoni,
                R.drawable.virat_kohli,
                R.drawable.yuvraj_singh1,
                R.drawable.ajinkya_rahane_,
                R.drawable.ishant_sharma1,
                R.drawable.amit_mishra1,
                R.drawable.shikhar_dhawan,
                R.drawable.suresh_raina,
                R.drawable.lokesh_rahul1,
                R.drawable.rohit_sharma,
                R.drawable.shami_ahmed1,
                R.drawable.ravichandran_ashwin,
                R.drawable.ravindra_jadeja,
                R.drawable.cheteshwar_pujara1,
                R.drawable.umesh_yadav

        };

        playerImg= (ImageView) findViewById(R.id.imgPlayer);
        playerDetails= (TextView) findViewById(R.id.playerDetails);

        switch (i)
        {

            case "Dhoni" :
                playerDetails.setText("Name      : " + player_names[0] + System.getProperty ("line.separator") + "Age          : 35"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[0]);
                break;

            case "Kohli" :
                playerDetails.setText("Name      : " + player_names[1] + System.getProperty ("line.separator") + "Age          : 28"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[1]);
                break;

            case "Yuvraj" :
                playerDetails.setText("Name      : " + player_names[2] + System.getProperty ("line.separator") + "Age          : 35"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[2]);
                break;

            case "Rahane" :
                playerDetails.setText("Name      : " + player_names[3] + System.getProperty ("line.separator") + "Age          : 28"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[3]);
                break;

            case "Ishanth" :
                playerDetails.setText("Name      : " + player_names[4] + System.getProperty ("line.separator") + "Age          : 28"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[4]);
                break;

            case "Mishra" :
                playerDetails.setText("Name      : " + player_names[5] + System.getProperty ("line.separator") + "Age          : 34"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[5]);
                break;

            case "Dhawan" :
                playerDetails.setText("Name      : " + player_names[6] + System.getProperty ("line.separator") + "Age          : 31"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[6]);
                break;

            case "Raina" :
                playerDetails.setText("Name      : " + player_names[7] + System.getProperty ("line.separator") + "Age          : 30"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[7]);
                break;

            case "Rahul" :
                playerDetails.setText("Name      : " + player_names[8] + System.getProperty ("line.separator") + "Age          : 24"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[8]);
                break;

            case "Sharma" :
                playerDetails.setText("Name      : " + player_names[9] + System.getProperty ("line.separator") + "Age          : 29"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[9]);
                break;

            case "Shami" :
                playerDetails.setText("Name      : " + player_names[10] + System.getProperty ("line.separator") + "Age          : 26"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[10]);
                break;

            case "Ashwin" :
                playerDetails.setText("Name      : " + player_names[11] + System.getProperty ("line.separator") + "Age          : 30"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[11]);
                break;

            case "Jadeja" :
                playerDetails.setText("Name      : " + player_names[12] + System.getProperty ("line.separator") + "Age          : 28"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[12]);
                break;

            case "Pujara" :
                playerDetails.setText("Name      : " + player_names[13] + System.getProperty ("line.separator") + "Age          : 29"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[13]);
                break;

            case "Yadav" :
                playerDetails.setText("Name      : " + player_names[14] + System.getProperty ("line.separator") + "Age          : 29"
                        + System.getProperty ("line.separator") + "Country   : INDIA");
                playerImg.setImageResource(player_images[14]);
                break;

        }


    }
}
