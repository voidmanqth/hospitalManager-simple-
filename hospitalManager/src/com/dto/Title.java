package com.dto;

import java.util.Vector;

public class Title {
	
	public static Vector drugtitle(){
		String[] names = { "ҩ������", "ҩ������", "ҩ���۸�", "����", "��ע"};
		Vector title = new Vector();
		title.add(names[0]);
		title.add(names[1]);
		title.add(names[2]);
		title.add(names[3]);
		title.add(names[4]);
		return title;
	}
	
	public static Vector employertitle(){
		String[] names = { "Ա����", "����", "����", "�Ա�", "���֤��","����","����","����",
				"����","����״��","����״��","����ʱ��","��ͥסַ","�绰"};
		Vector title = new Vector();
		title.add(names[0]);
		title.add(names[1]);
		title.add(names[2]);
		title.add(names[3]);
		title.add(names[4]);
		title.add(names[5]);
		title.add(names[6]);
		title.add(names[7]);
		title.add(names[8]);
		title.add(names[9]);
		title.add(names[10]);
		title.add(names[11]);
		title.add(names[12]);
		title.add(names[13]);
		return title;
	}
	public static Vector patienttitle(){
		String[] names = { "������", "����", "�Ա�", "����ҽ��", "��������","��Ժʱ��","����","����","֢״"};
		Vector title = new Vector();
		title.add(names[0]);
		title.add(names[1]);
		title.add(names[2]);
		title.add(names[3]);
		title.add(names[4]);
		title.add(names[5]);
		title.add(names[6]);
		title.add(names[7]);
		title.add(names[8]);
		return title;
	}	
	
	public static Vector salarytitle(){
		String[] names = { "Ա����", "����", "����", "���ʼ���", "���"};
		Vector title = new Vector();
		title.add(names[0]);
		title.add(names[1]);
		title.add(names[2]);
		title.add(names[3]);
		title.add(names[4]);
		return title;
	}
	public static Vector bedtitle(){
		String[] names = { "������", "������", "���˲�����", "��������", "����","����ҽ��","״��","��Ժʱ��"};
		Vector title = new Vector();
		title.add(names[0]);
		title.add(names[1]);
		title.add(names[2]);
		title.add(names[3]);
		title.add(names[4]);
		title.add(names[5]);
		title.add(names[6]);
		title.add(names[7]);
		return title;
	}
	
	public static Vector admintitle(){
		String[] names = { "���", "�û���", "Ȩ��"};
		Vector title = new Vector();
		title.add(names[0]);
		title.add(names[1]);
		title.add(names[2]);
		return title;
	}
}
