package com.example.luke.myfirstappagain;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class TeaklopedieFragment extends Fragment {

    ListView simpleList;
    String  Item[] = {"Bílý čaj", "Zelený Čaj", "Černý čaj", "Žlutý čaj", "Oolong", "Pu-erh"};
    String  SubItem[] = {"The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.",
            "The banana is an edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.",
            "The lemon, Citrus limon Osbeck, is a species of small evergreen tree in the flowering plant family Rutaceae, native to Asia.",
            "A cherry is the fruit of many plants of the genus Prunus, and is a fleshy drupe.",
            "The garden strawberry is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries.",
            "The avocado is a tree, long thought to have originated in South Central Mexico, classified as a member of the flowering plant family Lauraceae."};
    int flags[] = {R.drawable.white, R.drawable.green, R.drawable.black, R.drawable.yellow, R.drawable.oolong, R.drawable.puerh};

    public TeaklopedieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teaklopedie, container, false);

        simpleList = (ListView)view.findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(getContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);

        return view;
    }
}
