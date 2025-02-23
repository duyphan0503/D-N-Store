namespace PhanMem_QuanLy_CBCC.Forms
{
    partial class frmLogin
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmLogin));
            panel1 = new Panel();
            btnClose = new Button();
            btnLogin = new Button();
            chkShowPW = new CheckBox();
            txtMK = new TextBox();
            txtTenDN = new TextBox();
            label3 = new Label();
            label2 = new Label();
            label1 = new Label();
            panel2 = new Panel();
            lblTitle = new Label();
            pictureBox1 = new PictureBox();
            panel1.SuspendLayout();
            panel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            SuspendLayout();
            // 
            // panel1
            // 
            panel1.Controls.Add(btnClose);
            panel1.Controls.Add(btnLogin);
            panel1.Controls.Add(chkShowPW);
            panel1.Controls.Add(txtMK);
            panel1.Controls.Add(txtTenDN);
            panel1.Controls.Add(label3);
            panel1.Controls.Add(label2);
            panel1.Controls.Add(label1);
            panel1.Dock = DockStyle.Right;
            panel1.Location = new Point(570, 0);
            panel1.Name = "panel1";
            panel1.Size = new Size(456, 472);
            panel1.TabIndex = 0;
            // 
            // btnClose
            // 
            btnClose.Anchor = AnchorStyles.Top | AnchorStyles.Right;
            btnClose.BackgroundImage = (Image)resources.GetObject("btnClose.BackgroundImage");
            btnClose.BackgroundImageLayout = ImageLayout.Zoom;
            btnClose.Location = new Point(405, 3);
            btnClose.Name = "btnClose";
            btnClose.Size = new Size(48, 40);
            btnClose.TabIndex = 7;
            btnClose.UseVisualStyleBackColor = true;
            btnClose.Click += btnClose_Click;
            // 
            // btnLogin
            // 
            btnLogin.BackColor = Color.DeepSkyBlue;
            btnLogin.FlatAppearance.BorderSize = 0;
            btnLogin.Font = new Font("Tahoma", 13.8F, FontStyle.Bold, GraphicsUnit.Point, 0);
            btnLogin.ForeColor = Color.White;
            btnLogin.Image = (Image)resources.GetObject("btnLogin.Image");
            btnLogin.ImageAlign = ContentAlignment.MiddleRight;
            btnLogin.Location = new Point(107, 341);
            btnLogin.Name = "btnLogin";
            btnLogin.Size = new Size(244, 70);
            btnLogin.TabIndex = 6;
            btnLogin.Text = "ĐĂNG NHẬP";
            btnLogin.TextImageRelation = TextImageRelation.TextBeforeImage;
            btnLogin.UseVisualStyleBackColor = false;
            btnLogin.Click += btnLogin_Click;
            // 
            // chkShowPW
            // 
            chkShowPW.AutoSize = true;
            chkShowPW.Font = new Font("Tahoma", 13.8F, FontStyle.Regular, GraphicsUnit.Point, 0);
            chkShowPW.Location = new Point(260, 284);
            chkShowPW.Name = "chkShowPW";
            chkShowPW.Size = new Size(184, 32);
            chkShowPW.TabIndex = 5;
            chkShowPW.Text = "Hiện Mật Khẩu";
            chkShowPW.UseVisualStyleBackColor = true;
            chkShowPW.CheckedChanged += chkShowPW_CheckedChanged;
            // 
            // txtMK
            // 
            txtMK.BorderStyle = BorderStyle.FixedSingle;
            txtMK.Font = new Font("Tahoma", 13.8F);
            txtMK.Location = new Point(17, 236);
            txtMK.Multiline = true;
            txtMK.Name = "txtMK";
            txtMK.PasswordChar = '*';
            txtMK.Size = new Size(427, 42);
            txtMK.TabIndex = 4;
            // 
            // txtTenDN
            // 
            txtTenDN.BorderStyle = BorderStyle.FixedSingle;
            txtTenDN.Font = new Font("Tahoma", 13.8F);
            txtTenDN.Location = new Point(17, 150);
            txtTenDN.Multiline = true;
            txtTenDN.Name = "txtTenDN";
            txtTenDN.Size = new Size(427, 42);
            txtTenDN.TabIndex = 3;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("Tahoma", 13.8F);
            label3.Location = new Point(12, 202);
            label3.Name = "label3";
            label3.Size = new Size(109, 28);
            label3.TabIndex = 2;
            label3.Text = "Mật Khẩu";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Tahoma", 13.8F);
            label2.Location = new Point(12, 118);
            label2.Name = "label2";
            label2.Size = new Size(171, 28);
            label2.TabIndex = 1;
            label2.Text = "Tên Đăng Nhập";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Snap ITC", 19.8000011F, FontStyle.Bold | FontStyle.Italic, GraphicsUnit.Point, 0);
            label1.ForeColor = SystemColors.HotTrack;
            label1.Location = new Point(83, 34);
            label1.Name = "label1";
            label1.Size = new Size(296, 44);
            label1.TabIndex = 0;
            label1.Text = "LOGIN FORM";
            // 
            // panel2
            // 
            panel2.BackColor = SystemColors.MenuHighlight;
            panel2.Controls.Add(lblTitle);
            panel2.Controls.Add(pictureBox1);
            panel2.Dock = DockStyle.Fill;
            panel2.Location = new Point(0, 0);
            panel2.Name = "panel2";
            panel2.Size = new Size(570, 472);
            panel2.TabIndex = 1;
            // 
            // lblTitle
            // 
            lblTitle.AutoSize = true;
            lblTitle.Font = new Font("Tahoma", 16.2F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblTitle.ForeColor = Color.White;
            lblTitle.Location = new Point(7, 313);
            lblTitle.Name = "lblTitle";
            lblTitle.Size = new Size(552, 34);
            lblTitle.TabIndex = 1;
            lblTitle.Text = "Phần Mềm Quản Lý Cán Bộ Công Chức";
            // 
            // pictureBox1
            // 
            pictureBox1.Anchor = AnchorStyles.Top | AnchorStyles.Left | AnchorStyles.Right;
            pictureBox1.BackgroundImage = (Image)resources.GetObject("pictureBox1.BackgroundImage");
            pictureBox1.BackgroundImageLayout = ImageLayout.Zoom;
            pictureBox1.Location = new Point(155, 98);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(259, 189);
            pictureBox1.TabIndex = 0;
            pictureBox1.TabStop = false;
            // 
            // frmLogin
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1026, 472);
            Controls.Add(panel2);
            Controls.Add(panel1);
            FormBorderStyle = FormBorderStyle.None;
            Name = "frmLogin";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Đăng Nhập Hệ Thống";
            panel1.ResumeLayout(false);
            panel1.PerformLayout();
            panel2.ResumeLayout(false);
            panel2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ResumeLayout(false);
        }

        #endregion

        private Panel panel1;
        private Label label2;
        private Label label1;
        private Panel panel2;
        private Label lblTitle;
        private PictureBox pictureBox1;
        private Button btnLogin;
        private CheckBox chkShowPW;
        private TextBox txtMK;
        private TextBox txtTenDN;
        private Label label3;
        private Button btnClose;
    }
}