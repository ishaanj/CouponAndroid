package com.hzs.couponandroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ishaan 2 on 8/28/2016.
 */
public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.MyViewHolder> {

    private List<Offer> offersList;
    private int color;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView exp, text, from, points, type;
        public RelativeLayout rel;

        public MyViewHolder(View view) {
            super(view);
            rel = (RelativeLayout) view.findViewById(R.id.card_rel_view);
            from = (TextView) view.findViewById(R.id.offer_by);
            text = (TextView) view.findViewById(R.id.offer_text);
            exp = (TextView) view.findViewById(R.id.offer_exp);
            points = (TextView) view.findViewById(R.id.offer_points);
            type = (TextView) view.findViewById(R.id.offer_type);
        }
    }

    public OfferAdapter(List<Offer> offers, int color) {
        this.offersList = offers;
        this.color = color;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.offer_rec_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Offer offer = offersList.get(position);
        holder.rel.setBackgroundColor(color);
        holder.from.setText(offer.getFrom());
        holder.text.setText(offer.getText());
        holder.exp.setText(offer.getExp());
        holder.points.setText(offer.getPoints());
        holder.type.setText(offer.getType());
    }

    @Override
    public int getItemCount() {
        return offersList.size();
    }
}
