/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jusbuah;
import java.util.Scanner;
/**
 *
 * @author Audylam
 */
public class JusBuah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scanner;
        Scanner input=new Scanner(System.in);
        //BUAH
       // Jus jus = new Apel();//4500
       // Jus jus = new BuahNaga();6500
       // Jus jus = new Jeruk();//4000
       // Jus jus = new Kiwi();//6000
       // Jus jus = new Mangga();//5000
       // Jus jus = new Sirsak();//5500
        
        //CAMPURAN
        //jus= new Es(jus);//500
        //jus= new Madu(jus);//1500
        //jus= new Gula(jus);//1000
        //jus= new Susu(jus);//1500
        
        System.out.println("===JUS BUAH===");
        System.out.println("1. Jus Apel");
        System.out.println("2. Jus Buah Naga");
        System.out.println("3. Jus Jeruk");
        System.out.println("4. Jus Kiwi");
        System.out.println("5. Jus Mangga");
        System.out.println("6. Jus Sirsak");
        System.out.print("Pilih Jus Buah= ");
        int jb= input.nextInt();
        
        Jus jus = null;
        if (jb==1) {
            jus = new Apel(); 
             System.out.println("Jus Apel");
        }
        else if(jb==2) {
            jus = new BuahNaga(); 
            System.out.println("Jus Buah Naga");
        }
        else if(jb==3) {
            jus = new Jeruk(); 
            System.out.println("Jus Jeruk");
        }
        else if(jb==4) {
            jus = new Kiwi(); 
            System.out.println("Jus Kiwi");
        }
        else if(jb==5) {
            jus = new Mangga(); 
            System.out.println("Jus Mangga");
        }
        else if(jb==6) {
            jus = new Sirsak(); 
            System.out.println("Jus Sirsak");
        }
        
        String ulang= "y";
        while("y".equals(ulang))
        {

            System.out.println("===CAMPURAN===");
            System.out.println("1. ES");
            System.out.println("2. Madu");
            System.out.println("3. Gula");
            System.out.println("4. Susu");

            System.out.print("Pilih Campuran= ");
            int cm= input.nextInt();

            if (cm==1) {
                jus= new Es(jus); 
                System.out.println("Es");
            }
            else if(cm==2) {
                jus = new Madu(jus); 
                System.out.println("Madu");
            }
            else if(cm==3) {
                jus = new Gula(jus); 
                System.out.println("Gula");
            }
            else if(cm==4) {
                jus = new Susu(jus); 
                System.out.println("Susu");
            }
            
            System.out.print("Apakah ingin menambah lagi?  ");
            ulang=input.next();
        }
        
          
        System.out.println(jus.GetDeskripsi() + " = Rp." + jus.Harga());        
    }

}
