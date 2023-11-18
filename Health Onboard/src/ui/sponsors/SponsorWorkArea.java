package ui.sponsors;


import businessFramework.Environment;
import businessFramework.enterprises.Enterprises;
import businessFramework.organizations.Organizations;
import businessFramework.userAccount.User;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jhalaksurve
 */
public class SponsorWorkArea extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Environment ecoSystem;
    private Enterprises enterprise;
    private User userAccount;
    private Organizations organization;
    /**
     * Creates new form DonorWorkAreaJPanel
     */
    public SponsorWorkArea(JPanel userProcessContainer, User userAccount, Enterprises enterprise, Organizations organization, Environment ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = organization;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
         Color c1 = new Color(210,240,114);
         Color c2 = new Color(210,240,114);
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageProfile = new javax.swing.JButton();
        donationHistory = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        viewDonationRequestsBtn = new javax.swing.JButton();
        donateMoneyBtn = new javax.swing.JButton();
        viewProfileBtn = new javax.swing.JButton();

        manageProfile.setBackground(new java.awt.Color(0, 153, 153));
        manageProfile.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        manageProfile.setForeground(new java.awt.Color(255, 255, 255));
        manageProfile.setText("Create Profile");
        manageProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProfileActionPerformed(evt);
            }
        });

        donationHistory.setBackground(new java.awt.Color(0, 153, 153));
        donationHistory.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        donationHistory.setForeground(new java.awt.Color(255, 255, 255));
        donationHistory.setText("View Donation History");
        donationHistory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donationHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationHistoryActionPerformed(evt);
            }
        });

        manageEnt.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        manageEnt.setText("Sponsor Work Area");

        viewDonationRequestsBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewDonationRequestsBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        viewDonationRequestsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewDonationRequestsBtn.setText("View Donation Requests");
        viewDonationRequestsBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewDonationRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonationRequestsBtnActionPerformed(evt);
            }
        });

        donateMoneyBtn.setBackground(new java.awt.Color(0, 153, 153));
        donateMoneyBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        donateMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
        donateMoneyBtn.setText("Donate Money");
        donateMoneyBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donateMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateMoneyBtnActionPerformed(evt);
            }
        });

        viewProfileBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewProfileBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        viewProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewProfileBtn.setText("View/Update Profile");
        viewProfileBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(donationHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewDonationRequestsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(donateMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(manageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(manageEnt)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDonationRequestsBtn)
                    .addComponent(manageProfile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donationHistory)
                    .addComponent(viewProfileBtn))
                .addGap(18, 18, 18)
                .addComponent(donateMoneyBtn)
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProfileActionPerformed
        CreateDonorProfileJPanel createDonorProfile = new CreateDonorProfileJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("CreateDonorProfile", createDonorProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProfileActionPerformed

    private void donationHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationHistoryActionPerformed
        if(userAccount.getRequestPipeline().getRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Donations Recorded as of now","warning",JOptionPane.WARNING_MESSAGE);
           return;     
        }
        ViewDonationHistory vdh = new ViewDonationHistory(userProcessContainer, userAccount);
        userProcessContainer.add("ViewDonationHistory", vdh);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_donationHistoryActionPerformed

    private void viewDonationRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonationRequestsBtnActionPerformed
        ViewDonationRequestJPanel viewDonationRequestJPanel = new ViewDonationRequestJPanel(userProcessContainer, userAccount, organization, ecoSystem);
        userProcessContainer.add("ViewDonationRequestJPanel", viewDonationRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDonationRequestsBtnActionPerformed

    private void donateMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateMoneyBtnActionPerformed
       DonationJPanelWorkArea donationJPanelWorkArea = new DonationJPanelWorkArea(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("DonationJPanelWorkArea", donationJPanelWorkArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_donateMoneyBtnActionPerformed

    private void viewProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileBtnActionPerformed
     
        ViewMyProfile viewMyProfile = new ViewMyProfile(userProcessContainer, userAccount);
        userProcessContainer.add("ViewMyProfile", viewMyProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donateMoneyBtn;
    private javax.swing.JButton donationHistory;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton manageProfile;
    private javax.swing.JButton viewDonationRequestsBtn;
    private javax.swing.JButton viewProfileBtn;
    // End of variables declaration//GEN-END:variables
}
