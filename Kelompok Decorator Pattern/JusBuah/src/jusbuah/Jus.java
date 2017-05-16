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
public abstract class Jus {
    protected String deskripsi;
    
    public String GetDeskripsi(){
        return deskripsi;
    }
    
    public abstract int Harga();
    
}
