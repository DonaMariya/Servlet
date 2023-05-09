import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class AddServlet extends jakarta.servlet.http.HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter p = response.getWriter();
		p.println("Enter your name");
		
		
		
		
	//	System.out.println("result is " + sum);
		
	}
}
