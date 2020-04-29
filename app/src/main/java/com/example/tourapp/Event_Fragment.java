package com.example.tourapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class Event_Fragment extends Fragment {
    public static final String DA_DA_DA_DADAD_DA = "Da da da dadad da";
    public static final String BIRTHDAY_OF_MUHAMMAD_ALI_JINNAH = "Birthday of Muhammad Ali Jinnah";
    public static final String QUAID_E_AZAM_DAY = "Quaid-e-Azam Day";
    public static final String BIRTHDAY_OF_MUHAMMAD_IQBAL = "Birthday of Muhammad Iqbal";
    public static final String IQBAL_DAY = "Iqbal Day";
    public static final String CELEBRATED_TO_COMMEND_THE_ROLE_OF_PAKISTAN_AIR_FORCE_IN_THE_1965_WAR_WITH_INDIA = "Celebrated to commend the role of Pakistan Air Force in the 1965 war with India";
    public static final String AIR_FORCE_DAY = "Air Force Day";
    public static final String CELEBRATED_IN_MEMORY_OF_THOSE_WHO_WERE_KILLED_IN_THE_INDO_PAK_WAR_OF_1965 = "Celebrated in memory of those who were killed in the Indo-Pak war of 1965";
    public static final String DEFENCE_DAY = "Defence Day";
    public static final String PAKISTAN_IS_INDEPENDENT_IN_1947 = "Pakistan is Independent in 1947";
    public static final String INDEPENDENCE_DAY = "Independence Day";
    public static final String CELEBRATED_IN_COMMEMORATION_OF_THE_FIRST_NUCLEAR_TEST = "Celebrated in commemoration of the first Nuclear test";
    public static final String YOUM_E_TAKBIR = "Youm-e-Takbir";
    public static final String REPUBLIC_DAY_AND_TO_COMMEMORATE_THE_LAHORE_RESOLUTION = "Republic Day and to commemorate the Lahore Resolution";
    public static final String PAKISTAN_DAY = "Pakistan Day";
    public static final String THE_CELEBRATIONS_WITH_THE_START_OF_SPRING_SEASON = "The celebrations with the start of Spring season";
    public static final String JASHN_E_BAHARAAN = "Jashn-e-Baharaan";
    public static final String FEBRUARY_23_TO_26 = "February, 23 To 26";
    public static final String PAKISTAN_FLOWER_SHOW = "Pakistan Flower Show";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_event__fragment, container, false);

        final ArrayList<Tour_data> event_list = new ArrayList();
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.tatto));
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.b));
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM),getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.a));
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM),getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.w));
        event_list.add(new Tour_data(getString(R.string.EGYPTION_MUESUM), getString(R.string.EGYPTION_MUESUM), "01212260464", R.drawable.q));


        ListView museum_LIstView = (ListView) rootView.findViewById(R.id.event_List_view);
        TourAdapter adapter = new TourAdapter(getActivity(), event_list, R.color.colorAccent);
        museum_LIstView.setAdapter(adapter);

        museum_LIstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Tour_data resturant_data = event_list.get(position);
                Log.v(DA_DA_DA_DADAD_DA, resturant_data.getTour_name().toString());
            }
        });

        return rootView;
    }

}

