package br.com.renanpetronilho.copadascopas.tela;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.renanpetronilho.copadascopas.R;
import br.com.renanpetronilho.copadascopas.adapter.JogadorAdapter;
import br.com.renanpetronilho.copadascopas.api.GolApi;
import br.com.renanpetronilho.copadascopas.api.JogadorApi;
import br.com.renanpetronilho.copadascopas.entidade.Gol;
import br.com.renanpetronilho.copadascopas.entidade.Jogador;
import br.com.renanpetronilho.copadascopas.util.Copa;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemClick;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by renan on 14/06/15.
 */
public class JogadorActivity extends Activity {

    @InjectView(R.id.lvGeral) protected ListView lvJogador;
    private List<Jogador> lJogadores;

    public static String ENDPOINT = "https://montanaflynn-fifa-world-cup.p.mashape.com";

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.lista_activity);
        ButterKnife.inject(JogadorActivity.this);
        request();
    }

    protected void request(){
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();
        JogadorApi api = adapter.create(JogadorApi.class);

        api.getJogador(new Callback<List<Jogador>>() {
            @Override
            public void success(List<Jogador> jogadores, Response response) {
                lJogadores = jogadores;
                requestGols();
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(Copa.LOG, "Erro ao realizar o request: " + error.getMessage());
            }
        });

    }

    protected  void requestGols(){
        List<Gol> gols = new ArrayList<Gol>();
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(ENDPOINT).build();
        GolApi api = adapter.create(GolApi.class);
        api.getGol(new Callback<List<Gol>>() {
            @Override
            public void success(List<Gol> gols, Response response) {
                adicionarGol(gols);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(Copa.LOG, "Erro ao realizar o request: " + error.getMessage());
            }
        });

    }

    protected void adicionarGol(List<Gol> gols){
        for(Gol gol : gols){
            for(Jogador jogador : lJogadores){
                if(gol.getPerson_id() == jogador.getId()){
                    jogador.getGols().add(gol);
                    break;
                }
            }
        }
        atualizarLista();
    }


    public void atualizarLista(){
        JogadorAdapter adapter = new JogadorAdapter(lJogadores,getApplication());
        lvJogador.setAdapter(adapter);
    }


    @OnItemClick(R.id.lvGeral)
    public void seleciona_item(int position){
        Log.d(Copa.LOG, lJogadores.get(position).toString());
        Toast.makeText(this, lJogadores.get(position).toString(), Toast.LENGTH_LONG).show();
    }


}
