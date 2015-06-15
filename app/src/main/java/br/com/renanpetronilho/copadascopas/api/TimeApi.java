package br.com.renanpetronilho.copadascopas.api;

import java.util.List;

import br.com.renanpetronilho.copadascopas.entidade.Time;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;

/**
 * Created by renan on 12/06/15.
 */
public interface TimeApi {

    //Flem49jLbDmshzeVEuuI9MiFihLxp11XHIOjsnZZL6ra3eEGz0
    @Headers("X-Mashape-Key: Flem49jLbDmshzeVEuuI9MiFihLxp11XHIOjsnZZL6ra3eEGz0")
    @GET("/teams")
    public void getTime(Callback<List<Time>> response);

}
