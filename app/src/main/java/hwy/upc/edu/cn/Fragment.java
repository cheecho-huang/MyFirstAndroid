package hwy.upc.edu.cn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hwy.upc.edu.cn.ui.fragment2.Fragment2;

public class Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment2.newInstance())
                    .commitNow();
        }
    }
}
