package com.company;

import javax.security.auth.kerberos.EncryptionKey;

public class Encrypt {
    private String encrypt_this, encrypted_data;
    private int encryption_key;


   public Encrypt(){
       encryption_key= 0;
       encrypted_data ="";
       encrypt_this="";

   }

    public String getEncrypt_this() {
        return encrypt_this;
    }

    public void setEncrypt_this(String encrypt_this) {
        this.encrypt_this = encrypt_this;
    }

    public int getEncryption_key(){
       return encryption_key;
    }
    public void setEncryption_key(int encryption_key){
       this.encryption_key = encryption_key;

    }

    public String encrypted_data() {

       for(int c=0; c<encrypt_this.length(); c++){
           if(encrypt_this.charAt(c) != ' '){
               char character=encrypt_this.charAt(c);
               int character_value= character+ encryption_key;

               if (character >= 'A' && character <='Z' && character_value >90){
                   character_value=65 +(character_value-91);
               }
               else if (character >= 'a' && character <='z' && character_value >122){
                   character_value=97 +(character_value-123);
               }
               encrypted_data+= (char)character_value;
           }
           else encrypted_data += ' ';
        }

       return encrypted_data;
    }
}

