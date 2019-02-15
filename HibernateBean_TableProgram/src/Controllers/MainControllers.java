package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.EmpBean;
import bean.EmpBeans;
import dao.MyDao;

@Controller
public class MainControllers {
	
	//For one bean two table
	/* @RequestMapping("/")
		public String empRecords()
		{
		   return "EmpDetails";
		}
	 @RequestMapping("/insertEmpDetails")
	 	public ModelAndView empinsert(@ModelAttribute EmpBean e)//Model Attribute annotation as method parameter
	 	{
	 			MyDao m=new MyDao();
	 		ModelAndView mv=null;
	 		
	 		int x= m.insertEmp(e);
	 		   if(x==1)
	 		   {
	 			mv=new ModelAndView("EmpDetails","msg","Data Inserted Succesfully") ;  
	 		   }
	 		   else {
	 			   mv=new ModelAndView("EmpDetails","msg","Data not inserted") ;
	 		   }
	 		   return mv;
	 	}*/
	
	//For Two bean one table
	 @RequestMapping("/")
		public String empRecords()
		{
		   return "EmpDetails";
		}
	 @RequestMapping("/insertEmpDetails")
	 	public ModelAndView empinsert(@ModelAttribute EmpBeans e)//Model Attribute annotation as method parameter
	 	{
	 			MyDao m=new MyDao();
	 		ModelAndView mv=null;
	 		
	 		int x= m.insertEmp(e);
	 		   if(x==1)
	 		   {
	 			mv=new ModelAndView("EmpDetails","msg","Data Inserted Succesfully") ;  
	 		   }
	 		   else {
	 			   mv=new ModelAndView("EmpDetails","msg","Data not inserted") ;
	 		   }
	 		   return mv;
	 	}
	 
}
