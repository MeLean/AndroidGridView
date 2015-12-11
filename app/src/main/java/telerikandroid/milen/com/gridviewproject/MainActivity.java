package telerikandroid.milen.com.gridviewproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    private GridView gvGallery;
    private GridItem[] gridItems;
    private PictureStringGridAdapter gridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridItems = new GridItem[]{
            new GridItem(getString(R.string.image_blue_text), R.drawable.blue),
            new GridItem(getString(R.string.image_stupid_text), R.drawable.stupid),
            new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                //uncomment the code below to test view-holder pattern.
                /*new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),
                new GridItem(getString(R.string.image_sunset_text), R.drawable.sunset),*/
            new GridItem(getString(R.string.image_winter_text), R.drawable.winter)
        };

        gvGallery = (GridView) findViewById(R.id.gridView);
        gvGallery.setOnItemClickListener(this);

        gridViewAdapter = new PictureStringGridAdapter(this, gridItems);

        gvGallery.setAdapter(gridViewAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String textOfItem = gridViewAdapter.getTextAtPosition(position);
        Toast.makeText(
                MainActivity.this,
                String.format("Item: \"%s\" at position %d has been clicked!", textOfItem, position),
                Toast.LENGTH_SHORT
        ).show();
    }
}
