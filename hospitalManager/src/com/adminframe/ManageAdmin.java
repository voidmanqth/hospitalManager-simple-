/*
 * ManageAdmin.java
 *
 * Created on __DATE__, __TIME__
 */

package com.adminframe;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.dto.Admin;
import com.dto.Title;
import com.model.AdminModel;
import com.model.TableModel;

/**
 * 
 * @author __USER__
 */
public class ManageAdmin extends javax.swing.JInternalFrame implements
		MouseListener {

	/** Creates new form ManageAdmin */
	public ManageAdmin() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		name = new javax.swing.JTextField();
		power = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		adminid = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();

		jLabel1.setText("\u7ba1\u7406\u7528\u6237");

		power.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"管理员", "普通用户" }));

		jLabel2.setText("\u767b\u5f55\u540d");

		jLabel3.setText("用户权限");

		// 表格

		TableModel model = new TableModel();
		Vector vec = model.query(sql, 3);
		table = new DefaultTableModel(vec, Title.admintitle());
		jTable1.setModel(table);
		jTable1.addMouseListener(this);
		jScrollPane2.setViewportView(jTable1);

		jScrollPane1.setViewportView(jScrollPane2);

		jButton2.setText("\u5220\u9664");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u53d6\u6d88");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u4fee\u6539");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		adminid.setEnabled(false);
		name.setEditable(false);
		jLabel4.setText("\u7f16\u53f7");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										171, Short.MAX_VALUE).addComponent(
										jLabel1).addGap(198, 198, 198))
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(107, 107, 107)
										.addComponent(jButton2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton3)
										.addContainerGap(127, Short.MAX_VALUE))
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 417,
								Short.MAX_VALUE)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(42, 42, 42)
										.addComponent(
												jLabel4,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												24, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												adminid,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												36, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												name,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												94,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												24, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												power,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(65, 65, 65)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addGap(11, 11, 11)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												219, Short.MAX_VALUE)
										.addGap(26, 26, 26)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(power)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(
																				6,
																				6,
																				6))
														.addComponent(adminid)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(
																				6,
																				6,
																				6))
														.addComponent(name)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(
																				6,
																				6,
																				6)))
										.addGap(43, 43, 43)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton4)
														.addComponent(jButton3))
										.addGap(33, 33, 33)));

		pack();
	}// </editor-fold>

	// GEN-END:initComponents

	// 取消
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	// 修改
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		if (name.getText() == null) {
			JOptionPane.showMessageDialog(this, "请选择用户");
			return;
		}
		int id = Integer.parseInt(adminid.getText());
		AdminModel amodel = new AdminModel();
		if (amodel.queryOne(id) == null) {
			JOptionPane.showMessageDialog(this, "查无此用户");
			return;
		}
		Admin ad = new Admin();
		ad.setName(name.getText());
		ad.setPower(power.getSelectedItem().toString());
		boolean flag = amodel.uptAdmin(ad, id);
		if (flag) {
			TableModel tmodel = new TableModel();
			table.setDataVector(tmodel.query(sql, 3), Title.admintitle());
			JOptionPane.showMessageDialog(this, "修改权限成功");
		}else{
			JOptionPane.showMessageDialog(this, "修改权限失败");
		}
	}

	// 删除
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (name.getText() == null) {
			JOptionPane.showMessageDialog(this, "请选择用户");
			return;
		}
		int id = Integer.parseInt(adminid.getText());
		AdminModel amodel = new AdminModel();
		if (amodel.queryOne(id) == null) {
			JOptionPane.showMessageDialog(this, "查无此用户");
			return;
		}
		int i = JOptionPane.showConfirmDialog(this, "确定删除该用户？");
		if (i == 0) {
			boolean flag = amodel.DelAdmin(id);
			if (flag) {
				JOptionPane.showMessageDialog(this, "删除用户成功");
				TableModel tmodel = new TableModel();
				table.setDataVector(tmodel.query(sql, 3), Title.admintitle());
			} else {
				JOptionPane.showMessageDialog(this, "删除用户失败");
			}
		}
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField name;
	private javax.swing.JTextField adminid;
	private javax.swing.JComboBox power;
	private DefaultTableModel table;
	private String sql = "select id,name,power from admin";

	// End of variables declaration//GEN-END:variables
	@Override
	// 点击表格会出现相应信息
	public void mouseClicked(MouseEvent e) {
		int r = jTable1.rowAtPoint(e.getPoint());
		jTable1.setRowSelectionInterval(r, r);
		int row = jTable1.getSelectedRow();
		int id = Integer.parseInt(table.getValueAt(row, 0).toString());
		AdminModel model = new AdminModel();
		Admin admin = model.queryOne(id);
		adminid.setText(admin.getId() + "");
		name.setText(admin.getName());
		power.setSelectedItem(admin.getPower());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}