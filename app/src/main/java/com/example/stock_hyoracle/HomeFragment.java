package com.example.stock_hyoracle;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stock_hyoracle.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView expanderRecyclerView;

    public HomeFragment() {
        // Required empty public constructor

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //expanderRecyclerView = getView().findViewById(R.id.recyclerView);
        initiateExpander();

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    private void initiateExpander() {

        ArrayList<String> parentList = new ArrayList<>();
        ArrayList<ArrayList> childListHolder = new ArrayList<>();

        parentList.add("홍준표");
        parentList.add("황교안");
        parentList.add("유시민");
        /*parentList.add("이낙연");
        parentList.add("유승민");
        parentList.add("이재명");
        parentList.add("안희정");
        parentList.add("임종석");
        parentList.add("안철수");
        parentList.add("조국");
        parentList.add("김부겸");*/

        ArrayList<String> childNameList = new ArrayList<>();
        childNameList.add("Apple");
        childNameList.add("Mango");
        childNameList.add("Banana");

        childListHolder.add(childNameList);

        childNameList = new ArrayList<>();
        childNameList.add("Red bull");
        childNameList.add("Maa");
        childNameList.add("Horlicks");

        childListHolder.add(childNameList);

        childNameList = new ArrayList<>();
        childNameList.add("Knife");
        childNameList.add("Vessels");
        childNameList.add("Spoons");

        childListHolder.add(childNameList);

        ExpandableRecyclerViewAdapter expandableCategoryRecyclerViewAdapter =
                new ExpandableRecyclerViewAdapter(getActivity().getApplicationContext(), parentList,
                        childListHolder);

        expanderRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        expanderRecyclerView.setAdapter(expandableCategoryRecyclerViewAdapter);
    }

}
