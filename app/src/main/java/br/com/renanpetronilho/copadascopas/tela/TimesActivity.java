package br.com.renanpetronilho.copadascopas.tela;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.com.renanpetronilho.copadascopas.R;
import br.com.renanpetronilho.copadascopas.adapter.TimeAdapter;
import br.com.renanpetronilho.copadascopas.api.TimeApi;
import br.com.renanpetronilho.copadascopas.entidade.Time;
import br.com.renanpetronilho.copadascopas.util.Copa;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemClick;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by renan on 12/06/15.
 */
public class TimesActivity extends Activity {

    //Link da API https://www.mashape.com/montanaflynn/fifa-world-cup#teams

    public static String ENDPOINT = "https://montanaflynn-fifa-world-cup.p.mashape.com";

    @InjectView(R.id.lvGeral) ListView lvTimes;
    private List<Time> lTimes;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.lista_activity);
        ButterKnife.inject(this);
        request();
    }

    public void request(){
        try {
            RestAdapter adapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();
            TimeApi api = adapter.create(TimeApi.class);

            api.getTime(new Callback<List<Time>>() {
                @Override
                public void success(List<Time> times, Response response) {
                    lTimes = times;
                    atualizarLista();
                }

                @Override
                public void failure(RetrofitError error) {
                    Log.d(Copa.LOG, "Erro ao realizar o request: " + error.getMessage());
                }
            });
        }catch (Exception e){
            Log.d(Copa.LOG, "Erro : " + e.getMessage());
        }

    }

    public void atualizarLista(){
        TimeAdapter adapter = new TimeAdapter(lTimes,getApplicationContext());
        lvTimes.setAdapter(adapter);
    }


    @OnItemClick(R.id.lvGeral)
    public void seleciona_item(int position){
        Log.d(Copa.LOG, lTimes.get(position).toString());
        Toast.makeText(this, lTimes.get(position).toString(), Toast.LENGTH_LONG).show();
    }

}
