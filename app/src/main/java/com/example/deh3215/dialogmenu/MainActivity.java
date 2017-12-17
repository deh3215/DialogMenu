package com.example.deh3215.dialogmenu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String[] dinner = {"腿庫","雞蛋糕","沙威瑪","澳美客","麵線","麵疙瘩"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder dialog_list = new AlertDialog.Builder(MainActivity.this);
        dialog_list.setTitle("利用List呈現");

        dialog_list.setItems(dinner, listener);
        dialog_list.show();
    }

    DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Toast.makeText(MainActivity.this, "你選的是" + dinner[i], Toast.LENGTH_SHORT).show();
        }
    };

}
