package br.com.renanpetronilho.copadascopas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


import br.com.renanpetronilho.copadascopas.R;
import br.com.renanpetronilho.copadascopas.entidade.Time;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by renan on 12/06/15.
 */
public class TimeAdapter extends BaseAdapter {

    private List<Time> times;
    private LayoutInflater inflater;

    public TimeAdapter(List<Time> lista, Context context){
        this.times = lista;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return times.size();
    }

    @Override
    public Object getItem(int position) {
        return times.get(position);
    }

    @Override
    public long getItemId(int position) {
        return times.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        HolderView holder;
        if(view != null){
            holder = (HolderView) view.getTag();
        }else{
            view = inflater.inflate(R.layout.linha_time,null);
            holder = new HolderView(view);
            view.setTag(holder);
        }

        holder.tvTime.setText(times.get(position).getTitle());
        holder.tvCodigo.setText(times.get(position).getCode());

        return view;
    }

    /**
     * Clase Holder
     */
    static class HolderView{
        @InjectView(R.id.tvTime) TextView tvTime;
        @InjectView(R.id.tvCodigo) TextView tvCodigo;
        public HolderView(View view){
            ButterKnife.inject(this,view);
        }
    }
}
