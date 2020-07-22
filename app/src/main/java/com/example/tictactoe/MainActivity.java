package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

/**
 * The main program of the
 * APP TicTacToe.
 *
 *
 * @author Wenglei Wu
 */

public class MainActivity extends AppCompatActivity {

    // Instance variables.
    // Buttons.
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, buttonClear, buttonRestart;
    // Text boxes.
    TextView edttxt, statisticsX, statisticsO, statisticsDraw;
    // Number of wins and draws.
    int XWin, OWin, draw;
    // Determine whether a game is over.
    boolean gameOver;
    // Determine X to play or O to play.
    boolean XPlay;
    // Instance storing values of each cell.
    CellValue[] board;
    // Computer on/off.
    Switch computer;
    // Instance of class Random.
    Random random;

    // Main program.
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Initialize.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize instance variables.
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
        computer = (Switch) findViewById(R.id.computerSwitch);
        random = new Random();

        // Initialze each cell to EMPTY.
        for(int i=0; i<board.length; i++){
            board[i]=CellValue.EMPTY;
        }

        // Show initialized statistics.
        statisticsX.setText("X wins "+XWin+" games.");
        statisticsO.setText("O wins "+OWin+" games.");
        statisticsDraw.setText(draw+" draws.");

        // Click to enter value into the first cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to enter value into the second cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to enter value into the third cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to enter value into the fourth cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to enter value into the fifth cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to enter value into the sixth cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to enter value into the seventh cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to enter value into the eighth cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to enter value into the ninth cell.
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
                    if(!gameOver && computer.isChecked()){
                        computerPlay();
                    }
                }
            }
        });

        // Click to clear statistics.
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XWin=0;
                OWin=0;
                draw=0;
                statisticsX.setText("X wins "+XWin+" games.");
                statisticsO.setText("O wins "+OWin+" games.");
                statisticsDraw.setText(draw+" draws.");
            }
        });

        // Click to restart the game.
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
                edttxt.setText("PLAYING");
            }
        });
    }

    // Help method to determine the game status after change to the value of a cell.
    private void determineResult(){

        // Determine rows.
        for(int i=0; i<board.length; i+=3){
            if(board[i]==board[i+1] && board[i+1]==board[i+2]){
                if(board[i]==CellValue.X){
                    XWin++;
                    gameOver=true;
                    statisticsX.setText("X wins "+XWin+" games.");
                    edttxt.setText("XWIN");
                    return;
                } else if(board[i]==CellValue.O){
                    OWin++;
                    gameOver=true;
                    statisticsO.setText("O wins "+OWin+" games.");
                    edttxt.setText("OWIN");
                    return;
                }
            }
        }

        // Determine columns.
        for(int i=0; i<3; i++){
            if(board[i]==board[i+3] && board[i+3]==board[i+6]){
                if(board[i]==CellValue.X){
                    XWin++;
                    gameOver=true;
                    statisticsX.setText("X wins "+XWin+" games.");
                    edttxt.setText("XWIN");
                    return;
                } else if(board[i]==CellValue.O){
                    OWin++;
                    gameOver=true;
                    statisticsO.setText("O wins "+OWin+" games.");
                    edttxt.setText("OWIN");
                    return;
                }
            }
        }

        //Determine diagonals.
        if(board[0]==board[4] && board[4]==board[8]){
            if(board[0]==CellValue.X){
                XWin++;
                gameOver=true;
                statisticsX.setText("X wins "+XWin+" games.");
                edttxt.setText("XWIN");
                return;
            } else if(board[0]==CellValue.O){
                OWin++;
                gameOver=true;
                statisticsO.setText("O wins "+OWin+" games.");
                edttxt.setText("OWIN");
                return;
            }
        } else if(board[2]==board[4] && board[4]==board[6]){
            if(board[2]==CellValue.X){
                XWin++;
                gameOver=true;
                statisticsX.setText("X wins "+XWin+" games.");
                edttxt.setText("XWIN");
                return;
            } else if(board[2]==CellValue.O){
                OWin++;
                gameOver=true;
                statisticsO.setText("O wins "+OWin+" games.");
                edttxt.setText("OWIN");
                return;
            }
        }

        //Determine draw.
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
            edttxt.setText("DRAW");
            return;
        }
    }

    // Computer play method.
    private void computerPlay(){

        // Generate a random index.
        int index;
        while (true){
            index = random.nextInt(9);
            if(board[index]==CellValue.EMPTY){break;}
        }
        if(XPlay){
            board[index]=CellValue.X;
            if(index==0){button0.setText("X");}
            else if(index==1){button1.setText("X");}
            else if(index==2){button2.setText("X");}
            else if(index==3){button3.setText("X");}
            else if(index==4){button4.setText("X");}
            else if(index==5){button5.setText("X");}
            else if(index==6){button6.setText("X");}
            else if(index==7){button7.setText("X");}
            else if(index==8){button8.setText("X");}
            XPlay=false;
        } else {
            board[index]=CellValue.O;
            if(index==0){button0.setText("O");}
            else if(index==1){button1.setText("O");}
            else if(index==2){button2.setText("O");}
            else if(index==3){button3.setText("O");}
            else if(index==4){button4.setText("O");}
            else if(index==5){button5.setText("O");}
            else if(index==6){button6.setText("O");}
            else if(index==7){button7.setText("O");}
            else if(index==8){button8.setText("O");}
            XPlay=true;
        }
        determineResult();
    }
}