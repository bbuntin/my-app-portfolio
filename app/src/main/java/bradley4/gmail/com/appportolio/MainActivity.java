package bradley4.gmail.com.appportolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spot_str = (Button) findViewById(R.id.spotify_streamer);
        spot_str.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch SPOTIFY STREAMER.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button scores_app = (Button) findViewById(R.id.scores_app);
        scores_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch SCORE APP.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button lib_app = (Button) findViewById(R.id.library_app);
        lib_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch LIBRARY APP.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button build_big = (Button) findViewById(R.id.build_it_bigger);
        build_big.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch BUILD IT BIGGER.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button xyz_reader = (Button) findViewById(R.id.xyz_reader);
        xyz_reader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch XYZ READER.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button cap_app = (Button) findViewById(R.id.capstone_my_own_app);
        cap_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch CAPSTONE: MY OWN APP.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
