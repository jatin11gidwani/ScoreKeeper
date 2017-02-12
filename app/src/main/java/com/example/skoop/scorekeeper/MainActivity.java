package com.example.skoop.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int BB_Score_A = 0;
    int BB_Score_B = 0;
    int FB_Score_A = 0;
    int FB_Score_B = 0;
    int BB_Foul_A = 0;
    int BB_Foul_B = 0;
    int FB_Foul_A = 0;
    int FB_Foul_B = 0;
    int a = 0;
    int undo = 0;
    int undor[] = new int[4];
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //BasketBall Team A Methods
    public void BB_Score_A_FreeThrow(View view) {
        undo = BB_Score_A;
        BB_Score_A = BB_Score_A + 1;
        Show_BB_Score_A(BB_Score_A);
        flag = 1;
    }

    public void BB_Score_A_2Point(View view) {
        undo = BB_Score_A;
        BB_Score_A = BB_Score_A + 2;
        flag = 1;
        Show_BB_Score_A(BB_Score_A);
    }

    public void BB_Score_A_3Point(View view) {
        undo = BB_Score_A;
        flag = 1;
        BB_Score_A = BB_Score_A + 3;
        Show_BB_Score_A(BB_Score_A);
    }

    public void BB_Foul_A(View View) {
        undo = BB_Foul_A;
        flag = 3;
        BB_Foul_A = BB_Foul_A + 1;
        Show_BB_Foul_A(BB_Foul_A);
    }

    public void Show_BB_Score_A(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.BB_Score_A);
        quantityTextView.setText("" + a);
    }

    public void Show_BB_Foul_A(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.BB_Foul_A);
        quantityTextView.setText("" + a);
    }

    //BasketBall Team B Methods
    public void BB_Score_B_FreeThrow(View view) {
        undo = BB_Score_B;
        BB_Score_B = BB_Score_B + 1;
        flag = 2;
        Show_BB_Score_B(BB_Score_B);
    }

    public void BB_Score_B_2Point(View view) {
        undo = BB_Score_B;
        flag = 2;
        BB_Score_B = BB_Score_B + 2;
        Show_BB_Score_B(BB_Score_B);
    }

    public void BB_Score_B_3Point(View view) {
        undo = BB_Score_B;
        BB_Score_B = BB_Score_B + 3;
        flag = 2;
        Show_BB_Score_B(BB_Score_B);
    }

    public void BB_Foul_B(View View) {
        undo = BB_Foul_B;
        flag = 4;
        BB_Foul_B = BB_Foul_B + 1;
        Show_BB_Foul_B(BB_Foul_B);
    }

    public void Show_BB_Score_B(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.BB_Score_B);
        quantityTextView.setText("" + a);
    }

    public void Show_BB_Foul_B(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.BB_Foul_B);
        quantityTextView.setText("" + a);
    }

    //BasketBall Reset
    public void BB_Reset(View View) {
        undor[0] = BB_Score_A;
        undor[1] = BB_Score_B;
        undor[2] = BB_Foul_A;
        undor[3] = BB_Foul_B;
        BB_Score_A = 0;
        BB_Score_B = 0;
        BB_Foul_A = 0;
        BB_Foul_B = 0;
        flag = 5;
        Show_BB_Score_A(BB_Score_A);
        Show_BB_Score_B(BB_Score_B);
        Show_BB_Foul_A(BB_Foul_A);
        Show_BB_Foul_B(BB_Foul_B);

    }

    //FootBall Team A Methods
    public void FB_Score_A(View view) {
        FB_Score_A = FB_Score_A + 1;
        Show_FB_Score_A(FB_Score_A);
    }

    public void FB_Foul_A(View View) {
        FB_Foul_A = FB_Foul_A + 1;
        Show_FB_Foul_A(FB_Foul_A);
    }

    public void Show_FB_Foul_A(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.FB_Foul_A);
        quantityTextView.setText("" + a);
    }

    public void Show_FB_Score_A(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.FB_Score_A);
        quantityTextView.setText("" + a);
    }

    //FootBall Team B Methods
    public void FB_Score_B(View view) {
        FB_Score_B = FB_Score_B + 1;
        Show_Fb_Score_B(FB_Score_B);
    }

    public void FB_Foul_B(View View) {
        FB_Foul_B = FB_Foul_B + 1;
        Show_Fb_Foul_B(FB_Foul_B);
    }

    public void Show_Fb_Foul_B(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.FB_Foul_B);
        quantityTextView.setText("" + a);
    }

    public void Show_Fb_Score_B(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.FB_Score_B);
        quantityTextView.setText("" + a);
    }

    //FB Reset
    public void FB_Reset(View View) {
        FB_Score_A = 0;
        FB_Score_B = 0;
        FB_Foul_A = 0;
        FB_Foul_B = 0;
        Show_FB_Score_A(FB_Score_A);
        Show_Fb_Score_B(FB_Score_B);
        Show_FB_Foul_A(FB_Foul_A);
        Show_Fb_Foul_B(FB_Foul_B);
    }

    public void Bb_Undo(View View) {
        if (flag == 1) {
            BB_Score_A = undo;
            Show_BB_Score_A(undo);
        } else if (flag == 2) {
            BB_Score_B = undo;
            Show_BB_Score_B(undo);
        } else if (flag == 3) {
            BB_Foul_A = undo;
            Show_BB_Foul_A(undo);
        } else if (flag == 4) {
            BB_Foul_B = undo;
            Show_BB_Foul_B(undo);
        } else if (flag == 5) {
            Show_BB_Score_A(undor[0]);
            Show_BB_Score_B(undor[1]);
            Show_BB_Foul_A(undor[2]);
            Show_BB_Foul_B(undor[3]);
            BB_Score_A = undor[0];
            BB_Score_B = undor[1];
            BB_Foul_A = undor[2];
            BB_Foul_B = undor[3];
        }
    }
}