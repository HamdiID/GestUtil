/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gsb;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class InterfaceGSB extends javax.swing.JFrame {

    private AccesBdD bd;
    private VisiteurDAO visDAO;
    private Connection connexion;

    /**
     * Creates new form InterfaceGSB
     *
     * @param connexion
     */
    public InterfaceGSB(Connection connexion) {
        initComponents();
        this.bd = new AccesBdD();
        this.connexion = connexion;
        System.out.println("💡 Connexion reçue dans InterfaceGSB : " + (connexion != null ? "OK" : "NULL"));

        visDAO = new VisiteurDAO(connexion);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        texteUtil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnUtil = new javax.swing.JButton();
        btnSortirUtil = new javax.swing.JButton();
        annuler_btn1 = new java.awt.Button();
        valider_btn = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_utilisateur = new javax.swing.JTable();
        txt_date = new com.toedter.calendar.JDateChooser();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_adresse = new javax.swing.JTextField();
        txt_cp = new javax.swing.JTextField();
        txt_ville = new javax.swing.JTextField();
        btnModifier = new javax.swing.JButton();
        affiche_btn = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 51));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("User Finder");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        texteUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texteUtilActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nom :");

        btnUtil.setText("Entrer");
        btnUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtilActionPerformed(evt);
            }
        });

        btnSortirUtil.setText("Sortir");
        btnSortirUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortirUtilActionPerformed(evt);
            }
        });

        annuler_btn1.setActionCommand("Valider");
        annuler_btn1.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        annuler_btn1.setLabel("Annuler");
        annuler_btn1.setName(""); // NOI18N
        annuler_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annuler_btn1ActionPerformed(evt);
            }
        });

        valider_btn.setActionCommand("Valider");
        valider_btn.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        valider_btn.setLabel("Valider");
        valider_btn.setName(""); // NOI18N
        valider_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valider_btnMouseClicked(evt);
            }
        });
        valider_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider_btnActionPerformed(evt);
            }
        });

        jLabel10.setText("DateEmbauche :");

        jLabel9.setText("Ville :");

        jLabel7.setText("CP :");

        jLabel8.setText("Adresse :");

        jLabel6.setText("Nom :");

        jLabel3.setText("Prenom :");

        jLabel2.setFont(new java.awt.Font("Alef", 1, 20)); // NOI18N
        jLabel2.setText("Ajouter un utilisateur");

        tab_utilisateur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom", "Prenom", "Login", "Mdp", "Adresse", "CP", "Ville ", "DateEmbauche"
            }
        ));
        jScrollPane2.setViewportView(tab_utilisateur);

        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        affiche_btn.setText("Tout afficher");
        affiche_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                affiche_btnMouseClicked(evt);
            }
        });
        affiche_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affiche_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(valider_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texteUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSortirUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(affiche_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(200, 200, 200)
                                        .addComponent(annuler_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valider_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(annuler_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texteUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(affiche_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btnSortirUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortirUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortirUtilActionPerformed
      System.exit(0); // Pour quitter l'application
    }//GEN-LAST:event_btnSortirUtilActionPerformed

    private void annuler_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annuler_btn1ActionPerformed
        txt_nom.setText("");
        txt_prenom.setText("");
        txt_adresse.setText("");
        txt_cp.setText("");
        txt_ville.setText("");
        txt_date.setDate(null);
        txt_nom.requestFocus();
    }//GEN-LAST:event_annuler_btn1ActionPerformed

    private void valider_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_valider_btnMouseClicked

    private void valider_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider_btnActionPerformed
// Conversion de la date
        Date selectedDate = txt_date.getDate();
        LocalDate localDate = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

// Création de l'objet Visiteur
        Visiteur nouveauVisiteur = new Visiteur(
                "",
                txt_nom.getText(),
                txt_prenom.getText(),
                "",
                "",
                txt_adresse.getText(),
                txt_cp.getText(),
                txt_ville.getText(),
                localDate
        );

// Génération du login et mot de passe
        String login = GSB.genererLoginUnique(nouveauVisiteur, visDAO);
        String mdp = GSB.genererMdpUnique();
        String id = GSB.genererIdUnique(visDAO);

// Ajout dans le tableau
        DefaultTableModel table = (DefaultTableModel) tab_utilisateur.getModel();
        table.addRow(new Object[]{id, txt_nom.getText(), txt_prenom.getText(), login, mdp, txt_adresse.getText(), txt_cp.getText(), txt_ville.getText(), localDate});

// Requête SQL
        String sql = "INSERT INTO visiteur (id, nom, prenom, login, mdp, adresse, cp, ville, dateEmbauche) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = (PreparedStatement) connexion.prepareStatement(sql)) {
            // Affectation des valeurs
            statement.setString(1, id);
            statement.setString(2, txt_nom.getText());
            statement.setString(3, txt_prenom.getText());
            statement.setString(4, login);
            statement.setString(5, mdp);
            statement.setString(6, txt_adresse.getText());
            statement.setString(7, txt_cp.getText());
            statement.setString(8, txt_ville.getText());
            statement.setDate(9, java.sql.Date.valueOf(localDate));

            // Exécution de la requête
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Gestion des erreurs SQL
        }

    }//GEN-LAST:event_valider_btnActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        DefaultTableModel table = (DefaultTableModel) tab_utilisateur.getModel();

        int selectRowIndex = tab_utilisateur.getSelectedRow();

        String id = table.getValueAt(selectRowIndex, 0).toString();
        String nom = table.getValueAt(selectRowIndex, 1).toString();
        String prenom = table.getValueAt(selectRowIndex, 2).toString();
        String login = table.getValueAt(selectRowIndex, 3).toString();
        String mdp = table.getValueAt(selectRowIndex, 4).toString();
        String adresse = table.getValueAt(selectRowIndex, 5).toString();
        String cp = table.getValueAt(selectRowIndex, 6).toString();
        String ville = table.getValueAt(selectRowIndex, 7).toString();
        String dateEmbauche = table.getValueAt(selectRowIndex, 8).toString();

        String NewNom = JOptionPane.showInputDialog(null, "Entrez le nouveau nom", nom);
        String NewPrenom = JOptionPane.showInputDialog(null, "Entrez le nouveau Prenom", prenom);
        String NewAdresse = JOptionPane.showInputDialog(null, "Entrez la nouvelle Adresse", adresse);
        String NewCP = JOptionPane.showInputDialog(null, "Entrez le nouveau code Postal", cp);
        String NewVille = JOptionPane.showInputDialog(null, "Entrez la nouvelle ville", ville);
        String NewDate = JOptionPane.showInputDialog(null, "Entrez la nouvelle date", dateEmbauche);

        table.setValueAt(NewNom, selectRowIndex, 1);
        table.setValueAt(NewPrenom, selectRowIndex, 2);
        table.setValueAt(NewAdresse, selectRowIndex, 5);
        table.setValueAt(NewCP, selectRowIndex, 6);
        table.setValueAt(NewVille, selectRowIndex, 7);
        table.setValueAt(NewDate, selectRowIndex, 8);

        String sql = "UPDATE visiteur SET nom = ?, prenom = ?, adresse = ?, cp = ?, ville = ?, dateEmbauche = ? WHERE id = ?";

        try (PreparedStatement statement = (PreparedStatement) connexion.prepareStatement(sql)) {
            // Affectation des nouvelles valeurs
            statement.setString(1, NewNom);
            statement.setString(2, NewPrenom);
            statement.setString(3, NewAdresse);
            statement.setString(4, NewCP);
            statement.setString(5, NewVille);
            statement.setString(6, NewDate);
            statement.setString(7, id); // Utiliser l'ID pour cibler l'enregistrement à mettre à jour

            // Exécution de la requête
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Gestion des erreurs SQL
        }

    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtilActionPerformed

        String nomRecherche = texteUtil.getText().trim();

        // Si le texte est un nombre (id), essayer de rechercher par ID
        try {
            int idRecherche = Integer.parseInt(nomRecherche);  // Essayer de convertir en entier

            // Recherche par ID
            VisiteurDAO visiteurDAO = new VisiteurDAO(bd.getConnexion());
            ArrayList<Visiteur> lesVisiteurs = visiteurDAO.getVisiteursParId(idRecherche);

            // Mettre à jour la table avec les résultats trouvés par ID
            DefaultTableModel model = (DefaultTableModel) tab_utilisateur.getModel();
            model.setRowCount(0);  // Vider la table existante

            // Ajouter les résultats dans la table
            for (Visiteur visiteur : lesVisiteurs) {
                model.addRow(new Object[]{
                    visiteur.getId(),
                    visiteur.getNom(),
                    visiteur.getPrenom(),
                    visiteur.getLogin(),
                    visiteur.getMdp(),
                    visiteur.getAdresse(),
                    visiteur.getCp(),
                    visiteur.getVille(),
                    visiteur.getDateEmbauche()
                });
            }
        } catch (NumberFormatException e) {
            // Si ce n'est pas un nombre, faire une recherche par nom
            VisiteurDAO visiteurDAO = new VisiteurDAO(bd.getConnexion());
            ArrayList<Visiteur> lesVisiteurs = visiteurDAO.getLesRecherches(nomRecherche);

            // Mettre à jour la table avec les résultats trouvés par nom
            DefaultTableModel model = (DefaultTableModel) tab_utilisateur.getModel();
            model.setRowCount(0);  // Vider la table existante

            // Ajouter les résultats dans la table
            for (Visiteur visiteur : lesVisiteurs) {
                model.addRow(new Object[]{
                    visiteur.getId(),
                    visiteur.getNom(),
                    visiteur.getPrenom(),
                    visiteur.getLogin(),
                    visiteur.getMdp(),
                    visiteur.getAdresse(),
                    visiteur.getCp(),
                    visiteur.getVille(),
                    visiteur.getDateEmbauche()
                });
            }
        }
    }//GEN-LAST:event_btnUtilActionPerformed

    private void texteUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texteUtilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texteUtilActionPerformed

    private void affiche_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affiche_btnMouseClicked
       
        
       DefaultTableModel model = (DefaultTableModel) tab_utilisateur.getModel();
       model.setRowCount(0);  // Vider la table existante
            
        ArrayList<Visiteur> lesVisiteurs = visDAO.getLesVisiteurs();

            // Ajouter les résultats dans la table
            for (Visiteur visiteur : lesVisiteurs) {
                model.addRow(new Object[]{
                    visiteur.getId(),
                    visiteur.getNom(),
                    visiteur.getPrenom(),
                    visiteur.getLogin(),
                    visiteur.getMdp(),
                    visiteur.getAdresse(),
                    visiteur.getCp(),
                    visiteur.getVille(),
                    visiteur.getDateEmbauche()
                });
            }
    }//GEN-LAST:event_affiche_btnMouseClicked

    private void affiche_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affiche_btnActionPerformed
  
    }//GEN-LAST:event_affiche_btnActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGSB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGSB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGSB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGSB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccesBdD accesBdD = new AccesBdD();
                new InterfaceGSB((Connection) accesBdD.getConnexion()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton affiche_btn;
    private java.awt.Button annuler_btn1;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSortirUtil;
    private javax.swing.JButton btnUtil;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JTable tab_utilisateur;
    private javax.swing.JTextField texteUtil;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_cp;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_ville;
    private java.awt.Button valider_btn;
    // End of variables declaration//GEN-END:variables
}
