package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Content: ");
        String content= input.nextLine();
        System.out.print ("Enter Key: ");
        int key= input.nextInt();
        System.out.println();


        Encrypt encrypt= new Encrypt();
        encrypt.setEncrypt_this(content);
        System.out.println(encrypt.getEncrypt_this());

        encrypt.setEncryption_key(key);
        System.out.println(encrypt.getEncryption_key());

        System.out.println(encrypt.encrypted_data());
    }
}
