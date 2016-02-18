/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankcots;
import java.sql.ResultSet;
//import java.util.UUID;

/**
 *
 * @author KAHFI
 */
public class Transaksi {
   private String Id_Trans;
   private String JnisTrans;
   private String norekTrans;
   private String jumlahTrans;
   private String TokenTrans;
   private String tglTrans;
   private String wktTrans;
   Database db = new Database();
   ResultSet rs = null;

    public Transaksi() {
    }

    public String getId_Trans() {
        return Id_Trans;
    }

    public String getJnisTrans() {
        return JnisTrans;
    }

    public String getNorekTrans() {
        return norekTrans;
    }

    public String getJumlahTrans() {
        return jumlahTrans;
    }

    public String getTokenTrans() {
        return TokenTrans;
    }

    public String getTglTrans() {
        return tglTrans;
    }

    public String getWktTrans() {
        return wktTrans;
    }

    public void setId_Trans(String Id_Trans) {
        this.Id_Trans = Id_Trans;
    }

    public void setJnisTrans(String JnisTrans) {
        this.JnisTrans = JnisTrans;
    }

    public void setNorekTrans(String norekTrans) {
        this.norekTrans = norekTrans;
    }

    public void setJumlahTrans(String jumlahTrans) {
        this.jumlahTrans = jumlahTrans;
    }

    public void setTokenTrans(String TokenTrans) {
        this.TokenTrans = TokenTrans;
    }

    public void setTglTrans(String tglTrans) {
        this.tglTrans = tglTrans;
    }

    public void setWktTrans(String wktTrans) {
        this.wktTrans = wktTrans;
    }
   
        
   public void TambahTrans(int id_Trans,String JnisTrans,String norekTrans,String tglTrans,String wktTrans,int jumlahTrans){
       try {
           db.query("INSERT INTO transaksi (Id_Transaksi,Jenis_Transaksi, Norek, Tanggal, Waktu, Jml_Transaksi) VALUES ('"+id_Trans+"','"+JnisTrans+"', '"+norekTrans+"', '"+tglTrans+"', '"+wktTrans+"', "+jumlahTrans+");");
           System.out.println("masuk");
           //db.disconnect();
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }
   
   public void UpdateSaldo(String norek, int uptsaldo){
       int saldo=0;
       try {
           rs=db.getData("select * from akun where Norek='"+norek+"';");
           while(rs.next()){
               saldo=Integer.parseInt(rs.getString("Saldo"));
               //System.out.println("ok");
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       saldo=saldo-uptsaldo;
       db.query("update akun set Saldo='"+saldo+"' where Norek='"+norek+"';");
   }
   
   public boolean cekJmlUang(String norek,int UangTransaksi){
       boolean cek=false;
       int uang=0;
       try {
           rs=db.getData("select * from akun where Norek='"+norek+"';");
           while(rs.next()){
               uang=Integer.parseInt(rs.getString("Saldo"));
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       if(uang!=0&&uang-UangTransaksi>=50000){
           cek=true;
       }
       return cek;
   }
   
}
