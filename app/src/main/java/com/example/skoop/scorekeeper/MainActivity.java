package com.example.skoop.scorekeeper;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {
    int BB_Score_A = 0;
    int BB_Score_B = 0;
    int FB_Score_A = 0;
    int FB_Score_B = 0;
    int BB_Foul_A = 0;
    int BB_Foul_B = 0;
    int FB_Foul_A = 0;
    int FB_Foul_B = 0;
    int undo_BB = 0;
    int undo_FB = 0;
    int undos_BB[] = new int[4];
    int undos_FB[] = new int[4];
    int flag_BB = 0;
    int flag_FB = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    //BasketBall Team A Methods
    public void BB_Score_A_FreeThrow(View view) {
        undo_BB = BB_Score_A;
        BB_Score_A = BB_Score_A + 1;
        Show_BB_Score_A(BB_Score_A);
        flag_BB = 1;
    }

    public void BB_Score_A_2Point(View view) {
        undo_BB = BB_Score_A;
        BB_Score_A = BB_Score_A + 2;
        flag_BB = 1;
        Show_BB_Score_A(BB_Score_A);
    }

    public void BB_Score_A_3Point(View view) {
        undo_BB = BB_Score_A;
        flag_BB = 1;
        BB_Score_A = BB_Score_A + 3;
        Show_BB_Score_A(BB_Score_A);
    }

    public void BB_Foul_A(View View) {
        undo_BB = BB_Foul_A;
        flag_BB = 2;
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
        undo_BB = BB_Score_B;
        BB_Score_B = BB_Score_B + 1;
        flag_BB = 3;
        Show_BB_Score_B(BB_Score_B);
    }

    public void BB_Score_B_2Point(View view) {
        undo_BB = BB_Score_B;
        flag_BB = 3;
        BB_Score_B = BB_Score_B + 2;
        Show_BB_Score_B(BB_Score_B);
    }

    public void BB_Score_B_3Point(View view) {
        undo_BB = BB_Score_B;
        BB_Score_B = BB_Score_B + 3;
        flag_BB = 3;
        Show_BB_Score_B(BB_Score_B);
    }

    public void BB_Foul_B(View View) {
        undo_BB = BB_Foul_B;
        flag_BB = 4;
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
        undos_BB[0] = BB_Score_A;
        undos_BB[1] = BB_Score_B;
        undos_BB[2] = BB_Foul_A;
        undos_BB[3] = BB_Foul_B;
        BB_Score_A = 0;
        BB_Score_B = 0;
        BB_Foul_A = 0;
        BB_Foul_B = 0;
        flag_BB = 5;
        Show_BB_Score_A(BB_Score_A);
        Show_BB_Score_B(BB_Score_B);
        Show_BB_Foul_A(BB_Foul_A);
        Show_BB_Foul_B(BB_Foul_B);

    }

    //FootBall Team A Methods
    public void FB_Score_A(View view) {
        undo_FB = FB_Score_A;
        FB_Score_A = FB_Score_A + 1;
        flag_FB = 1;
        Show_FB_Score_A(FB_Score_A);
    }

    public void FB_Foul_A(View View) {
        undo_FB = FB_Foul_A;
        FB_Foul_A = FB_Foul_A + 1;
        flag_FB = 2;
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
        undo_FB = FB_Score_B;
        FB_Score_B = FB_Score_B + 1;
        flag_FB = 3;
        Show_FB_Score_B(FB_Score_B);
    }

    public void FB_Foul_B(View View) {
        undo_FB = FB_Foul_B;
        FB_Foul_B = FB_Foul_B + 1;
        flag_FB = 4;
        Show_FB_Foul_B(FB_Foul_B);
    }

    public void Show_FB_Foul_B(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.FB_Foul_B);
        quantityTextView.setText("" + a);
    }

    public void Show_FB_Score_B(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.FB_Score_B);
        quantityTextView.setText("" + a);
    }

    //FB Reset
    public void FB_Reset(View View) {
        undos_FB[0] = FB_Score_A;
        undos_FB[1] = FB_Score_B;
        undos_FB[2] = FB_Foul_A;
        undos_FB[3] = FB_Foul_B;
        FB_Score_A = 0;
        FB_Score_B = 0;
        FB_Foul_A = 0;
        FB_Foul_B = 0;
        flag_FB = 5;
        Show_FB_Score_A(FB_Score_A);
        Show_FB_Score_B(FB_Score_B);
        Show_FB_Foul_A(FB_Foul_A);
        Show_FB_Foul_B(FB_Foul_B);
    }

    public void FB_Undo(View View) {
        if (flag_FB == 1) {
            FB_Score_A = undo_FB;
            Show_FB_Score_A(undo_FB);
        } else if (flag_FB == 3) {
            FB_Score_B = undo_FB;
            Show_FB_Score_B(undo_FB);
        } else if (flag_FB == 2) {
            FB_Foul_A = undo_FB;
            Show_FB_Foul_A(undo_FB);
        } else if (flag_FB == 4) {
            FB_Foul_B = undo_FB;
            Show_FB_Foul_B(undo_FB);
        } else if (flag_FB == 5) {
            Show_FB_Score_A(undos_FB[0]);
            Show_FB_Score_B(undos_FB[1]);
            Show_FB_Foul_A(undos_FB[2]);
            Show_FB_Foul_B(undos_FB[3]);
            FB_Score_A = undos_FB[0];
            FB_Score_B = undos_FB[1];
            FB_Foul_A = undos_FB[2];
            FB_Foul_B = undos_FB[3];
        }
    }

    public void BB_Undo(View View) {
        if (flag_BB == 1) {
            BB_Score_A = undo_BB;
            Show_BB_Score_A(undo_BB);
        } else if (flag_BB == 3) {
            BB_Score_B = undo_BB;
            Show_BB_Score_B(undo_BB);
        } else if (flag_BB == 2) {
            BB_Foul_A = undo_BB;
            Show_BB_Foul_A(undo_BB);
        } else if (flag_BB == 4) {
            BB_Foul_B = undo_BB;
            Show_BB_Foul_B(undo_BB);
        } else if (flag_BB == 5) {
            Show_BB_Score_A(undos_BB[0]);
            Show_BB_Score_B(undos_BB[1]);
            Show_BB_Foul_A(undos_BB[2]);
            Show_BB_Foul_B(undos_BB[3]);
            BB_Score_A = undos_BB[0];
            BB_Score_B = undos_BB[1];
            BB_Foul_A = undos_BB[2];
            BB_Foul_B = undos_BB[3];
        }
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}