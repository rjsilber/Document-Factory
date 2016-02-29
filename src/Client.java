import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.robynsilber.document.Document;
import com.robynsilber.documentfactory.DocumentFactory;


public class Client {

	public static void main(String[] args) {
		
		BuildGUI gui = BuildGUI.getSingleGUI();
		
		gui.txtBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				newDocFactory(0);
			}
		});
        
		gui.csvBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				newDocFactory(1);
			}
		});
		
		gui.xmlBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				newDocFactory(2);
			}
		});
	}
	
	
	public static void newDocFactory(int docInstance){
		
		Date d = new Date();
		TimeToPathnameString dateAndTimeObj = new TimeToPathnameString();
		String dateAndTime = dateAndTimeObj.getCalendarString(d.toString());

		DocumentFactory factoryObj = new DocumentFactory();
		Document doc = factoryObj.manufactureDocument(docInstance, dateAndTime);

		System.out.println("File: " + doc.getFile().getName());
	}

}
