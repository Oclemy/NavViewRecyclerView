package com.tutorials.hp.navviewrecyclerview.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.navviewrecyclerview.R;
import com.tutorials.hp.navviewrecyclerview.mRecycler.MyAdapter;


/**
  * Created by Oclemy on 9/18/2016.
 */
public class InterStellar extends Fragment {

    private RecyclerView rv;
    private static String[] spacecrafts={"Kepler","Hubble","Rosetter","Discovery","Endeavor"};

    public static InterStellar newInstance()
    {
        return new InterStellar();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.interstellar,null);


        //REFERENCE
        rv= (RecyclerView) rootView.findViewById(R.id.interstellar_RV);

        //LAYOUT MANAGER
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        //ADAPTER
        rv.setAdapter(new MyAdapter(getActivity(),spacecrafts));



        return rootView;
    }

    @Override
    public String toString() {
        return "InterStellar";
    }
}
