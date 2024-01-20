/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pum;

import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class PUM {

    public static void main(String[] args) {
        byte N;
        int x = 0, y;
        Scanner scan = new Scanner(System.in);
        N = scan.nextByte();
        for (int i = 0; i < N; i++) {
            y = 1 + x;
            System.out.println(y + " " + (y + 1) + " " + (y + 2) + " " + "PUM");
            x += 4;

        }

    }
}
