using System;
using System.ComponentModel;
using System.Data;
using System.Windows.Forms;

namespace DA1_QLQuanNET
{
    public partial class frmMay : Form
    {
        
        public frmMay()
        {
            InitializeComponent();
        }

        private void btnBACK_Click(object sender, EventArgs e)
        {
            this.Hide();
            frmMenu menu = new frmMenu();
            menu.ShowDialog();
        }
    }
}