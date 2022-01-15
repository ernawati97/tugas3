package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKatak,btnMerak,btnKelinci;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKatak = findViewById(R.id.btn_buka_ras_katak);
        btnMerak = findViewById(R.id.btn_buka_ras_merak);
        btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
        btnKatak.setOnClickListener(view -> bukaGaleri("Katak"));
        btnMerak.setOnClickListener(view -> bukaGaleri("Merak"));
        btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity merak");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void btn_profil(View view) {
        Intent intent = new Intent(MainActivity.this, DaftarHewanActivity.class);
        startActivity(intent);
    }
}