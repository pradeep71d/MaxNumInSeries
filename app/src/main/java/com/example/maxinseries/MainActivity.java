package com.example.maxinseries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[] = {2, 25, 36, 1, 3, 7, 85, 69, 37};
        max = a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];

            }

        }
        System.out.println(max);
    }
}
