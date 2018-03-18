
import java.awt.Color;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nhaht
 */
public class UI extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fgsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pwfPassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taStatus = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfGroupId = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfCount = new javax.swing.JTextField();
        lblAlert = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facebook Group Spider");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        setResizable(false);

        fgsPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Facebook Group Spider");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Username");

        tfUsername.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tfUsername.setText("thenevergay");
        tfUsername.setToolTipText("Username");
        tfUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfUsername.setMargin(new java.awt.Insets(5, 10, 5, 10));
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel3.setText("Password");

        pwfPassword.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        pwfPassword.setText("Tamvayda1");
        pwfPassword.setToolTipText("Password");
        pwfPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pwfPassword.setMargin(new java.awt.Insets(5, 10, 5, 10));

        taStatus.setColumns(20);
        taStatus.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        taStatus.setLineWrap(true);
        taStatus.setRows(5);
        taStatus.setTabSize(4);
        taStatus.setToolTipText("Status");
        taStatus.setWrapStyleWord(true);
        taStatus.setBorder(null);
        taStatus.setFocusable(false);
        taStatus.setMargin(new java.awt.Insets(10, 10, 10, 10));
        taStatus.setName(""); // NOI18N
        taStatus.setRequestFocusEnabled(false);
        taStatus.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(taStatus);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel4.setText("Status:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel5.setText("Group ID");

        tfGroupId.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tfGroupId.setText("628810487239665");
        tfGroupId.setToolTipText("Group ID");
        tfGroupId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfGroupId.setMargin(new java.awt.Insets(5, 10, 5, 10));
        tfGroupId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGroupIdActionPerformed(evt);
            }
        });

        btnStart.setBackground(new java.awt.Color(255, 255, 255));
        btnStart.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnStart.setText("Start");
        btnStart.setToolTipText("Start Fetching");
        btnStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel6.setText("Count");

        tfCount.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tfCount.setText("100");
        tfCount.setToolTipText("Count");
        tfCount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfCount.setMargin(new java.awt.Insets(5, 10, 5, 10));

        lblAlert.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblAlert.setForeground(new java.awt.Color(255, 51, 0));
        lblAlert.setText("Alert: Error");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Author: NhaHT");

        btnStop.setBackground(new java.awt.Color(255, 255, 255));
        btnStop.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnStop.setText("Stop");
        btnStop.setToolTipText("Stop Fetching");
        btnStop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fgsPanelLayout = new javax.swing.GroupLayout(fgsPanel);
        fgsPanel.setLayout(fgsPanelLayout);
        fgsPanelLayout.setHorizontalGroup(
            fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgsPanelLayout.createSequentialGroup()
                .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fgsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tfGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fgsPanelLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel3))
                    .addGroup(fgsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(fgsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(fgsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fgsPanelLayout.createSequentialGroup()
                                    .addComponent(lblAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        fgsPanelLayout.setVerticalGroup(
            fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfGroupId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwfPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fgsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlert)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fgsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fgsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void tfGroupIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGroupIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGroupIdActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        if (t != null && t.isAlive()) {
            return;
        }
        if (checkValid()) {
            ui.infoAlert("Starting...");
            t = new Thread(ui);
            t.start();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        if (t != null && (t.getState() + "").equals("TERMINATED")) {
            ui.stopDriver();
            ui.alert("Stopped!");
            ui.writeLog("Stopped!");
            t.stop();
            return;
        }
        if (t != null && t.isAlive()) {
            ui.stopDriver();
            ui.alert("Stopped!");
            ui.writeLog("Stopped!");
            t.stop();
        }
    }//GEN-LAST:event_btnStopActionPerformed

    public void stopDriver() {
        try {
            UI.driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean checkValid() {
        if (tfUsername.getText().equals("")) {
            warningAlert("Warning: Empty username!");
            return false;
        }
        if (pwfPassword.getText().equals("")) {
            warningAlert("Warning: Empty password!");
            return false;
        }
        if (tfGroupId.getText().equals("")) {
            warningAlert("Warning: Empty group id!");
            return false;
        }
        if (tfCount.getText().equals("")) {
            warningAlert("Warning: Empty count!");
            return false;
        }
        return true;
    }

    public void infoAlert(String message) {
        lblAlert.setText(message);
        lblAlert.setForeground(Color.blue);
    }

    public void warningAlert(String message) {
        lblAlert.setText(message);
        lblAlert.setForeground(Color.red);
    }

    public void alert(String message) {
        lblAlert.setText(message);
        lblAlert.setForeground(Color.black);
    }

    public void writeLog(String message) {
        taStatus.append(message + "\n");
    }

    private Thread t;
    private static UI ui;

    public static void main(String args[]) {
        ui = new UI();
        ui.setVisible(true);
        ui.alert("Ready!");
        ui.writeLog(LocalDateTime.now() + "");
    }

    private static WebDriver driver = null;
    private static final String FB_URL = "https://m.facebook.com";

    public void restart() {
        ui.writeLog("Restarting...");
        ui.infoAlert("Restarting...");

        ui.stopDriver();

        ui.infoAlert("Starting...");
        ui.writeLog("Starting...");

        t = new Thread(ui);
        t.start();
    }

    @Override
    public void run() {
        try {
            ui.infoAlert("Starting Chrome Webdriver...");
            ui.writeLog("Starting Chrome Webdriver...");

            int count = Integer.parseInt(tfCount.getText().trim());
            String groupId = tfGroupId.getText().trim();

            System.setProperty("webdriver.chrome.driver", "D:\\facebook-group-spider\\chromedriver.exe");
            UI.driver = new ChromeDriver();

            ui.infoAlert("Processing...");

            UI.driver.get(FB_URL);

            Thread.sleep(2000);

            UI.driver.findElement(By.name("email")).sendKeys(tfUsername.getText().trim());
            UI.driver.findElement(By.name("pass")).sendKeys(pwfPassword.getText().trim());
            UI.driver.findElement(By.name("login")).click();

            Thread.sleep(2000);

            for (int k = 1; k < count; k++) {
                ui.writeLog("Run " + k + "/" + count);
                UI.driver.get(FB_URL + "/" + groupId);

                Thread.sleep(2000);

                List<WebElement> elements = driver.findElements(By.xpath("//section//article"));
                String result = "";

                for (WebElement element : elements) {
                    try {
                        String user_fullname = element.findElement(By.xpath(".//header//div//div//a//i")).getAttribute("aria-label");
                        String user_picture = element.findElement(By.xpath(".//header//div//div//a//i")).getCssValue("background");
                        String user_url = element.findElement(By.xpath(".//header//div//div//a")).getAttribute("href");

                        List<WebElement> rmlist = element.findElement(By.xpath(".//div//div[@class=\"_5rgt _5nk5 _5msi\"]//span"))
                                .findElements(By.xpath(".//span[@class=\"text_exposed_hide\"]"));

                        String message = element.findElement(By.xpath(".//div//div[@class=\"_5rgt _5nk5 _5msi\"]//span"))
                                .getAttribute("innerHTML");

                        if (rmlist != null) {
                            for (WebElement element1 : rmlist) {
                                String tmp = element1.getAttribute("outerHTML");
                                message = message.replace(tmp, "");
                            }
                        }

                        JSONObject jsonObj = new JSONObject(element.getAttribute("data-store"));
                        String post_id = jsonObj.get("feedback_target").toString();
                        String user_id = "";

                        if (user_url.contains("&fref=")) {
                            user_url = user_url.split("&fref=")[0];
                            user_id = user_url.split("id=")[1];
                        } else {
                            user_url = user_url.split("fref=")[0].substring(0, user_url.split("fref=")[0].length() - 1);
                        }

                        user_picture = ui.getUserPicture(user_picture);

//                        System.out.println(user_fullname);
//                        System.out.println(user_picture);
//                        System.out.println(user_url);
//                        System.out.println(user_id);
//                        System.out.println(message);
//                        System.out.println(post_id);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.append("user_fullname", user_fullname);
                        jSONObject.append("user_picture", user_picture);
                        jSONObject.append("user_url", user_url);
                        jSONObject.append("user_id", user_id);
                        jSONObject.append("message", message);
                        jSONObject.append("postId", post_id);

                        result += JSONObject.valueToString(jSONObject) + "@@123shipperhn@@";

                        ui.writeLog("[SUCCESS] " + LocalDateTime.now());
                    } catch (Exception ex) {
                        ui.writeLog("[ERROR] " + LocalDateTime.now() + "");
                        ui.writeLog("\tMessage: " + ex.getMessage());
                        continue;
                    }
                }

                boolean rs = ui.callInsert(result);

                Thread.sleep(60000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ui.writeLog(e.getMessage());
            ui.restart();
        }
    }

    public boolean callInsert(String input) {

        System.out.println(input);

        HttpClient client = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost("http://localhost:50706/Post/AddPosts");

        List<NameValuePair> arguments = new ArrayList<>(1);
        arguments.add(new BasicNameValuePair("data", input));

        try {
            request.setEntity(new UrlEncodedFormEntity(arguments, "UTF-8"));
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return true;
    }

    public String getUserPicture(String css) {
        String pattern = "\\(\\\"[\\w:\\/\\/.-0-9?=&]+\\\"\\)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(css);

        if (m.find()) {
            if (m.group(0) != null) {
                return m.group(0).substring(2, m.group(0).length() - 2);
            } else {
                return "";
            }
        } else {
            return "";
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JPanel fgsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JPasswordField pwfPassword;
    private javax.swing.JTextArea taStatus;
    private javax.swing.JTextField tfCount;
    private javax.swing.JTextField tfGroupId;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

}
