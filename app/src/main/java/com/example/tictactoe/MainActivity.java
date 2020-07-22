package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, buttonClear, buttonRestart;
    TextView edttxt, statisticsX, statisticsO, statisticsDraw;
    int XWin, OWin, draw;
    boolean gameOver;
    boolean XPlay;
    CellValue[] board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        buttonClear = (Button) findViewById(R.id.btnClear);
        buttonRestart = (Button) findViewById(R.id.btnRestart);
        edttxt = (TextView) findViewById(R.id.title);
        statisticsX = (TextView) findViewById(R.id.staX);
        statisticsO = (TextView) findViewById(R.id.staO);
        statisticsDraw = (TextView) findViewById(R.id.staDraw);
        XWin=0;
        OWin=0;
        draw=0;
        gameOver=false;
        XPlay=true;

        board = new CellValue[9];
        for(int i=0; i<board.length; i++){
            board[i]=CellValue.EMPTY;
        }


        statisticsX.setText("X win "+XWin+" games.");
        statisticsO.setText("O win "+OWin+" games.");
        statisticsDraw.setText(draw+" draws.");


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[0]==CellValue.EMPTY){
                    if(XPlay){
                        board[0]=CellValue.X;
                        button0.setText("X");
                        XPlay=false;
                    } else {
                        board[0]=CellValue.O;
                        button0.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[1]==CellValue.EMPTY){
                    if(XPlay){
                        board[1]=CellValue.X;
                        button1.setText("X");
                        XPlay=false;
                    } else {
                        board[1]=CellValue.O;
                        button1.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[2]==CellValue.EMPTY){
                    if(XPlay){
                        board[2]=CellValue.X;
                        button2.setText("X");
                        XPlay=false;
                    } else {
                        board[2]=CellValue.O;
                        button2.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[3]==CellValue.EMPTY){
                    if(XPlay){
                        board[3]=CellValue.X;
                        button3.setText("X");
                        XPlay=false;
                    } else {
                        board[3]=CellValue.O;
                        button3.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[4]==CellValue.EMPTY){
                    if(XPlay){
                        board[4]=CellValue.X;
                        button4.setText("X");
                        XPlay=false;
                    } else {
                        board[4]=CellValue.O;
                        button4.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[5]==CellValue.EMPTY){
                    if(XPlay){
                        board[5]=CellValue.X;
                        button5.setText("X");
                        XPlay=false;
                    } else {
                        board[5]=CellValue.O;
                        button5.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[6]==CellValue.EMPTY){
                    if(XPlay){
                        board[6]=CellValue.X;
                        button6.setText("X");
                        XPlay=false;
                    } else {
                        board[6]=CellValue.O;
                        button6.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[7]==CellValue.EMPTY){
                    if(XPlay){
                        board[7]=CellValue.X;
                        button7.setText("X");
                        XPlay=false;
                    } else {
                        board[7]=CellValue.O;
                        button7.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!gameOver && board[8]==CellValue.EMPTY){
                    if(XPlay){
                        board[8]=CellValue.X;
                        button8.setText("X");
                        XPlay=false;
                    } else {
                        board[8]=CellValue.O;
                        button8.setText("O");
                        XPlay=true;
                    }
                    determineResult();
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XWin=0;
                OWin=0;
                draw=0;
                statisticsX.setText("X win "+XWin+" games.");
                statisticsO.setText("O win "+OWin+" games.");
                statisticsDraw.setText(draw+" draws.");
            }
        });

        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameOver=false;
                XPlay=true;
                for(int i=0; i<board.length; i++){board[i]=CellValue.EMPTY;}
                button0.setText("");
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
            }
        });


    }

    private void determineResult(){
        for(int i=0; i<board.length; i+=3){
            if(board[i]==board[i+1] && board[i+1]==board[i+2]){
                if(board[i]==CellValue.X){
                    XWin++;
                    gameOver=true;
                    statisticsX.setText("X win "+XWin+" games.");
                    return;
                } else if(board[i]==CellValue.O){
                    OWin++;
                    gameOver=true;
                    statisticsO.setText("O win "+OWin+" games.");
                    return;
                }
            }
        }
        for(int i=0; i<3; i++){
            if(board[i]==board[i+3] && board[i+3]==board[i+6]){
                if(board[i]==CellValue.X){
                    XWin++;
                    gameOver=true;
                    statisticsX.setText("X win "+XWin+" games.");
                    return;
                } else if(board[i]==CellValue.O){
                    OWin++;
                    gameOver=true;
                    statisticsO.setText("O win "+OWin+" games.");
                    return;
                }
            }
        }
        if(board[0]==board[4] && board[4]==board[8]){
            if(board[0]==CellValue.X){
                XWin++;
                gameOver=true;
                statisticsX.setText("X win "+XWin+" games.");
                return;
            } else if(board[0]==CellValue.O){
                OWin++;
                gameOver=true;
                statisticsO.setText("O win "+OWin+" games.");
                return;
            }
        } else if(board[2]==board[4] && board[4]==board[6]){
            if(board[2]==CellValue.X){
                XWin++;
                gameOver=true;
                statisticsX.setText("X win "+XWin+" games.");
                return;
            } else if(board[2]==CellValue.O){
                OWin++;
                gameOver=true;
                statisticsO.setText("O win "+OWin+" games.");
                return;
            }
        }
        int countNotEmpty=0;
        for (int i=0; i<board.length; i++){
            if(board[i]!=CellValue.EMPTY){
                countNotEmpty++;
            }
        }
        if(countNotEmpty==board.length){
            draw++;
            gameOver=true;
            statisticsDraw.setText(draw+" draws.");
            return;
        }
    }
}