import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class MainMahasiswaFX extends JFrame {
    private JTextField txtNama, txtNim, txtJurusan, txtUmur;
    private JTextField txtTglLahir;
    private JTextField txtSkills;
    private JTextArea txtOutput;
    private JButton btnSimpan, btnTampil;

    private Mahasiswa mahasiswa;

    public MainMahasiswaFX () {
        setTitle("Form Data Mahasiswa");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel Input
        JPanel panelInput = new JPanel(new GridLayout(7, 2, 5, 5));
        panelInput.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        panelInput.add(new JLabel("Nama:"));
        txtNama = new JTextField();
        panelInput.add(txtNama);

        panelInput.add(new JLabel("NIM:"));
        txtNim = new JTextField();
        panelInput.add(txtNim);

        panelInput.add(new JLabel("Jurusan:"));
        txtJurusan = new JTextField();
        panelInput.add(txtJurusan);

        panelInput.add(new JLabel("Umur:"));
        txtUmur = new JTextField();
        panelInput.add(txtUmur);

        panelInput.add(new JLabel("Tanggal Lahir (yyyy-mm-dd):"));
        txtTglLahir = new JTextField();
        panelInput.add(txtTglLahir);

        panelInput.add(new JLabel("Skills (pisahkan dengan koma):"));
        txtSkills = new JTextField();
        panelInput.add(txtSkills);

        // Tombol
        btnSimpan = new JButton("Simpan");
        btnTampil = new JButton("Tampilkan Data");

        panelInput.add(btnSimpan);
        panelInput.add(btnTampil);

        add(panelInput, BorderLayout.NORTH);

        // Area Output
        txtOutput = new JTextArea();
        txtOutput.setEditable(false);
        add(new JScrollPane(txtOutput), BorderLayout.CENTER);

        // Event Tombol Simpan
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nama = txtNama.getText();
                    String nim = txtNim.getText();
                    String jurusan = txtJurusan.getText();
                    int umur = Integer.parseInt(txtUmur.getText());
                    Date tglLahir = java.sql.Date.valueOf(txtTglLahir.getText());
                    String[] skills = txtSkills.getText().split(",");

                    mahasiswa = new Mahasiswa(nama, nim, jurusan, umur, tglLahir, skills);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "❌ Gagal menyimpan data: " + ex.getMessage());
                }
            }
        });

        // Event Tombol Tampil
        btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mahasiswa != null) {
                    txtOutput.setText(
                                    "Nama          : " + mahasiswa.getNama() + "\n" +
                                    "NIM           : " + mahasiswa.getNim() + "\n" +
                                    "Jurusan       : " + mahasiswa.getJurusan() + "\n" +
                                    "Umur          : " + mahasiswa.getUmur() + "\n" +
                                    "Tanggal Lahir : " + mahasiswa.getTglLahir() + "\n" +
                                    "Keahlian      : " + String.join(", ", mahasiswa.getSkills()) + "\n"
                    );
                } else {
                    JOptionPane.showMessageDialog(null, "⚠ Belum ada data yang disimpan!");
                }
            }
        });

        setLocationRelativeTo(null); // Tengah layar
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainMahasiswaFX ().setVisible(true);
        });
    }
}
