using PhanMem_QuanLy_CBCC.Forms;
using System.Runtime.InteropServices;
using System.Windows.Forms.DataVisualization.Charting;


namespace PhanMem_QuanLy_CBCC
{
    public partial class frmMenu : Form
    {
        //Fields
        private Button currentButton;
        private Random random;
        private int tempIndex;
        private Form activeForm;

        public frmMenu()
        {
            InitializeComponent();

            random = new Random();
            this.Text = string.Empty;
            this.ControlBox = false;
            this.MaximizedBounds = Screen.FromHandle(this.Handle).WorkingArea;
        }

        [DllImport("user32.DLL", EntryPoint = "ReleaseCapture")]
        private extern static void ReleaseCapture();
        [DllImport("user32.DLL", EntryPoint = "SendMessage")]
        private extern static void SendMessage(System.IntPtr hWnd, int wMsg, int wParam, int lParam);
        //Methods
        private Color SelectThemeColor()
        {
            int index = random.Next(ThemeColor.ColorList.Count);
            while (tempIndex == index)
            {
                index = random.Next(ThemeColor.ColorList.Count);
            }
            tempIndex = index;
            string color = ThemeColor.ColorList[index];
            return ColorTranslator.FromHtml(color);
        }
        private void ActivateButton(object btnSender)
        {
            if (btnSender != null)
            {
                if (currentButton != (Button)btnSender)
                {
                    DisableButton();
                    Color color = SelectThemeColor();
                    currentButton = (Button)btnSender;
                    currentButton.BackColor = color;
                    currentButton.ForeColor = Color.White;
                    currentButton.Font = new System.Drawing.Font("Tahoma", 13F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
                    panelTitlebar.BackColor = color;
                    ThemeColor.PrimaryColor = color;
                    ThemeColor.SecondaryColor = ThemeColor.ChangeColorBrightness(color, -0.3);
                }
            }
        }
        private void DisableButton()
        {
            foreach (Control previousBtn in panelMenu.Controls)
            {
                if (previousBtn.GetType() == typeof(Button))
                {
                    previousBtn.BackColor = Color.FromArgb(51, 51, 76);
                    previousBtn.ForeColor = Color.Gainsboro;
                    previousBtn.Font = new System.Drawing.Font("Tahoma", 13F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
                }
            }
        }

        private void OpenChildForm(Form childForm, object btnSender)
        {
            if (activeForm != null)
                activeForm.Close();
            ActivateButton(btnSender);
            activeForm = childForm;
            childForm.TopLevel = false;
            childForm.FormBorderStyle = FormBorderStyle.None;
            childForm.Dock = DockStyle.Fill;
            this.panelContent.Controls.Add(childForm);
            this.panelContent.Tag = childForm;
            childForm.BringToFront();
            childForm.Show();
            lblTitle.Text = childForm.Text;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            OpenChildForm(new Forms.frmProfile(), sender);
        }

        private void Reset()
        {
            DisableButton();
            lblTitle.Text = "TRANG CHỦ";
            panelTitlebar.BackColor = Color.FromArgb(0, 150, 136);
            currentButton = null;
        }

        private void panelTitlebar_MouseDown(object sender, MouseEventArgs e)
        {
            ReleaseCapture();
            SendMessage(this.Handle, 0x112, 0xf012, 0);
        }

        private void btnMinimize_Click(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }

        private void btnMaximize_Click(object sender, EventArgs e)
        {
            if (WindowState == FormWindowState.Normal)
                this.WindowState = FormWindowState.Maximized;
            else
                this.WindowState = FormWindowState.Normal;
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Thoát chương trình?", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                Application.Exit();
            }
        }


        private void btnCloseChildForm_Click_1(object sender, EventArgs e)
        {
            if (activeForm != null)
                activeForm.Close();
            Reset();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            OpenChildForm(new Forms.frmAccount(), sender);
        }

        private void btnLogout_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Xác nhận đăng xuất khỏi hệ thống ?", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                frmLogin login = new frmLogin();
                login.Show();
                this.Hide();
            }
        }

        private void frmMenu_Load(object sender, EventArgs e)
        {
            // Dữ liệu giả định
            string[] categories = { "A", "B", "C", "D", "E" };
            int[] values = { 10, 20, 30, 25, 15 };

            // --- CHART COLUMN ---
            chartColumn.Series.Clear();
            chartColumn.ChartAreas[0].AxisX.Title = "Categories";
            chartColumn.ChartAreas[0].AxisY.Title = "Values";

            Series columnSeries = new Series("Data");
            columnSeries.ChartType = SeriesChartType.Column;

            for (int i = 0; i < categories.Length; i++)
            {
                columnSeries.Points.AddXY(categories[i], values[i]);
            }

            chartColumn.Series.Add(columnSeries);

            // --- CHART PIE ---
            chartPie.Series.Clear();

            Series pieSeries = new Series("Data");
            pieSeries.ChartType = SeriesChartType.Pie;
            pieSeries.IsValueShownAsLabel = true; // Hiển thị giá trị trên Pie

            for (int i = 0; i < categories.Length; i++)
            {
                pieSeries.Points.AddXY(categories[i], values[i]);
            }

            chartPie.Series.Add(pieSeries);
        }

        private void btnLuong_Click(object sender, EventArgs e)
        {
            OpenChildForm(new Forms.frmSalary(), sender);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            OpenChildForm(new Forms.frmDepartment(), sender);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            OpenChildForm(new Forms.frmPosition(), sender);
        }
    }
}
