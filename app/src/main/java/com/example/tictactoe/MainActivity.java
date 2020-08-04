package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean flag = false;
    Button one_one;
    Button one_two;
    Button one_three;
    Button two_one;
    Button two_two;
    Button two_three;
    Button three_one;
    Button three_two;
    Button three_three;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;
    TextView message;
    TextView S_1;
    TextView S_2;
    Button reset;
    Button reset_bd;
    String[][] flag_x = new String[3][3];
    String[][] flag_o = new String[3][3];
    int round = 0;
    int player1 = 0;
    int player2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one_one = findViewById(R.id.onebyone);
        one_two = findViewById(R.id.onebytwo);
        one_three = findViewById(R.id.onebythree);
        two_one = findViewById(R.id.twobyone);
        two_two = findViewById(R.id.twobytwo);
        two_three = findViewById(R.id.twobythree);
        three_one = findViewById(R.id.threebyone);
        three_two = findViewById(R.id.threebytwo);
        three_three = findViewById(R.id.threebythree);
        text1 = findViewById(R.id.textView11);
        text2 = findViewById(R.id.textView12);
        text3 = findViewById(R.id.textView13);
        text4 = findViewById(R.id.textView21);
        text5 = findViewById(R.id.textView22);
        text6 = findViewById(R.id.textView23);
        text7 = findViewById(R.id.textView31);
        text8 = findViewById(R.id.textView32);
        text9 = findViewById(R.id.textView33);
        message = findViewById(R.id.messages);
        reset = findViewById(R.id.reset);
        reset_bd = findViewById(R.id.reset_b);
        S_1 = findViewById(R.id.score_one);
        S_2 = findViewById(R.id.score_two);


        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                flag_x[i][j]="a";
                flag_o[i][j]="a";
            }
        }

    }


    public void click11(View view) {
        flag = !flag;
        if(flag){
            text1.setText("X");
            flag_x[0][0]="X";
        }
        else{
            text1.setText("O");
            flag_o[0][0]="O";

        }
        round++;
        check();
        score();

    }

    public void click12(View view) {
        flag = !flag;
        if(flag){
            text2.setText("X");
            flag_x[0][1]="X";
        }
        else{
            text2.setText("O");
            flag_o[0][1]="O";
        }
        round++;
        check();
        score();

    }

    public void click13(View view) {
        flag = !flag;
        if(flag){
            text3.setText("X");
            flag_x[0][2]="X";
        }
        else{
            text3.setText("O");
            flag_o[0][2]="O";
        }
        round++;
        check();
        score();

    }

    public void click21(View view) {
        flag = !flag;
        if(flag){
            text4.setText("X");
            flag_x[1][0]="X";
        }
        else{
            text4.setText("O");
            flag_o[1][0]="O";
        }
        round++;
        check();
        score();
    }

    public void click22(View view) {
        flag = !flag;
        if(flag){
            text5.setText("X");
            flag_x[1][1]="X";
        }
        else{
            text5.setText("O");
            flag_o[1][1]="O";
        }
        round++;
        check();
        score();
    }

    public void click23(View view) {
        flag = !flag;
        if(flag){
            text6.setText("X");
            flag_x[1][2]="X";
        }
        else{
            text6.setText("O");
            flag_o[1][2]="O";
        }
        round++;
        check();
        score();
    }

    public void click31(View view) {
        flag = !flag;
        if(flag){
            text7.setText("X");
            flag_x[2][0]="X";
        }
        else{
            text7.setText("O");
            flag_o[2][0]="O";
        }
        round++;
        check();
        score();
    }

    public void click32(View view) {
        flag = !flag;
        if(flag){
            text8.setText("X");
            flag_x[2][1]="X";
        }
        else{
            text8.setText("O");
            flag_o[2][1]="O";
        }
        round++;
        check();
        score();
    }

    public void click33(View view) {
        flag = !flag;
        if(flag){
            text9.setText("X");
            flag_x[2][2]="X";
        }
        else{
            text9.setText("O");
            flag_o[2][2]="O";
        }
        round++;
        check();
        score();
    }

    public void check(){
        if ((flag_x[0][0].equals("X")) && (flag_x[0][1].equals("X")) && (flag_x[0][2].equals("X"))||(flag_x[0][0].equals("X")) && (flag_x[1][0].equals("X")) && (flag_x[2][0].equals("X"))) {
            message.setText("Player 1 wins");
            player1++;
        }
            else if ((flag_x[1][0].equals("X")) && (flag_x[1][1].equals("X")) && (flag_x[1][2].equals("X"))||(flag_x[0][1].equals("X")) && (flag_x[1][1].equals("X")) && (flag_x[2][1].equals("X"))){
                message.setText("Player 1 wins");
                player1++;
            }
            else if ((flag_x[2][0].equals("X")) && (flag_x[2][1].equals("X")) && (flag_x[2][2].equals("X"))||(flag_x[0][2].equals("X")) && (flag_x[1][2].equals("X")) && (flag_x[2][2].equals("X"))){
                message.setText("Player 1 wins");
                player1++;
            }
            else if ((flag_o[0][0].equals("O")) && (flag_o[0][1].equals("O")) && (flag_o[0][2].equals("O"))||(flag_o[0][0].equals("O")) && (flag_o[1][0].equals("O")) && (flag_o[2][0].equals("O"))){
                message.setText("Player 2 wins");
                player2++;
            }
            else if ((flag_o[1][0].equals("O")) && (flag_o[1][1].equals("O")) && (flag_o[1][2].equals("O"))||(flag_o[0][1].equals("O")) && (flag_o[1][1].equals("O")) && (flag_o[2][1].equals("O"))){
                message.setText("Player 2 wins");
                player2++;
            }
            else if ((flag_o[2][0].equals("O")) && (flag_o[2][1].equals("O")) && (flag_o[2][2].equals("O"))||(flag_o[0][2].equals("O")) && (flag_o[1][2].equals("O")) && (flag_o[2][2].equals("O"))){
                message.setText("Player 2 wins");
                player2++;
            }
            else if ((flag_x[0][0].equals("X") && flag_x[1][1].equals("X") && flag_x[2][2].equals("X")) || (flag_x[0][2].equals("X") && flag_x[1][1].equals("X") && flag_x[2][0].equals("X"))){
                message.setText("Player 1 wins");
                player1++;
            }
            else if ((flag_o[0][0].equals("O") && flag_o[1][1].equals("O") && flag_o[2][2].equals("O")) || (flag_o[0][2].equals("O") && flag_o[1][1].equals("O") && flag_o[2][0].equals("O"))){
                message.setText("Player 2 wins");
                player2++;
            }
            else if (round==9){
                message.setText("draw");
                reset_board();
        }
            else{
                message.setText("");
            }


    }

    public void score(){
        S_1.setText("player1: "+player1);
        S_2.setText("player2: "+player2);
    }

    public void reset_board(){
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                flag_x[i][j]="a";
                flag_o[i][j]="a";
            }
        }
        text1.setText(" ");
        text2.setText(" ");
        text3.setText(" ");
        text4.setText(" ");
        text5.setText(" ");
        text6.setText(" ");
        text7.setText(" ");
        text8.setText(" ");
        text9.setText(" ");
        round=0;

    }


    public void reset_score(View view) {
        player1=0;
        player2=0;
        S_1.setText("player1: "+player1);
        S_2.setText("player2: "+player2);

    }

    public void reset_b(View view) {
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                flag_x[i][j]="a";
                flag_o[i][j]="a";
            }
        }
        text1.setText(" ");
        text2.setText(" ");
        text3.setText(" ");
        text4.setText(" ");
        text5.setText(" ");
        text6.setText(" ");
        text7.setText(" ");
        text8.setText(" ");
        text9.setText(" ");
        round=0;
        message.setText("");

    }
}