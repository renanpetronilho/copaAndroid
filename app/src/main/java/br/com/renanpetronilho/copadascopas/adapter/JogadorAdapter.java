package br.com.renanpetronilho.copadascopas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.renanpetronilho.copadascopas.R;
import br.com.renanpetronilho.copadascopas.entidade.Jogador;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by renan on 14/06/15.
 */
public class JogadorAdapter extends BaseAdapter {
    private List<Jogador> jogadores;
    private LayoutInflater inflater;

    public JogadorAdapter(List<Jogador> jogadores, Context ctx){
        this.jogadores = jogadores;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return jogadores.size();
    }

    @Override
    public Object getItem(int position) {
        return jogadores.get(position);
    }

    @Override
    public long getItemId(int position) {
        return jogadores.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        HolderView holder;
        if(view != null){
            holder = (HolderView) view.getTag();
        }else{
            view = inflater.inflate(R.layout.linha_jogador,null);
            holder = new HolderView(view);
            view.setTag(holder);
        }

        holder.tvNome.setText(jogadores.get(position).getName());
        holder.tvGol.setText(" "+String.valueOf(jogadores.get(position).getGols().size()));

        return view;
    }

    static class HolderView{
        @InjectView(R.id.tvNome) TextView tvNome;
        @InjectView(R.id.tvGol) TextView tvGol;
        public HolderView(View view){
            ButterKnife.inject(this,view);
        }
    }
}
