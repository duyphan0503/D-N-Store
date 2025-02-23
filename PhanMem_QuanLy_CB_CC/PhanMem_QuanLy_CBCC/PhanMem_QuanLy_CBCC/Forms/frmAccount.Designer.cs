namespace PhanMem_QuanLy_CBCC.Forms
{
    partial class frmAccount
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmAccount));
            panelInfor = new Panel();
            btnSearch = new Button();
            textBox3 = new TextBox();
            label12 = new Label();
            textBox1 = new TextBox();
            comboBox2 = new ComboBox();
            label3 = new Label();
            textBox2 = new TextBox();
            comboBox3 = new ComboBox();
            dateTimePicker1 = new DateTimePicker();
            label1 = new Label();
            label2 = new Label();
            label13 = new Label();
            btnEdit = new Button();
            btnDelete = new Button();
            btnExport = new Button();
            btnAdd = new Button();
            btnSave = new Button();
            btnCancel = new Button();
            btnImport = new Button();
            button4 = new Button();
            panelAction = new Panel();
            panelContentAcc = new Panel();
            panelTable = new Panel();
            dgvNhanVien = new DataGridView();
            button1 = new Button();
            button8 = new Button();
            button2 = new Button();
            button3 = new Button();
            button5 = new Button();
            button6 = new Button();
            button7 = new Button();
            button9 = new Button();
            panelInfor.SuspendLayout();
            panelAction.SuspendLayout();
            panelContentAcc.SuspendLayout();
            panelTable.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)dgvNhanVien).BeginInit();
            SuspendLayout();
            // 
            // panelInfor
            // 
            panelInfor.Controls.Add(btnSearch);
            panelInfor.Controls.Add(textBox3);
            panelInfor.Controls.Add(label12);
            panelInfor.Controls.Add(textBox1);
            panelInfor.Controls.Add(comboBox2);
            panelInfor.Controls.Add(label3);
            panelInfor.Controls.Add(textBox2);
            panelInfor.Controls.Add(comboBox3);
            panelInfor.Controls.Add(dateTimePicker1);
            panelInfor.Controls.Add(label1);
            panelInfor.Controls.Add(label2);
            panelInfor.Controls.Add(label13);
            panelInfor.Dock = DockStyle.Top;
            panelInfor.Location = new Point(0, 0);
            panelInfor.Margin = new Padding(6, 4, 6, 4);
            panelInfor.Name = "panelInfor";
            panelInfor.Size = new Size(1764, 122);
            panelInfor.TabIndex = 3;
            // 
            // btnSearch
            // 
            btnSearch.BackgroundImage = (Image)resources.GetObject("btnSearch.BackgroundImage");
            btnSearch.BackgroundImageLayout = ImageLayout.Zoom;
            btnSearch.Location = new Point(1524, 56);
            btnSearch.Name = "btnSearch";
            btnSearch.Size = new Size(107, 49);
            btnSearch.TabIndex = 83;
            btnSearch.UseVisualStyleBackColor = true;
            // 
            // textBox3
            // 
            textBox3.BorderStyle = BorderStyle.FixedSingle;
            textBox3.Location = new Point(1158, 73);
            textBox3.Multiline = true;
            textBox3.Name = "textBox3";
            textBox3.Size = new Size(360, 32);
            textBox3.TabIndex = 82;
            // 
            // label12
            // 
            label12.AutoSize = true;
            label12.Location = new Point(46, 32);
            label12.Margin = new Padding(4, 0, 4, 0);
            label12.Name = "label12";
            label12.Size = new Size(114, 24);
            label12.TabIndex = 79;
            label12.Text = "Account ID:";
            // 
            // textBox1
            // 
            textBox1.BorderStyle = BorderStyle.FixedSingle;
            textBox1.Location = new Point(201, 23);
            textBox1.Multiline = true;
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(360, 32);
            textBox1.TabIndex = 43;
            // 
            // comboBox2
            // 
            comboBox2.FormattingEnabled = true;
            comboBox2.Location = new Point(201, 73);
            comboBox2.Name = "comboBox2";
            comboBox2.Size = new Size(360, 32);
            comboBox2.TabIndex = 65;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(1158, 24);
            label3.Margin = new Padding(4, 0, 4, 0);
            label3.Name = "label3";
            label3.Size = new Size(106, 24);
            label3.TabIndex = 46;
            label3.Text = "CreatedAt:";
            // 
            // textBox2
            // 
            textBox2.BorderStyle = BorderStyle.FixedSingle;
            textBox2.Location = new Point(716, 74);
            textBox2.Multiline = true;
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(360, 32);
            textBox2.TabIndex = 45;
            // 
            // comboBox3
            // 
            comboBox3.FormattingEnabled = true;
            comboBox3.Location = new Point(716, 21);
            comboBox3.Name = "comboBox3";
            comboBox3.Size = new Size(360, 32);
            comboBox3.TabIndex = 67;
            // 
            // dateTimePicker1
            // 
            dateTimePicker1.Location = new Point(1271, 16);
            dateTimePicker1.Name = "dateTimePicker1";
            dateTimePicker1.Size = new Size(360, 32);
            dateTimePicker1.TabIndex = 47;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(46, 79);
            label1.Margin = new Padding(4, 0, 4, 0);
            label1.Name = "label1";
            label1.Size = new Size(131, 24);
            label1.TabIndex = 42;
            label1.Text = "Employee ID:";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(602, 77);
            label2.Margin = new Padding(4, 0, 4, 0);
            label2.Name = "label2";
            label2.Size = new Size(109, 24);
            label2.TabIndex = 44;
            label2.Text = "UserName:";
            // 
            // label13
            // 
            label13.AutoSize = true;
            label13.Location = new Point(602, 25);
            label13.Margin = new Padding(4, 0, 4, 0);
            label13.Name = "label13";
            label13.Size = new Size(56, 24);
            label13.TabIndex = 66;
            label13.Text = "Role:";
            // 
            // btnEdit
            // 
            btnEdit.Anchor = AnchorStyles.Right;
            btnEdit.BackColor = Color.DarkKhaki;
            btnEdit.FlatAppearance.BorderSize = 0;
            btnEdit.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            btnEdit.ForeColor = Color.White;
            btnEdit.Image = (Image)resources.GetObject("btnEdit.Image");
            btnEdit.ImageAlign = ContentAlignment.MiddleRight;
            btnEdit.Location = new Point(2680, 0);
            btnEdit.Margin = new Padding(6, 4, 6, 4);
            btnEdit.Name = "btnEdit";
            btnEdit.Size = new Size(233, 73);
            btnEdit.TabIndex = 0;
            btnEdit.Text = "SỬA";
            btnEdit.TextImageRelation = TextImageRelation.ImageBeforeText;
            btnEdit.UseVisualStyleBackColor = false;
            // 
            // btnDelete
            // 
            btnDelete.Anchor = AnchorStyles.Right;
            btnDelete.BackColor = Color.LightSkyBlue;
            btnDelete.FlatAppearance.BorderSize = 0;
            btnDelete.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            btnDelete.ForeColor = Color.White;
            btnDelete.Image = (Image)resources.GetObject("btnDelete.Image");
            btnDelete.ImageAlign = ContentAlignment.MiddleRight;
            btnDelete.Location = new Point(2966, 0);
            btnDelete.Margin = new Padding(6, 4, 6, 4);
            btnDelete.Name = "btnDelete";
            btnDelete.Size = new Size(233, 73);
            btnDelete.TabIndex = 1;
            btnDelete.Text = "XÓA";
            btnDelete.TextImageRelation = TextImageRelation.ImageBeforeText;
            btnDelete.UseVisualStyleBackColor = false;
            // 
            // btnExport
            // 
            btnExport.Anchor = AnchorStyles.Right;
            btnExport.BackColor = Color.DarkSlateGray;
            btnExport.FlatAppearance.BorderSize = 0;
            btnExport.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            btnExport.ForeColor = Color.White;
            btnExport.Image = (Image)resources.GetObject("btnExport.Image");
            btnExport.ImageAlign = ContentAlignment.MiddleRight;
            btnExport.Location = new Point(3542, 0);
            btnExport.Margin = new Padding(6, 4, 6, 4);
            btnExport.Name = "btnExport";
            btnExport.Size = new Size(233, 73);
            btnExport.TabIndex = 2;
            btnExport.Text = "XUẤT";
            btnExport.TextImageRelation = TextImageRelation.ImageBeforeText;
            btnExport.UseVisualStyleBackColor = false;
            // 
            // btnAdd
            // 
            btnAdd.Anchor = AnchorStyles.Right;
            btnAdd.BackColor = Color.MediumAquamarine;
            btnAdd.FlatAppearance.BorderSize = 0;
            btnAdd.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            btnAdd.ForeColor = Color.White;
            btnAdd.Image = (Image)resources.GetObject("btnAdd.Image");
            btnAdd.ImageAlign = ContentAlignment.MiddleRight;
            btnAdd.Location = new Point(1810, 0);
            btnAdd.Margin = new Padding(6, 4, 6, 4);
            btnAdd.Name = "btnAdd";
            btnAdd.Size = new Size(233, 73);
            btnAdd.TabIndex = 3;
            btnAdd.Text = "THÊM";
            btnAdd.TextImageRelation = TextImageRelation.ImageBeforeText;
            btnAdd.UseVisualStyleBackColor = false;
            // 
            // btnSave
            // 
            btnSave.Anchor = AnchorStyles.Right;
            btnSave.BackColor = SystemColors.ActiveCaption;
            btnSave.FlatAppearance.BorderSize = 0;
            btnSave.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            btnSave.ForeColor = Color.White;
            btnSave.Image = (Image)resources.GetObject("btnSave.Image");
            btnSave.ImageAlign = ContentAlignment.MiddleRight;
            btnSave.Location = new Point(2105, 0);
            btnSave.Margin = new Padding(6, 4, 6, 4);
            btnSave.Name = "btnSave";
            btnSave.Size = new Size(233, 73);
            btnSave.TabIndex = 4;
            btnSave.Text = "LƯU";
            btnSave.TextImageRelation = TextImageRelation.ImageBeforeText;
            btnSave.UseVisualStyleBackColor = false;
            // 
            // btnCancel
            // 
            btnCancel.Anchor = AnchorStyles.Right;
            btnCancel.BackColor = Color.LightCoral;
            btnCancel.FlatAppearance.BorderSize = 0;
            btnCancel.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            btnCancel.ForeColor = Color.White;
            btnCancel.Image = (Image)resources.GetObject("btnCancel.Image");
            btnCancel.ImageAlign = ContentAlignment.MiddleRight;
            btnCancel.Location = new Point(2392, 0);
            btnCancel.Margin = new Padding(6, 4, 6, 4);
            btnCancel.Name = "btnCancel";
            btnCancel.Size = new Size(233, 73);
            btnCancel.TabIndex = 5;
            btnCancel.Text = "HỦY";
            btnCancel.TextImageRelation = TextImageRelation.ImageBeforeText;
            btnCancel.UseVisualStyleBackColor = false;
            // 
            // btnImport
            // 
            btnImport.Anchor = AnchorStyles.Right;
            btnImport.BackColor = Color.LightSlateGray;
            btnImport.FlatAppearance.BorderSize = 0;
            btnImport.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            btnImport.ForeColor = Color.White;
            btnImport.Image = (Image)resources.GetObject("btnImport.Image");
            btnImport.ImageAlign = ContentAlignment.MiddleRight;
            btnImport.Location = new Point(3254, 0);
            btnImport.Margin = new Padding(6, 4, 6, 4);
            btnImport.Name = "btnImport";
            btnImport.Size = new Size(233, 73);
            btnImport.TabIndex = 6;
            btnImport.Text = "NHẬP";
            btnImport.TextImageRelation = TextImageRelation.ImageBeforeText;
            btnImport.UseVisualStyleBackColor = false;
            // 
            // button4
            // 
            button4.Anchor = AnchorStyles.Right;
            button4.BackColor = Color.MediumAquamarine;
            button4.FlatAppearance.BorderSize = 0;
            button4.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button4.ForeColor = Color.White;
            button4.Image = (Image)resources.GetObject("button4.Image");
            button4.ImageAlign = ContentAlignment.MiddleRight;
            button4.Location = new Point(-288, 12);
            button4.Margin = new Padding(6, 4, 6, 4);
            button4.Name = "button4";
            button4.Size = new Size(233, 73);
            button4.TabIndex = 9;
            button4.Text = "THÊM";
            button4.TextImageRelation = TextImageRelation.ImageBeforeText;
            button4.UseVisualStyleBackColor = false;
            // 
            // panelAction
            // 
            panelAction.Controls.Add(button1);
            panelAction.Controls.Add(button8);
            panelAction.Controls.Add(button2);
            panelAction.Controls.Add(button3);
            panelAction.Controls.Add(button5);
            panelAction.Controls.Add(button6);
            panelAction.Controls.Add(button7);
            panelAction.Controls.Add(button9);
            panelAction.Controls.Add(button4);
            panelAction.Controls.Add(btnImport);
            panelAction.Controls.Add(btnCancel);
            panelAction.Controls.Add(btnSave);
            panelAction.Controls.Add(btnAdd);
            panelAction.Controls.Add(btnExport);
            panelAction.Controls.Add(btnDelete);
            panelAction.Controls.Add(btnEdit);
            panelAction.Dock = DockStyle.Bottom;
            panelAction.ForeColor = Color.White;
            panelAction.Location = new Point(0, 772);
            panelAction.Margin = new Padding(6, 4, 6, 4);
            panelAction.Name = "panelAction";
            panelAction.Size = new Size(1764, 96);
            panelAction.TabIndex = 5;
            // 
            // panelContentAcc
            // 
            panelContentAcc.Controls.Add(panelTable);
            panelContentAcc.Controls.Add(panelInfor);
            panelContentAcc.Dock = DockStyle.Fill;
            panelContentAcc.Location = new Point(0, 0);
            panelContentAcc.Margin = new Padding(6, 4, 6, 4);
            panelContentAcc.Name = "panelContentAcc";
            panelContentAcc.Size = new Size(1764, 772);
            panelContentAcc.TabIndex = 4;
            // 
            // panelTable
            // 
            panelTable.Controls.Add(dgvNhanVien);
            panelTable.Dock = DockStyle.Fill;
            panelTable.Location = new Point(0, 122);
            panelTable.Name = "panelTable";
            panelTable.Size = new Size(1764, 650);
            panelTable.TabIndex = 4;
            // 
            // dgvNhanVien
            // 
            dgvNhanVien.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dgvNhanVien.Dock = DockStyle.Fill;
            dgvNhanVien.Location = new Point(0, 0);
            dgvNhanVien.Margin = new Padding(6, 4, 6, 4);
            dgvNhanVien.Name = "dgvNhanVien";
            dgvNhanVien.RowHeadersWidth = 51;
            dgvNhanVien.Size = new Size(1764, 650);
            dgvNhanVien.TabIndex = 0;
            // 
            // button1
            // 
            button1.Anchor = AnchorStyles.Right;
            button1.BackColor = Color.MidnightBlue;
            button1.FlatAppearance.BorderSize = 0;
            button1.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button1.ForeColor = Color.White;
            button1.Image = (Image)resources.GetObject("button1.Image");
            button1.ImageAlign = ContentAlignment.MiddleRight;
            button1.Location = new Point(1588, 18);
            button1.Margin = new Padding(4);
            button1.Name = "button1";
            button1.Size = new Size(169, 61);
            button1.TabIndex = 112;
            button1.Text = "RELOAD";
            button1.TextImageRelation = TextImageRelation.ImageBeforeText;
            button1.UseVisualStyleBackColor = false;
            // 
            // button8
            // 
            button8.Anchor = AnchorStyles.Right;
            button8.BackColor = Color.DarkSlateGray;
            button8.FlatAppearance.BorderSize = 0;
            button8.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button8.ForeColor = Color.White;
            button8.Image = (Image)resources.GetObject("button8.Image");
            button8.ImageAlign = ContentAlignment.MiddleRight;
            button8.Location = new Point(1382, 18);
            button8.Margin = new Padding(4);
            button8.Name = "button8";
            button8.Size = new Size(169, 61);
            button8.TabIndex = 111;
            button8.Text = "XUẤT";
            button8.TextImageRelation = TextImageRelation.ImageBeforeText;
            button8.UseVisualStyleBackColor = false;
            // 
            // button2
            // 
            button2.Anchor = AnchorStyles.Right;
            button2.BackColor = Color.LightSlateGray;
            button2.FlatAppearance.BorderSize = 0;
            button2.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button2.ForeColor = Color.White;
            button2.Image = (Image)resources.GetObject("button2.Image");
            button2.ImageAlign = ContentAlignment.MiddleRight;
            button2.Location = new Point(1173, 18);
            button2.Margin = new Padding(4);
            button2.Name = "button2";
            button2.Size = new Size(169, 61);
            button2.TabIndex = 110;
            button2.Text = "NHẬP";
            button2.TextImageRelation = TextImageRelation.ImageBeforeText;
            button2.UseVisualStyleBackColor = false;
            // 
            // button3
            // 
            button3.Anchor = AnchorStyles.Right;
            button3.BackColor = Color.LightCoral;
            button3.FlatAppearance.BorderSize = 0;
            button3.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button3.ForeColor = Color.White;
            button3.Image = (Image)resources.GetObject("button3.Image");
            button3.ImageAlign = ContentAlignment.MiddleRight;
            button3.Location = new Point(546, 18);
            button3.Margin = new Padding(4);
            button3.Name = "button3";
            button3.Size = new Size(169, 61);
            button3.TabIndex = 109;
            button3.Text = "HỦY";
            button3.TextImageRelation = TextImageRelation.ImageBeforeText;
            button3.UseVisualStyleBackColor = false;
            // 
            // button5
            // 
            button5.Anchor = AnchorStyles.Right;
            button5.BackColor = SystemColors.ActiveCaption;
            button5.FlatAppearance.BorderSize = 0;
            button5.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button5.ForeColor = Color.White;
            button5.Image = (Image)resources.GetObject("button5.Image");
            button5.ImageAlign = ContentAlignment.MiddleRight;
            button5.Location = new Point(337, 18);
            button5.Margin = new Padding(4);
            button5.Name = "button5";
            button5.Size = new Size(169, 61);
            button5.TabIndex = 108;
            button5.Text = "LƯU";
            button5.TextImageRelation = TextImageRelation.ImageBeforeText;
            button5.UseVisualStyleBackColor = false;
            // 
            // button6
            // 
            button6.Anchor = AnchorStyles.Right;
            button6.BackColor = Color.MediumAquamarine;
            button6.FlatAppearance.BorderSize = 0;
            button6.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button6.ForeColor = Color.White;
            button6.Image = (Image)resources.GetObject("button6.Image");
            button6.ImageAlign = ContentAlignment.MiddleRight;
            button6.Location = new Point(122, 18);
            button6.Margin = new Padding(4);
            button6.Name = "button6";
            button6.Size = new Size(169, 61);
            button6.TabIndex = 107;
            button6.Text = "THÊM";
            button6.TextImageRelation = TextImageRelation.ImageBeforeText;
            button6.UseVisualStyleBackColor = false;
            // 
            // button7
            // 
            button7.Anchor = AnchorStyles.Right;
            button7.BackColor = Color.LightSkyBlue;
            button7.FlatAppearance.BorderSize = 0;
            button7.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button7.ForeColor = Color.White;
            button7.Image = (Image)resources.GetObject("button7.Image");
            button7.ImageAlign = ContentAlignment.MiddleRight;
            button7.Location = new Point(964, 18);
            button7.Margin = new Padding(4);
            button7.Name = "button7";
            button7.Size = new Size(169, 61);
            button7.TabIndex = 106;
            button7.Text = "XÓA";
            button7.TextImageRelation = TextImageRelation.ImageBeforeText;
            button7.UseVisualStyleBackColor = false;
            // 
            // button9
            // 
            button9.Anchor = AnchorStyles.Right;
            button9.BackColor = Color.DarkKhaki;
            button9.FlatAppearance.BorderSize = 0;
            button9.Font = new Font("Tahoma", 12F, FontStyle.Bold);
            button9.ForeColor = Color.White;
            button9.Image = (Image)resources.GetObject("button9.Image");
            button9.ImageAlign = ContentAlignment.MiddleRight;
            button9.Location = new Point(756, 18);
            button9.Margin = new Padding(4);
            button9.Name = "button9";
            button9.Size = new Size(169, 61);
            button9.TabIndex = 105;
            button9.Text = "SỬA";
            button9.TextImageRelation = TextImageRelation.ImageBeforeText;
            button9.UseVisualStyleBackColor = false;
            // 
            // frmAccount
            // 
            AutoScaleDimensions = new SizeF(11F, 24F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1764, 868);
            Controls.Add(panelContentAcc);
            Controls.Add(panelAction);
            Font = new Font("Tahoma", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            Margin = new Padding(4);
            Name = "frmAccount";
            Text = "QUẢN LÝ TÀI KHOẢN";
            panelInfor.ResumeLayout(false);
            panelInfor.PerformLayout();
            panelAction.ResumeLayout(false);
            panelContentAcc.ResumeLayout(false);
            panelTable.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)dgvNhanVien).EndInit();
            ResumeLayout(false);
        }

        #endregion
        private Panel panelInfor;
        private ComboBox comboBox3;
        private Label label13;
        private ComboBox comboBox2;
        private DateTimePicker dateTimePicker1;
        private Label label3;
        private TextBox textBox2;
        private Label label2;
        private TextBox textBox1;
        private Label label1;
        private Label label12;
        private Button btnEdit;
        private Button btnDelete;
        private Button btnExport;
        private Button btnAdd;
        private Button btnSave;
        private Button btnCancel;
        private Button btnImport;
        private Button button4;
        private Panel panelAction;
        private Panel panelContentAcc;
        private DataGridView dgvNhanVien;
        private Panel panelTable;
        private Button btnSearch;
        private TextBox textBox3;
        private Button button1;
        private Button button8;
        private Button button2;
        private Button button3;
        private Button button5;
        private Button button6;
        private Button button7;
        private Button button9;
    }
}