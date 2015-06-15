package br.com.renanpetronilho.copadascopas.tela;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import br.com.renanpetronilho.copadascopas.R;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by renan on 14/06/15.
 */
public class MainActivity extends Activity {

    @InjectView(R.id.btTime) protected Button btTime;
    @InjectView(R.id.btJogador) protected Button btJogador;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.main_activity);
        ButterKnife.inject(MainActivity.this);
    }

    @OnClick(R.id.btTime)
    protected void click_time(){
        chamar_classe(TimesActivity.class);

    }

    @OnClick(R.id.btJogador)
    protected void click_jogador(){
        chamar_classe(JogadorActivity.class);
    }

    protected void chamar_classe(Class<?> cls){
        Intent it = new Intent(MainActivity.this, cls);
        startActivity(it);
    }
}
