import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankGUI extends JFrame 
{
    private Account account;
    private JTextField nameField, accNumField, amountField;
    private JButton createBtn, depositBtn, withdrawBtn, balanceBtn;
    private JTextArea outputArea;

    public BankGUI() {
        setTitle("Simple Banking System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameField = new JTextField(15);
        accNumField = new JTextField(15);
        amountField = new JTextField(10);

        createBtn = new JButton("Create Account");
        depositBtn = new JButton("Deposit");
        withdrawBtn = new JButton("Withdraw");
        balanceBtn = new JButton("Check Balance");

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Account No:"));
        add(accNumField);
        add(createBtn);

        add(new JLabel("Amount:"));
        add(amountField);
        add(depositBtn);
        add(withdrawBtn);
        add(balanceBtn);
        add(new JScrollPane(outputArea));

        // Action Listeners

        createBtn.addActionListener(e -> {
            String name = nameField.getText();
            String accNum = accNumField.getText();
            if (!name.isEmpty() && !accNum.isEmpty()) {
                account = new Account(name, accNum);
                outputArea.setText("Account created for " + name + " with A/C No: " + accNum);
            } else {
                outputArea.setText("Enter valid name and account number.");
            }
        });

        depositBtn.addActionListener(e -> {
            if (account != null) {
                double amount = Double.parseDouble(amountField.getText());
                account.deposit(amount);
                outputArea.setText("₹" + amount + " deposited.\nCurrent Balance: ₹" + account.getBalance());
            } else {
                outputArea.setText("Create account first!");
            }
        });

        withdrawBtn.addActionListener(e -> {
            if (account != null) {
                double amount = Double.parseDouble(amountField.getText());
                if (account.withdraw(amount)) {
                    outputArea.setText("₹" + amount + " withdrawn.\nCurrent Balance: ₹" + account.getBalance());
                } else {
                    outputArea.setText("Insufficient balance or invalid amount.");
                }
            } else {
                outputArea.setText("Create account first!");
            }
        });

        balanceBtn.addActionListener(e -> {
            if (account != null) {
                outputArea.setText("Current Balance: ₹" + account.getBalance());
            } else {
                outputArea.setText("Create account first!");
            }
        });
    }
}