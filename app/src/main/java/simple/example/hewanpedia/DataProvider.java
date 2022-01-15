package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Merak;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Katak;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Katak> initDataKatak(Context ctx) {
        List<Katak> kataks = new ArrayList<>();
        kataks.add(new Katak(ctx.getString(R.string.amazon_milk_frog_nama),ctx.getString(R.string.amazon_milk_frog_asal),
                ctx.getString(R.string.amazon_milk_frog_deskripsi), R.drawable.amazon_milk_frog));
        kataks.add(new Katak(ctx.getString(R.string.strowberry_nama),ctx.getString(R.string.strowberry_asal),
                ctx.getString(R.string.strowberry_deskripsi), R.drawable.strowberry_paison_dart_frog));
        kataks.add(new Katak(ctx.getString(R.string.clown_nama),ctx.getString(R.string.clown_asal),
                ctx.getString(R.string.clown_deskripsi), R.drawable.clown_tree_frog));
        kataks.add(new Katak(ctx.getString(R.string.read_nama),ctx.getString(R.string.read_asal),
                ctx.getString(R.string.read_deskripsi), R.drawable.read_ayes_tree_frog));
        kataks.add(new Katak(ctx.getString(R.string.ranitomeya_nama),ctx.getString(R.string.ranitomeya_asal),
                ctx.getString(R.string.ranitomeya_deskripsi), R.drawable.ranitomeya_amazonika));
        return kataks;
    }

    private static List<Merak> initDataMerak(Context ctx) {
        List<Merak> meraks = new ArrayList<>();
        meraks.add(new Merak(ctx.getString(R.string.kongo_nama),ctx.getString(R.string.kongo_asal),
                ctx.getString(R.string.kongo_deskripsi), R.drawable.merak_kongo));
        meraks.add(new Merak(ctx.getString(R.string.biru_nama),ctx.getString(R.string.biru_asal),
                ctx.getString(R.string.biru_deskripsi), R.drawable.merak_biru));
        meraks.add(new Merak(ctx.getString(R.string.hijau_nama),ctx.getString(R.string.hijau_asal),
                ctx.getString(R.string.hijau_deskripsi), R.drawable.merak_hijau));
        meraks.add(new Merak(ctx.getString(R.string.putih_nama),ctx.getString(R.string.putih_asal),
                ctx.getString(R.string.putih_deskripsi), R.drawable.merak_putih));
        return meraks;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci(ctx.getString(R.string.netherland_nama),ctx.getString(R.string.netherland_asal),
                ctx.getString(R.string.netherland_deskripsi), R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci(ctx.getString(R.string.orictolagus_nama),ctx.getString(R.string.orictolagus_asal),
                ctx.getString(R.string.orictolagus_deskripsi), R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci(ctx.getString(R.string.holland_nama),ctx.getString(R.string.holland_asal),
                ctx.getString(R.string.holland_deskripsi), R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.mini_nama),ctx.getString(R.string.mini_asal),
                ctx.getString(R.string.mini_deskripsi), R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.raksasa_nama),ctx.getString(R.string.raksasa_asal),
                ctx.getString(R.string.raksasa_deskripsi), R.drawable.kelinci_raksasa));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKatak(ctx));
        hewans.addAll(initDataMerak(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
