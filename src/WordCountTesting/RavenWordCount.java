package WordCountTesting;

import java.net.*;
import java.sql.*;
import java.util.*;

import javax.swing.*;

import java.awt.BorderLayout;
import java.io.*;

	public class RavenWordCount {

	public static void main(String[] args) throws Exception {
		
		 //Creating the Frame
        JFrame frame = new JFrame("RavenWordCount");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("PoemWordCount");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
        
{ 

getConnection();
	}
	
	try{
        Socket socket=new Socket("localhost",8080);
        
        DataInputStream inputStream=new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
	}catch(Exception e){
        System.out.println(e);
	{

	String Word;  

	URL poem = new URL("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm");
	BufferedReader in = new BufferedReader(new InputStreamReader(poem.openStream()));

	Map<String,Integer> map = new HashMap<String, Integer>(); 

	while ((Word = in.readLine()) != null) 

	{
	   String[] words = Word.split("[\\s.;,<>/?:!()\"]+");
	   for (String word : words) {
	   word = word.trim();
	   if (word.length() > 0) {
	   if (map.containsKey(word)) {
	   map.put(word, map.get(word) + 1);
	   } else {
	   map.put(word, (int) 1L);
	   }
	   }
	   }
	   }

	// retrieving the map contents
	Set<Map.Entry<String, Integer>> set = map.entrySet();
	// make an array list
	    var sortedList = new ArrayList<Map.Entry<String, Integer>>(set);
	// sorting the array list
	Collections.sort( sortedList, new Comparator<Map.Entry<String, Integer>>() 
	{
	public int compare( Map.Entry<String, Integer> a, Map.Entry<String, Integer> b)
	{
	// order
	return (b.getValue()).compareTo( a.getValue() );
	}
	} );
	// printing the list
	for(int i = 0; i < 10 && i < sortedList.size(); i++){
	System.out.println(sortedList.get(i));
	   }
	   in.close();
	   }
	}
	}
	public static Connection getConnection() throws Exception{
		try {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/wordoccurrences";
			String username="root";
			String password="MyPassword1234";
			Class.forName(driver);
			
			Connection conn=DriverManager.getConnection(url, username, password);
			System.out.println("Connection successfull");
			
			Statement statement = conn.createStatement();
			
			statement.addBatch("insert into wordoccurrences.word (word) values ('the')");
			 
		    statement.addBatch("insert into wordoccurrences.word (word) values ('this')");
		 
		    statement.addBatch("insert into wordoccurrences.word (word) values ('a')");
			

			int[] rowsAffected    = statement.executeBatch();
			return conn;
		}
		
		catch(Exception e) {System.out.println (e);}
	return null;	
	}
	
	
	public int countAnd(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compare(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}