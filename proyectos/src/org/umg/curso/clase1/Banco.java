package org.umg.curso.clase1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        Cliente c = new Cliente();
        c.setNombre("Leonidas");
        c.setEdad(30);
        c.setSalario(25000);
        System.out.println("Estimado cliente "+c.getNombre()+", su salario sera de $ "+c.getSalario());


        Cliente c2 = new Cliente("Willmer", 25, 30000, 500);
        System.out.println("Estimado cliente "+c2.getNombre()+", su salario sera de $ "+c2.getSalario());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su nombre:");
        c.setNombre(reader.readLine());
        System.out.println("Su edad:");
        c.setEdad(Integer.parseInt(reader.readLine()));
        System.out.println("Su salario:");
        c.setSalario(Integer.parseInt(reader.readLine()));
        System.out.println("Estimado cliente "+c.getNombre()+", su salario sera de $ "+c.getSalario());
    }
}
