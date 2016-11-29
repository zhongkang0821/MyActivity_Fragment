package test.bwie.com.myactivity_fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public String ss="fragment";
    private Button bt1,bt2,bt3,bt4;
    private FrameLayout frame;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("activity1111","onCreate");
        bt1= (Button) findViewById(R.id.bt1);
        bt2= (Button) findViewById(R.id.bt2);
        bt3= (Button) findViewById(R.id.bt3);
        bt4= (Button) findViewById(R.id.bt4);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
//创建fragment管理器
        fm=getSupportFragmentManager();
        //开启fragment事物
        FragmentTransaction ft=fm.beginTransaction();
        OneFragment oneFragment=new OneFragment();
        //替换fragment
        ft.replace(R.id.frame,oneFragment,"f1");
        Bundle bundle=new Bundle();
        bundle.putString("dad","kkk");
        oneFragment.setArguments(bundle);
        ft.commit();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity1111","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity1111","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("activity1111","onResume");

    }

    public String rr(){
        return "lll";
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity1111","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity1111","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity1111","onDestroy");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt1:
                FragmentTransaction ft1=fm.beginTransaction();
                OneFragment on=new OneFragment();
                ft1.replace(R.id.frame,on,"f1");
                ft1.commit();
                break;
            case R.id.bt2:
                FragmentTransaction ft2=fm.beginTransaction();
                ft2.replace(R.id.frame,new TwoFragment(),"f2");
                ft2.commit();
                break;
            case R.id.bt3:
                FragmentTransaction ft3=fm.beginTransaction();
                ft3.replace(R.id.frame,new ThreeFragment(),"f3");
                ft3.commit();
                break;
            case R.id.bt4:
                FragmentTransaction ft4=fm.beginTransaction();
                ft4.replace(R.id.frame,new FourFragment(),"f4");
                ft4.commit();
                break;
        }
    }
}
