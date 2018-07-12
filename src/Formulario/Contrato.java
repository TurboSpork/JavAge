package Formulario;

import javax.swing.JOptionPane;

/* @author Wilson */
public class Contrato extends javax.swing.JFrame {

    public Contrato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelnom = new javax.swing.JLabel();
        labeldir = new javax.swing.JLabel();
        labeltel = new javax.swing.JLabel();
        labelnac = new javax.swing.JLabel();
        labelced = new javax.swing.JLabel();
        labeloc = new javax.swing.JLabel();
        labelpas = new javax.swing.JLabel();
        labellic = new javax.swing.JLabel();
        labeltt = new javax.swing.JLabel();
        labelaut = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelnumtt = new javax.swing.JLabel();
        labelexp = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelnom2 = new javax.swing.JLabel();
        labeldir2 = new javax.swing.JLabel();
        labelced2 = new javax.swing.JLabel();
        labeltel2 = new javax.swing.JLabel();
        labelficha = new javax.swing.JLabel();
        labeltipo = new javax.swing.JLabel();
        labelplaca = new javax.swing.JLabel();
        labelfechasalida = new javax.swing.JLabel();
        labelded = new javax.swing.JLabel();
        labeldiasrenta = new javax.swing.JLabel();
        labelcolor = new javax.swing.JLabel();
        labelkmsalida = new javax.swing.JLabel();
        labelret = new javax.swing.JLabel();
        labelpre_dia = new javax.swing.JLabel();
        labeltotalpre = new javax.swing.JLabel();
        labelobser = new javax.swing.JLabel();
        labelmintiempo = new javax.swing.JLabel();
        nomtxt = new javax.swing.JTextField();
        directxt = new javax.swing.JTextField();
        nactxt = new javax.swing.JTextField();
        nomtxt2 = new javax.swing.JTextField();
        directxt2 = new javax.swing.JTextField();
        ocuptxt = new javax.swing.JTextField();
        fichatxt = new javax.swing.JTextField();
        tipovtxt = new javax.swing.JTextField();
        colvtxt = new javax.swing.JTextField();
        pastxt = new javax.swing.JTextField();
        numtxt = new javax.swing.JTextField();
        numplacatxt = new javax.swing.JTextField();
        kmsalidatxt = new javax.swing.JTextField();
        posrettxt = new javax.swing.JTextField();
        preciodiatxt = new javax.swing.JTextField();
        pretotaltxt = new javax.swing.JTextField();
        dedtxt = new javax.swing.JTextField();
        expetxt2 = new javax.swing.JTextField();
        lictxt = new javax.swing.JTextField();
        tarjetastxt = new javax.swing.JTextField();
        auttxt = new javax.swing.JTextField();
        datfield = new javax.swing.JFormattedTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        sigbutt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contrato");
        setBounds(new java.awt.Rectangle(0, 0, 792, 428));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("DATOS ARRENDAMIENTO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("DATOS VEHICULO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CONTRATO DE VEHICULO");

        labelnom.setText("NOMBRE:");

        labeldir.setText("DIRECCION:");

        labeltel.setText("TELEFONO:");

        labelnac.setText("NACIONALIDAD:");

        labelced.setText("CEDULA:");

        labeloc.setText("OCUPACION:");

        labelpas.setText("PASAPORTE:");

        labellic.setText("LICENCIA:");

        labeltt.setText("TIPO DE TARJETAS:");

        labelaut.setText("No. AUTORIZACION:");

        jLabel14.setText("EXPEDIDO EN:");

        jLabel15.setText("FECHA EXPIR.:");

        labelnumtt.setText("NUMERO:");

        labelexp.setText("EXPIRACION:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("DATOS GARANTE");

        labelnom2.setText("NOMBRE:");

        labeldir2.setText("DIRECCION:");

        labelced2.setText("CEDULA:");

        labeltel2.setText("TEL.:");

        labelficha.setText("FICHA:");

        labeltipo.setText("TIPO DE VEHICULO:");

        labelplaca.setText("No. PLACA:");

        labelfechasalida.setText("FECHA SALIDA:");

        labelded.setText("DEDUCIBLE:");

        labeldiasrenta.setText("DIAS RENTADO:");

        labelcolor.setText("COLOR DEL VEHICULO:");

        labelkmsalida.setText("KM. SALIDA:");

        labelret.setText("POSIBLE RETORNO:");

        labelpre_dia.setText("PRECIO P/DIA:");

        labeltotalpre.setText("TOTAL PRECIOS:");

        labelobser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelobser.setText("OBSERVACIONES: NO DAMOS CREDITO POR GASOLINA DEJADA EN VEHICULO");

        labelmintiempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelmintiempo.setText("TIEMPO MINIMO DE RENTA: TRES DIAS");

        nomtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomtxtActionPerformed(evt);
            }
        });

        directxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directxtActionPerformed(evt);
            }
        });

        ocuptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocuptxtActionPerformed(evt);
            }
        });

        try {
            datfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/20##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        datfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datfieldActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/20##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/20##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        sigbutt.setText("Siguiente");
        sigbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigbuttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labellic)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lictxt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labeltt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tarjetastxt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelpas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 11, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelaut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(auttxt)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelexp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(expetxt2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelnumtt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numtxt))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelnom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labeldir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(directxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labeltel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelnac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nactxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labeloc)
                                            .addComponent(labelced))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ocuptxt, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                            .addComponent(jFormattedTextField2))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labeldir2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(directxt2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelnom2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomtxt2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labeltipo)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(labelcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(colvtxt)
                                                .addGap(16, 16, 16))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tipovtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelfechasalida)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(datfield))
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelficha)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fichatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelplaca)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numplacatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(labelded)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(dedtxt))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(labeldiasrenta)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelkmsalida)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(kmsalidatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelret)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(posrettxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelpre_dia)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(preciodiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labeltotalpre)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pretotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelced2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labeltel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelmintiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sigbutt)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(labelobser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnom)
                    .addComponent(labelficha)
                    .addComponent(labelcolor)
                    .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fichatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colvtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldir)
                    .addComponent(labeltipo)
                    .addComponent(directxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipovtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltel)
                    .addComponent(labelplaca)
                    .addComponent(labelkmsalida)
                    .addComponent(numplacatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmsalidatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnac)
                    .addComponent(labelfechasalida)
                    .addComponent(labelret)
                    .addComponent(nactxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posrettxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelced)
                    .addComponent(labelded)
                    .addComponent(labelpre_dia)
                    .addComponent(preciodiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dedtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeloc)
                    .addComponent(labeldiasrenta)
                    .addComponent(labeltotalpre)
                    .addComponent(ocuptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pretotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelpas)
                        .addComponent(pastxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labellic)
                    .addComponent(jLabel15)
                    .addComponent(labelnom2)
                    .addComponent(nomtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lictxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltt)
                    .addComponent(labelnumtt)
                    .addComponent(labeldir2)
                    .addComponent(directxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarjetastxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelaut)
                    .addComponent(labelexp)
                    .addComponent(labelced2)
                    .addComponent(labeltel2)
                    .addComponent(expetxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(auttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(labelobser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelmintiempo)
                    .addComponent(sigbutt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ocuptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocuptxtActionPerformed
        if(ocuptxt.getText().equals("")){
        JOptionPane.showMessageDialog(null, "DIGITE LA DESCRIPCION DEL ARTICULO");
        ocuptxt.requestFocus();
    }//GEN-LAST:event_ocuptxtActionPerformed
    }
    
    private void nomtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomtxtActionPerformed
        if(nomtxt.getText().equals("")){
        JOptionPane.showMessageDialog(null, "DIGITE EL NOMBRE");
        nomtxt.requestFocus();
    }//GEN-LAST:event_nomtxtActionPerformed
    }
    
    private void directxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directxtActionPerformed
        if(directxt.getText().equals("")){
        JOptionPane.showMessageDialog(null, "DIGITE LA DIRECCION");
        directxt.requestFocus();
    }//GEN-LAST:event_directxtActionPerformed
    }
    
    private void datfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datfieldActionPerformed

    private void sigbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigbuttActionPerformed
        Contrato2 con2=new Contrato2();
        con2.setVisible(true);
        
    }//GEN-LAST:event_sigbuttActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auttxt;
    private javax.swing.JTextField colvtxt;
    private javax.swing.JFormattedTextField datfield;
    private javax.swing.JTextField dedtxt;
    private javax.swing.JTextField directxt;
    private javax.swing.JTextField directxt2;
    private javax.swing.JTextField expetxt2;
    private javax.swing.JTextField fichatxt;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kmsalidatxt;
    private javax.swing.JLabel labelaut;
    private javax.swing.JLabel labelced;
    private javax.swing.JLabel labelced2;
    private javax.swing.JLabel labelcolor;
    private javax.swing.JLabel labelded;
    private javax.swing.JLabel labeldiasrenta;
    private javax.swing.JLabel labeldir;
    private javax.swing.JLabel labeldir2;
    private javax.swing.JLabel labelexp;
    private javax.swing.JLabel labelfechasalida;
    private javax.swing.JLabel labelficha;
    private javax.swing.JLabel labelkmsalida;
    private javax.swing.JLabel labellic;
    private javax.swing.JLabel labelmintiempo;
    private javax.swing.JLabel labelnac;
    private javax.swing.JLabel labelnom;
    private javax.swing.JLabel labelnom2;
    private javax.swing.JLabel labelnumtt;
    private javax.swing.JLabel labelobser;
    private javax.swing.JLabel labeloc;
    private javax.swing.JLabel labelpas;
    private javax.swing.JLabel labelplaca;
    private javax.swing.JLabel labelpre_dia;
    private javax.swing.JLabel labelret;
    private javax.swing.JLabel labeltel;
    private javax.swing.JLabel labeltel2;
    private javax.swing.JLabel labeltipo;
    private javax.swing.JLabel labeltotalpre;
    private javax.swing.JLabel labeltt;
    private javax.swing.JTextField lictxt;
    private javax.swing.JTextField nactxt;
    private javax.swing.JTextField nomtxt;
    private javax.swing.JTextField nomtxt2;
    private javax.swing.JTextField numplacatxt;
    private javax.swing.JTextField numtxt;
    private javax.swing.JTextField ocuptxt;
    private javax.swing.JTextField pastxt;
    private javax.swing.JTextField posrettxt;
    private javax.swing.JTextField preciodiatxt;
    private javax.swing.JTextField pretotaltxt;
    private javax.swing.JButton sigbutt;
    private javax.swing.JTextField tarjetastxt;
    private javax.swing.JTextField tipovtxt;
    // End of variables declaration//GEN-END:variables

    private Object createFormatter(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
