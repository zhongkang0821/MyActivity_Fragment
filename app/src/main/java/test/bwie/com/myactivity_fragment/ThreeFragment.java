package test.bwie.com.myactivity_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 1.
 * 2.仲康
 * 3.2016/11/23
 */
public class ThreeFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("333333333","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("333333333","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("333333333","onCreateView");
        View view=inflater.inflate(R.layout.fragment3,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("333333333","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("333333333","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("333333333","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("333333333","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("333333333","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("333333333","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("333333333","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("333333333","onDetach");
    }
}