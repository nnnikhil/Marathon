package klkl;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.concurrent.Flow;
import javax.swing.*;



import java.util.*;
public class mara {
static node head;
	public static  class node{
		int data;
		int category;
		String name;
		node next;
		public node(int x,int y,String s) {
			data=x;
			category=y;
			name=s;
			next=null;
			
		}
	}
	public static void push(int x,int y,String s) {
		node temp=new node(x,y,s);
		if(head==null) {
			head=temp;
		}
		else{node temp2=head;
		while(temp2.next!=null) {
			temp2=temp2.next;
		}
		temp2.next=temp;
	}
	}
	public static node sorting(node head) {
        if(head==null )
        	{return head;}
        if(head.next==null)
        	{return head;}
        node temp=new node(-1,-1,"h");
        temp.next=head;
        node preof=temp;
        node current=head;
        node Node=null;
        while(current.next!=null){
            Node=current.next;
            
            if(Node.data<preof.next.data){ 
                current.next=Node.next;
                Node.next=preof.next;
                preof.next=Node;
            }
            else if(Node.data>=current.data){
                current=current.next;
            }
            else{
                while(preof!=current && preof.next.data<Node.data){
                    preof=preof.next;
                }
                current.next=Node.next;
                Node.next=preof.next;
                preof.next=Node;
                preof=temp;
            }
        }
        return temp.next;
	}

	public static node opposite(node head) {
	    node previous = null;
	    node current = head;
	    while (current != null) {
	        node remp = current.next;
	        current.next = previous;
	        previous = current;
	        current = remp;
	    }
	    return previous;
	}

	public static String result(node n1) {
		String first_one="";
		String first_two="";
		String first_three="";
		String second_one="";
		String second_two="";
		String second_three="";
		node temp=opposite(n1);
		
		node h1=temp;
		if(h1!=null) {
		if(h1.category==1) {
			System.out.println(h1.name+" 2,80,000");
			first_one=h1.name;
			temp=temp.next;
		}
		else {
		while(h1.next!=null) {
			if(h1.next.category==1) {
				first_one=h1.next.name;
				System.out.println(h1.next.name+" 2,80,000");
				h1.next=h1.next.next;
				break;
			}
			h1=h1.next;
		}
		}
		node h2=temp;
		if(h2.category==2) {
			System.out.println(h2.name+" 1,90,000");
			first_two=h2.name;
			temp=temp.next;
		}
		else{
			while(h2.next!=null) {
		
			if(h2.next.category==2) {
				first_two=h2.next.name;
				System.out.println(h2.next.name+" 1,90,000");
				h2.next=h2.next.next;
				break;
			}
			h2=h2.next;
	}
	}
		node h3=temp;
		if(h3.category==3) {
			first_three=h3.name;
			System.out.println(h3.name+" 1,35,000");
			temp=temp.next;
		}	
		else{
			while(h3.next!=null) {
		
			if(h3.next.category==3) {
				first_three=h3.next.name;
				System.out.println(h3.next.name+" 1,35,000");
				h3.next=h3.next.next;
				break;
			}
	h3=h3.next;
		}
		}
		node h4=temp;
		while(h4!=null) {
			if(h4.category==1) {
				second_one=h4.name;
				System.out.println(h4.name+" 2,80,000");
				
				break;
			}
			h4=h4.next;
		}
		node h5=temp;
		while(h5!=null) {
			if(h5.category==2) {
				second_two=h5.name;
				System.out.println(h5.name+" 1,90,000");
				
				break;
			}
			h5=h5.next;
		}
		node h6=temp;
		while(h6!=null) {
			if(h6.category==3) {
				second_three=h6.name;
				System.out.println(h6.name+" 1,35,000");
				
				break;
			}
			h6=h6.next;
		}
		
		System.out.println("Half Marathon (20 Km)-Ist"+first_one);
		System.out.println("Open 10K Run (10Km)-Ist"+first_two);
		System.out.println("Great Delhi Run (5Km)-Ist"+first_three);
		
		
		System.out.println("Half Marathon (20 Km)-Ist"+second_one);
		System.out.println("Open 10K Run (10Km)-Ist"+second_two);
		System.out.println("Great Delhi Run (5Km)-Ist"+second_three);
		
		return first_one+" "+"2,80,000/-   "+second_one+"  2,10,000/-  "+"   "+"    "+first_two+" "+"1,90,000/-   "+second_two+"  Rs.1,50,00/- "+"   "+first_three+" "+"1,35,000/-  "+second_three+"   Rs.1,15,000/- ";
	}
		else {
			return "Please enter the inputs for runners";
		}
	}
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Winners");
		JPanel p_main=new JPanel();
		p_main.setLayout(new BoxLayout(p_main,BoxLayout.Y_AXIS));
		
		
		JPanel p_name=new JPanel();
		p_name.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel l_name=new JLabel("Name");
		JTextField tf_name=new JTextField();
		tf_name.setPreferredSize(new Dimension(150,50));
		p_name.add(l_name);
		p_name.add(tf_name);
		p_main.add(p_name);
		
		JPanel p_name2=new JPanel();
		p_name2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel l_name2=new JLabel("TIME");
		JTextField tf_name2=new JTextField();
		tf_name2.setPreferredSize(new Dimension(150,50));
		p_name2.add(l_name2);
		p_name2.add(tf_name2);
		p_main.add(p_name2);
		
		JPanel p_name3=new JPanel();
		p_name3.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel l_name3=new JLabel("WINNER");
		JTextField tf_name3=new JTextField();
		tf_name3.setPreferredSize(new Dimension(750,50));
		p_name3.add(l_name3);
		p_name3.add(tf_name3);
		p_main.add(p_name3);
		
ButtonGroup bg_join=new ButtonGroup();
		
		JPanel p_join=new JPanel();
		p_join.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel l_join=new JLabel("Half Marathon (20 Km)-");
		p_join.add(l_join);
		JRadioButton rb_in=new JRadioButton("IN");
		p_join.add(rb_in);
		p_main.add(p_join);
		
		JPanel p_join2=new JPanel();
		p_join2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel l_join2=new JLabel("Open 10K Run (10Km)-");
		p_join2.add(l_join2);
		JRadioButton rb_in2=new JRadioButton("IN");
		p_join2.add(rb_in2);
		p_main.add(p_join2);
		
		
		JPanel p_join3=new JPanel();
		p_join3.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel l_join3=new JLabel("Great Delhi Run (5Km)-");
		p_join3.add(l_join3);
		JRadioButton rb_in3=new JRadioButton("IN");
		p_join3.add(rb_in3);
		p_main.add(p_join3);
		
		
		
		bg_join.add(rb_in);
		bg_join.add(rb_in2);
		bg_join.add(rb_in3);
		
		JPanel p_button=new JPanel();
		p_button.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton b_next=new JButton("next");
		JButton b_print=new JButton("winner");
		JButton b_exit=new JButton("exit");
		p_button.add(b_next);
		p_button.add(b_print);
		p_button.add(b_exit);
		p_main.add(p_button);
		
		b_next.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String n = tf_name.getText();
				int t = Integer.parseInt(tf_name2.getText());
				int m;
				if(rb_in.isSelected()==true) {
					 m=1;
				}
				else if(rb_in2.isSelected()==true) {
					 m=2;
				}
				else {
					 m=3;
				}
				
			push(t,m,n);
		
			}
			
		});
		b_print.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
            	String yup=result(sorting(head));
            	tf_name3.setText(yup);
            	
            }
        });
		

		b_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            		System.exit(0);
            }
        });	
		frame.add(p_main);
		frame.setSize(800,800);//1920*1080
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
