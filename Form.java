package a_AWT;
//-----------------import some Packeg------------------
import java.awt.*;
import java.awt.event.*;

public class All_In_One3 {

	public static void main(String[] args) {

//----------------Frame ---------------------------
		Frame f = new Frame("My Form  Frame");
		
		f.setSize(600,500);
		f.setLayout(null);
		f.setVisible(true);
		

//--------------------Menu_Bar and Menu-------------------------
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("HOME");
		Menu m2 = new Menu("SERVICE");
		Menu m3 = new Menu("CONTACT_US");
		Menu m4 = new Menu("ABOUT_US");
		Menu m5 = new Menu("FACULTY");
		mb.add(m1); mb.add(m2); mb.add(m3); mb.add(m4); mb.add(m5);
		f.setMenuBar(mb);
		
		Menu m6 = new Menu("IT");
		Menu m7 = new Menu("Mgnt");
		m5.add(m6); m5.add(m7);
		
		MenuItem mt1 = new MenuItem("BIM");
		MenuItem mt2 = new MenuItem("BHM");
		m6.add(mt1); m7.add(mt2);
		
//------------------------------Form for Student-----------------------
		
	//-------------------Name Field ---------------------
		Label lbn = new Label("Full Name: ");
		lbn.setBounds(20,70,60,25); 
		TextField tfn = new TextField();
		tfn.setBounds(100,70,150,25);
		f.add(lbn); f.add(tfn);
		
	//---------------------Gender--------------------------
		Label lbg = new Label("Gender: ");
		lbg.setBounds(20,120,60,25); 
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cbg1 = new Checkbox("Male",false,cbg);
		cbg1.setBounds(100,120,50,25);
		Checkbox cbg2 = new Checkbox("FeMale",false,cbg);
		cbg2.setBounds(160,120,60,25);
		Checkbox cbg3 = new Checkbox("Other",false,cbg);
		cbg3.setBounds(235,120,60,25);
		f.add(lbg); f.add(cbg1);f.add(cbg2); f.add(cbg3);
		
	//-------------------Address --------------------------
		Label lba = new Label("Address: ");
		lba.setBounds(20,170,60,25);
		
		Choice ch = new Choice();
		ch.setBounds(100,170,100,25);
		ch.add("Kathmandu"); ch.add("Butwal");
		ch.add("Pokhara"); ch.add("Chitwan"); ch.add("Other");
		f.add(lba); f.add(ch);
		
	//---------------------Gender--------------------------
		Label lbh = new Label("Hobbies: ");
		lbh.setBounds(20,220,60,25); 
		Checkbox cbgh1 = new Checkbox("Coding");
		cbgh1.setBounds(100,220,70,25);
		Checkbox cbgh2 = new Checkbox("Dancing");
		cbgh2.setBounds(170,220,70,25);
		Checkbox cbgh3 = new Checkbox("Singing");
		cbgh3.setBounds(245,220,70,25);
		f.add(lbh); f.add(cbgh1);f.add(cbgh2); f.add(cbgh3);	
	
	//------------------list for year---------------------
		Label lbl = new Label("Year: ");
		lbl.setBounds(20,270,60,25);
		List lst = new List(5,true);
		lst.setBounds(100,270,150,40);
		lst.add("First Year");
		lst.add("Second Year");
		lst.add("Third Year");
		lst.add("Fourth Year");
		f.add(lbl); f.add(lst);
		
	//-------------------------Panel for image------------------	
		Panel pn = new Panel();
		pn.setBounds(370,70,100,120);
		pn.setBackground(Color.cyan);
		Label lbi = new Label("Photo");
		lbi.setBounds(400,190,50,25);
		f.add(pn); f.add(lbi);
		
	//---------------------comment --------------------------
		Label lbta = new Label("Comment: ");
		lbta.setBounds(20,340,60,25);
		TextArea ta = new TextArea();
		ta.setBounds(100,340,200,90);
		f.add(ta); f.add(lbta);
	
	//-------------------submit button -----------------------
		
		Button btn = new Button("Submit");
		 btn.setBounds(350,400,100,30);
		 btn.setBackground(Color.green);
		 f.add(btn);
		 
	//--------------------Action for Button-----------------
		 btn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 
				 //-----------------Dialog Box------------------------
				 Dialog dg = new Dialog(f,"Finally");
				 dg.add(new Label("Are You Sure To Continue?"));
				 Button btd = new Button("Continue");
				 btd.setBackground(Color.yellow);
				 
				 dg.add(btd);
				 dg.setSize(300,150);
				 dg.setLayout(new FlowLayout());
				 dg.setVisible(true);
				 
				
				 dg.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent d) {
							dg.dispose();
						}
					});
				 
				 
				 btd.addActionListener(new ActionListener() {
					 public void actionPerformed(ActionEvent be) {
							dg.dispose();
						}
					});
			 }
		 });
		 
		//-------------------Frame Closing ------------------------
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});		 
		 
		 
	}

}
