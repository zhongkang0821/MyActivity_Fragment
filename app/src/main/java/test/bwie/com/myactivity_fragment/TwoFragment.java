package test.bwie.com.myactivity_fragment;

import android.content.Context;
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
public class TwoFragment extends Fragment {

    private String s;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("fragment_222222222","onAttach");
        OneFragment oneFragment=new OneFragment();
        s=oneFragment.ssss();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment_222222222","onCreate");
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("fragment_222222222","onCreateView");
        View view=inflater.inflate(R.layout.fragment2,container,false);
        TextView text2= (TextView) view.findViewById(R.id.te2xt);
        text2.setText(s);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("fragment_222222222","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fragment_222222222","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragment_222222222","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fragment_222222222","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fragment_222222222","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fragment_222222222","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fragment_222222222","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fragment_222222222","onDetach");
    }
}
