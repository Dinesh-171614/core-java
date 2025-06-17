import java.awt.*;
import java.awt.event.*;
public class register extends Frame implements ActionListener {

    Label nameLabel, mobileLabel, passwordLabel,genderLabel,addressLabel, outputLabel;
    TextField nameField;
    TextField mobileField;
    TextField passwordField;
    CheckboxGroup genderGroup;
    Checkbox male, female;
    TextField addressField;
    Button submitButton;

    public register() {
        setTitle("Register Letter");
        setSize(600, 400);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 60, 20);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(120, 50, 200, 20);
        add(nameField);

        mobileLabel = new Label("mobile:");
        mobileLabel.setBounds(50, 80, 60, 20);
        add(mobileLabel);

        mobileField = new TextField();
        mobileField.setBounds(120, 80, 200, 20);
        add(mobileField);

        passwordLabel = new Label("password:");
        passwordLabel.setBounds(50, 110, 60, 20);
        add(passwordLabel);

        passwordField = new TextField();
        passwordField.setBounds(120, 110, 150, 20);
        add(passwordField);

        genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 140, 60, 20);
        add(genderLabel);

        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, true);
        male.setBounds(120, 140, 60, 20);
        add(male);

        female = new Checkbox("Female", genderGroup, false);
        female.setBounds(190, 140, 60, 20);
        add(female);

        addressLabel = new Label("Address:");
        addressLabel.setBounds(50, 170, 60, 30);
        add(addressLabel);

        addressField = new TextField();
        addressField.setBounds(120, 170, 150, 30);
        add(addressField);

        submitButton = new Button("Submit");
        submitButton.setBounds(120, 200, 150,20);
        submitButton.addActionListener(this);
        add(submitButton);

        outputLabel = new Label();
        outputLabel.setBounds(120, 230, 150, 20);
        add(outputLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            outputLabel.setText("Please enter your name.");
            return;
        }

        String gender = genderGroup.getSelectedCheckbox().getLabel();

        String message = "Hello " + name + " (" + gender + ") from";
        outputLabel.setText(message);
    }

    public static void main(String[] args) {
        new register();
    }
}