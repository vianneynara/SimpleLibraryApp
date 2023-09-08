import javax.swing.*;

public class RegistrationGUI extends JDialog {
    /* Komponen formulir */
    private JTextField name;
    private JTextField idNumber;
    private JComboBox idType;
    private JTextField address;
    private JTextField phone;
    private JButton cancel;
    private JButton submit;

    public RegistrationGUI() {
        setTitle        ("Registrasi GUI");
        setSize         (960, 540);
        setResizable    (false);
        setDefaultCloseOperation(3);
    }
}
