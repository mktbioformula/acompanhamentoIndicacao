package view;

import javax.swing.JFrame;
import javax.swing.JTextField;

import bean.Pessoa;
import controle.PessoaBC;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CadastroPessoaView extends JFrame implements ActionListener {
	
	
	private JTextField nome;
	private JTextField fone;
	private JTextField email;
	
	
	public CadastroPessoaView(){
		this.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(66, 65, 70, 15);
		getContentPane().add(lblNome);
		
		nome = new JTextField();
		nome.setBounds(146, 63, 114, 19);
		getContentPane().add(nome);
		nome.setColumns(10);
		
		fone = new JTextField();
		fone.setBounds(146, 123, 114, 19);
		getContentPane().add(fone);
		fone.setColumns(10);
		
		JLabel lblFone = new JLabel("Fone");
		lblFone.setBounds(66, 125, 70, 15);
		getContentPane().add(lblFone);
		
		email = new JTextField();
		email.setBounds(146, 184, 114, 19);
		getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(66, 186, 70, 15);
		getContentPane().add(lblEmail);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(this);
		btnCadastrar.setBounds(143, 250, 117, 25);
		getContentPane().add(btnCadastrar);
		this.setBounds(300, 300, 600, 453);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Pessoa p = new Pessoa();
		
		p.setNome(this.nome.getText());
		p.setTelefone(this.fone.getText());
		p.setEmail(this.email.getText());
		
		
		PessoaBC pbc = new PessoaBC();
		if(pbc.cadastrar(p)){
			JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
		}else{
			JOptionPane.showMessageDialog(null, "Erro ao gravar pessoa!");
		}
		
	}


	
}
