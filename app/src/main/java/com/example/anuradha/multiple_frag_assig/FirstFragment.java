package com.example.anuradha.multiple_frag_assig;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    Button b1,b2;
    ImageView i1;
    TextView t1;
   // EditText e1,e2;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v= inflater.inflate(R.layout.fragment_first, container, false);
        b2= (Button) v.findViewById(R.id.button2);
       // e1= (EditText) v.findViewById(R.id.editText);
       // e2= (EditText) v.findViewById(R.id.editText2);
        t1= (TextView) v.findViewById(R.id.textView2);
        b1= (Button) v.findViewById(R.id.button);
        i1= (ImageView) v.findViewById(R.id.imageView);
        i1.setImageResource(R.drawable.amitab);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              //  String a=e1.getText().toString();
               // String b=e2.getText().toString();
              //  int i=Integer.parseInt(a);
               // int i1=Integer.parseInt(b);


                FragmentManager fm=getFragmentManager();
                SecondFragment frg= (SecondFragment) fm.findFragmentById(R.id.fragment2);
              //  frg.showText("multiply="+(i*i1));
                frg.showText("Name of Driver+\n+Mobile No of Driver+\n+Pickup Location+\n+Drop Location ");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   String a=e1.getText().toString();
             ///   String b=e2.getText().toString();
              //  int i=Integer.parseInt(a);
              //  int i1=Integer.parseInt(b);

                FragmentManager fm=getFragmentManager();
                SecondFragment frg= (SecondFragment) fm.findFragmentById(R.id.fragment2);
                frg.showText("Enter user Name+\n+Its address");

            }
        });
        return v;
    }

}
