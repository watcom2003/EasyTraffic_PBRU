package th.ac.pbru.suwat.easytraffic;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
    // ประกาศตัวแปร เพื่อเตรียม RAM ในมือถือ
    // Explicit ประกาศตัวแปร
    private ListView trafficListView;    // complement key CTRL+SHIFT + Enter


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial Widget กด ALT + Enter
        initialWidget();

    }  // Main Method นี่คือ เมธอดหลัก

    private void initialWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);

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
}  // Main Class นี่คือ คลาสหลัก
