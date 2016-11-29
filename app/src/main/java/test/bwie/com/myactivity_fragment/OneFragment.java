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
public class OneFragment extends Fragment {

    private TextView text1;
    private String s;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("fragment_111111111","onAttach");
        s=((MainActivity)context).rr();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment_111111111","onCreate");
    }

    public String ssss(){
        return "....";
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("fragment_111111111","onCreateView");
        View view=inflater.inflate(R.layout.fragment1,container,false);
        text1= (TextView) view.findViewById(R.id.text1);
        text1.setText(s);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("fragment_111111111","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fragment_111111111","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragment_111111111","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fragment_111111111","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fragment_111111111","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fragment_111111111","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fragment_111111111","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fragment_111111111","onDetach");
    }
}
