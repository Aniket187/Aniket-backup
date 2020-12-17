import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowriedBeans.Traveller;
import beans.EmpDept;
import beans.Employee;

public class ClientLogic {


	public static void main(String[] args) {
		
		/*Resource r=new FileSystemResource("springContext.xml");
		XmlBeanFactory myContext=new XmlBeanFactory(r);	*/	
		
ApplicationContext myContext=new ClassPathXmlApplicationContext(new String[]{"springContext.xml","autowiring.xml"});//IoC container
		Employee emp=(Employee) myContext.getBean("employee");
		
		System.out.println("Are the beans same: "+emp.equals(myContext.getBean("employee")));
	
		/*System.out.println("Employee created: "+emp);
		
		System.out.println("Emp hobbies are: "+emp.getHobbies());
		System.out.println("Emp is working in:  "+emp.getWorkingDepts());*/
		
		
		//System.out.println(((EmpDept) myContext.getBean("empDept")).getEmployeeDept());
		
	//	System.out.println("New Employee: "+(Employee) myContext.getBean("emp"));;
		
		
		
		
		Traveller t=(Traveller) myContext.getBean("traveller");
		
		t.startJourney();
		
		((AbstractApplicationContext) myContext).close();
		
	}
}
