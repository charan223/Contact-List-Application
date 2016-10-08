import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import javax.swing.JPanel;
import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Relatives class
class Relatives {
	private String rname = null;
	private String rmobile = null;
	private String remail = null;
	private Date bdate = null;
	private Date ldate = null;
	public String temp;

	public String getRname() {
		temp = rname;
		return temp;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRmobile() {
		temp = rmobile;
		return temp;
	}

	public void setRmobile(String rmobile) {
		this.rmobile = rmobile;
	}

	public String getRemail() {
		temp = remail;
		return temp;
	}

	public void setRemail(String remail) {
		this.remail = remail;
	}

	public Date getBdate() {
		Date temp2 = bdate;
		return temp2;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public Date getLdate() {
		Date temp3 = ldate;
		return temp3;
	}

	public void setLdate(Date somedate) {
		this.ldate = somedate;
	}
}

// Personal class
class Personal {

	private String pename = null;
	private String pemobile = null;
	private String peemail = null;
	private String context = null;
	private Date adate = null;
	private String spevents = null;
	public String temp = null;

	public String getPename() {
		temp = pename;
		return temp;
	}

	public void setPename(String pename) {
		this.pename = pename;
	}

	public String getPemobile() {
		temp = pemobile;
		return temp;
	}

	public void setPemobile(String pemobile) {
		this.pemobile = pemobile;
	}

	public String getPeemail() {
		temp = peemail;
		return temp;
	}

	public void setPeemail(String peemail) {
		this.peemail = peemail;
	}

	public Date getAdate() {
		Date temp2 = adate;
		return temp2;
	}

	public void setAdate(Date somedate) {
		this.adate = somedate;
	}

	public String getSpevents() {
		temp = spevents;
		return temp;
	}

	public void setSpevents(String spevents) {
		this.spevents = spevents;
	}

	public String getContext() {
		temp = context;
		return temp;
	}

	public void setContext(String context) {
		this.context = context;
	}
}

// Professional class
class Professional {

	private String prname = null;
	private String prmobile = null;
	private String premail = null;
	private String prointerests = null;
	public String temp;

	public String getPrname() {
		temp = prname;
		return temp;
	}

	public void setPrname(String prname) {
		this.prname = prname;
	}

	public String getPrmobile() {
		temp = prmobile;
		return temp;
	}

	public void setPrmobile(String prmobile) {
		this.prmobile = prmobile;
	}

	public String getPremail() {
		temp = premail;
		return temp;
	}

	public void setPremail(String premail) {
		this.premail = premail;
	}

	public String getProinterests() {
		temp = prointerests;
		return temp;
	}

	public void setProinterests(String prointerests) {
		this.prointerests = prointerests;
	}
}

// Casual class
class Casual {

	private String cname = null;
	private String cmobile = null;
	private String cemail = null;
	private String whenwhere = null;
	private String circums = null;
	private String usefulinfo = null;
	public String temp;

	public String getCname() {
		temp = cname;
		return temp;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCmobile() {
		temp = cmobile;
		return temp;
	}

	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}

	public String getCemail() {
		temp = cemail;
		return temp;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getWhenwhere() {
		temp = whenwhere;
		return temp;
	}

	public void setWhenwhere(String whenwhere) {
		this.whenwhere = whenwhere;
	}

	public String getCircums() {
		temp = circums;
		return temp;
	}

	public void setCircums(String circums) {
		this.circums = circums;
	}

	public String getUsefulinfo() {
		temp = usefulinfo;
		return temp;
	}

	public void setUsefulinfo(String usefulinfo) {
		this.usefulinfo = usefulinfo;
	}
}

@SuppressWarnings("serial")
public class sssfile extends JApplet {

	// private JFrame frame=new JFrame();
	private final JPanel Data = new JPanel();
	private final JPanel Parts = new JPanel();

	/**
	 * Launch the application.
	 */
	class MyException extends Exception {
		private String ex;

		MyException(String v) {
			setEx(v);
		}

		public String toString() {
			System.out.println("Length of string is more than 100 char...Runtime error");
			Runtime.getRuntime().exit(0);
			return ("null");

		}

		public String getEx() {
			return ex;
		}

		public void setEx(String ex) {
			this.ex = ex;
		}
	}

	int i = 1, j, switchme, m = 0;
	String check = null;
	int q, e;
	int k;
	ArrayList<Relatives> relatives = new ArrayList<Relatives>();
	ArrayList<Personal> personal = new ArrayList<Personal>();
	ArrayList<Professional> professional = new ArrayList<Professional>();
	ArrayList<Casual> casual = new ArrayList<Casual>();

	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat format1 = new SimpleDateFormat("dd/MM");
	Date somedate = new Date();
	String date = null;

	String p = null;

	private boolean sum(String v) throws MyException {
		if (v.length() < 100)
			return true;
		return false;
	}

	File file = new File("input1.txt");

	Scanner scanme1;
	ActionListener readmefilelistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			Data.setVisible(false);
			Parts.setVisible(false);

			try {
				FileReader freader = new FileReader(file.getAbsoluteFile());
				scanme1 = new Scanner(freader);

				e = Integer.parseInt(scanme1.nextLine());

				for (q = 0; q < e; q++) {
					Relatives rcheck = new Relatives();

					rcheck.setRname(scanme1.nextLine());

					rcheck.setRmobile(scanme1.nextLine());

					rcheck.setRemail(scanme1.nextLine());

					date = scanme1.nextLine();

					somedate = format1.parse(date);
					rcheck.setBdate(somedate);

					date = scanme1.nextLine();
					somedate = format.parse(date);
					rcheck.setLdate(somedate);

					relatives.add(rcheck);
				}
				e = Integer.parseInt(scanme1.nextLine());
				for (q = 0; q < e; q++) {
					Personal pecheck = new Personal();

					pecheck.setPename(scanme1.nextLine());

					pecheck.setPemobile(scanme1.nextLine());

					pecheck.setPeemail(scanme1.nextLine());

					date = scanme1.nextLine();
					somedate = format.parse(date);
					pecheck.setAdate(somedate);

					// Limiting to 100 char max
					try {
						p = scanme1.nextLine();
						sum(p);
					} catch (MyException me) {
						JOptionPane.showMessageDialog(null, "Special events exceeding 100 characters");
					}

					pecheck.setSpevents(p);

					// Limiting to 100 char max
					try {
						p = scanme1.nextLine();
						sum(p);
					} catch (MyException me) {
						JOptionPane.showMessageDialog(null, "context exceeding 100 characters");
					}
					pecheck.setContext(p);

					personal.add(pecheck);
				}
				e = Integer.parseInt(scanme1.nextLine());
				for (q = 0; q < e; q++) {
					Professional prcheck = new Professional();

					prcheck.setPrname(scanme1.nextLine());

					prcheck.setPrmobile(scanme1.nextLine());

					prcheck.setPremail(scanme1.nextLine());

					// Limiting to 100 char max
					try {
						p = scanme1.nextLine();
						sum(p);
					} catch (MyException me) {
						JOptionPane.showMessageDialog(null, "Professional interests exceeding 100 characters");
					}
					prcheck.setProinterests(p);

					professional.add(prcheck);
				}
				e = Integer.parseInt(scanme1.nextLine());
				for (q = 0; q < e; q++) {
					Casual ccheck = new Casual();

					ccheck.setCname(scanme1.nextLine());

					ccheck.setCmobile(scanme1.nextLine());

					ccheck.setCemail(scanme1.nextLine());

					// Limiting to 100 char max
					try {
						p = scanme1.nextLine();
						sum(p);
					} catch (MyException me) {
						JOptionPane.showMessageDialog(null, "when and where exceeding 100 characters");
					}
					ccheck.setWhenwhere(p);

					// Limiting to 100 char max
					try {
						p = scanme1.nextLine();
						sum(p);
					} catch (MyException me) {
						JOptionPane.showMessageDialog(null, "Circumstances exceeding 100 characters");
					}
					ccheck.setCircums(p);

					// Limiting to 100 char max
					try {
						p = scanme1.nextLine();
						sum(p);
					} catch (MyException me) {
						JOptionPane.showMessageDialog(null, "Useful info exceeding 100 characters");

					}
					ccheck.setUsefulinfo(p);

					casual.add(ccheck);

				}
				scanme1.close();
				JOptionPane.showMessageDialog(null, "Data is read");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "File not found ");
			}

			setVisible(true);

			Data.setVisible(false);
			Parts.setVisible(true);

		}

	};

	ActionListener createnewdatalistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Data.setVisible(false);
			Parts.setVisible(true);
			setVisible(true);
		}
	};
	/**
	 * Create the application.
	 */
	String one = "1", two = "2", three = "3", four = "4";

	public sssfile() {

		this.getContentPane().setLayout(new CardLayout(0, 0));

		this.setBounds(100, 100, 651, 543);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.getContentPane().add(Data, BorderLayout.CENTER);

		JButton btnNewButton_1 = new JButton("New Data");
		btnNewButton_1.setBounds(289, 164, 97, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.addActionListener(createnewdatalistener);
			}
		});
		Data.setLayout(null);
		Data.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Old Data");
		btnNewButton_2.setBounds(289, 249, 97, 25);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.addActionListener(readmefilelistener);
			}
		});
		Data.add(btnNewButton_2);

		// JPanel Parts = new JPanel();
		this.getContentPane().add(Parts, BorderLayout.NORTH);
		Parts.setLayout(null);

		JButton btnNewButton_6 = new JButton("Create");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Data.setVisible(false);
				Parts.setVisible(false);

				int j = 1;
				String fn = null;
				while (j > 0) {
					fn = JOptionPane.showInputDialog("Enter your choice 1.Relative 2.Personal 3.Professional 4.Casual");
					if (fn.compareTo(one) == 0) {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);
						Relatives check = new Relatives();
						check.setRname(JOptionPane.showInputDialog("Enter name"));
						check.setRmobile(JOptionPane.showInputDialog("Enter number"));
						check.setRemail(JOptionPane.showInputDialog("Enter email"));
						try {
							check.setBdate(format1.parse(JOptionPane.showInputDialog("Enter birthday")));
						} catch (HeadlessException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							check.setLdate(format.parse(JOptionPane.showInputDialog("Last Date of Meeting")));
						} catch (HeadlessException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						relatives.add(check);
						j = 0;
					} else if (fn.compareTo(two) == 0) {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);
						Personal check = new Personal();
						check.setPename(JOptionPane.showInputDialog("Enter name"));
						check.setPemobile(JOptionPane.showInputDialog("Enter mobile"));
						check.setPeemail(JOptionPane.showInputDialog("Enter email"));
						check.setSpevents(JOptionPane.showInputDialog("Specific events"));
						check.setContext(JOptionPane.showInputDialog("context"));
						try {
							check.setAdate(format.parse(JOptionPane.showInputDialog("Acquaintance date")));
						} catch (HeadlessException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						personal.add(check);
						j = 0;
					} else if (fn.compareTo(three) == 0) {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);
						Professional check = new Professional();
						check.setPrname(JOptionPane.showInputDialog("Enter name"));
						check.setPrmobile(JOptionPane.showInputDialog("Enter number"));
						check.setPremail(JOptionPane.showInputDialog("Enter email"));
						check.setProinterests(JOptionPane.showInputDialog("Profeesional interests"));
						professional.add(check);
						j = 0;
					} else if (fn.compareTo(four) == 0) {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);

						Casual check = new Casual();
						check.setCname(JOptionPane.showInputDialog("Enter name"));
						check.setCmobile(JOptionPane.showInputDialog("Enter number"));
						check.setCemail(JOptionPane.showInputDialog("Enter email"));
						check.setWhenwhere(JOptionPane.showInputDialog("Enter when an where details"));
						check.setCircums(JOptionPane.showInputDialog("Enter circumstances "));
						check.setUsefulinfo(JOptionPane.showInputDialog("Enter useful info"));
						casual.add(check);
						j = 0;
					} else {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);
						j = 0;
						JOptionPane.showMessageDialog(null, "Wrong Choice Entered .Enter correct choice");
					}

				}

				Data.setVisible(false);

				Parts.setVisible(true);
				setVisible(true);

			}
		});

		btnNewButton_6.setBounds(225, 142, 97, 25);
		Parts.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Delete");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

				Data.setVisible(false);
				Parts.setVisible(false);
				j = 1;
				int i;
				String fn = JOptionPane.showInputDialog(
						"enter a choice 1) to del relatives,2) to del personal ,3) to del professional ,4) to del casual");
				String fn1 = JOptionPane.showInputDialog("enter a name to delete");
				while (j > 0) {
					if (fn.compareTo(one) == 0) {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);
						for (i = 0; i < relatives.size(); i++) {
							if (relatives.get(i).getRname() == fn1)

							{
								relatives.remove(i);
							}
						}

						j = 0;
					} else if (fn.compareTo(two) == 0) {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);
						for (i = 0; i < personal.size(); i++) {
							if (personal.get(i).getPename() == fn1)

							{
								personal.remove(i);
							}
						}

						j = 0;
					} else if (fn.compareTo(three) == 0) {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);
						for (i = 0; i < professional.size(); i++) {
							if (professional.get(i).getPrname() == fn1)

							{
								professional.remove(i);
							}
						}

						j = 0;
					} else if (fn.compareTo(four) == 0) {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);
						for (i = 0; i < casual.size(); i++) {
							if (casual.get(i).getCname() == fn1)

							{
								casual.remove(i);
							}
						}

						j = 0;
					} else {
						setVisible(false);

						Parts.setVisible(false);
						Data.setVisible(false);

						JOptionPane.showMessageDialog(null, "Wrong Choice Entered .Enter correct choice");
					}

				}
				setVisible(false);

				Parts.setVisible(true);
				Data.setVisible(true);

			}
		});
		btnNewButton_7.setBounds(225, 208, 97, 25);
		Parts.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("Display");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

				Data.setVisible(false);
				Parts.setVisible(false);
				j = 1;
				String output = null;
				String name = null;
				String mobile = null;
				String email = null;
				Date date11 = null;
				Date date22 = null;
				String context = null;
				String specialevents = null;
				String hjk;

				String fn = JOptionPane.showInputDialog(
						"enter a choice 1) to display relatives,2) to display personal ,3) to display professional ,4) to display casual");
				while (j > 0) {
					if (fn.compareTo(one) == 0) {
						setVisible(true);

						Parts.setVisible(false);
						Data.setVisible(false);
						for (i = 0; i < relatives.size(); i++) {
							name = relatives.get(i).getRname();
							mobile = relatives.get(i).getRmobile();
							email = relatives.get(i).getRemail();
							date11 = relatives.get(i).getBdate();
							date22 = relatives.get(i).getLdate();
							output = name + "\n" + mobile + "\n" + email + "\n" + date11 + "\n" + date22 + "\n";
						}
						JOptionPane.showMessageDialog(null, output);
						j = 0;
					} else if (fn.compareTo(two) == 0) {
						setVisible(true);

						Parts.setVisible(false);
						Data.setVisible(false);
						for (i = 0; i < personal.size(); i++) {
							name = personal.get(i).getPename();
							mobile = personal.get(i).getPemobile();
							email = personal.get(i).getPeemail();
							context = personal.get(i).getContext();
							date22 = personal.get(i).getAdate();
							specialevents = personal.get(i).getSpevents();
							output = name + "\n" + mobile + "\n" + email + "\n" + context + "\n" + date22 + "\n"
									+ specialevents + "\n";
						}
						JOptionPane.showMessageDialog(null, output);
						j = 0;
					} else if (fn.compareTo(three) == 0) {
						setVisible(true);

						Parts.setVisible(false);
						Data.setVisible(false);
						for (i = 0; i < professional.size(); i++) {
							name = professional.get(i).getPrname();
							mobile = professional.get(i).getPrmobile();
							email = professional.get(i).getPremail();
							context = professional.get(i).getProinterests();

							output = name + "\n" + mobile + "\n" + email + "\n" + context + "\n";
						}
						JOptionPane.showMessageDialog(null, output);
						j = 0;
					} else if (fn.compareTo(four) == 0) {
						setVisible(true);

						Parts.setVisible(false);
						Data.setVisible(false);
						for (i = 0; i < casual.size(); i++) {
							name = casual.get(i).getCname();
							mobile = casual.get(i).getCmobile();
							email = casual.get(i).getCemail();
							context = casual.get(i).getCircums();
							specialevents = casual.get(i).getUsefulinfo();
							hjk = casual.get(i).getWhenwhere();

							output = name + "\n" + mobile + "\n" + email + "\n" + context + "\n" + specialevents + "\n"
									+ hjk + "\n";
						}
						JOptionPane.showMessageDialog(null, output);
						j = 0;
					} else {
						JOptionPane.showMessageDialog(null, "Enter correct choice");
						j = 0;
					}
				}
				setVisible(true);

				Parts.setVisible(true);
				Data.setVisible(false);
			}
		});
		btnNewButton_8.setBounds(225, 267, 97, 25);
		Parts.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("Search");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String output = null;
				String name = null;
				String mobile = null;
				String email = null;
				Date date11 = null;
				Date date22 = null;
				String context = null;
				String specialevents = null;
				String hjk;

				String fn1 = JOptionPane.showInputDialog("enter a name to search");
				setVisible(true);

				Parts.setVisible(false);
				Data.setVisible(false);

				for (i = 0; i < relatives.size(); i++) {
					if (relatives.get(i).getRname().equals(fn1) == true) {
						name = relatives.get(i).getRname();
						mobile = relatives.get(i).getRmobile();
						email = relatives.get(i).getRemail();
						date11 = relatives.get(i).getBdate();
						date22 = relatives.get(i).getLdate();
						output = name + "\n" + mobile + "\n" + email + "\n" + date11 + "\n" + date22 + "\n";
						JOptionPane.showMessageDialog(null, output);
					}
				}

				setVisible(true);

				Parts.setVisible(false);
				Data.setVisible(false);
				for (i = 0; i < personal.size(); i++) {
					if (personal.get(i).getPename().equals(fn1) == true) {
						name = personal.get(i).getPename();
						mobile = personal.get(i).getPemobile();
						email = personal.get(i).getPeemail();
						context = personal.get(i).getContext();
						date22 = personal.get(i).getAdate();
						specialevents = personal.get(i).getSpevents();
						output = name + "\n" + mobile + "\n" + email + "\n" + context + "\n" + date22 + "\n"
								+ specialevents + "\n";
						JOptionPane.showMessageDialog(null, output);
					}
				}

				setVisible(true);

				Parts.setVisible(false);
				Data.setVisible(false);
				for (i = 0; i < professional.size(); i++) {
					if (professional.get(i).getPrname().equals(fn1) == true) {
						name = professional.get(i).getPrname();
						mobile = professional.get(i).getPrmobile();
						email = professional.get(i).getPremail();
						context = professional.get(i).getProinterests();

						output = name + "\n" + mobile + "\n" + email + "\n" + context + "\n";
						JOptionPane.showMessageDialog(null, output);
					}
				}

				setVisible(true);

				Parts.setVisible(false);
				Data.setVisible(false);
				for (i = 0; i < casual.size(); i++) {
					if (casual.get(i).getCname().equals(fn1) == true) {

						name = casual.get(i).getCname();
						mobile = casual.get(i).getCmobile();
						email = casual.get(i).getCemail();
						context = casual.get(i).getCircums();
						specialevents = casual.get(i).getUsefulinfo();
						hjk = casual.get(i).getWhenwhere();

						output = name + "\n" + mobile + "\n" + email + "\n" + context + "\n" + date22 + "\n"
								+ specialevents + "\n" + hjk + "\n";
						JOptionPane.showMessageDialog(null, output);
					}
				}

				setVisible(true);

				Parts.setVisible(true);
				Data.setVisible(false);

			}
		});
		btnNewButton_9.setBounds(225, 331, 97, 25);
		Parts.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("Exit");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);

				Parts.setVisible(false);
				Data.setVisible(false);
				
				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException pe) {
						// TODO Auto-generated catch block
						pe.printStackTrace();
					}
				}
				FileWriter fwriter = null;
				try {
					fwriter = new FileWriter(file.getAbsoluteFile());
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {

					BufferedWriter bwriter = new BufferedWriter(fwriter);

					// bwriter.newLine();
					bwriter.write(Integer.toString(relatives.size()));
					bwriter.newLine();
					for (i = 0; i < relatives.size(); i++) {
						bwriter.write(relatives.get(i).getRname());
						bwriter.newLine();

						bwriter.write(relatives.get(i).getRmobile());
						bwriter.newLine();

						bwriter.write(relatives.get(i).getRemail());
						bwriter.newLine();

						String xoxo = format.format(relatives.get(i).getBdate());
						bwriter.write(xoxo);
						bwriter.newLine();

						xoxo = format.format(relatives.get(i).getLdate());
						bwriter.write(xoxo);
						bwriter.newLine();
					}
					bwriter.write(Integer.toString(personal.size()));
					bwriter.newLine();

					for (i = 0; i < personal.size(); i++) {
						bwriter.write(personal.get(i).getPename());
						bwriter.newLine();

						bwriter.write(personal.get(i).getPemobile());
						bwriter.newLine();

						bwriter.write(personal.get(i).getPeemail());
						bwriter.newLine();

						bwriter.write(personal.get(i).getContext());
						bwriter.newLine();

						String xoxo = format.format(personal.get(i).getAdate());
						bwriter.write(xoxo);
						bwriter.newLine();

						bwriter.write(personal.get(i).getSpevents());
						bwriter.newLine();

					}
					bwriter.write(Integer.toString(professional.size()));
					bwriter.newLine();
					for (i = 0; i < professional.size(); i++) {
						bwriter.write(professional.get(i).getPrname());
						bwriter.newLine();

						bwriter.write(professional.get(i).getPrmobile());
						bwriter.newLine();

						bwriter.write(professional.get(i).getPremail());
						bwriter.newLine();

						bwriter.write(professional.get(i).getProinterests());
						bwriter.newLine();

					}

					bwriter.write(Integer.toString(casual.size()));
					bwriter.newLine();
					for (i = 0; i < casual.size(); i++) {
						bwriter.write(casual.get(i).getCname());
						bwriter.newLine();

						bwriter.write(casual.get(i).getCmobile());
						bwriter.newLine();

						bwriter.write(casual.get(i).getCemail());
						bwriter.newLine();

						bwriter.write(casual.get(i).getWhenwhere());
						bwriter.newLine();

						bwriter.write(casual.get(i).getCircums());
						bwriter.newLine();

						bwriter.write(casual.get(i).getUsefulinfo());
						bwriter.newLine();
					}
					scanme1.close();
					bwriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_10.setBounds(225, 392, 97, 25);
		Parts.add(btnNewButton_10);

		JLabel lblNewLabel_20 = new JLabel("Select an option");
		lblNewLabel_20.setBounds(212, 56, 110, 16);
		Parts.add(lblNewLabel_20);

	}

	/**
	 * Initialize the contents of the frame.
	 */

}