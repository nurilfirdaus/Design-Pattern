/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jusbuah;

/**
 *
 * @author Audylam
 */
public class Es extends Campuran{
    public Es(Jus jus) {
        this.jus = jus;
    }
    
   
    public String GetDeskripsi() {
        return jus.GetDeskripsi()+ " + Es";
    }
    
   
    public int Harga() {
        return jus.Harga() + 500;
    }
}
