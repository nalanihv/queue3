package com.example.queue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  Queue queue;
    private EditText etUsuario;
    private Button btAgregar;
    private Button btAtender;
    private Button btMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario=findViewById(R.id.etUsuario);
        btAgregar=findViewById(R.id.btGuardar);
        btMostrar=findViewById(R.id.btMostrar);
        btAtender=findViewById(R.id.btQuitar);
        Queue queue= new Queue();





        btAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input=etUsuario.getText().toString().trim();
                if( input.equals("") )
                    Toast.makeText(getApplicationContext(),"ingresa un dato", Toast.LENGTH_SHORT).show();
                else{
                    int aux=Integer.parseInt(input);

                    boolean encontro = false;

                    /*
                    queue.add(aux);//se supone que aqui agrega
                    Log.i("log",aux+"");
                    etUsuario.setText("");*/

                    queue.add(aux);//aqui agrega
                    Log.i("log",aux+"");
                    etUsuario.setText("");

                    
                    String result = "";
                    QueueNode buscar = queue.getFirst();
                    while (buscar !=null) {
                        result += buscar.getData();
                        buscar = buscar.getNext();

                        if (input.equals(buscar)) {
                            Log.i("log", "el numero sí se encontro");
                            encontro = true;
                        } else {
                            //QueueNode buscar= queue.getFirst();
                            // buscar=buscar.getNext();

                        }
                    }
                }

            }
        });





        btAtender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String input = etUsuario.getText().toString().trim();
                //if (input.equals(""))
                    //Toast.makeText(getApplicationContext(), "ingresa cliente", Toast.LENGTH_SHORT).show();
                //else {
                    Toast.makeText(getApplicationContext(), "id. del cliente atendido"+  queue.getFirst(), Toast.LENGTH_SHORT).show();
                    //queue.printl();
                    queue.remove();
             //   }
            }
        });



        btMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                queue.printl();
                //String input = etUsuario.getText().toString().trim();
                //Queue  queue= new Queue();

            }
        });

    }
}