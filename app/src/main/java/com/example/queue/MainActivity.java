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
        //  System.out.println();
        //tvFibonacci= findViewById(R.id.tvFibonacci);
       //StringBuilder fibo = new StringBuilder();
      // fibo.append(fibonacci(30));
        //tvFibonacci.setText(fibo);

        contar(5,0);
        factorial(4);
    }
    public void contar(int contador,int numero){
        if(contador>numero){
            Log.i("log","se acabo ");
        } else
        {
            //contar(contador+1);
            contar(contador+1,contador+1);
            Log.i("log "," contador: "+contador);
            Log.i("log","numero"+numero);
        }
    }

    public int factorial(int numero){

        //sol. prof. quita el total
        int total;
        if(numero==0 || numero==1){ //if numero<=1
            total=1;
            return total;
        }else {
            total= numero * factorial(numero-1);
            return total;
            /* for (int i = 0; i >0 ; i--) {
                total+=i;
            }
            Log.i("log",""+total);*/
        }
    }
    /*
       // StringBuilder fib=new StringBuilder();
        //fib.append("0 - ");
        //fib.append("1- ");
        int a=0, b=1, aux=0;
        for (int i = 0; i <numero -2; i++) {
            aux=a+b;
            a=b;
            b=aux;
          //  fib.append(String.valueOf(aux)+" - ");
        }
        //return new String(fib);*/
    /*
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
                    etUsuario.setText("");//

        queue.add(aux);//aqui agrega
        Log.i("log",aux+"");
        etUsuario.setText("");


        String result="";
        QueueNode auxQueue=queue.getFirst();
        while (auxQueue!=null){ // aux==last.getNext; sign.
            result+=aux+" -> ";
            auxQueue=auxQueue.getNext();

            if (input.equals(auxQueue)) {
                Log.i("log", "el numero sí se encontro");
                encontro = true;
            } else {
                //QueueNode buscar= queue.getFirst();
                // buscar=buscar.getNext();
            }
        }}}
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
 */
}
