package com.example.vistasgraficosejemplos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Llamada a nuestra propia Vista
        setContentView(new MiPropiaVista(this));
    }

    //Creación de nuestra propia Vista
    public class MiPropiaVista extends View {
       //Creación del constructor por defecto
        public MiPropiaVista (Context context) {
            super(context);
        }

        //Método para pintar dentro del Canvas
        protected void onDraw (Canvas canvas) {

           /*Para probar vídeos 36-37
            Paint miPincel=new Paint();

            //Para establecer directamente un color a través de una constante ya definida
            //miPincel.setColor(Color.BLUE);
            //Para establecer un color según su nivel de transparencia (alpha)
            //miPincel.setColor(Color.argb(185, 168,155,255));
            //Para establecer un color según un código hexadecimal
            miPincel.setColor(0xffff00ff);
            miPincel.setStrokeWidth(8);
            miPincel.setStyle(Paint.Style.STROKE);

            canvas.drawCircle(175,175,100,miPincel);

            //Relleno
            int miColor;
            miColor= ContextCompat.getColor(getContext(),R.color.rellenoCirculo);

            miPincel.setColor(miColor);
            miPincel.setStyle(Paint.Style.FILL);

            canvas.drawCircle(175,175,100, miPincel);
            */

           // Para probar vídeo 38
           Path miTrazo = new Path();

           miTrazo.addCircle(350, 350,200, Path.Direction.CCW);

           Paint miPincel=new Paint();

           miPincel.setColor(Color.RED);
           miPincel.setStrokeWidth(8);
           miPincel.setStyle(Paint.Style.STROKE);

           canvas.drawPath(miTrazo, miPincel);

           //Establecer un texto
           miPincel.setStrokeWidth(1);
           miPincel.setStyle(Paint.Style.FILL);
           miPincel.setTextSize(40);
           miPincel.setTypeface(Typeface.SANS_SERIF);

           canvas.drawTextOnPath("Curso Android - Dibujo círculo", miTrazo, 40, 100, miPincel);

        }
    }
}
