package com.hzs.couponandroid.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hzs.couponandroid.persistence.Offer;
import com.hzs.couponandroid.adapters.OfferAdapter;
import com.hzs.couponandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ishaan 2 on 9/4/2016.
 */
public class VaultFragment extends Fragment {

    private List<Offer> offers;
    private RecyclerView recyclerView;
    private OfferAdapter offerAdapter;

    public VaultFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vault, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.offer_rec);
        offers = new ArrayList<>();

        offers.add(new Offer("Test company", "Hi there, I'm the first offer", "Survey", "30 days", "100 points"));
        offers.add(new Offer("Test company", "Hi there, I'm the first offer", "Survey", "30 days", "100 points"));
        offers.add(new Offer("Test company", "Hi there, I'm the first offer", "Survey", "30 days", "100 points"));
        offers.add(new Offer("Test company", "Hi there, I'm the first offer", "Survey", "30 days", "100 points"));
        offerAdapter = new OfferAdapter(getActivity(), offers, R.color.vaultColor);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(offerAdapter);
        offerAdapter.notifyDataSetChanged();
    }
}
