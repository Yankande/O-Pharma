package com.mobile.opapp.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mobile.opapp.Cnop;
import com.mobile.opapp.Cpro;
import com.mobile.opapp.Login;
import com.mobile.opapp.MainActivity;
import com.mobile.opapp.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    CardView cardView;
    CardView cardView2;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);

        cardView2=root.findViewById(R.id.a);
       // cardView=root.findViewById(R.id.cpp);

        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });



        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeIten=new Intent(getContext(), Cnop.class);
                startActivity(HomeIten);
            }
        });

        return root;




    }
}