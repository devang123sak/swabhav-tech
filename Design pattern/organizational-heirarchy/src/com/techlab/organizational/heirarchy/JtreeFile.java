package com.techlab.organizational.heirarchy;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JtreeFile {
	
	public class XmlToJTreeMain extends JFrame {
		private JPanel jContentPane = null;
		JPanel panel;
		
		private JPanel getJContentPane() {
		      if (jContentPane == null) {
		            jContentPane = new JPanel();
		            jContentPane.setLayout(null);

		                        SaxParser sp = new SaxParser(""Employee-Database/NewFile.xml");
		                        JTree jt = new JTree(ObjectModelToTreeModel.getTreeOfModel(sp.getBookL()));
		                        JScrollPane jp = new JScrollPane(jt);
		                        jp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		                        jp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		                        jp.setBounds(2, 4, 500, 300);
		                        panel.add(jp);
		                        panel.revalidate();
		                        panel.repaint();
		           
		            

		      }
		      return jContentPane;
		}
		
		public XmlToJTreeMain() {
		      super();
		      setSize(441, 350);
		      setContentPane(getJContentPane());
		      setTitle("JFrame");
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setVisible(true);
		}

	
}
}
