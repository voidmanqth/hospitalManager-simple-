//������
package com.jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.*;

import com.adminframe.AddAdmin;
import com.adminframe.AdminFrame;
import com.adminframe.ManageAdmin;
import com.bed.BedTableFrame;
import com.drugframe.DrugTableFrame;
import com.drugframe.ManageDrug;
import com.dto.Admin;
import com.employer.EmployerTableFrame;
import com.employer.ManageEmployer;
import com.employer.SearchEmployer;
import com.instrumentframe.InstrumentTableFrame;
import com.instrumentframe.ManageInstrument;
import com.patient.ManagePatient;
import com.patient.PatientTableFrame;
import com.salary.ManageSalary;
import com.salary.SalaryTableFrame;

public class MyJFrame extends JFrame implements ActionListener {
	private JMenuBar menubar;
	private JMenu[] menu;
	private JDesktopPane desktop;
	private Admin admin;

	MyJFrame(Admin admin) {
		super("ҽԺ��Ϣ����ϵͳ");
		this.setBounds(180, 80, 1000, 650);
		this.admin = admin;
		desktop = new JDesktopPane();
		menubar = new JMenuBar();
		this.getContentPane().add(desktop);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		String[] menustr = { "Ա����Ϣ����", "������Ϣ����", "ҩ����Դ����", "������Դ����", "��������",
				"Ա�����ʹ���", "�û�Ȩ�޹���" };
		menu = new JMenu[menustr.length];
		for (int i = 0; i < menustr.length; i++) {
			menu[i] = new JMenu(menustr[i]);
			menubar.add(menu[i]);
		}

		String[] itemstr = { "�鿴Ա����Ϣ", "�鿴������Ϣ", "�鿴ҩ����Դ", "�鿴������Դ", "�鿴����",
				"�鿴����", "�޸���Ϣ", };
		JMenuItem[] menuitems = new JMenuItem[itemstr.length];
		for (int i = 0; i < itemstr.length; i++) {
			menuitems[i] = new JMenuItem(itemstr[i]);
			menuitems[i].addActionListener(this);
			menu[i].add(menuitems[i]);
		}
		String[] itemstr2 = { "����Ա����Ϣ", "��������Ϣ", "����ҩ����Դ", "����������Դ", null,
				"��������Ϣ", "Ȩ�޹���", };

		JMenuItem menuitem = new JMenuItem("����û�");
		menu[6].add(menuitem).setEnabled(false);
		menuitem.addActionListener(this);
		
		JMenuItem menuitem2 = new JMenuItem("��ѯԱ����Ϣ");
		menu[0].add(menuitem2);
		menuitem2.addActionListener(this);
		
		JMenuItem[] menuitems2 = new JMenuItem[itemstr2.length];
		for (int i = 0; i < itemstr2.length; i++) {
			menuitems2[i] = new JMenuItem(itemstr2[i]);
			menuitems2[i].addActionListener(this);
			menu[i].add(menuitems2[i]);
			if (!admin.getPower().equals("����Ա")) {
				menuitems2[i].setEnabled(false);
			} else {
				menuitems2[i].setEnabled(true);
				menuitem.setEnabled(true);
			}

		}

		this.setJMenuBar(menubar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		// this.pack();
	}

	// public static void main(String[] args) {
	// new MyJFrame(null);
	// }

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "�鿴Ա����Ϣ") {
			desktop.removeAll();
			EmployerTableFrame tableframe = new EmployerTableFrame();
			desktop.add(tableframe);
			tableframe.setVisible(true);
		}
		if (e.getActionCommand() == "�鿴������Ϣ") {
			desktop.removeAll();
			PatientTableFrame tableframe = new PatientTableFrame();
			desktop.add(tableframe);
			tableframe.setVisible(true);
		}
		if (e.getActionCommand() == "�鿴ҩ����Դ") {
			desktop.removeAll();
			DrugTableFrame tableframe = new DrugTableFrame();
			desktop.add(tableframe);
			tableframe.setVisible(true);
		}
		if (e.getActionCommand() == "�鿴������Դ") {
			desktop.removeAll();
			InstrumentTableFrame tableframe = new InstrumentTableFrame();
			desktop.add(tableframe);
			tableframe.setVisible(true);
		}
		if (e.getActionCommand() == "�鿴����") {
			desktop.removeAll();
			BedTableFrame tableframe = new BedTableFrame();
			desktop.add(tableframe);
			tableframe.setVisible(true);
		}
		if (e.getActionCommand() == "�鿴����") {
			desktop.removeAll();
			SalaryTableFrame tableframe = new SalaryTableFrame();
			desktop.add(tableframe);
			tableframe.setVisible(true);
		}

		if (e.getActionCommand() == "����Ա����Ϣ") {
			ManageEmployer addpatient = new ManageEmployer(desktop);
			desktop.add(addpatient).setVisible(true);
			try {
				addpatient.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}
		if (e.getActionCommand() == "��������Ϣ") {
			ManagePatient addpatient = new ManagePatient(desktop);
			desktop.add(addpatient).setVisible(true);
			try {
				addpatient.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}
		if (e.getActionCommand() == "����ҩ����Դ") {
			ManageDrug manage = new ManageDrug(desktop);
			desktop.add(manage).setVisible(true);
			try {
				manage.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}
		if (e.getActionCommand() == "����������Դ") {
			ManageInstrument add = new ManageInstrument(desktop);
			desktop.add(add).setVisible(true);
			try {
				add.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}

		if (e.getActionCommand() == "��������Ϣ") {
			ManageSalary msalary = new ManageSalary(desktop);
			desktop.add(msalary).setVisible(true);
			try {
				msalary.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}
		if (e.getActionCommand() == "������") {

		}
		if (e.getActionCommand() == "����û�") {
			AddAdmin addadmin = new AddAdmin(desktop);
			desktop.add(addadmin).setVisible(true);
			try {
				addadmin.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}
		if (e.getActionCommand() == "�޸���Ϣ") {
			AdminFrame adminframe = new AdminFrame(admin);
			desktop.add(adminframe).setVisible(true);
			try {
				adminframe.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}
		if (e.getActionCommand() == "Ȩ�޹���") {
			ManageAdmin manage = new ManageAdmin();
			desktop.add(manage).setVisible(true);
			try {
				manage.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}		
		if (e.getActionCommand() == "��ѯԱ����Ϣ") {
			SearchEmployer search = new SearchEmployer();
			desktop.add(search).setVisible(true);
			try {
				search.setSelected(true);
			} catch (PropertyVetoException pe) {
			}
		}
	}
}
