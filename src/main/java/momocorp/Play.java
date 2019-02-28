package momocorp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Play", urlPatterns = { "/Play" })
public class Play extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
		   throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession s = req.getSession(true);
		Dice d = (Dice) s.getAttribute("game");
		if (d == null) {
			d = new Dice();
			d.setName(req.getParameter("tonnom"));
			s.setAttribute("game", d);
		}
		if (d.play()) {
			s.invalidate();
			Hs hs = (Hs) this.getServletContext().getAttribute("hs");
			if (hs == null) {
				hs = new Hs();
				this.getServletContext().setAttribute("hs", hs);
			}
			hs.add(d.getName(), d.getScore());
			out.println("fini: score:" + d.getScore());
			out.println("fini: score:" + hs.toString());
			out.println("<a href=\"index.html\">MyNewProject</a>");

		} else {
			s.setAttribute("game", d);
			out.println(d.toString());
			out.println("<a href=\"Play\">Play</a>");
		}
	}
}