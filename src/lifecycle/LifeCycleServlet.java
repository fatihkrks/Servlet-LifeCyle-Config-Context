package lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		//konfügrasyon yapılablir
		System.out.println("İnit");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		pw.print("lifecycledoget");
		System.out.println("doget");
		
		
	}
	@Override
	public void destroy() {
		System.out.println("Destroying");
	}
}
