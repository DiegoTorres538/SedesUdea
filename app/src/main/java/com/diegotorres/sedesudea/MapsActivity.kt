package com.diegotorres.sedesudea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
    companion object{
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }

    private lateinit var map1: GoogleMap
    private lateinit var map2: GoogleMap
    private lateinit var map3: GoogleMap
    private lateinit var map4: GoogleMap
    private lateinit var map5: GoogleMap
    private lateinit var map6: GoogleMap
    private lateinit var map7: GoogleMap
    private lateinit var map8: GoogleMap
    private lateinit var map9: GoogleMap
    private lateinit var map10: GoogleMap
    private lateinit var map11: GoogleMap
    private lateinit var map12: GoogleMap
    private lateinit var map13: GoogleMap
    private lateinit var map14: GoogleMap
    private lateinit var map15: GoogleMap
    private lateinit var map16: GoogleMap
    private lateinit var map17: GoogleMap
    private lateinit var map18: GoogleMap
    private lateinit var map19: GoogleMap



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map1 = googleMap
        map2 = googleMap
        map3 = googleMap
        map4 = googleMap
        map5 = googleMap
        map6 = googleMap
        map7 = googleMap
        map8 = googleMap
        map9 = googleMap
        map10 = googleMap
        map11 = googleMap
        map12 = googleMap
        map13 = googleMap
        map14 = googleMap
        map15 = googleMap
        map16 = googleMap
        map17 = googleMap
        map18 = googleMap
        map19 = googleMap
        // Add a marker in Sydney and move the camera
        val udea = LatLng(6.267470, -75.570862)
        map1.addMarker(MarkerOptions().position(udea).title("Alma Mater"))
        map1.moveCamera(CameraUpdateFactory.newLatLngZoom(udea,15F))

        val sedeRobledo = LatLng(6.270959, -75.587287)
        map2.addMarker(MarkerOptions().position(sedeRobledo).title("Sede Robledo"))

        val antEscDer = LatLng(6.245893,-75.563361)
        map3.addMarker(MarkerOptions().position(antEscDer).title("Antigua Escuela de Derecho"))

        val paranInfo = LatLng(6.246623,-75.564358)
        map4.addMarker(MarkerOptions().position(paranInfo).title("Paraninfo UdeA"))

        val edSuraMericana = LatLng(6.25057,-75.569472)
        map5.addMarker(MarkerOptions().position(edSuraMericana).title("Edificio Suramenricana del Centro"))

        val sedPosgrado = LatLng(6.198092,-75.584625)
        map6.addMarker(MarkerOptions().position(sedPosgrado).title("Sede de Posgrados"))

        val areaSalud = LatLng(6.26133,-75.56634)
        map7.addMarker(MarkerOptions().position(areaSalud).title("Area de la Salud"))

        val liceoFran = LatLng(6.170568,-75.585632)
        map8.addMarker(MarkerOptions().position(liceoFran).title("Liceo Francisco Restrepo Molina"))

        val udeaMagdalena = LatLng(6.492837,-74.409573)
        map9.addMarker(MarkerOptions().position(udeaMagdalena).title("UdeA Seccional Magdalena Medio"))

        val udeaBajoCauca = LatLng(7.991959,-75.201438)
        map10.addMarker(MarkerOptions().position(udeaBajoCauca).title("UdeA Seccional Bajo Cauca"))

        val udeaOcc = LatLng(6.555072,-75.826444)
        map11.addMarker(MarkerOptions().position(udeaOcc).title("UdeA Seccional Occidente"))

        val udeaOr = LatLng(6.105772,-75.38748)
        map12.addMarker(MarkerOptions().position(udeaOr).title("UdeA Seccional Oriente"))

        val udeaSonson = LatLng(5.719201,-75.29704)
        map13.addMarker(MarkerOptions().position(udeaSonson).title("UdeA Sede Sonsón"))

        val udeaTurbo = LatLng(8.100829,-76.716309)
        map14.addMarker(MarkerOptions().position(udeaTurbo).title("UdeA Sede Ciencias del Mar"))

        val udeaAmalfi = LatLng(6.90712,-75.07401)
        map15.addMarker(MarkerOptions().position(udeaAmalfi).title("UdeA Sede Nordeste-Amalfi"))

        val udeaSuroeste = LatLng(5.692769,-75.881769)
        map16.addMarker(MarkerOptions().position(udeaSuroeste).title("UdeA Seccional Suroeste"))

        val udeaCarepa = LatLng(7.773801,-76.663406)
        map17.addMarker(MarkerOptions().position(udeaCarepa).title("UdeA Sede Tulenapa"))

        val udeaApartado = LatLng(7.869699,-76.636709)
        map18.addMarker(MarkerOptions().position(udeaApartado).title("UdeA Sede Apartadó-Seccional Urabá"))

        val udeaYarumal = LatLng(6.962189,-75.417726)
        map19.addMarker(MarkerOptions().position(udeaYarumal).title("UdeA Sede Norte"))

        map1
        map2
        map3
        map4
        map5
        map6
        map7
        map8
        map9
        map10
        map11
        map12
        map13
        map14
        map15
        map16
        map17
        map18
        map19
        /*if(ActivityCompat.checkSelfPermission(this,
                        android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                    LOCATION_PERMISSION_REQUEST_CODE)
            return
        }

        mMap.isMyLocationEnabled = true*/
    }


}
