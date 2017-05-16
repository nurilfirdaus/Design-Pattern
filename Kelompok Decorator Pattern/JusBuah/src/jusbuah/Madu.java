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
public class Madu extends Campuran{
    public Madu(Jus jus) {
        this.jus = jus;
    }
    
  
    @Override
    public String GetDeskripsi() {
        return jus.GetDeskripsi()+ " + Madu";
    }
    
   
    @Override
    public int Harga() {
        return jus.Harga() + 1500;
    }
}
