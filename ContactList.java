
import java.util.*;
import java.io.*;
import java.text.*;

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

// Main class
class ContactList {

	static void sum(String v) throws MyException {
		if (v.length() > 100) {
			throw new MyException(v);
		}

	}

	public static void main(String[] args) throws IOException, ParseException {

		int i = 1, j, switchme, m = 0;
		String check = null;
		;
		int k;

		Scanner scanme = new Scanner(System.in);
		ArrayList<Relatives> relatives = new ArrayList<Relatives>();
		ArrayList<Personal> personal = new ArrayList<Personal>();
		ArrayList<Professional> professional = new ArrayList<Professional>();
		ArrayList<Casual> casual = new ArrayList<Casual>();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM");
		Date somedate = new Date();
		String date = null;
		int e, q;
		String p = null;
		System.out.println("Enter 1 to access previous data");
		System.out.println("Else Enter 2 ");
		int t = scanme.nextInt();
		File file = new File("input1.txt");
		//////////////////////////////////////////////////////////////////////////////////////////
		// SCANNING OLD DATA
		if (t == 1) {

			FileReader freader = new FileReader(file.getAbsoluteFile());

			@SuppressWarnings("resource")
			Scanner scanme1 = new Scanner(freader);

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

				pecheck.setPename(scanme.nextLine());

				pecheck.setPemobile(scanme.nextLine());

				pecheck.setPeemail(scanme.nextLine());

				date = scanme.nextLine();
				somedate = format.parse(date);
				pecheck.setAdate(somedate);

				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}

				pecheck.setSpevents(p);

				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				pecheck.setContext(p);

				personal.add(pecheck);
			}
			e = Integer.parseInt(scanme1.nextLine());
			for (q = 0; q < e; q++) {
				Professional prcheck = new Professional();

				prcheck.setPrname(scanme.nextLine());

				prcheck.setPrmobile(scanme.nextLine());

				prcheck.setPremail(scanme.nextLine());

				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				prcheck.setProinterests(p);

				professional.add(prcheck);
			}
			e = Integer.parseInt(scanme1.nextLine());
			for (q = 0; q < e; q++) {
				Casual ccheck = new Casual();

				ccheck.setCname(scanme.nextLine());

				ccheck.setCmobile(scanme.nextLine());

				ccheck.setCemail(scanme.nextLine());

				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				ccheck.setWhenwhere(p);

				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				ccheck.setCircums(p);

				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				ccheck.setUsefulinfo(p);

				casual.add(ccheck);
			}

		}

		FileWriter fwriter = new FileWriter(file.getAbsoluteFile());

		BufferedWriter bwriter = new BufferedWriter(fwriter);
		///////////////////////////////////////////////////////////////////////////////////////////////////
		// WHILE STATEMENT
		while (i == 1) {
			System.out.println("Select an option:");
			System.out.println("Enter 1  to add relatives............................. ");
			System.out.println("Enter 2  to add personal acquaintances................ ");
			System.out.println("Enter 3  to add professional acquaintances............ ");
			System.out.println("Enter 4  to add casual aquaintances................... ");
			System.out.println("Enter 5  to delete relatives.......................... ");
			System.out.println("Enter 6  to delete personal acquaintances............. ");
			System.out.println("Enter 7  to delete professional acquaintances......... ");
			System.out.println("Enter 8  to delete casual aquaintances................ ");
			System.out.println("Enter 9  to display entire list of acquaintances...... ");
			System.out.println("Enter 10 to display specific category of acquaintances ");
			System.out.println("Enter 11 to search given name from acquaintance list..");
			System.out.println("Enter 12 to do nothing................................");
			System.out.println("Enter 13 to exit and use old data..................... ");

			switchme = scanme.nextInt();
			scanme.nextLine();

			///////////////////////////////////////////////////////////////////////////////////////////////////
			// SWITCH STATEMENT START
			switch (switchme) {
			case 1: {
				System.out.println("Give the details of the relatives");
				Relatives rcheck = new Relatives();

				System.out.println("Name:");
				rcheck.setRname(scanme.nextLine());

				System.out.println("Mobile:");
				rcheck.setRmobile(scanme.nextLine());

				System.out.println("Email:");
				rcheck.setRemail(scanme.nextLine());

				System.out.println("Birthday Day in [dd/mm] format:");
				date = scanme.nextLine();
				somedate = format1.parse(date);
				rcheck.setBdate(somedate);

				System.out.println("Last Meeting Date in [dd/mm/yyyy] format:");
				date = scanme.nextLine();
				somedate = format.parse(date);
				rcheck.setLdate(somedate);

				relatives.add(rcheck);
				break;
			}

			case 2: {
				System.out.println("Give the details of the personal acquaintances");
				Personal pecheck = new Personal();

				System.out.println("Name:");
				pecheck.setPename(scanme.nextLine());

				System.out.println("Mobile:");
				pecheck.setPemobile(scanme.nextLine());

				System.out.println("Email:");
				pecheck.setPeemail(scanme.nextLine());

				System.out.println("Acquaintance Date:");
				date = scanme.nextLine();
				somedate = format.parse(date);
				pecheck.setAdate(somedate);

				System.out.println("Specific Events:''With in 100 char' ");
				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}

				pecheck.setSpevents(p);

				System.out.println("Context:'With in 100 char'");
				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				pecheck.setContext(p);

				personal.add(pecheck);

				break;
			}

			case 3: {
				System.out.println("Give the details of the Professional acquaintances");
				Professional prcheck = new Professional();

				System.out.println("Name:");
				prcheck.setPrname(scanme.nextLine());

				System.out.println("Mobile:");
				prcheck.setPrmobile(scanme.nextLine());

				System.out.println("Email:");
				prcheck.setPremail(scanme.nextLine());

				System.out.println("Professional interests:'With in 100 char' ");
				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				prcheck.setProinterests(p);

				professional.add(prcheck);

				break;
			}

			case 4: {
				System.out.println("Give the details of the Casual acquaintances");
				Casual ccheck = new Casual();

				System.out.println("Name:");
				ccheck.setCname(scanme.nextLine());

				System.out.println("Mobile:");
				ccheck.setCmobile(scanme.nextLine());

				System.out.println("Email:");
				ccheck.setCemail(scanme.nextLine());

				System.out.println("When and where you met:'With in 100 char' ");
				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				ccheck.setWhenwhere(p);

				System.out.println("Circumstances of meeting:'With in 100 char'");
				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				ccheck.setCircums(p);

				System.out.println("Usefulinfo :'With in 100 char'");
				// Limiting to 100 char max
				try {
					p = scanme.nextLine();
					sum(p);
				} catch (MyException me) {
					System.out.println(me);
				}
				ccheck.setUsefulinfo(p);

				casual.add(ccheck);

				break;
			}

			case 5: {
				System.out.println("Give the name of the relative to be deleted");
				check = scanme.nextLine();
				for (k = 0; k < relatives.size(); k++) {
					if (relatives.get(k).getRname().compareTo(check) == 0) {
						relatives.remove(relatives.get(k));

					}
				}
				break;
			}

			case 6: {
				System.out.println("Give the name of the personal acquaintance to be deleted");
				check = scanme.nextLine();
				for (k = 0; k < personal.size(); k++) {
					if (personal.get(k).getPename().compareTo(check) == 0) {
						personal.remove(personal.get(k));

					}
				}
				break;
			}

			case 7: {
				System.out.println("Give the name of the proffesional acquaintance to be deleted");
				check = scanme.nextLine();
				for (k = 0; k < professional.size(); k++) {
					if (professional.get(k).getPrname().compareTo(check) == 0) {
						professional.remove(professional.get(k));

					}
				}
				break;
			}

			case 8: {
				System.out.println("Give the name of the casual acquaintance to be deleted");
				check = scanme.nextLine();
				for (k = 0; k < casual.size(); k++) {
					if (casual.get(k).getCname().compareTo(check) == 0) {
						casual.remove(casual.get(k));

					}
				}
				break;
			}

			case 9: {

				System.out.println("RELATIVES:");
				for (k = 0; k < relatives.size(); k++) {
					System.out.println("relative" + k + 1 + ":");
					System.out.println("Name:" + relatives.get(k).getRname());
					System.out.println("Mobile:" + relatives.get(k).getRmobile());
					System.out.println("email:" + relatives.get(k).getRemail());
					System.out.println("bdate:" + relatives.get(k).getBdate());
					System.out.println("last date:" + relatives.get(k).getLdate());
				}

				System.out.println("PERSONAL:");
				for (k = 0; k < personal.size(); k++) {
					System.out.println("personal relative" + k + 1 + ":");
					System.out.println("Name:" + personal.get(k).getPename());
					System.out.println("Mobile:" + personal.get(k).getPemobile());
					System.out.println("email:" + personal.get(k).getPeemail());
					System.out.println("context:" + personal.get(k).getContext());
					System.out.println("acquaintance date:" + personal.get(k).getAdate());
					System.out.println("sp events:" + personal.get(k).getSpevents());
				}

				System.out.println("PROFESSSIONAL:");
				for (k = 0; k < professional.size(); k++) {
					System.out.println("professional relative" + k + 1 + ":");
					System.out.println("Name:" + professional.get(k).getPrname());
					System.out.println("Mobile:" + professional.get(k).getPrmobile());
					System.out.println("Email:" + professional.get(k).getPremail());
					System.out.println("Interests:" + professional.get(k).getProinterests());
				}

				System.out.println("CASUAL:");
				for (k = 0; k < casual.size(); k++) {
					System.out.println("casual relative" + k + 1 + ":");
					System.out.println("Name:" + casual.get(k).getCname());
					System.out.println("mobile:" + casual.get(k).getCmobile());
					System.out.println("email:" + casual.get(k).getCemail());
					System.out.println("when where:" + casual.get(k).getWhenwhere());
					System.out.println("circumstances:" + casual.get(k).getCircums());
					System.out.println("Useful info:" + casual.get(k).getUsefulinfo());
				}

				break;

			}

			case 10: {
				System.out.println("Enter a choice ");
				System.out.println("Enter 1 to display Relatives");
				System.out.println("Enter 2 to display Personal acquaintances");
				System.out.println("Enter 3 to display Professional acquaintances");
				System.out.println("Enter 4 to display Casual acquaintances");
				j = scanme.nextInt();
				scanme.nextLine();
				if (j == 1) {
					System.out.println("RELATIVES:");
					for (k = 0; k < relatives.size(); k++) {
						System.out.println("relative" + k + 1 + ":");
						System.out.println("Name:" + relatives.get(k).getRname());
						System.out.println("Mobile:" + relatives.get(k).getRmobile());
						System.out.println("email:" + relatives.get(k).getRemail());
						System.out.println("bdate:" + relatives.get(k).getBdate());
						System.out.println("last date:" + relatives.get(k).getLdate());
					}

				} else if (j == 2) {
					System.out.println("PERSONAL:");
					for (k = 0; k < personal.size(); k++) {
						System.out.println("personal relative" + k + 1 + ":");

						System.out.println("Name:" + personal.get(k).getPename());
						System.out.println("Mobile:" + personal.get(k).getPemobile());
						System.out.println("email:" + personal.get(k).getPeemail());
						System.out.println("context:" + personal.get(k).getContext());
						System.out.println("acquaintance date:" + personal.get(k).getAdate());
						System.out.println("sp events:" + personal.get(k).getSpevents());
					}
				} else if (j == 3) {
					System.out.println("PROFESSSIONAL:");
					for (k = 0; k < professional.size(); k++) {
						System.out.println("professional relative" + k + 1 + ":");
						System.out.println("Name:" + professional.get(k).getPrname());
						System.out.println("Mobile:" + professional.get(k).getPrmobile());
						System.out.println("Email:" + professional.get(k).getPremail());
						System.out.println("Interests:" + professional.get(k).getProinterests());
					}
				} else if (j == 4) {
					System.out.println("CASUAL:");
					for (k = 0; k < casual.size(); k++) {
						System.out.println("casual relative" + k + 1 + ":");
						System.out.println("Name:" + casual.get(k).getCname());
						System.out.println("mobile:" + casual.get(k).getCmobile());
						System.out.println("email:" + casual.get(k).getCemail());
						System.out.println("when where:" + casual.get(k).getWhenwhere());
						System.out.println("circumstances:" + casual.get(k).getCircums());
						System.out.println("Useful info:" + casual.get(k).getUsefulinfo());
					}
				}

				break;
			}

			case 11: {
				System.out.println("Give the name to be searched");
				check = scanme.nextLine();
				for (k = 0; k < relatives.size(); k++) {
					if (relatives.get(k).getRname().compareTo(check) == 0) {
						System.out.println("The Given name is found in relatives and the details of it are : ");
						System.out.println("relative" + k + 1 + ":");
						System.out.println("relative" + k + 1 + ":");
						System.out.println("Name:" + relatives.get(k).getRname());
						System.out.println("Mobile:" + relatives.get(k).getRmobile());
						System.out.println("email:" + relatives.get(k).getRemail());
						System.out.println("bdate:" + relatives.get(k).getBdate());
						System.out.println("last date:" + relatives.get(k).getLdate());
					}
				}

				for (k = 0; k < personal.size(); k++) {
					if (personal.get(k).getPename().compareTo(check) == 0) {
						System.out.println(
								"The Given name is found in personal acquaintances and the details of it are : ");
						System.out.println("personal relative" + k + 1 + ":");
						System.out.println("Name:" + personal.get(k).getPename());
						System.out.println("Mobile:" + personal.get(k).getPemobile());
						System.out.println("email:" + personal.get(k).getPeemail());
						System.out.println("context:" + personal.get(k).getContext());
						System.out.println("acquaintance date:" + personal.get(k).getAdate());
						System.out.println("sp events:" + personal.get(k).getSpevents());
					}
				}

				for (k = 0; k < professional.size(); k++) {
					if (professional.get(k).getPrname().compareTo(check) == 0) {
						System.out.println(
								"The Given name is found in professional acquaintances and the details of it are : ");
						System.out.println("professional relative" + k + 1 + ":");
						System.out.println("Name:" + professional.get(k).getPrname());
						System.out.println("Mobile:" + professional.get(k).getPrmobile());
						System.out.println("Email:" + professional.get(k).getPremail());
						System.out.println("Interests:" + professional.get(k).getProinterests());
					}
				}

				for (k = 0; k < casual.size(); k++) {
					if (casual.get(k).getCname().compareTo(check) == 0) {
						System.out.println(
								"The Given name is found in casual acquaintances and the details of it are : ");
						System.out.println("casual relative" + k + 1 + ":");
						System.out.println("Name:" + casual.get(k).getCname());
						System.out.println("mobile:" + casual.get(k).getCmobile());
						System.out.println("email:" + casual.get(k).getCemail());
						System.out.println("when where:" + casual.get(k).getWhenwhere());
						System.out.println("circumstances:" + casual.get(k).getCircums());
						System.out.println("Useful info:" + casual.get(k).getUsefulinfo());
					}
				}

				break;

			}

			case 12: {
				break;
			}

			case 13: {
				m = 1;
				break;
			}

			default: {
				System.out.println("Wrong entering of number!!!Enter again  ");
				break;
			}

			}

			if (m == 1) {
				System.out.println("Breaking from while loop too.....");
				break;
			}

		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		// WRITING A FILE
		bwriter = new BufferedWriter(fwriter);
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
		scanme.close();
		bwriter.close();

	}

}
