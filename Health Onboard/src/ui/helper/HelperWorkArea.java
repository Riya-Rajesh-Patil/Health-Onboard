package ui.helper;

import businessFramework.Environment;
import businessFramework.enterprises.Enterprises;
import businessFramework.organizations.Organizations;
import businessFramework.organizations.HelperOrganizations;
import businessFramework.person.Helper;
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
 * @author patil
 */
public class HelperWorkArea extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprises enterprises;
    private User user;  
    private HelperOrganizations organizations;
    private Environment environment;
    /**
     * Creates new form VolunteerWorkAreaJPanel
     */
    public HelperWorkArea(JPanel userProcessContainer, Enterprises enterprises , User user, Organizations organizations, Environment environment) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprises = enterprises;
        this.user = user;
        this.organizations = (HelperOrganizations)organizations;
        this.environment = environment;
        
      
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

        manageEnt = new javax.swing.JLabel();
        viewPersonalHelpRequestBtn = new javax.swing.JButton();
        manageVolunteerProfileBtn = new javax.swing.JButton();
        viewTestimonialsBtn = new javax.swing.JButton();
        manageEnt1 = new javax.swing.JLabel();
        viewAnonymousReqBtn = new javax.swing.JButton();
        viewVolProfileBtn = new javax.swing.JButton();

        manageEnt.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        manageEnt.setText("Helper Work Area");

        viewPersonalHelpRequestBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewPersonalHelpRequestBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        viewPersonalHelpRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewPersonalHelpRequestBtn.setText("View Personal Help Requests");
        viewPersonalHelpRequestBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewPersonalHelpRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonalHelpRequestBtnActionPerformed(evt);
            }
        });

        manageVolunteerProfileBtn.setBackground(new java.awt.Color(0, 153, 153));
        manageVolunteerProfileBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        manageVolunteerProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageVolunteerProfileBtn.setText("Update Profile ");
        manageVolunteerProfileBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageVolunteerProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVolunteerProfileBtnActionPerformed(evt);
            }
        });

        viewTestimonialsBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewTestimonialsBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        viewTestimonialsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewTestimonialsBtn.setText("View Testimonials");
        viewTestimonialsBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewTestimonialsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTestimonialsBtnActionPerformed(evt);
            }
        });

        manageEnt1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        manageEnt1.setText("Welcome to Health Onboard");

        viewAnonymousReqBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewAnonymousReqBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        viewAnonymousReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewAnonymousReqBtn.setText("View Anonymous Help Requests");
        viewAnonymousReqBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAnonymousReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAnonymousReqBtnActionPerformed(evt);
            }
        });

        viewVolProfileBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewVolProfileBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        viewVolProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewVolProfileBtn.setText("View Profile");
        viewVolProfileBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewVolProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVolProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewAnonymousReqBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                .addComponent(viewTestimonialsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewVolProfileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(manageVolunteerProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewPersonalHelpRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                        .addGap(511, 511, 511))))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(manageEnt1)
                .addGap(44, 44, 44)
                .addComponent(manageEnt)
                .addGap(58, 58, 58)
                .addComponent(manageVolunteerProfileBtn)
                .addGap(29, 29, 29)
                .addComponent(viewPersonalHelpRequestBtn)
                .addGap(18, 18, 18)
                .addComponent(viewAnonymousReqBtn)
                .addGap(18, 18, 18)
                .addComponent(viewTestimonialsBtn)
                .addGap(18, 18, 18)
                .addComponent(viewVolProfileBtn)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageVolunteerProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVolunteerProfileBtnActionPerformed
         UpdateHelperProfile updateVolunteerProfile = new UpdateHelperProfile(userProcessContainer, user, enterprises.getUserDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("UpdateVolunteerProfile", updateVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVolunteerProfileBtnActionPerformed

    private void viewPersonalHelpRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonalHelpRequestBtnActionPerformed
        if(user.getRequestPipeline().getRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Help Requests to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
        ViewPersonalHelpRequests viewHelpRequestsJPanel = new ViewPersonalHelpRequests(userProcessContainer, user, enterprises.getOrganizationsDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewHelpRequestsJPanel", viewHelpRequestsJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPersonalHelpRequestBtnActionPerformed

    private void viewAnonymousReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAnonymousReqBtnActionPerformed
        if(organizations.getRequestPipeline().getRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Help Requests to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        } 
         ViewAnonymousRequest viewAnonymousRequestJPanel = new ViewAnonymousRequest(userProcessContainer, user,  organizations, enterprises.getOrganizationsDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewAnonymousRequestJPanel", viewAnonymousRequestJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAnonymousReqBtnActionPerformed

    private void viewTestimonialsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTestimonialsBtnActionPerformed
        Helper helper = (Helper)user.getPerson();
        if(helper.getReviewList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Testimonials to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
         ViewTestimonialJPanel viewTestimonialJPanel = new ViewTestimonialJPanel(userProcessContainer, user);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewTestimonialJPanel", viewTestimonialJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewTestimonialsBtnActionPerformed

    private void viewVolProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVolProfileBtnActionPerformed
        ViewHelperProfile viewVolunteerProfile = new ViewHelperProfile(userProcessContainer, user);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVolProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JButton manageVolunteerProfileBtn;
    private javax.swing.JButton viewAnonymousReqBtn;
    private javax.swing.JButton viewPersonalHelpRequestBtn;
    private javax.swing.JButton viewTestimonialsBtn;
    private javax.swing.JButton viewVolProfileBtn;
    // End of variables declaration//GEN-END:variables
}
