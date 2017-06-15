package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import bean.Pessoa;
import controle.PessoaBC;
import exceptions.SSPException;

public class CadastroPessoaView extends JFrame implements ActionListener {

	private JComboBox pessoas;
	private JButton btnSelecionar;
	private JTextField nome;
	private JTextField fone;
	private JTextField email;
	private JTextField id;
	private JTextField cpf;

	public CadastroPessoaView() {
		getContentPane().setLayout(null);
		this.setBounds(300, 300, 600, 453);

		JLabel lblNome;
		JLabel lblPessoasCadastradas = new JLabel("Pessoas Cadastradas");
		lblPessoasCadastradas.setBounds(10, 32, 122, 14);
		getContentPane().add(lblPessoasCadastradas);

		pessoas = new JComboBox();
		pessoas.setBounds(142, 26, 262, 27);
		getContentPane().add(pessoas);

		btnSelecionar = new JButton("Selecionar");
		btnSelecionar.setBounds(414, 28, 89, 25);
		getContentPane().add(btnSelecionar);

		lblNome = new JLabel("Nome");
		lblNome.setBounds(69, 162, 46, 14);
		getContentPane().add(lblNome);

		nome = new JTextField();
		nome.setBounds(121, 159, 323, 20);
		getContentPane().add(nome);
		nome.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(34, 111, 469, 7);
		getContentPane().add(separator);

		JLabel lblFone = new JLabel("Fone");
		lblFone.setBounds(69, 236, 46, 14);
		getContentPane().add(lblFone);

		fone = new JTextField();
		fone.setBounds(121, 233, 152, 20);
		getContentPane().add(fone);
		fone.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(69, 278, 46, 14);
		getContentPane().add(lblEmail);

		email = new JTextField();
		email.setBounds(121, 275, 323, 20);
		getContentPane().add(email);
		email.setColumns(10);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(69, 129, 46, 14);
		getContentPane().add(lblId);

		id = new JTextField();
		id.setBounds(121, 124, 63, 20);
		getContentPane().add(id);
		id.setColumns(10);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(69, 199, 46, 14);
		getContentPane().add(lblCpf);

		cpf = new JTextField();
		cpf.setBounds(121, 190, 152, 20);
		getContentPane().add(cpf);
		cpf.setColumns(10);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(204, 125, 89, 23);
		getContentPane().add(btnExcluir);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnSalvar.setBounds(160, 333, 89, 23);
		getContentPane().add(btnSalvar);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(278, 333, 89, 23);
		getContentPane().add(btnUpdate);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Pessoa p = new Pessoa();

		p.setNome(this.nome.getText());
		p.setCpf(this.cpf.getText());
		p.setEmail(this.email.getText());
		p.setFone(this.fone.getText());

		PessoaBC pbc = new PessoaBC();
		try {
			if (pbc.gravar(p)) {
				JOptionPane.showMessageDialog(null, "Gravado com sucesso");
			} else {
				JOptionPane.showMessageDialog(null, "ERRO");
			}
		} catch (SSPException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null,pbc.chamarPolicia(p));

		} finally {
			/*
			 * opcional e sempre vai ser executado
			 */
		}

		

	}
}
