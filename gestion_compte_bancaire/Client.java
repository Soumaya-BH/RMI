/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_compte_bancaire;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            int c=0;
            while(c!=4){
            System.out.println(" \t Veuillez vous entrer le num de votre choix: \n 1:Debiter \n 2:Crediter \n 3:LireSolde \n 4:Quitter \n \t ****************************************");
            Scanner sc=new Scanner(System.in);
            c=sc.nextInt();
            if(c==1){
                System.out.println("Quel montant voulez vous le debiter ?");
                int x=sc.nextInt();
                service1.debiter(x);
            }
            else if(c==2){
                System.out.println("Quel montant voulez vous le crediter ?");
                int y=sc.nextInt();
                service1.crediter(y);
            }
            else if(c==3){
                System.out.println(service1.lireSolde());
            }
            }

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}