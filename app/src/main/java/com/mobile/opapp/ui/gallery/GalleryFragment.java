package com.mobile.opapp.ui.gallery;

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

import com.mobile.opapp.Cotisations;
import com.mobile.opapp.R;
import com.mobile.opapp.payecard;
import com.mobile.opapp.payementotion;

public class GalleryFragment extends Fragment {
    CardView paymomo;
    CardView paycart;
    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });


        paymomo=root.findViewById(R.id.momo);
        paycart=root.findViewById(R.id.cart);
        //imageView=findViewById(R.id.backpayption);



        paymomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeItesn=new Intent(getContext(), Cotisations.class);
                startActivity(HomeItesn);

            }
        });



        paycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeItesn=new Intent(getContext(), payecard.class);
                startActivity(HomeItesn);

            }
        });

        return root;
    }
}