package Map.Zoo;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.graphics.Canvas;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;




        LatLng phxzoo = new LatLng(33.4519,   -111.9489);
        mMap.addMarker(new MarkerOptions().position(phxzoo).title("Phoenix Zoo").icon(BitmapDescriptorFactory.fromResource(R.drawable.phxzoo1)));
        float zoomLevel = 18.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(phxzoo, zoomLevel));

        LatLng africanlion = new LatLng(33.4501,    -111.9453);
        mMap.addMarker(new MarkerOptions().position(africanlion).title("African Lion").icon(BitmapDescriptorFactory.fromResource(R.drawable.africanlion1png)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(africanlion));

        LatLng hyena = new LatLng(33.4496,    -111.9451);
        mMap.addMarker(new MarkerOptions().position(hyena).title("Hyena").icon(BitmapDescriptorFactory.fromResource(R.drawable.hyena1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hyena));

        LatLng tiger = new LatLng(33.4498,   -111.9491);
        mMap.addMarker(new MarkerOptions().position(tiger).title("Sumatran Tiger").icon(BitmapDescriptorFactory.fromResource(R.drawable.tiger1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tiger));

        LatLng asianelephant = new LatLng(33.4489,    -111.9503);
        mMap.addMarker(new MarkerOptions().position(asianelephant).title("Asian Elephant").icon(BitmapDescriptorFactory.fromResource(R.drawable.asianelephant1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(asianelephant));

        LatLng baldeagle = new LatLng(33.4515,    -111.9468);
        mMap.addMarker(new MarkerOptions().position(baldeagle).title("Bald Eagle").icon(BitmapDescriptorFactory.fromResource(R.drawable.baldeagle1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(baldeagle));

        LatLng cheetah = new LatLng(33.4480,   -111.9458);
        mMap.addMarker(new MarkerOptions().position(cheetah).title("Cheetah").icon(BitmapDescriptorFactory.fromResource(R.drawable.cheetah1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cheetah));

        LatLng sloth = new LatLng(33.4506,   -111.9515);
        mMap.addMarker(new MarkerOptions().position(sloth).title("Sloth").icon(BitmapDescriptorFactory.fromResource(R.drawable.sloth1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sloth));

        LatLng orangutan = new LatLng(33.4489,   -111.9491);
        mMap.addMarker(new MarkerOptions().position(orangutan).title("Orangutan").icon(BitmapDescriptorFactory.fromResource(R.drawable.orangutan1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(orangutan));

        LatLng wolf = new LatLng(33.4519,   -111.9465);
        mMap.addMarker(new MarkerOptions().position(wolf).title("Mexican Wolf").icon(BitmapDescriptorFactory.fromResource(R.drawable.mexicanwolf1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wolf));

        LatLng jaguar = new LatLng(33.4497,   -111.9504);
        mMap.addMarker(new MarkerOptions().position(jaguar).title("Jaguar").icon(BitmapDescriptorFactory.fromResource(R.drawable.jaguar1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jaguar));

        LatLng giraffe = new LatLng(33.4503,  -111.9469);
        mMap.addMarker(new MarkerOptions().position(giraffe).title("Giraffe").icon(BitmapDescriptorFactory.fromResource(R.drawable.giraffe1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(giraffe));

        LatLng bear = new LatLng(33.4482,   -111.9499);
        mMap.addMarker(new MarkerOptions().position(bear).title("Andean Bear").icon(BitmapDescriptorFactory.fromResource(R.drawable.andeanbear1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bear));

        LatLng mountainlion = new LatLng(33.4519,   -111.9461);
        mMap.addMarker(new MarkerOptions().position(mountainlion).title("Mountain Lion").icon(BitmapDescriptorFactory.fromResource(R.drawable.mountainlion1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mountainlion));

        LatLng komodo = new LatLng(33.4497,   -111.9487);
        mMap.addMarker(new MarkerOptions().position(komodo).title("Komodo Dragon").icon(BitmapDescriptorFactory.fromResource(R.drawable.komododragon1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(komodo));

        LatLng rhino = new LatLng(33.4492,      -111.9453);
        mMap.addMarker(new MarkerOptions().position(rhino).title("Rhino").icon(BitmapDescriptorFactory.fromResource(R.drawable.rhino1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rhino));

        LatLng otter = new LatLng(33.4482,   -111.9473);
        mMap.addMarker(new MarkerOptions().position(otter).title("Spotted-Neck Otter").icon(BitmapDescriptorFactory.fromResource(R.drawable.otter1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(otter));

        LatLng fox = new LatLng(33.4505,    -111.9458);
        mMap.addMarker(new MarkerOptions().position(fox).title("Fennec Fox").icon(BitmapDescriptorFactory.fromResource(R.drawable.fennecfox1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fox));

        LatLng flamingo = new LatLng(33.4486,    -111.9474);
        mMap.addMarker(new MarkerOptions().position(flamingo).title("Flamingo").icon(BitmapDescriptorFactory.fromResource(R.drawable.flamingo1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(flamingo));

        LatLng zebra = new LatLng(33.4493,    -111.9472);
        mMap.addMarker(new MarkerOptions().position(zebra).title("Grevy Zebra").icon(BitmapDescriptorFactory.fromResource(R.drawable.zebra1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(zebra));

        LatLng baboon = new LatLng(33.4488,     -111.9453);
        mMap.addMarker(new MarkerOptions().position(baboon).title("Baboon").icon(BitmapDescriptorFactory.fromResource(R.drawable.baboon1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(baboon));





    }
}
