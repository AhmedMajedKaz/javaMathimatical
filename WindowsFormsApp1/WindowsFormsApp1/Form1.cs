using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String s = textBox2.Text;
            int ss = Int32.Parse(s);
            String sd = textBox1.Text;
            int ssd = Int32.Parse(sd);
            label1.Text = Convert.ToString(ss + ssd);
            
        }
    }
}
