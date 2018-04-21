package com.example.shipra.myapplication;

import android.content.SharedPreferences;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.security.Policy;

public class MainActivity extends AppCompatActivity {



    android.hardware.Camera camera=null;

    Switch sw;
    boolean isflashon = false;

    //declaring buttons


    //Camera camera = null;  //for flash light



    Button button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button0, buttonAdd, buttonSub, button10, buttonDivision,
            buttonMul, buttonEquals, buttonC;

    //declaring editText
    EditText editText1;

    //definig variables for containg user's input
    float mValueOne, mValueTwo;

    //declaring variables for arithmetic operation
    boolean mAddition, mDivision, mSubtraction, mMultiplication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // SharedPreferences permissionStatus = getSharedPreferences("permissionStatus", MODE_PRIVATE);










        sw = (Switch) findViewById(R.id.swith_for_flash);


        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {







            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (isflashon == false) {
                    on();
                } else {
                    off();
                }

            }

        });
    }

    public void on() {
        if (isflashon == true) {
            Toast.makeText(getApplicationContext(), "Flash lifht is already On", Toast.LENGTH_SHORT).show();
        } else {

            android.hardware.Camera cam = camera.open();
            // Camera cam = camera.sh
            android.hardware.Camera.Parameters p = cam.getParameters();


            // p = Camera.cam.getParameters();
            p.setFlashMode(android.hardware.Camera.Parameters.FLASH_MODE_TORCH);
            cam.setParameters(p);
            // cam.setParameter(p);
            isflashon = true;


        }
    }

    public void off() {

        if (isflashon == false) {
            Toast.makeText(getApplicationContext(), "Flash lifht is already OFF", Toast.LENGTH_SHORT).show();
        } else {

            android.hardware.Camera cam = camera.open();
            // Camera cam = camera.sh
            android.hardware.Camera.Parameters p = cam.getParameters();


            // p = Camera.cam.getParameters();
            p.setFlashMode(android.hardware.Camera.Parameters.FLASH_MODE_OFF);
            cam.setParameters(p);
           // cam.setParameters(p);
            isflashon = true;


        }






        //take the refrance of button in variable by there id
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);

        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonEquals = (Button) findViewById(R.id.buttoneql);
        buttonC = (Button) findViewById(R.id.buttonC);

        //same for the edit text
        editText1 = (EditText) findViewById(R.id.edt1);







                buttonC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText("");
                    }
                });


                //defining each button in a onclick listner method
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "1");
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "2");
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "3");
                    }
                });


                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "4");
                    }
                });


                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "5");
                    }
                });


                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "6");
                    }
                });


                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "7");
                    }
                });

                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "8");
                    }
                });

                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "9");
                    }
                });

                button0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText1.setText(editText1.getText() + "0");
                    }
                });


                //ADDITION
                buttonAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (editText1 == null) {
                            editText1.setText("");
                        } else {
                            mValueOne = Float.parseFloat(editText1.getText() + "");
                            mAddition = true;
                            editText1.setText(null);
                        }
                    }
                });

                //SUBTRACTION
                buttonSub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mValueOne = Float.parseFloat(editText1.getText() + "");
                        mSubtraction = true;
                        editText1.setText(null);
                    }
                });

                //DIVISION
                buttonDivision.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mValueOne = Float.parseFloat(editText1.getText() + "");
                        mDivision = true;
                        editText1.setText(null);
                    }
                });
                //MULTIPLECATION
                buttonMul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mValueOne = Float.parseFloat(editText1.getText() + "");
                        mMultiplication = true;
                        editText1.setText(mValueOne + "");
                    }
                });


                buttonEquals.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mValueTwo = Float.parseFloat(editText1.getText() + "");

                        if (mAddition == true) {

                            editText1.setText(mValueOne + mValueTwo + "");
                            mAddition = false;
                        }


                        if (mSubtraction == true) {
                            editText1.setText(mValueOne - mValueTwo + "");
                            mSubtraction = false;
                        }

                        if (mDivision == true) {
                            editText1.setText(mValueOne / mValueTwo + "");
                            mDivision = false;
                        }

                        if (mMultiplication == true) {

                            editText1.setText((mValueOne) * (mValueTwo) + "");
                            mMultiplication = false;

                        }


                    }


                });


                button10.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View v) {
                        editText1.setText(".");
                    }

                });

            }
        }











