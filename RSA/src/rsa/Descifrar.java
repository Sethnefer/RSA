/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.math.BigInteger;

/**
 *
 * @author usuario
 */
public class Descifrar {
    int tamPrimo;
    BigInteger p, q, n;
    BigInteger phi;
    BigInteger e, d;
    //descifrar
    public String descifrar(BigInteger[] cifrado){
        

        BigInteger[] descifrado = new BigInteger[cifrado.length];

        //descifrar
        for(int i = 0; i<descifrado.length; i++){
            //aplico el descifrado
            
            descifrado[i] = cifrado[i].modPow(d, n);
        }

        //lo tengo que colocar en un arreglo de caracteres para despues pasarlo a una cadena
        char[] charArray = new char[descifrado.length];

        for(int i = 0; i <charArray.length; i++){
            charArray[i] =(char)(descifrado[i].intValue());
        }

        return (new String(charArray));
    }

    //enviar los datos

    public BigInteger damep(){
        System.out.println(p);
        return p;
    }

    public BigInteger dameq(){
        return q;
    }

    public BigInteger damen(){
        return n;
    }

    public BigInteger damephi(){
        return phi;
    }

    public BigInteger damee(){
        return e;
    }

    public BigInteger damed(){
        return d;
    }
}


