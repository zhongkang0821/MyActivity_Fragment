package test.bwie.com.myactivity_fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 1.
 * 2.仲康
 * 3.2016/11/23
 */
public class FourFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("fragment_444444444","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment_444444444","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("fragment_444444444","onCreateView");
        View view=inflater.inflate(R.layout.fragment4,container,false);
        TextView text44= (TextView) view.findViewById(R.id.text444);
        text44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent=new Intent(getActivity(),TwoActivity.class);
                startActivity(mIntent);
            }
        });
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("fragment_444444444","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fragment_444444444","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragment_444444444","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fragment_444444444","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fragment_444444444","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fragment_444444444","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fragment_444444444","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fragment_444444444","onDetach");
    }
}
