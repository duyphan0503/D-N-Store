using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Windows.Forms;
using static DA1_QLQuanNET.frmHoaDon;
using static System.Windows.Forms.VisualStyles.VisualStyleElement.TaskbarClock;

namespace DA1_QLQuanNET
{
    public partial class frmHoaDon : Form
    {
        public frmHoaDon()
        {
            InitializeComponent();
        }
        private void btnBACK_Click(object sender, EventArgs e)
        {
            frmMenu menu = new frmMenu();
            this.Hide();
            menu.ShowDialog();
        }
    }
}