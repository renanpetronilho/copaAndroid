package br.com.renanpetronilho.copadascopas.api;

import java.util.List;

import br.com.renanpetronilho.copadascopas.entidade.Gol;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;

/**
 * Created by renan on 14/06/15.
 */
public interface GolApi {


    @Headers("X-Mashape-Key: Flem49jLbDmshzeVEuuI9MiFihLxp11XHIOjsnZZL6ra3eEGz0")
    @GET("/goals")
    public void getGol(Callback<List<Gol>> response);
}
