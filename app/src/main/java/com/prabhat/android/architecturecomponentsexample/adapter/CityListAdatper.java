package com.prabhat.android.architecturecomponentsexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prabhat.android.architecturecomponentsexample.Model.CityList;
import com.prabhat.android.architecturecomponentsexample.R;

import java.util.List;

/**
 * Created by Android on 2/28/2018.
 */

public class CityListAdatper extends RecyclerView.Adapter<CityListAdatper.itemHolder> {

    Context context;
    List<CityList> cityList;

    public CityListAdatper(Context context, List<CityList> cityList) {
        this.context = context;
        this.cityList = cityList;
    }

    @Override
    public CityListAdatper.itemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.row_city, parent, false);
        return new itemHolder(view);


    }

    @Override
    public void onBindViewHolder(CityListAdatper.itemHolder holder, int position) {

        holder.tv_id.setText(cityList.get(position).getId());
        holder.tv_citName.setText(cityList.get(position).getCity_name());
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }


    class itemHolder extends RecyclerView.ViewHolder {

        TextView tv_citName, tv_id;

        public itemHolder(View itemView) {
            super(itemView);
            tv_citName = (TextView) itemView.findViewById(R.id.tv_citName);
            tv_id = (TextView) itemView.findViewById(R.id.tv_id);
        }
    }
}
