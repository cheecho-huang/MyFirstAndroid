package hwy.upc.edu.cn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import hwy.upc.edu.cn.ui.fragment2.Fragment2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("早上好");
                builder.setMessage("你好吗？");
                builder.setPositiveButton("我好呀",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(MainActivity.this , Main2Activity.class);
                        startActivityForResult(i,1);
                        MainActivity.this.startActivity(i);
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        });

    }
    public void click(View v){

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);//super先做完父类所有操作再附加
        if (requestCode == 1&&resultCode == 2){
            String acquiredData= data.getStringExtra("data"); //获取回传的数据
            Toast.makeText(MainActivity.this,acquiredData, Toast.LENGTH_SHORT).show();
        }
    }
}
