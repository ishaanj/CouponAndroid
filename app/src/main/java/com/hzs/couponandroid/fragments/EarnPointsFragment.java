package com.hzs.couponandroid.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.hzs.couponandroid.R;

/**
 * Created by Ishaan 2 on 9/4/2016.
 */
public class EarnPointsFragment extends Fragment {

    private ImageView pointView, mainImage;

    public EarnPointsFragment() {
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
        return inflater.inflate(R.layout.fragment_earn_points, container, false);
    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pointView = (ImageView) view.findViewById(R.id.point_view);
        mainImage = (ImageView) view.findViewById(R.id.main_image_view);

        TextDrawable td = TextDrawable.builder().buildRound("100", getActivity().getResources().getColor(R.color.matRed));
        pointView.setImageDrawable(td);

        mainImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadPhoto(getActivity(), mainImage);
            }
        });
    }

    private void loadPhoto(Activity activity, ImageView imageView) {

        AlertDialog.Builder imageDialog = new AlertDialog.Builder(activity);
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.custom_fullimg_dialog,
                (ViewGroup) activity.findViewById(R.id.layout_root));
        ImageView image = (ImageView) layout.findViewById(R.id.fullimage);
        image.setImageDrawable(getResources().getDrawable(R.drawable.placeholder));
        imageDialog.setView(layout);
        imageDialog.create();
        imageDialog.show();
    }
}
