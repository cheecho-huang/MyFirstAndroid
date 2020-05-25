package hwy.upc.edu.cn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(Main2Activity.this, "成功打开啦~", Toast.LENGTH_SHORT).show();
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data","我回来啦~");
                setResult(2,intent);
                finish();
            }
        });
        Button tijiao = findViewById(R.id.button5);
        tijiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                builder.setTitle("选择一个颜色");
                final CharSequence[] items = {"red", "yellow", "green", "blue"};
                builder.setSingleChoiceItems(items ,-1,new  DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        CharSequence sequence = items[which];
                        Toast.makeText(Main2Activity.this, "select " + sequence, Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        });
    }
}
