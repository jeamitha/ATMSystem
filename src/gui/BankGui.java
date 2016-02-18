package gui;
import bankcots.Database;
import bankcots.Transaksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;
/**
 *
 * @author KAHFI
 */
public class BankGui extends javax.swing.JFrame implements Runnable{
Database db = new Database();
ResultSet rs = null;
Transaksi tr = new Transaksi();
boolean cekUang=false;
Thread t = new Thread(this);
    /**
     * Creates new form BankGui
     */
    public BankGui() {
        initComponents();
        Date d = new Date();
        Format f = new SimpleDateFormat("dd MMMM YYYY");
        Format f2 = new SimpleDateFormat("hh:mm aa");
        Tanggal.setText(f.format(d));
        waktu.setText(f2.format(d));
        idTransaksi.setText(Integer.toString(RandomId()));
        TanggalBayar.setText(f.format(d));
        waktuBayar.setText(f2.format(d));
        idBayar.setText(Integer.toString(RandomId()));
        TokenBayar.setText(Integer.toString(RandomId()));
        TanggalTransfer.setText(f.format(d));
        waktuTransfer.setText(f2.format(d));
        idTranfer.setText(Integer.toString(RandomId()));
//        this.tglTrans=f.format(d);
//        this.wktTrans=f2.format(d);
        t.start();
    }
    
@Override
    public void run(){
        for(int i=0; i>=0; i--){
             for(int j=59; j>=i-i; j--){
                 System.out.println(i+" : "+j);
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException ex) {
                     ex.printStackTrace();
                 }
             }
         }
        JOptionPane.showMessageDialog(null, "Waktu Berhenti Transaksi Anda Terlalu Lama,Silahkan Ulangi Transaksi");
        System.exit(0);
     }

     public static int RandomId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return Integer.parseInt(str);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        norekText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        passText = new javax.swing.JPasswordField();
        MenuUtama = new javax.swing.JPanel();
        TarikTunai = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        InfoSaldo = new javax.swing.JButton();
        GantiPin = new javax.swing.JButton();
        Transfer = new javax.swing.JButton();
        Pembayaran = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        MenuTarik = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        duaratus = new javax.swing.JButton();
        sejuta = new javax.swing.JButton();
        seratus = new javax.swing.JButton();
        limapuluh = new javax.swing.JButton();
        nomlain = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        MenuNomLain = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        menuPembayaran = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        MenuNominalByar = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        KodeUniv = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        InputTujuanBayar = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        InputBayar = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        noHpPulsa = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        inputNomPuilsa = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        IDBooking = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        InputIdBooking = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        InputBayarBooking = new javax.swing.JTextField();
        NoSpeedy = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        DetaiLTransaksi = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idTransaksi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JenisTransaksi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        NorekTrans = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Tanggal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        waktu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JumlahTransaksi = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        GantiPIN1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        pin1 = new javax.swing.JPasswordField();
        GantiPIN2 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        pin2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        MenuSaldo = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        Text_saldo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        NomorTransfer = new javax.swing.JPanel();
        NorekTuj = new javax.swing.JTextField();
        JumTran = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lanjut2button = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        backtransfer2button = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        DatailPembayaran = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        idBayar = new javax.swing.JTextField();
        JenisBayar = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        NorekTujuanBayar = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        TanggalBayar = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        waktuBayar = new javax.swing.JTextField();
        JumlahBayar = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        TokenBayar = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        NorekBayar = new javax.swing.JTextField();
        DetailTransfer = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        idTranfer = new javax.swing.JTextField();
        JenisTransfer = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        NorekTransfer = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        TanggalTransfer = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        waktuTransfer = new javax.swing.JTextField();
        JumlahTransfer = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        NorekTjuanTransfer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATM COTS");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 5\\Asprak PBO\\COTS\\BankCots\\cara-masukan-kartu-atm.jpg")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NO REKENING");

        norekText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        passText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2))
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(norekText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(LoginLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel3)))
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(norekText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Login, "card2");

        MenuUtama.setBackground(new java.awt.Color(204, 204, 204));

        TarikTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarikTunaiActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 5\\Asprak PBO\\COTS\\BankCots\\menu utama.jpg")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        InfoSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoSaldoActionPerformed(evt);
            }
        });

        GantiPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GantiPinActionPerformed(evt);
            }
        });

        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });

        Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembayaranActionPerformed(evt);
            }
        });

        Back.setText("CANCEL");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuUtamaLayout = new javax.swing.GroupLayout(MenuUtama);
        MenuUtama.setLayout(MenuUtamaLayout);
        MenuUtamaLayout.setHorizontalGroup(
            MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUtamaLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(GantiPin, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addComponent(Transfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InfoSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(TarikTunai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(MenuUtamaLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuUtamaLayout.setVerticalGroup(
            MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUtamaLayout.createSequentialGroup()
                .addGroup(MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuUtamaLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(TarikTunai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(InfoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuUtamaLayout.createSequentialGroup()
                            .addGap(239, 239, 239)
                            .addComponent(GantiPin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(Pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MenuUtamaLayout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        getContentPane().add(MenuUtama, "card3");

        MenuTarik.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 5\\Asprak PBO\\COTS\\BankCots\\tarik tunai 1-1.jpg")); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setPreferredSize(new java.awt.Dimension(300, 300));

        duaratus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaratusActionPerformed(evt);
            }
        });

        sejuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sejutaActionPerformed(evt);
            }
        });

        seratus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seratusActionPerformed(evt);
            }
        });

        limapuluh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limapuluhActionPerformed(evt);
            }
        });

        nomlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomlainActionPerformed(evt);
            }
        });

        jButton8.setText("CANCEL");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton17.setText("BACK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuTarikLayout = new javax.swing.GroupLayout(MenuTarik);
        MenuTarik.setLayout(MenuTarikLayout);
        MenuTarikLayout.setHorizontalGroup(
            MenuTarikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTarikLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuTarikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomlain, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuTarikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(seratus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addComponent(limapuluh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuTarikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(duaratus, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(sejuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(MenuTarikLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(MenuTarikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuTarikLayout.setVerticalGroup(
            MenuTarikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTarikLayout.createSequentialGroup()
                .addGroup(MenuTarikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuTarikLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuTarikLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(duaratus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(sejuta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuTarikLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(limapuluh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(seratus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(nomlain, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(MenuTarik, "card4");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nominal Kelipatan 50.000");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Masukan Nominal Penarikan Uang");

        jButton3.setText("BENAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("TIDAK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel42.setText("Menu Tarik Tunai");

        javax.swing.GroupLayout MenuNomLainLayout = new javax.swing.GroupLayout(MenuNomLain);
        MenuNomLain.setLayout(MenuNomLainLayout);
        MenuNomLainLayout.setHorizontalGroup(
            MenuNomLainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuNomLainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(163, 163, 163))
            .addGroup(MenuNomLainLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(MenuNomLainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuNomLainLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MenuNomLainLayout.createSequentialGroup()
                .addGroup(MenuNomLainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuNomLainLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(MenuNomLainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(MenuNomLainLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel42)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        MenuNomLainLayout.setVerticalGroup(
            MenuNomLainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuNomLainLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel42)
                .addGap(87, 87, 87)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        getContentPane().add(MenuNomLain, "card5");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Pilih Jenis Pembayaran");

        jButton6.setText("Kuliah");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Beli Pulsa");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Speedy");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Booking Kereta");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Booking Pesawat");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("CANCEL");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton16.setText("BACK");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel43.setText("Menu Pembayaran");

        javax.swing.GroupLayout menuPembayaranLayout = new javax.swing.GroupLayout(menuPembayaran);
        menuPembayaran.setLayout(menuPembayaranLayout);
        menuPembayaranLayout.setHorizontalGroup(
            menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPembayaranLayout.createSequentialGroup()
                .addGroup(menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPembayaranLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel9))
                    .addGroup(menuPembayaranLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel43))
                    .addGroup(menuPembayaranLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(menuPembayaranLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPembayaranLayout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuPembayaranLayout.createSequentialGroup()
                        .addGroup(menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74))))
        );
        menuPembayaranLayout.setVerticalGroup(
            menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPembayaranLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel43)
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(menuPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(menuPembayaran, "card6");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Masukan Nominal Tagihan");

        jButton18.setText("BENAR");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel20.setText("Lanjutkan Transaksi");

        jButton19.setText("TIDAK");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("CANCEL");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel44.setText("Menu Pembayaran");

        javax.swing.GroupLayout MenuNominalByarLayout = new javax.swing.GroupLayout(MenuNominalByar);
        MenuNominalByar.setLayout(MenuNominalByarLayout);
        MenuNominalByarLayout.setHorizontalGroup(
            MenuNominalByarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuNominalByarLayout.createSequentialGroup()
                .addGroup(MenuNominalByarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuNominalByarLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(MenuNominalByarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuNominalByarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuNominalByarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MenuNominalByarLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel44)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        MenuNominalByarLayout.setVerticalGroup(
            MenuNominalByarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuNominalByarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel44)
                .addGap(62, 62, 62)
                .addComponent(jLabel19)
                .addGap(27, 27, 27)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(16, 16, 16)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton20)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        getContentPane().add(MenuNominalByar, "card7");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Di ikuti Nomor Tagihan");

        InputTujuanBayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setText("Lanjutkan Transaksi");

        jButton21.setText("BENAR");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("TIDAK");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("CANCEL");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Masukan Jumlah Pembayaran");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel45.setText("Menu Pembayaran");

        InputBayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Masukan Kode Universitas");

        javax.swing.GroupLayout KodeUnivLayout = new javax.swing.GroupLayout(KodeUniv);
        KodeUniv.setLayout(KodeUnivLayout);
        KodeUnivLayout.setHorizontalGroup(
            KodeUnivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KodeUnivLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel45)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(KodeUnivLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KodeUnivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputTujuanBayar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(KodeUnivLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KodeUnivLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addComponent(InputBayar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KodeUnivLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(KodeUnivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(KodeUnivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KodeUnivLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        KodeUnivLayout.setVerticalGroup(
            KodeUnivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KodeUnivLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(82, 82, 82)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputTujuanBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(16, 16, 16)
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton23)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(KodeUnivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KodeUnivLayout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jLabel27)
                    .addContainerGap(442, Short.MAX_VALUE)))
        );

        getContentPane().add(KodeUniv, "card8");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Masukan Nominal Pulsa");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Di ikuti Nomor Handphone Anda");

        inputNomPuilsa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel26.setText("Lanjutkan Transaksi");

        jButton24.setText("BENAR");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("TIDAK");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("CANCEL");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel46.setText("Menu Pembayaran");

        javax.swing.GroupLayout noHpPulsaLayout = new javax.swing.GroupLayout(noHpPulsa);
        noHpPulsa.setLayout(noHpPulsaLayout);
        noHpPulsaLayout.setHorizontalGroup(
            noHpPulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noHpPulsaLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noHpPulsaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(noHpPulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(noHpPulsaLayout.createSequentialGroup()
                        .addGroup(noHpPulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(noHpPulsaLayout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addGroup(noHpPulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(noHpPulsaLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(noHpPulsaLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel25)))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addComponent(inputNomPuilsa))
                .addContainerGap())
        );
        noHpPulsaLayout.setVerticalGroup(
            noHpPulsaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noHpPulsaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addGap(76, 76, 76)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNomPuilsa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(16, 16, 16)
                .addComponent(jButton24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton26)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        getContentPane().add(noHpPulsa, "card9");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Masukan ID Booking Anda");

        InputIdBooking.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel29.setText("Lanjutkan Transaksi");

        jButton27.setText("BENAR");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("TIDAK");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("CANCEL");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel47.setText("Menu Pembayaran");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel69.setText("Masukan Jumlah Pembayaran");

        InputBayarBooking.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout IDBookingLayout = new javax.swing.GroupLayout(IDBooking);
        IDBooking.setLayout(IDBookingLayout);
        IDBookingLayout.setHorizontalGroup(
            IDBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDBookingLayout.createSequentialGroup()
                .addGroup(IDBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IDBookingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(IDBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputIdBooking)
                            .addGroup(IDBookingLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel28)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(InputBayarBooking)
                    .addGroup(IDBookingLayout.createSequentialGroup()
                        .addGroup(IDBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IDBookingLayout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addGroup(IDBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(IDBookingLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel47))
                            .addGroup(IDBookingLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel69)))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        IDBookingLayout.setVerticalGroup(
            IDBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDBookingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addGap(43, 43, 43)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputBayarBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel29)
                .addGap(16, 16, 16)
                .addComponent(jButton27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton29)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        getContentPane().add(IDBooking, "card10");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Masukan ID Speedy Anda");

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel31.setText("Lanjutkan Transaksi");

        jButton30.setText("BENAR");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("TIDAK");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("CANCEL");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel48.setText("Menu Pembayaran");

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel73.setText("Masukan Jumlah Pembayaran");

        javax.swing.GroupLayout NoSpeedyLayout = new javax.swing.GroupLayout(NoSpeedy);
        NoSpeedy.setLayout(NoSpeedyLayout);
        NoSpeedyLayout.setHorizontalGroup(
            NoSpeedyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoSpeedyLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(NoSpeedyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoSpeedyLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoSpeedyLayout.createSequentialGroup()
                        .addGroup(NoSpeedyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))))
            .addGroup(NoSpeedyLayout.createSequentialGroup()
                .addGroup(NoSpeedyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NoSpeedyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(NoSpeedyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13)
                            .addComponent(jTextField14)))
                    .addGroup(NoSpeedyLayout.createSequentialGroup()
                        .addGroup(NoSpeedyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NoSpeedyLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel30))
                            .addGroup(NoSpeedyLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NoSpeedyLayout.setVerticalGroup(
            NoSpeedyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoSpeedyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addGap(40, 40, 40)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel31)
                .addGap(16, 16, 16)
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton32)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        getContentPane().add(NoSpeedy, "card11");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Detail Transaksi");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ID Transaksi ");

        idTransaksi.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Jenis Transaksi ");

        JenisTransaksi.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Norek");

        NorekTrans.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Tanggal");

        Tanggal.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Waktu");

        waktu.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Jumlah Transaksi");

        JumlahTransaksi.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Lanjutkan Transaksi ?");

        jButton13.setText("BENAR");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("TIDAK");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("CANCEL");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetaiLTransaksiLayout = new javax.swing.GroupLayout(DetaiLTransaksi);
        DetaiLTransaksi.setLayout(DetaiLTransaksiLayout);
        DetaiLTransaksiLayout.setHorizontalGroup(
            DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetaiLTransaksiLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel10)
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetaiLTransaksiLayout.createSequentialGroup()
                .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DetaiLTransaksiLayout.createSequentialGroup()
                        .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DetaiLTransaksiLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(35, 35, 35))
                            .addGroup(DetaiLTransaksiLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DetaiLTransaksiLayout.createSequentialGroup()
                                .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(DetaiLTransaksiLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)))
                        .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(waktu)
                            .addComponent(JenisTransaksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(idTransaksi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NorekTrans, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tanggal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JumlahTransaksi)))
                    .addComponent(jButton15)
                    .addComponent(jLabel18)
                    .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        DetaiLTransaksiLayout.setVerticalGroup(
            DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetaiLTransaksiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JenisTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NorekTrans, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktu, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetaiLTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JumlahTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel16))
                .addGap(49, 49, 49)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addGap(115, 115, 115))
        );

        getContentPane().add(DetaiLTransaksi, "card12");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Masukan PIN Lama Anda");

        jLabel33.setText("Lanjutkan Transaksi");

        jButton33.setText("BENAR");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("TIDAK");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("CANCEL");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel49.setText("Menu Ganti PIN");

        pin1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pin1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout GantiPIN1Layout = new javax.swing.GroupLayout(GantiPIN1);
        GantiPIN1.setLayout(GantiPIN1Layout);
        GantiPIN1Layout.setHorizontalGroup(
            GantiPIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GantiPIN1Layout.createSequentialGroup()
                .addGroup(GantiPIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GantiPIN1Layout.createSequentialGroup()
                        .addGroup(GantiPIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GantiPIN1Layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addGroup(GantiPIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(GantiPIN1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel32))
                            .addGroup(GantiPIN1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel49)))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addComponent(pin1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        GantiPIN1Layout.setVerticalGroup(
            GantiPIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GantiPIN1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(20, 20, 20)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pin1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addGap(16, 16, 16)
                .addComponent(jButton33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton35)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        getContentPane().add(GantiPIN1, "card13");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Masukan PIN Baru Anda");

        pin2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel35.setText("Lanjutkan Transaksi");

        jButton36.setText("BENAR");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("TIDAK");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setText("CANCEL");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel50.setText("Menu Ganti PIN");

        javax.swing.GroupLayout GantiPIN2Layout = new javax.swing.GroupLayout(GantiPIN2);
        GantiPIN2.setLayout(GantiPIN2Layout);
        GantiPIN2Layout.setHorizontalGroup(
            GantiPIN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GantiPIN2Layout.createSequentialGroup()
                .addGroup(GantiPIN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GantiPIN2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pin2))
                    .addGroup(GantiPIN2Layout.createSequentialGroup()
                        .addGroup(GantiPIN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GantiPIN2Layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addGroup(GantiPIN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(GantiPIN2Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel34))
                            .addGroup(GantiPIN2Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel50)))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GantiPIN2Layout.setVerticalGroup(
            GantiPIN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GantiPIN2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pin2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addGap(16, 16, 16)
                .addComponent(jButton36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton38)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        getContentPane().add(GantiPIN2, "card14");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("Saldo Anda");

        Text_saldo.setEditable(false);
        Text_saldo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Text_saldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel37.setText("Lanjutkan Transaksi Lain");

        jButton39.setText("BENAR");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setText("TIDAK");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel51.setText("Menu Cek Saldo");

        javax.swing.GroupLayout MenuSaldoLayout = new javax.swing.GroupLayout(MenuSaldo);
        MenuSaldo.setLayout(MenuSaldoLayout);
        MenuSaldoLayout.setHorizontalGroup(
            MenuSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSaldoLayout.createSequentialGroup()
                .addGroup(MenuSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuSaldoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Text_saldo))
                    .addGroup(MenuSaldoLayout.createSequentialGroup()
                        .addGroup(MenuSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuSaldoLayout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addGroup(MenuSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(MenuSaldoLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel36)))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSaldoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(108, 108, 108))
        );
        MenuSaldoLayout.setVerticalGroup(
            MenuSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSaldoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addGap(16, 16, 16)
                .addComponent(jButton39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton40)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        getContentPane().add(MenuSaldo, "card15");

        NomorTransfer.setPreferredSize(new java.awt.Dimension(472, 576));

        NorekTuj.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N

        JumTran.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("SILAHKAN MASUKKAN NOMOR REKENING TRANSFER");

        jLabel39.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("DAN JUMLAH TRANSFER");

        jLabel40.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("LANJUTKAN");

        lanjut2button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanjut2buttonActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("KEMBALI KE MENU");

        backtransfer2button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtransfer2buttonActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel52.setText("Menu Transfer");

        javax.swing.GroupLayout NomorTransferLayout = new javax.swing.GroupLayout(NomorTransfer);
        NomorTransfer.setLayout(NomorTransferLayout);
        NomorTransferLayout.setHorizontalGroup(
            NomorTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NomorTransferLayout.createSequentialGroup()
                .addGroup(NomorTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NomorTransferLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(NomorTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NomorTransferLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lanjut2button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NomorTransferLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(backtransfer2button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NomorTransferLayout.createSequentialGroup()
                                .addComponent(NorekTuj, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JumTran, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(NomorTransferLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel38)))
                .addGap(0, 47, Short.MAX_VALUE))
            .addGroup(NomorTransferLayout.createSequentialGroup()
                .addGroup(NomorTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NomorTransferLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel39))
                    .addGroup(NomorTransferLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel52)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NomorTransferLayout.setVerticalGroup(
            NomorTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NomorTransferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addGap(70, 70, 70)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addGap(61, 61, 61)
                .addGroup(NomorTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NorekTuj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JumTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(NomorTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NomorTransferLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lanjut2button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NomorTransferLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel40)))
                .addGroup(NomorTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NomorTransferLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backtransfer2button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NomorTransferLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel41)))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        getContentPane().add(NomorTransfer, "card16");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel53.setText("Detail Pembayaran");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("ID Transaksi ");

        idBayar.setEditable(false);

        JenisBayar.setEditable(false);

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Jenis Transaksi ");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Norek Tujuan");

        NorekTujuanBayar.setEditable(false);

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Tanggal");

        TanggalBayar.setEditable(false);

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("Waktu");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Jumlah Transaksi");

        waktuBayar.setEditable(false);

        JumlahBayar.setEditable(false);

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("Token");

        TokenBayar.setEditable(false);

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("Lanjutkan Transaksi ?");

        jButton41.setText("BENAR");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("TIDAK");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setText("CANCEL");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("Norek ");

        NorekBayar.setEditable(false);

        javax.swing.GroupLayout DatailPembayaranLayout = new javax.swing.GroupLayout(DatailPembayaran);
        DatailPembayaran.setLayout(DatailPembayaranLayout);
        DatailPembayaranLayout.setHorizontalGroup(
            DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatailPembayaranLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(DatailPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DatailPembayaranLayout.createSequentialGroup()
                        .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DatailPembayaranLayout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addGap(35, 35, 35))
                            .addComponent(jLabel59))
                        .addContainerGap(375, Short.MAX_VALUE))
                    .addGroup(DatailPembayaranLayout.createSequentialGroup()
                        .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton41)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton43))
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatailPembayaranLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61)
                    .addGroup(DatailPembayaranLayout.createSequentialGroup()
                        .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DatailPembayaranLayout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(35, 35, 35))
                            .addGroup(DatailPembayaranLayout.createSequentialGroup()
                                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel58))
                                .addGap(18, 18, 18)))
                        .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JenisBayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                .addComponent(idBayar, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(NorekBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NorekTujuanBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TanggalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waktuBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TokenBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        DatailPembayaranLayout.setVerticalGroup(
            DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatailPembayaranLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JenisBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NorekBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NorekTujuanBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TanggalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktuBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JumlahBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatailPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TokenBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel60))
                .addGap(31, 31, 31)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton42)
                .addGap(18, 18, 18)
                .addComponent(jButton43)
                .addGap(44, 44, 44))
        );

        getContentPane().add(DatailPembayaran, "card17");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel62.setText("Detail Transfer");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("ID Transaksi ");

        idTranfer.setEditable(false);

        JenisTransfer.setEditable(false);

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Jenis Transaksi ");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("Norek");

        NorekTransfer.setEditable(false);

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("Tanggal");

        TanggalTransfer.setEditable(false);

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Waktu");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Jumlah Transaksi");

        waktuTransfer.setEditable(false);

        JumlahTransfer.setEditable(false);

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("Lanjutkan Transaksi ?");

        jButton44.setText("BENAR");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setText("TIDAK");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setText("CANCEL");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setText("Norek Tujuan");

        NorekTjuanTransfer.setEditable(false);

        javax.swing.GroupLayout DetailTransferLayout = new javax.swing.GroupLayout(DetailTransfer);
        DetailTransfer.setLayout(DetailTransferLayout);
        DetailTransferLayout.setHorizontalGroup(
            DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailTransferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailTransferLayout.createSequentialGroup()
                        .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton46)
                            .addComponent(jLabel70)
                            .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton44, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(DetailTransferLayout.createSequentialGroup()
                                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NorekTjuanTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JumlahTransfer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                        .addComponent(waktuTransfer, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TanggalTransfer)
                                        .addComponent(idTranfer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(DetailTransferLayout.createSequentialGroup()
                        .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DetailTransferLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel62))
                            .addComponent(jLabel72)
                            .addComponent(jLabel63)
                            .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DetailTransferLayout.createSequentialGroup()
                                    .addComponent(jLabel65)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NorekTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DetailTransferLayout.createSequentialGroup()
                                    .addComponent(jLabel64)
                                    .addGap(18, 18, 18)
                                    .addComponent(JenisTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );
        DetailTransferLayout.setVerticalGroup(
            DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailTransferLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idTranfer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(JenisTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NorekTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel65))
                .addGap(18, 18, 18)
                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailTransferLayout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addGap(18, 18, 18))
                    .addGroup(DetailTransferLayout.createSequentialGroup()
                        .addComponent(NorekTjuanTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TanggalTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktuTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetailTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JumlahTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel68))
                .addGap(49, 49, 49)
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton46)
                .addGap(77, 77, 77))
        );

        getContentPane().add(DetailTransfer, "card18");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pass=null;
        try {
        rs=db.getData("select Password from akun where Norek='"+norekText.getText()+"';");
            while(rs.next()){
            pass=rs.getString("Password");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if(!"".equals(pass)&&pass.equals(passText.getText())){
            MenuUtama.setVisible(true);
            Login.setVisible(false);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MenuTarik.setVisible(true);
        MenuNomLain.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nomlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomlainActionPerformed
        // TODO add your handling code here:
       MenuNomLain.setVisible(true);
       MenuTarik.setVisible(false);
    }//GEN-LAST:event_nomlainActionPerformed

    private void TarikTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarikTunaiActionPerformed
        // TODO add your handling code here:
         MenuTarik.setVisible(true);
         MenuUtama.setVisible(false);
    }//GEN-LAST:event_TarikTunaiActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        MenuTarik.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        MenuUtama.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_BackActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cekUang=tr.cekJmlUang(norekText.getText(), Integer.parseInt(jTextField1.getText()));
        if(cekUang==true){
            if(Integer.parseInt(jTextField1.getText())%50000==0){
                JenisTransaksi.setText("Tarik Tunai");
                NorekTrans.setText(norekText.getText());
                JumlahTransaksi.setText(jTextField1.getText());
                DetaiLTransaksi.setVisible(true);
                MenuNomLain.setVisible(false);
            } else {
            JOptionPane.showMessageDialog(null, "Nominal Harus Kelipatan Rp 50.000");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Anda Tidak Mencukupi");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        menuPembayaran.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        menuPembayaran.setVisible(false);
        MenuUtama.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        MenuTarik.setVisible(false);
        MenuUtama.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        MenuNominalByar.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        MenuNominalByar.setVisible(false);
        menuPembayaran.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        KodeUniv.setVisible(false);
        menuPembayaran.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        KodeUniv.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        noHpPulsa.setVisible(false);
        menuPembayaran.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        noHpPulsa.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        IDBooking.setVisible(false);
        menuPembayaran.setVisible(true);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        IDBooking.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        NoSpeedy.setVisible(false);
        menuPembayaran.setVisible(true);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        NoSpeedy.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembayaranActionPerformed
        // TODO add your handling code here:
        menuPembayaran.setVisible(true);
        MenuUtama.setVisible(false);
    }//GEN-LAST:event_PembayaranActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        GantiPIN1.setVisible(false);
        MenuUtama.setVisible(true);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        GantiPIN1.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        GantiPIN1.setVisible(true);
        GantiPIN2.setVisible(false);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        GantiPIN2.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        MenuSaldo.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton40ActionPerformed

    private void lanjut2buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanjut2buttonActionPerformed
        // TODO add your handling code here:
        String norekTujuan="";
        try {
            rs=db.getData("select * from akun where Norek='"+NorekTuj.getText()+"';");
            while(rs.next()){
                norekTujuan=rs.getString("Norek");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(!"".equals(norekTujuan)){
            JenisTransfer.setText("Transfer ke no rekening: "+NorekTuj.getText());
            NorekTransfer.setText(norekText.getText());
            JumlahTransfer.setText(JumTran.getText());
            NorekTjuanTransfer.setText(NorekTuj.getText());
            DetailTransfer.setVisible(true);
            NomorTransfer.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "No Rekening Tujuan Tidak Di Temukan");
        }
        
    }//GEN-LAST:event_lanjut2buttonActionPerformed

    private void backtransfer2buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtransfer2buttonActionPerformed
        // TODO add your handling code here:
       NomorTransfer.setVisible(false);
       MenuUtama.setVisible(true);
    }//GEN-LAST:event_backtransfer2buttonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        KodeUniv.setVisible(true);
        menuPembayaran.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void InfoSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoSaldoActionPerformed
        // TODO add your handling code here:
        int saldo = 0;
        try {
            rs=db.getData("select * from akun where Norek='"+norekText.getText()+"'");
            while(rs.next()){
                saldo=Integer.parseInt(rs.getString("Saldo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        MenuSaldo.setVisible(true);
        Text_saldo.setText(Integer.toString(saldo));
        MenuUtama.setVisible(false);
    }//GEN-LAST:event_InfoSaldoActionPerformed

    private void GantiPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GantiPinActionPerformed
        // TODO add your handling code here:
        GantiPIN1.setVisible(true);
        MenuUtama.setVisible(false);
        System.out.println(norekText.getText());
    }//GEN-LAST:event_GantiPinActionPerformed

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
        // TODO add your handling code here:
        NomorTransfer.setVisible(true);
        MenuUtama.setVisible(false);
    }//GEN-LAST:event_TransferActionPerformed

    private void duaratusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaratusActionPerformed
        // TODO add your handling code here:
        //tr.TambahTrans("Transfer Tunai", norekText.getText(), tglTrans, wktTrans, 200000);
        cekUang=tr.cekJmlUang(norekText.getText(), 200000);
        if(cekUang==true){
            JenisTransaksi.setText("Tarik Tunai");
            NorekTrans.setText(norekText.getText());
            JumlahTransaksi.setText("200000");
            MenuTarik.setVisible(false);
            DetaiLTransaksi.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Anda Tidak Mencukupi");
        }
        
    }//GEN-LAST:event_duaratusActionPerformed

    private void sejutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sejutaActionPerformed
        // TODO add your handling code here:
        cekUang=tr.cekJmlUang(norekText.getText(), 1000000);
        if(cekUang==true){
        JenisTransaksi.setText("Tarik Tunai");
        NorekTrans.setText(norekText.getText());
        JumlahTransaksi.setText("1000000");
        MenuTarik.setVisible(false);
        DetaiLTransaksi.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Anda Tidak Mencukupi");
        }
    }//GEN-LAST:event_sejutaActionPerformed

    private void limapuluhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limapuluhActionPerformed
        // TODO add your handling code here:
        cekUang=tr.cekJmlUang(norekText.getText(), 50000);
        if(cekUang==true){
        JenisTransaksi.setText("Tarik Tunai");
        NorekTrans.setText(norekText.getText());
        JumlahTransaksi.setText("50000");
        MenuTarik.setVisible(false);
        DetaiLTransaksi.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Anda Tidak Mencukupi");
        }
    }//GEN-LAST:event_limapuluhActionPerformed

    private void seratusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seratusActionPerformed
        // TODO add your handling code here:
        cekUang=tr.cekJmlUang(norekText.getText(), 100000);
        if(cekUang==true){
        JenisTransaksi.setText("Tarik Tunai");
        NorekTrans.setText(norekText.getText());
        JumlahTransaksi.setText("100000");
        MenuTarik.setVisible(false);
        DetaiLTransaksi.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Anda Tidak Mencukupi");
        }
    }//GEN-LAST:event_seratusActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        noHpPulsa.setVisible(true);
        menuPembayaran.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        menuPembayaran.setVisible(false);
        IDBooking.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        menuPembayaran.setVisible(false);
        IDBooking.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        menuPembayaran.setVisible(false);
        NoSpeedy.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        DetaiLTransaksi.setVisible(true);
        MenuNominalByar.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        JenisBayar.setText("Pembayaran Biaya Sekolah");
        NorekBayar.setText(norekText.getText());
        JumlahBayar.setText(InputBayar.getText());
        NorekTujuanBayar.setText(InputTujuanBayar.getText());
        DatailPembayaran.setVisible(true);
        KodeUniv.setVisible(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        JenisBayar.setText("Pembelian Pulsa");
        NorekBayar.setText(norekText.getText());
        JumlahBayar.setText(inputNomPuilsa.getText());
        NorekTujuanBayar.setText("");
        DatailPembayaran.setVisible(true);
        noHpPulsa.setVisible(false);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        JenisBayar.setText("Pembeayaran Booking");
        NorekBayar.setText(norekText.getText());
        JumlahBayar.setText(InputBayarBooking.getText());
        NorekTujuanBayar.setText(InputIdBooking.getText());
        DatailPembayaran.setVisible(true);
        IDBooking.setVisible(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        JenisBayar.setText("Pembayaran Speedy");
        NorekBayar.setText(norekText.getText());
        JumlahBayar.setText(jTextField14.getText());
        NorekTujuanBayar.setText(jTextField13.getText());
        DatailPembayaran.setVisible(true);
        NoSpeedy.setVisible(false);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        tr.TambahTrans(RandomId(), JenisTransaksi.getText(), NorekTrans.getText(), Tanggal.getText(), waktu.getText(), Integer.parseInt(JumlahTransaksi.getText()));
        tr.UpdateSaldo(norekText.getText(), Integer.parseInt(JumlahTransaksi.getText()));
        MenuUtama.setVisible(true);
        DetaiLTransaksi.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        DetaiLTransaksi.setVisible(false);
        MenuUtama.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        DetaiLTransaksi.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        System.out.println(norekText.getText());
        if(pin1.getText().equals(passText.getText())){
            GantiPIN1.setVisible(false);
            GantiPIN2.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "PIN lama anda salah");
            pin1.setText("");
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        if(!"".equals(pin2.getText())){
            try {
                db.query("update akun set Password='"+pin2.getText()+"' where Norek='"+norekText.getText()+"';");
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "PIN berhasil dirubah");
            MenuUtama.setVisible(true);
            GantiPIN2.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "PIN Tidak Boleh Kosong");
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        MenuUtama.setVisible(true);
        MenuSaldo.setVisible(false);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        tr.TambahTrans(RandomId(), JenisBayar.getText(), NorekBayar.getText(), Tanggal.getText(), waktu.getText(), Integer.parseInt(JumlahBayar.getText()));
        tr.UpdateSaldo(norekText.getText(), Integer.parseInt(JumlahBayar.getText()));
        MenuUtama.setVisible(true);
        DatailPembayaran.setVisible(false);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        tr.TambahTrans(RandomId(), JenisTransfer.getText(), NorekTransfer.getText(), TanggalTransfer.getText(), waktuTransfer.getText(), Integer.parseInt(JumlahTransfer.getText()));
        tr.UpdateSaldo(norekText.getText(), Integer.parseInt(JumlahTransfer.getText()));
        int transSaldo=0;
        try {
            rs=db.getData("select * from akun where Norek='"+NorekTjuanTransfer.getText()+"';");
            while(rs.next()){
                transSaldo=Integer.parseInt(rs.getString("Saldo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        transSaldo=transSaldo+Integer.parseInt(JumlahTransfer.getText());
        try {
            db.query("update akun set Saldo='"+transSaldo+"' where Norek='"+NorekTjuanTransfer.getText()+"';");
            JOptionPane.showMessageDialog(null, "Transfer Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
        }
        DetailTransfer.setVisible(false);
        MenuUtama.setVisible(true);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        DetailTransfer.setVisible(false);
        MenuUtama.setVisible(true);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        DetailTransfer.setVisible(false);
        Login.setVisible(true);
        norekText.setText("");
        passText.setText("");
    }//GEN-LAST:event_jButton46ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel DatailPembayaran;
    private javax.swing.JPanel DetaiLTransaksi;
    private javax.swing.JPanel DetailTransfer;
    private javax.swing.JPanel GantiPIN1;
    private javax.swing.JPanel GantiPIN2;
    private javax.swing.JButton GantiPin;
    private javax.swing.JPanel IDBooking;
    private javax.swing.JButton InfoSaldo;
    private javax.swing.JTextField InputBayar;
    private javax.swing.JTextField InputBayarBooking;
    private javax.swing.JTextField InputIdBooking;
    private javax.swing.JTextField InputTujuanBayar;
    private javax.swing.JTextField JenisBayar;
    private javax.swing.JTextField JenisTransaksi;
    private javax.swing.JTextField JenisTransfer;
    private javax.swing.JTextField JumTran;
    private javax.swing.JTextField JumlahBayar;
    private javax.swing.JTextField JumlahTransaksi;
    private javax.swing.JTextField JumlahTransfer;
    private javax.swing.JPanel KodeUniv;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel MenuNomLain;
    private javax.swing.JPanel MenuNominalByar;
    private javax.swing.JPanel MenuSaldo;
    private javax.swing.JPanel MenuTarik;
    private javax.swing.JPanel MenuUtama;
    private javax.swing.JPanel NoSpeedy;
    private javax.swing.JPanel NomorTransfer;
    private javax.swing.JTextField NorekBayar;
    private javax.swing.JTextField NorekTjuanTransfer;
    private javax.swing.JTextField NorekTrans;
    private javax.swing.JTextField NorekTransfer;
    private javax.swing.JTextField NorekTuj;
    private javax.swing.JTextField NorekTujuanBayar;
    private javax.swing.JButton Pembayaran;
    private javax.swing.JTextField Tanggal;
    private javax.swing.JTextField TanggalBayar;
    private javax.swing.JTextField TanggalTransfer;
    private javax.swing.JButton TarikTunai;
    private javax.swing.JTextField Text_saldo;
    private javax.swing.JTextField TokenBayar;
    private javax.swing.JButton Transfer;
    private javax.swing.JButton backtransfer2button;
    private javax.swing.JButton duaratus;
    private javax.swing.JTextField idBayar;
    private javax.swing.JTextField idTranfer;
    private javax.swing.JTextField idTransaksi;
    private javax.swing.JTextField inputNomPuilsa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton lanjut2button;
    private javax.swing.JButton limapuluh;
    private javax.swing.JPanel menuPembayaran;
    private javax.swing.JPanel noHpPulsa;
    private javax.swing.JButton nomlain;
    private javax.swing.JTextField norekText;
    private javax.swing.JPasswordField passText;
    private javax.swing.JPasswordField pin1;
    private javax.swing.JTextField pin2;
    private javax.swing.JButton sejuta;
    private javax.swing.JButton seratus;
    private javax.swing.JTextField waktu;
    private javax.swing.JTextField waktuBayar;
    private javax.swing.JTextField waktuTransfer;
    // End of variables declaration//GEN-END:variables
}
