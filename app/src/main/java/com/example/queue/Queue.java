package com.example.queue;

import android.util.Log;

public class Queue {
    private QueueNode first;
    private QueueNode last;
    private int contador=0;

    public Queue() {//por que la primera vez estan vacios -Se inicializa
        first=null;
        last=null;
        //first=last=null;
    }

    public QueueNode getFirst() {
        return first;}
    public QueueNode getLast() {
        return last;}



    public void add(int data){
        QueueNode node=new QueueNode(data);//agrega valores
        if (node==null){
            Log.i("log","Queue overflow");
        }else {
            if (contador<=8){
                if(first==null){
                    first=node;//el primero siempre va a tener el mismo valor agregando
                    contador++;
                }else {
                    last.setNext(node);//el dato que entra se enlaza con el set el enlace para que apunte al ultimo de ese momento , hasta
                    //que se actualiza en la siguente linea. Al ultimo ponerle el que sigue despues de el.
                    contador++;
                }
                last=node;//el ultimo que llegue es el ultimo
            }
            else{
                Log.i("log","la fila esta llena, el usuario no puede ser atendido");
            }

        }
    }



    public void printl(){
        String result="";
        QueueNode aux=first;
        while (aux!=null){ // aux==last.getNext; sign.
            result+=aux+" -> ";
            aux=aux.getNext();
        }
        Log.i("log","usuarios en fila: "+result);
    }


    public int remove(){

        if (first==null){
            return -1;//no hay elementos
        }else {
            QueueNode aux=first;
            first=first.getNext();//el primero va hacer ahora el enlace que tiene
            if (first==null)
                last = null;
            contador--;

            return aux.getData();

        }}
}
