package bc0nt13.findme

import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.support.v7.widget.LinearLayoutManager
import butterknife.bindView
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.view.View
import android.content.Intent
import bc0nt13.findme.resource.RoomApi
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

public class MainActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val map = (getFragmentManager().findFragmentById(R.id.map) as MapFragment).getMap();

        val sydney = LatLng(-33.867, 151.206);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13.0f));
    }
}
