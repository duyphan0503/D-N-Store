using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PhanMem_QuanLy_CBCC.Forms
{
    public partial class frmProfile : Form
    {
        public frmProfile()
        {
            InitializeComponent();
            LoadTheme();
        }

        private void LoadTheme()
        {
            // Duyệt qua tất cả các điều khiển trong form và các container con
            foreach (Control ctrl in this.Controls)
            {
                // Kiểm tra nếu là Label
                if (ctrl is Label)
                {
                    Label lbl = (Label)ctrl;
                    lbl.BackColor = ThemeColor.SecondaryColor;
                    lbl.ForeColor = Color.White;
                }
                // Nếu có Panel, GroupBox, hoặc các container, lặp lại qua các điều khiển con
                if (ctrl is Panel || ctrl is GroupBox)
                {
                    foreach (Control childCtrl in ctrl.Controls)
                    {
                        if (childCtrl is Label)
                        {
                            Label lbl = (Label)childCtrl;
                            lbl.ForeColor = ThemeColor.SecondaryColor;
                        }
                    }
                }
            }
        }


        private void btnSave_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Xác nhận lưu thông tin?", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
        }
    }
}
