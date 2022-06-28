package top.inhann.tom;
import org.apache.commons.configuration.ConfigurationException;
import org.nibblesec.tools.SerialKiller;

import java.io.*;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "test", value = "/test")
public class TestServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("fuck");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String exp = req.getParameter("exp");
        byte[] ser = Base64.getDecoder().decode(exp);
        ObjectInputStream ois = null;
        try {
            ByteArrayInputStream b = new ByteArrayInputStream(ser);
            ois = new SerialKiller(b, "serialkiller.xml");
            ois.readObject();
            out.write("Got it");
        } catch (Exception e) {
            System.out.println(e);
            out.write("Not use it again!!!!");
        }

    }
}
